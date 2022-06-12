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
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AffParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AffParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AffParser#entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry(AffParser.EntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(AffParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffParser#headerLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderLine(AffParser.HeaderLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AffParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffParser#tapStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTapStatement(AffParser.TapStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffParser#holdStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHoldStatement(AffParser.HoldStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffParser#sceneCtrlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSceneCtrlStatement(AffParser.SceneCtrlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffParser#cameraStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCameraStatement(AffParser.CameraStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffParser#timingStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimingStatement(AffParser.TimingStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffParser#timingGroupStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimingGroupStatement(AffParser.TimingGroupStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffParser#timingGroupModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimingGroupModifiers(AffParser.TimingGroupModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffParser#arcStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArcStatement(AffParser.ArcStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffParser#arcTapTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArcTapTail(AffParser.ArcTapTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link AffParser#arcTap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArcTap(AffParser.ArcTapContext ctx);
}