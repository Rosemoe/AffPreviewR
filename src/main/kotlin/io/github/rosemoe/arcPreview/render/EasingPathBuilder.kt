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

package io.github.rosemoe.arcPreview.render

import org.jetbrains.skija.Path

fun addEasingPath(easing: Easing, x1: Float, y1: Float, x2: Float, y2: Float, outPath: Path) = when (easing) {
    Easing.SINE_IN -> sineIn(x1, y1, x2, y2, outPath)
    Easing.SINE_OUT -> sineOut(x1, y1, x2, y2, outPath)
    Easing.SINE_IN_OUT -> sineInOut(x1, y1, x2, y2, outPath)
    Easing.STRAIGHT -> straight(x1, y1, x2, y2, outPath)
}

fun sineIn(x1: Float, y1: Float, x2: Float, y2: Float, outPath: Path) =
    makeCubicPath(x1, y1, x2, y2, DESCRIPTOR_SINE_IN, outPath)

fun sineOut(x1: Float, y1: Float, x2: Float, y2: Float, outPath: Path) =
    makeCubicPath(x1, y1, x2, y2, DESCRIPTOR_SINE_OUT, outPath)

fun sineInOut(x1: Float, y1: Float, x2: Float, y2: Float, outPath: Path) =
    makeCubicPath(x1, y1, x2, y2, DESCRIPTOR_SINE_IN_OUT, outPath)

fun straight(x1: Float, y1: Float, x2: Float, y2: Float, outPath: Path) {
    outPath.apply {
        lineTo(x2, y2)
    }
}

private data class CubicCurveDescriptor(
    val x1: Float,
    val y1: Float,
    val x2: Float,
    val y2: Float
)

private fun makeCubicPath(x1: Float, y1: Float, x2: Float, y2: Float, descriptor: CubicCurveDescriptor, outPath: Path) {
    outPath.apply {
        val dx = x2 - x1
        val dy = y2 - y1

        cubicTo(
            x1 + dx * descriptor.x1, y1 + dy * descriptor.y1,
            x1 + dx * descriptor.x2, y1 + dy * descriptor.y2,
            x2, y2
        )
    }
}

private val DESCRIPTOR_SINE_IN = CubicCurveDescriptor(0.47f, 0f, 0.745f, 0.715f)
private val DESCRIPTOR_SINE_OUT = CubicCurveDescriptor(0.39f, 0.575f, 0.565f, 1f)
private val DESCRIPTOR_SINE_IN_OUT = CubicCurveDescriptor(0.445f, 0.05f, 0.55f, 0.95f)