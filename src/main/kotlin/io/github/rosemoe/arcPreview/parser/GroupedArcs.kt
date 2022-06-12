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
import org.jetbrains.skija.Path

class GroupedArcs(val color: Int, val arcs: MutableList<ArcStatementContext>) {

    fun beginTime() = arcs.first().startTime.text.toInt()

    fun endTime() = arcs.last().endTime.text.toInt()

}