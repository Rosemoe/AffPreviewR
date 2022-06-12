/*
 *     AffPreviewR - A 2D chart image generator for Arcaea with Skia backend
 *     Copyright (C) 2022  Rosemoe
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package io.github.rosemoe.arcPreview.parser

import io.github.rosemoe.arcPreview.parser.AffParser.ArcStatementContext
import io.github.rosemoe.arcPreview.parser.AffParser.EntryContext
import io.github.rosemoe.arcPreview.parser.AffParser.HoldStatementContext
import io.github.rosemoe.arcPreview.parser.AffParser.StatementContext
import io.github.rosemoe.arcPreview.parser.AffParser.TapStatementContext
import io.github.rosemoe.arcPreview.parser.AffParser.TimingGroupStatementContext
import io.github.rosemoe.arcPreview.parser.AffParser.TimingStatementContext
import org.antlr.v4.runtime.CodePointBuffer
import org.antlr.v4.runtime.CodePointCharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import java.lang.Math.abs
import java.nio.ByteBuffer
import java.nio.file.Path
import java.util.Collections
import kotlin.io.path.readBytes

fun collectChartObjects(path: Path, interactiveObjectsOnly: Boolean = false): ChartObjects {
    val stream =
        CodePointCharStream.fromBuffer(CodePointBuffer.withBytes(ByteBuffer.wrap(path.readBytes())), "${path.fileName}")
    val lexer = AffLexer(stream)
    val parser = AffParser(CommonTokenStream(lexer))
    val taps = mutableListOf<TapStatementContext>()
    val holds = mutableListOf<HoldStatementContext>()
    val arcs = mutableListOf<ArcStatementContext>()
    val timings = mutableListOf<TimingStatementContext>()
    val entry = parser.entry()

    fun visitStatements(tree: ParseTree) {
        when (tree) {
            is EntryContext -> {
                tree.statement().forEach {
                    visitStatements(it)
                }
            }

            is TapStatementContext -> {
                taps.add(tree)
            }

            is HoldStatementContext -> {
                holds.add(tree)
            }

            is ArcStatementContext -> {
                arcs.add(tree)
            }

            is TimingStatementContext -> {
                timings.add(tree)
            }

            is StatementContext -> {
                visitStatements(tree.getChild(0))
            }

            is TimingGroupStatementContext -> {
                if (interactiveObjectsOnly && tree.timingGroupModifiers().IDENTIFIER()
                        .find { it.text == "noinput" } != null
                ) {
                    return@visitStatements
                }
                tree.statement().forEach {
                    val obj = it.getChild(0)
                    // Do not visit timings inside a group
                    if (obj !is TimingStatementContext)
                        visitStatements(it)
                }
            }
        }
    }

    visitStatements(entry)
    val groups = mutableListOf<GroupedArcs>()

    val arcLists = mutableMapOf<Int, MutableList<ArcStatementContext>>()
    val sets = mutableMapOf<Int, MutableList<GroupedArcs>>()
    // Sort arcs by color
    arcs.forEach {
        val color = if (it.skyLineBool.text.toBoolean()) -1 else it.color.text.toInt()
        arcLists.computeIfAbsent(color) {
            mutableListOf()
        }.add(it)
    }
    // Then sort by time
    arcLists.forEach {
        it.value.sortWith { a, b ->
            a.startTime.text.toInt().compareTo(b.endTime.text.toInt())
        }
    }
    // Make groups
    arcLists.entries.forEach { entry2 ->
        val color = entry2.key
        val localArcs = entry2.value
        for (i in 0 until localArcs.size) {
            val arc = localArcs[i]
            val set = sets.computeIfAbsent(color) {
                mutableListOf()
            }
            if (set.size == 0) {
                set.add(
                    GroupedArcs(
                        color,
                        mutableListOf(arc)
                    )
                )
            } else {
                val lastSet = set.last()
                val lastArc = lastSet.arcs.last()
                if (arc.startTime.text.toInt() - lastArc.endTime.text.toInt() <= 10
                    && arc.startX.text == lastArc.endX.text
                    && arc.startY.text == lastArc.endY.text
                ) {
                    lastSet.arcs.add(arc)
                } else {
                    set.add(
                       GroupedArcs(
                            color,
                            mutableListOf(arc)
                        )
                    )
                }
            }
        }
    }
    // Collect
    sets.values.forEach {
        it.forEach {
            groups.add(it)
        }
    }

    return ChartObjects(taps, holds, arcs, groups, timings)
}

data class ChartObjects(
    val taps: List<TapStatementContext>,
    val holds: List<HoldStatementContext>,
    val arcs: List<ArcStatementContext>,
    val arcGroups: List<GroupedArcs>,
    val timings: List<TimingStatementContext>
)