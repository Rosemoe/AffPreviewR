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

import io.github.rosemoe.arcPreview.parser.collectChartObjects
import io.github.rosemoe.arcPreview.render.*
import io.github.rosemoe.arcPreview.util.alsoMirror
import org.jetbrains.skija.Font
import org.jetbrains.skija.FontStyle
import org.jetbrains.skija.Typeface
import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardOpenOption

fun main(args: Array<String>) {
    val exoRegular = Typeface.makeFromFile("testFiles/fonts/Exo-Regular.ttf")
    val exoBold = Typeface.makeFromFile("testFiles/fonts/Exo-SemiBold.ttf")
    Files.newByteChannel(
        Path.of("out.png"),
        StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE
    )
        .apply {
            write(
                AffRenderer(
                    RenderParams(
                        File("testFiles/grievouslady/base.jpg"),
                        "Grievous Lady [FTR]",
                        "Team Grimoire vs Laur",
                        "迷路深層",
                        140000,
                        File("testFiles/bgs/").listFiles()?.random(),
                        createScheme("dark"),
                        RenderStyle(
                            primaryTextStyle = RenderFont(
                                Font(
                                    exoRegular,
                                    50f
                                ), 0xFFFFFFFF.toInt()
                            ),
                            secondaryTextStyle = RenderFont(
                                Font(
                                    Typeface.makeFromName("SimSun", FontStyle.NORMAL),
                                    40f
                                ), 0xFFEEEEEE.toInt()
                            ),
                            secondTextStyle = RenderFont(
                                Font(exoBold, 40f),
                                0xFFEC407A.toInt()
                            ),
                            beatsTextStyle = RenderFont(
                                Font(exoRegular, 18f),
                                0xFFEEEEEE.toInt()
                            ),
                        )
                    ), collectChartObjects(Path.of("testFiles/grievouslady/2.aff"))//.alsoMirror()
                ).render()
            )
            close()
        }
}

fun createScheme(name: String): NoteScheme {
    return NoteScheme(
        File("testFiles/schemes/$name/note.png"),
        File("testFiles/schemes/$name/note_hold.png"),
        File("testFiles/schemes/$name/tap.png"),
        File("testFiles/schemes/$name/track.png"),
        0xFF28222f.toInt()
    )
}