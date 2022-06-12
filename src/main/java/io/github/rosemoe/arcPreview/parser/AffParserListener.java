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

// Generated from C:/Users/20734/IdeaProjects/ImageGenerater/src/main/kotlin/io/github/rosemoe/arcPreview/parser\AffParser.g4 by ANTLR 4.10.1
package io.github.rosemoe.arcPreview.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AffParser}.
 */
public interface AffParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AffParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(AffParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(AffParser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(AffParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(AffParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffParser#headerLine}.
	 * @param ctx the parse tree
	 */
	void enterHeaderLine(AffParser.HeaderLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffParser#headerLine}.
	 * @param ctx the parse tree
	 */
	void exitHeaderLine(AffParser.HeaderLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AffParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AffParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffParser#tapStatement}.
	 * @param ctx the parse tree
	 */
	void enterTapStatement(AffParser.TapStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffParser#tapStatement}.
	 * @param ctx the parse tree
	 */
	void exitTapStatement(AffParser.TapStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffParser#holdStatement}.
	 * @param ctx the parse tree
	 */
	void enterHoldStatement(AffParser.HoldStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffParser#holdStatement}.
	 * @param ctx the parse tree
	 */
	void exitHoldStatement(AffParser.HoldStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffParser#sceneCtrlStatement}.
	 * @param ctx the parse tree
	 */
	void enterSceneCtrlStatement(AffParser.SceneCtrlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffParser#sceneCtrlStatement}.
	 * @param ctx the parse tree
	 */
	void exitSceneCtrlStatement(AffParser.SceneCtrlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffParser#cameraStatement}.
	 * @param ctx the parse tree
	 */
	void enterCameraStatement(AffParser.CameraStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffParser#cameraStatement}.
	 * @param ctx the parse tree
	 */
	void exitCameraStatement(AffParser.CameraStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffParser#timingStatement}.
	 * @param ctx the parse tree
	 */
	void enterTimingStatement(AffParser.TimingStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffParser#timingStatement}.
	 * @param ctx the parse tree
	 */
	void exitTimingStatement(AffParser.TimingStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffParser#timingGroupStatement}.
	 * @param ctx the parse tree
	 */
	void enterTimingGroupStatement(AffParser.TimingGroupStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffParser#timingGroupStatement}.
	 * @param ctx the parse tree
	 */
	void exitTimingGroupStatement(AffParser.TimingGroupStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffParser#timingGroupModifiers}.
	 * @param ctx the parse tree
	 */
	void enterTimingGroupModifiers(AffParser.TimingGroupModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffParser#timingGroupModifiers}.
	 * @param ctx the parse tree
	 */
	void exitTimingGroupModifiers(AffParser.TimingGroupModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffParser#arcStatement}.
	 * @param ctx the parse tree
	 */
	void enterArcStatement(AffParser.ArcStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffParser#arcStatement}.
	 * @param ctx the parse tree
	 */
	void exitArcStatement(AffParser.ArcStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffParser#arcTapTail}.
	 * @param ctx the parse tree
	 */
	void enterArcTapTail(AffParser.ArcTapTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffParser#arcTapTail}.
	 * @param ctx the parse tree
	 */
	void exitArcTapTail(AffParser.ArcTapTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link AffParser#arcTap}.
	 * @param ctx the parse tree
	 */
	void enterArcTap(AffParser.ArcTapContext ctx);
	/**
	 * Exit a parse tree produced by {@link AffParser#arcTap}.
	 * @param ctx the parse tree
	 */
	void exitArcTap(AffParser.ArcTapContext ctx);
}