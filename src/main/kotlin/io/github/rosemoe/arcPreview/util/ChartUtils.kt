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

import io.github.rosemoe.arcPreview.parser.AffLexer
import io.github.rosemoe.arcPreview.parser.ChartObjects
import org.antlr.v4.runtime.CommonToken

fun ChartObjects.alsoMirror() : ChartObjects {
    mirrorChart(this)
    return this
}

fun mirrorChart(objects: ChartObjects) {
    objects.taps.forEach {
        it.track = CommonToken(AffLexer.INTEGER_LITERAL, "${5 - it.track.text.toInt()}")
    }
    objects.holds.forEach {
        it.track = CommonToken(AffLexer.INTEGER_LITERAL, "${5 - it.track.text.toInt()}")
    }
    objects.arcs.forEach {
        // X varies from -0.50 to 1.50
        it.startX = CommonToken(AffLexer.FLOAT_LITERAL, transformX(it.startX.text))
        it.endX = CommonToken(AffLexer.FLOAT_LITERAL, transformX(it.endX.text))
    }
}

private fun transformX(srcX: String) : String {
    val x = srcX.toFloat()
    val step = x - (- 0.50f)
    return (1.50f - step).toString()
}