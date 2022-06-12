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

import org.jetbrains.skija.Font
import org.jetbrains.skija.FontStyle
import org.jetbrains.skija.Typeface

data class RenderStyle(
    val heightPerSecond: Int = 400,
    val secondPerColumn: Int = 10,
    val headerHeight: Int = 300,
    val widthPerColumn: Int = 550,
    val spacePercentage: Float = 0.2f,
    val albumSize: Int = 250,
    val lineSpacing: Float = 50f,
    val headerBackgroundColor: Int = 0x7F000000,
    val coverLayerColor: Int = 0x7F000000,
    val alphaSamplingFrequency: Int = 8,
    val primaryTextStyle: RenderFont = RenderFont(
        Font(Typeface.makeFromName("微软雅黑", FontStyle.NORMAL), 45f),
        0xFFFFFFFF.toInt()
    ),
    val secondaryTextStyle: RenderFont = RenderFont(
        Font(Typeface.makeFromName("微软雅黑", FontStyle.NORMAL), 40f),
        0xFFEEEEEE.toInt()
    ),
    val secondTextStyle: RenderFont = RenderFont(
        Font(Typeface.makeFromName("微软雅黑", FontStyle.BOLD), 28f),
        0xFFEEEEEE.toInt()
    ),
    val beatsTextStyle: RenderFont = RenderFont(
        Font(Typeface.makeFromName("微软雅黑", FontStyle.NORMAL), 18f),
        0xFFEEEEEE.toInt()
    ),
    val arcColors: Map<Int, Int> = mapOf(
        -1 to 0xFFd3d3d3.toInt(), // For skylines
        0 to 0xff31dae7.toInt(), // Blue ones
        1 to 0xffff69b4.toInt(), // Red ones
        2 to 0xff7cfc00.toInt()  // Green ones
    )
) {
    companion object {
        val DEFAULT = RenderStyle()
    }
}