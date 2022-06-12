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

import io.github.rosemoe.arcPreview.parser.ChartObjects
import io.github.rosemoe.arcPreview.parser.easingX
import io.github.rosemoe.arcPreview.parser.positionWhen
import org.jetbrains.skija.*
import java.awt.LinearGradientPaint
import java.lang.Float.max
import java.nio.ByteBuffer
import java.util.concurrent.atomic.AtomicInteger
import kotlin.math.ceil
import kotlin.math.min

class AffRenderer(val params: RenderParams, val objects: ChartObjects) {

    private val secondCount = ceil(params.songDuration / 1000.0).toInt()
    private val style = params.style
    private val paint = Paint()
    private val height = style.headerHeight + 16 + 12 * 2 + style.heightPerSecond * style.secondPerColumn
    private val columnCount = ceil(secondCount / style.secondPerColumn.toDouble()).toInt()
    private val width = style.widthPerColumn * columnCount + 24
    private val res = loadScheme()

    init {
        paint.apply {
            isAntiAlias = true
        }
    }

    fun render(format: EncodedImageFormat = EncodedImageFormat.PNG): ByteBuffer {
        val surface = Surface.makeRasterN32Premul(width, height)
        surface.canvas.apply {
            renderBackground()
            renderHeader()
            renderTrackBase()
            renderSecondIndicators()
            renderColumnNotes()
        }
        return surface.makeImageSnapshot().encodeToData(format)!!.toByteBuffer()
    }

    private fun Canvas.renderBackground() {
        paint.setStroke(false)
        if (params.background == null) {
            paint.color = 0xFFFFFFFF.toInt()
            drawRect(Rect(0f, 0f, width.toFloat(), height.toFloat()), paint)
        } else {
            val image = Image.makeFromEncoded(params.background.readBytes())
            val factor = max(1f, max(height.toFloat() / image.height, width.toFloat() / image.width))
            setMatrix(Matrix33.makeScale(factor))
            drawImage(image, 0f, 0f)
            resetMatrix()
            image.close()
        }
        paint.color = style.coverLayerColor
        drawRectMargined(Rect(0f, 0f, width.toFloat(), (height - style.headerHeight).toFloat()), 12f, paint)
    }

    private fun Canvas.renderHeader() {
        val top = height - style.headerHeight + 16f
        val bottom = top + style.headerHeight

        // Header background
        paint.setStroke(false)
        paint.color = style.headerBackgroundColor
        drawRect(Rect(0f, top.toFloat(), width.toFloat(), bottom.toFloat()), paint)

        var horizontalOffset = 50f
        val centerY = (top + bottom) / 2f

        var topY = top + style.headerHeight * 0.2f
        // Album image
        if (params.albumImage != null) {
            val image = Image.makeFromEncoded(params.albumImage.readBytes())
            drawImageRect(
                image,
                Rect(0f, 0f, image.width.toFloat(), image.height.toFloat()),
                Rect(
                    horizontalOffset,
                    centerY - style.albumSize / 2f,
                    horizontalOffset + style.albumSize,
                    centerY + style.albumSize / 2f
                )
            )
            image.close()
            horizontalOffset += style.albumSize + 50f
            topY = centerY - style.albumSize / 2f
        }


        // Song info texts
        paint.color = style.primaryTextStyle.color
        topY += style.lineSpacing
        drawTextByTopY(params.songTitle, horizontalOffset, topY, style.primaryTextStyle.font, paint)
        topY += style.primaryTextStyle.font.measureText(params.songTitle).height
        topY += style.lineSpacing
        paint.color = style.secondaryTextStyle.color
        drawTextByTopY(
            "Song by ${params.songAuthor} & Chart by ${params.chartAuthor}",
            horizontalOffset,
            topY,
            style.secondaryTextStyle.font,
            paint
        )
    }

    private fun getColumnCount() = columnCount
    private fun getColumnLeft(index: Int): Float {
        return index * style.widthPerColumn + style.widthPerColumn * style.spacePercentage / 2f + 12f
    }

    private fun getColumnRight(index: Int): Float {
        return (index + 1) * style.widthPerColumn - style.widthPerColumn * style.spacePercentage / 2f + 12f
    }

    private fun getColumnTop(): Float {
        return 12f
    }

    private fun getColumnBottom(): Float {
        return (height - style.headerHeight - 16f)
    }

    private fun Canvas.renderTrackBase() {
        save()
        clipRect(Rect(0f, getColumnTop(), width.toFloat(), getColumnBottom()))
        for (i in 0 until getColumnCount()) {
            val left = getColumnLeft(i)
            val right = getColumnRight(i)
            val top = getColumnTop()
            val bottom = getColumnBottom()

            // Render the image, until it is out of bounds
            var k = 0
            val image = res.track
            while (k * image.height < bottom) {
                drawImage(image, left, k * image.height.toFloat())
                k++
            }

            paint.color = params.noteScheme.partLineColor
            paint.strokeWidth = 4f
            val step = (right - left) / 4f
            for (j in 0..4) {
                drawLine(left + step * j, top, left + step * j, bottom, paint)
            }
        }
        restore()
    }

    private fun Canvas.renderSecondIndicators() {
        paint.strokeWidth = 4f
        for (i in 0..secondCount) {
            paint.color = params.noteScheme.partLineColor
            val columnIdx = i / style.secondPerColumn
            val rowIdx = i.mod(style.secondPerColumn)
            val left = getColumnLeft(columnIdx)
            val right = getColumnRight(columnIdx)
            val bottom = getColumnBottom()
            val y = bottom - rowIdx * style.heightPerSecond
            drawLine(left, y, right, y, paint)
            paint.color = style.secondTextStyle.color
            val str = "$i"
            val bounds = style.secondTextStyle.font.measureTextWidth(str, paint)
            val x = left - 16f - bounds
            drawTextByCenterY(str, x, y - 2f, style.secondTextStyle.font, paint)
        }
    }

    private fun Canvas.renderColumnNotes() {
        for (i in 0 until getColumnCount()) {
            renderSecondRegion(
                style.secondPerColumn * i * 1000,
                style.secondPerColumn * (i + 1) * 1000,
                getColumnLeft(i),
                getColumnRight(i)
            )
        }
    }

    private fun loadScheme(): LoadedResource {
        val trackWidth = ((style.widthPerColumn * (1 - style.spacePercentage)) / 4f - 4f).toInt()
        val scheme = params.noteScheme
        return LoadedResource(
            Image.makeFromEncoded(scheme.tapNote.readBytes()).resize(trackWidth),
            Image.makeFromEncoded(scheme.holdNote.readBytes()).resize(trackWidth),
            adjustArcTapImage(Image.makeFromEncoded(scheme.arcTap.readBytes()), trackWidth),
            Image.makeFromEncoded(scheme.track.readBytes()).resize((style.widthPerColumn * (1 - style.spacePercentage)).toInt())
        )
    }

    private fun Canvas.renderSecondRegion(
        beginTime: Int,
        endTime: Int,
        left: Float,
        right: Float
    ) {

        fun trackCenter(trackIdx: Int): Float {
            return left + (right - left) / 8f * (1f + (trackIdx - 1) * 2f)
        }

        fun getYForTime(time: Int): Float {
            val percentage = (time - beginTime).toFloat() / (endTime - beginTime)
            return getColumnBottom() - (getColumnBottom() - getColumnTop()) * percentage
        }

        var image = res.note
        objects.taps.forEach {
            val time = it.time.text.toInt()
            if (time in beginTime until endTime) {
                val track = it.track.text.toInt()
                drawImage(image, trackCenter(track) - image.width / 2f, getYForTime(time) - image.height)
            }
        }

        image = res.holdNote
        objects.holds.forEach {
            val time = it.startTime.text.toInt()
            val edTime = it.endTime.text.toInt()
            if (time in beginTime until endTime || edTime in beginTime until endTime) {
                val track = it.track.text.toInt()
                val begin = Integer.max(beginTime, time)
                val end = min(edTime, endTime)
                val center = trackCenter(track)
                drawImageRect(
                    image, Rect(0f, 0f, image.width.toFloat(), image.height.toFloat()),
                    Rect(center - image.width / 2f, getYForTime(end), center + image.width / 2f, getYForTime(begin))
                )
            }
        }

        val center = (left + right) / 2f
        val halfWidth = (right - left) / 2f
        fun arcXToWorld(x: Float): Float {
            return -(-8.5f * x + 4.25f)
        }

        fun getHorizontalByArcX(x: Float): Float {
            return center + arcXToWorld(x) / 8.5f * halfWidth
        }


        // Cut out-bound arcs
        save()
        clipRect(Rect(0f, getColumnTop(), width.toFloat(), getColumnBottom()))

        image = res.arcTapNote
        paint.setStroke(true)
        paint.strokeCap = PaintStrokeCap.BUTT
        val arctap = mutableListOf<ArcTapRender>()
        objects.arcGroups.forEach {
            if (it.beginTime() in beginTime until endTime || it.endTime() in beginTime until endTime) {
                val path = Path()
                val first = it.arcs.first()
                val startPos = first.positionWhen(it.beginTime())
                path.reset()
                path.moveTo(getHorizontalByArcX(startPos.x), getYForTime(it.beginTime()))
                println("Render group")

                if (it.color == -1) {
                    paint.strokeWidth = 6f
                } else {
                    paint.strokeWidth = halfWidth / 3.5f
                }

                paint.strokeCap = PaintStrokeCap.ROUND
                paint.strokeJoin = PaintStrokeJoin.ROUND
                val shaderFractions = mutableListOf<Float>()
                val shaderColors = mutableListOf<Int>()
                paint.color = style.arcColors[it.color]!!
                val baseAlpha = Color.getA(paint.color)
                val group = it
                it.arcs.forEach {
                    println("Render $it")
                    val arcStart = it.startTime.text.toInt()
                    val arcEnd = it.endTime.text.toInt()
                    val pos1 = it.positionWhen(arcStart)
                    val pos2 = it.positionWhen(arcEnd)
                    if (it != first) {
                        path.addCircle(getHorizontalByArcX(pos1.x), getYForTime(arcStart), 1f)
                    }
                    addEasingPath(
                        it.easingX(),
                        getHorizontalByArcX(pos1.x),
                        getYForTime(arcStart),
                        getHorizontalByArcX(pos2.x),
                        getYForTime(arcEnd),
                        path
                    )

                    // Config shader
                    val totalTime = arcEnd - arcStart
                    val samplingTime = (totalTime / (style.alphaSamplingFrequency - 1f)).toInt()
                    for (i in 0 until style.alphaSamplingFrequency) {
                        val sampleTime = arcStart + samplingTime * i
                        val transparency = it.positionWhen(sampleTime).y * 0.65f + 0.35f
                        shaderFractions.add((sampleTime - group.beginTime()) / (group.endTime() - group.beginTime()).toFloat())
                        shaderColors.add(Color.withA(paint.color, (baseAlpha * transparency).toInt()))
                        println("shader color at ${shaderFractions.last()} with ${transparency}")
                    }
                    if (it == group.arcs.last()) {
                        val sampleTime = arcEnd
                        val transparency = it.positionWhen(sampleTime).y * 0.65f + 0.35f
                        shaderFractions.add((sampleTime - group.beginTime()) / (group.endTime() - group.beginTime()).toFloat())
                        shaderColors.add(Color.withA(paint.color, (baseAlpha * transparency).toInt()))
                        println("shader color at ${shaderFractions.last()} with ${transparency}")
                    }

                    // Render arc tap
                    val myArc = it
                    it.arcTapTail()?.arcTap()?.forEach {
                        val tapTime = it.time.text.toInt()
                        val pos = myArc.positionWhen(tapTime)
                        val y = getYForTime(tapTime)
                        val centerX = getHorizontalByArcX(pos.x)
                        arctap.add(ArcTapRender(centerX - image.width / 2f, y - image.height, transformAlpha(255, pos.y)))
                    }
                }

                paint.shader = Shader.makeLinearGradient(
                    0f,
                    getYForTime(it.beginTime()),
                    0f,
                    getYForTime(it.endTime()),
                    IntArray(shaderColors.size) { i -> shaderColors[i] },
                    FloatArray(shaderFractions.size) { i -> shaderFractions[i] })
                drawPath(path, paint)
            }
        }

        arctap.forEach {
            paint.alpha = it.alpha
            drawImage(image, it.x, it.y, paint)
        }
        paint.alpha = 255

        restore()
    }

    fun transformAlpha(src: Int, y: Float): Int {
        return (src * y).toInt()
    }

}