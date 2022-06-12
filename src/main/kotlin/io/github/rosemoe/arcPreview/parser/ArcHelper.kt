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

import io.github.rosemoe.arcPreview.render.Easing
import io.github.rosemoe.arcPreview.parser.AffParser.ArcStatementContext
import io.github.rosemoe.arcPreview.util.sineIn616
import io.github.rosemoe.arcPreview.util.sineInOut
import io.github.rosemoe.arcPreview.util.sineOut616
import io.github.rosemoe.arcPreview.util.straight

fun ArcStatementContext.positionWhen(time: Int): ArcPosition {
    val start = startTime.text.toInt()
    val end = endTime.text.toInt()

    val beginX = startX.text.toFloat()
    val endX = endX.text.toFloat()
    val beginY = startY.text.toFloat()
    val endY = endY.text.toFloat()

    val current = (time - start).toLong()
    val total = (end - start).toLong()

    val x = when (easing.text) {
        "si", "siso", "sisi" -> sineIn616(beginX, endX, current, total)
        "so", "sosi", "soso" -> sineOut616(beginX, endX, current, total)
        "b" -> sineInOut(beginX, endX, current, total)
        else -> straight(beginX, endX, current, total)
    }

    val y = when (easing.text) {
        "si", "sosi", "sisi" -> sineIn616(beginY, endY, current, total)
        "so", "siso", "soso" -> sineOut616(beginY, endY, current, total)
        "b" -> sineInOut(beginY, endY, current, total)
        else -> straight(beginY, endY, current, total)
    }

    return ArcPosition(x, y)
}

fun ArcStatementContext.easingX() =
    when (easing.text) {
        "si", "siso", "sisi" -> Easing.SINE_IN
        "so", "sosi", "soso" -> Easing.SINE_OUT
        "b" -> Easing.SINE_IN_OUT
        else -> Easing.STRAIGHT
    }

data class ArcPosition(
    val x: Float,
    val y: Float,
)