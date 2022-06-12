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

import org.jetbrains.skija.Canvas
import org.jetbrains.skija.Font
import org.jetbrains.skija.Paint
import org.jetbrains.skija.Rect

fun Canvas.drawTextByCenterY(text: String, startX: Float, centerY: Float, font: Font, paint: Paint) {
    val bounds = font.measureText(text, paint)
    val y = centerY - bounds.height / 2f + font.getBaseline()
    drawString(text, startX, y, font, paint)
}

fun Canvas.drawTextByTopY(text: String, startX: Float, topY: Float, font: Font, paint: Paint) {
    val y = topY + font.getBaseline()
    drawString(text, startX, y, font, paint)
}

fun Canvas.drawRectMargined(rect: Rect, margin: Float, paint: Paint) {
    val nRect = Rect(rect.left + margin, rect.top + margin, rect.right - margin, rect.bottom - margin)
    if (nRect.height < 0 || nRect.width < 0) {
        return
    }
    drawRect(nRect, paint)
}