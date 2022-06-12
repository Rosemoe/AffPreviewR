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

package io.github.rosemoe.arcPreview.util


import kotlin.math.cos
import kotlin.math.pow
import kotlin.math.sin

fun sineIn(start: Float, end: Float, current: Long, total: Long): Float {
    val offset = end - start
    return (-offset * cos(current / total.toFloat() * (Math.PI / 2)) + offset + start).toFloat()
}

fun sineOut(start: Float, end: Float, current: Long, total: Long): Float {
    val offset = end - start
    return (offset * sin(current / total.toFloat() * (Math.PI / 2)) + start).toFloat()
}

fun sineInOut(start: Float, end: Float, current: Long, total: Long): Float {
    val t = current.toDouble() / total
    val o = 1 - t
    return (o.pow(3.0) * start + 3 * o.pow(2.0) * t * start + 3 * o * t.pow(2.0) * end + t.pow(3.0) * end).toFloat()
}

fun straight(start: Float, end: Float, current: Long, total: Long): Float {
    return start + (end - start) * current / total
}

fun sineIn616(start: Float, end: Float, current: Long, total: Long): Float {
    return sineOut(start, end, current, total)
}

fun sineOut616(start: Float, end: Float, current: Long, total: Long): Float {
    return sineIn(start, end, current, total)
}

fun cubicIn(value: Float): Float {
    return value * value * value
}

fun cubicOut(value: Float): Float {
    return ((value - 1) * (value - 1) * (value - 1) + 1).toFloat()
}