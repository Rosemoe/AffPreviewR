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
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AffParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARC=1, ARCTAP=2, HOLD=3, SCENE_CTRL=4, CAMERA=5, TIMING=6, TIMING_GROUP=7, 
		BOOL_LITERAL=8, IDENTIFIER=9, LPAREN=10, RPAREN=11, LBRACE=12, RBRACE=13, 
		LBRACK=14, RBRACK=15, COMMA=16, SEMICOLON=17, MINUS=18, COLON=19, INTEGER_LITERAL=20, 
		FLOAT_LITERAL=21, WS=22;
	public static final int
		RULE_entry = 0, RULE_header = 1, RULE_headerLine = 2, RULE_statement = 3, 
		RULE_tapStatement = 4, RULE_holdStatement = 5, RULE_sceneCtrlStatement = 6, 
		RULE_cameraStatement = 7, RULE_timingStatement = 8, RULE_timingGroupStatement = 9, 
		RULE_timingGroupModifiers = 10, RULE_arcStatement = 11, RULE_arcTapTail = 12, 
		RULE_arcTap = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"entry", "header", "headerLine", "statement", "tapStatement", "holdStatement", 
			"sceneCtrlStatement", "cameraStatement", "timingStatement", "timingGroupStatement", 
			"timingGroupModifiers", "arcStatement", "arcTapTail", "arcTap"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'arc'", "'arctap'", "'hold'", "'scenecontrol'", "'camera'", "'timing'", 
			"'timinggroup'", null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"','", "';'", "'-'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ARC", "ARCTAP", "HOLD", "SCENE_CTRL", "CAMERA", "TIMING", "TIMING_GROUP", 
			"BOOL_LITERAL", "IDENTIFIER", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "COMMA", "SEMICOLON", "MINUS", "COLON", "INTEGER_LITERAL", 
			"FLOAT_LITERAL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AffParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AffParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class EntryContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public EntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).enterEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).exitEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffParserVisitor ) return ((AffParserVisitor<? extends T>)visitor).visitEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntryContext entry() throws RecognitionException {
		EntryContext _localctx = new EntryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			header();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARC) | (1L << HOLD) | (1L << SCENE_CTRL) | (1L << CAMERA) | (1L << TIMING) | (1L << TIMING_GROUP) | (1L << LPAREN))) != 0)) {
				{
				{
				setState(29);
				statement();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(AffParser.MINUS, 0); }
		public List<HeaderLineContext> headerLine() {
			return getRuleContexts(HeaderLineContext.class);
		}
		public HeaderLineContext headerLine(int i) {
			return getRuleContext(HeaderLineContext.class,i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffParserVisitor ) return ((AffParserVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(35);
				headerLine();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			match(MINUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderLineContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AffParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AffParser.COLON, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(AffParser.INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(AffParser.FLOAT_LITERAL, 0); }
		public HeaderLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).enterHeaderLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).exitHeaderLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffParserVisitor ) return ((AffParserVisitor<? extends T>)visitor).visitHeaderLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderLineContext headerLine() throws RecognitionException {
		HeaderLineContext _localctx = new HeaderLineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_headerLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(IDENTIFIER);
			setState(44);
			match(COLON);
			setState(45);
			_la = _input.LA(1);
			if ( !(_la==INTEGER_LITERAL || _la==FLOAT_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TapStatementContext tapStatement() {
			return getRuleContext(TapStatementContext.class,0);
		}
		public HoldStatementContext holdStatement() {
			return getRuleContext(HoldStatementContext.class,0);
		}
		public ArcStatementContext arcStatement() {
			return getRuleContext(ArcStatementContext.class,0);
		}
		public SceneCtrlStatementContext sceneCtrlStatement() {
			return getRuleContext(SceneCtrlStatementContext.class,0);
		}
		public CameraStatementContext cameraStatement() {
			return getRuleContext(CameraStatementContext.class,0);
		}
		public TimingStatementContext timingStatement() {
			return getRuleContext(TimingStatementContext.class,0);
		}
		public TimingGroupStatementContext timingGroupStatement() {
			return getRuleContext(TimingGroupStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffParserVisitor ) return ((AffParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				tapStatement();
				}
				break;
			case HOLD:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				holdStatement();
				}
				break;
			case ARC:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				arcStatement();
				}
				break;
			case SCENE_CTRL:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				sceneCtrlStatement();
				}
				break;
			case CAMERA:
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				cameraStatement();
				}
				break;
			case TIMING:
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				timingStatement();
				}
				break;
			case TIMING_GROUP:
				enterOuterAlt(_localctx, 7);
				{
				setState(53);
				timingGroupStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TapStatementContext extends ParserRuleContext {
		public Token time;
		public Token track;
		public TerminalNode LPAREN() { return getToken(AffParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(AffParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(AffParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AffParser.SEMICOLON, 0); }
		public List<TerminalNode> INTEGER_LITERAL() { return getTokens(AffParser.INTEGER_LITERAL); }
		public TerminalNode INTEGER_LITERAL(int i) {
			return getToken(AffParser.INTEGER_LITERAL, i);
		}
		public TapStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tapStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).enterTapStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).exitTapStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffParserVisitor ) return ((AffParserVisitor<? extends T>)visitor).visitTapStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TapStatementContext tapStatement() throws RecognitionException {
		TapStatementContext _localctx = new TapStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tapStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(LPAREN);
			setState(57);
			((TapStatementContext)_localctx).time = match(INTEGER_LITERAL);
			setState(58);
			match(COMMA);
			setState(59);
			((TapStatementContext)_localctx).track = match(INTEGER_LITERAL);
			setState(60);
			match(RPAREN);
			setState(61);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HoldStatementContext extends ParserRuleContext {
		public Token startTime;
		public Token endTime;
		public Token track;
		public TerminalNode HOLD() { return getToken(AffParser.HOLD, 0); }
		public TerminalNode LPAREN() { return getToken(AffParser.LPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AffParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AffParser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(AffParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AffParser.SEMICOLON, 0); }
		public List<TerminalNode> INTEGER_LITERAL() { return getTokens(AffParser.INTEGER_LITERAL); }
		public TerminalNode INTEGER_LITERAL(int i) {
			return getToken(AffParser.INTEGER_LITERAL, i);
		}
		public HoldStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_holdStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).enterHoldStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).exitHoldStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffParserVisitor ) return ((AffParserVisitor<? extends T>)visitor).visitHoldStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HoldStatementContext holdStatement() throws RecognitionException {
		HoldStatementContext _localctx = new HoldStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_holdStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(HOLD);
			setState(64);
			match(LPAREN);
			setState(65);
			((HoldStatementContext)_localctx).startTime = match(INTEGER_LITERAL);
			setState(66);
			match(COMMA);
			setState(67);
			((HoldStatementContext)_localctx).endTime = match(INTEGER_LITERAL);
			setState(68);
			match(COMMA);
			setState(69);
			((HoldStatementContext)_localctx).track = match(INTEGER_LITERAL);
			setState(70);
			match(RPAREN);
			setState(71);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SceneCtrlStatementContext extends ParserRuleContext {
		public Token time;
		public Token type;
		public TerminalNode SCENE_CTRL() { return getToken(AffParser.SCENE_CTRL, 0); }
		public TerminalNode LPAREN() { return getToken(AffParser.LPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AffParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AffParser.COMMA, i);
		}
		public TerminalNode FLOAT_LITERAL() { return getToken(AffParser.FLOAT_LITERAL, 0); }
		public List<TerminalNode> INTEGER_LITERAL() { return getTokens(AffParser.INTEGER_LITERAL); }
		public TerminalNode INTEGER_LITERAL(int i) {
			return getToken(AffParser.INTEGER_LITERAL, i);
		}
		public TerminalNode RPAREN() { return getToken(AffParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AffParser.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AffParser.IDENTIFIER, 0); }
		public SceneCtrlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sceneCtrlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).enterSceneCtrlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).exitSceneCtrlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffParserVisitor ) return ((AffParserVisitor<? extends T>)visitor).visitSceneCtrlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SceneCtrlStatementContext sceneCtrlStatement() throws RecognitionException {
		SceneCtrlStatementContext _localctx = new SceneCtrlStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sceneCtrlStatement);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(SCENE_CTRL);
				setState(74);
				match(LPAREN);
				setState(75);
				((SceneCtrlStatementContext)_localctx).time = match(INTEGER_LITERAL);
				setState(76);
				match(COMMA);
				setState(77);
				((SceneCtrlStatementContext)_localctx).type = match(IDENTIFIER);
				setState(78);
				match(COMMA);
				setState(79);
				match(FLOAT_LITERAL);
				setState(80);
				match(COMMA);
				setState(81);
				match(INTEGER_LITERAL);
				setState(82);
				match(RPAREN);
				setState(83);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(SCENE_CTRL);
				setState(85);
				match(LPAREN);
				setState(86);
				((SceneCtrlStatementContext)_localctx).time = match(INTEGER_LITERAL);
				setState(87);
				match(COMMA);
				setState(88);
				((SceneCtrlStatementContext)_localctx).type = match(IDENTIFIER);
				setState(89);
				match(RPAREN);
				setState(90);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CameraStatementContext extends ParserRuleContext {
		public Token time;
		public Token easing;
		public Token duration;
		public TerminalNode CAMERA() { return getToken(AffParser.CAMERA, 0); }
		public TerminalNode LPAREN() { return getToken(AffParser.LPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AffParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AffParser.COMMA, i);
		}
		public List<TerminalNode> FLOAT_LITERAL() { return getTokens(AffParser.FLOAT_LITERAL); }
		public TerminalNode FLOAT_LITERAL(int i) {
			return getToken(AffParser.FLOAT_LITERAL, i);
		}
		public List<TerminalNode> INTEGER_LITERAL() { return getTokens(AffParser.INTEGER_LITERAL); }
		public TerminalNode INTEGER_LITERAL(int i) {
			return getToken(AffParser.INTEGER_LITERAL, i);
		}
		public TerminalNode RPAREN() { return getToken(AffParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AffParser.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AffParser.IDENTIFIER, 0); }
		public CameraStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cameraStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).enterCameraStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).exitCameraStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffParserVisitor ) return ((AffParserVisitor<? extends T>)visitor).visitCameraStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CameraStatementContext cameraStatement() throws RecognitionException {
		CameraStatementContext _localctx = new CameraStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cameraStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(CAMERA);
			setState(94);
			match(LPAREN);
			setState(95);
			((CameraStatementContext)_localctx).time = match(INTEGER_LITERAL);
			setState(96);
			match(COMMA);
			setState(97);
			match(FLOAT_LITERAL);
			setState(98);
			match(COMMA);
			setState(99);
			match(FLOAT_LITERAL);
			setState(100);
			match(COMMA);
			setState(101);
			match(FLOAT_LITERAL);
			setState(102);
			match(COMMA);
			setState(103);
			match(INTEGER_LITERAL);
			setState(104);
			match(COMMA);
			setState(105);
			match(INTEGER_LITERAL);
			setState(106);
			match(COMMA);
			setState(107);
			match(INTEGER_LITERAL);
			setState(108);
			match(COMMA);
			setState(109);
			((CameraStatementContext)_localctx).easing = match(IDENTIFIER);
			setState(110);
			match(COMMA);
			setState(111);
			((CameraStatementContext)_localctx).duration = match(INTEGER_LITERAL);
			setState(112);
			match(RPAREN);
			setState(113);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimingStatementContext extends ParserRuleContext {
		public Token time;
		public Token bpm;
		public Token beats;
		public TerminalNode TIMING() { return getToken(AffParser.TIMING, 0); }
		public TerminalNode LPAREN() { return getToken(AffParser.LPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AffParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AffParser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(AffParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AffParser.SEMICOLON, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(AffParser.INTEGER_LITERAL, 0); }
		public List<TerminalNode> FLOAT_LITERAL() { return getTokens(AffParser.FLOAT_LITERAL); }
		public TerminalNode FLOAT_LITERAL(int i) {
			return getToken(AffParser.FLOAT_LITERAL, i);
		}
		public TimingStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timingStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).enterTimingStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).exitTimingStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffParserVisitor ) return ((AffParserVisitor<? extends T>)visitor).visitTimingStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimingStatementContext timingStatement() throws RecognitionException {
		TimingStatementContext _localctx = new TimingStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_timingStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(TIMING);
			setState(116);
			match(LPAREN);
			setState(117);
			((TimingStatementContext)_localctx).time = match(INTEGER_LITERAL);
			setState(118);
			match(COMMA);
			setState(119);
			((TimingStatementContext)_localctx).bpm = match(FLOAT_LITERAL);
			setState(120);
			match(COMMA);
			setState(121);
			((TimingStatementContext)_localctx).beats = match(FLOAT_LITERAL);
			setState(122);
			match(RPAREN);
			setState(123);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimingGroupStatementContext extends ParserRuleContext {
		public TerminalNode TIMING_GROUP() { return getToken(AffParser.TIMING_GROUP, 0); }
		public TerminalNode LPAREN() { return getToken(AffParser.LPAREN, 0); }
		public TimingGroupModifiersContext timingGroupModifiers() {
			return getRuleContext(TimingGroupModifiersContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AffParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(AffParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AffParser.RBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(AffParser.SEMICOLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TimingGroupStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timingGroupStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).enterTimingGroupStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).exitTimingGroupStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffParserVisitor ) return ((AffParserVisitor<? extends T>)visitor).visitTimingGroupStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimingGroupStatementContext timingGroupStatement() throws RecognitionException {
		TimingGroupStatementContext _localctx = new TimingGroupStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_timingGroupStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(TIMING_GROUP);
			setState(126);
			match(LPAREN);
			setState(127);
			timingGroupModifiers();
			setState(128);
			match(RPAREN);
			setState(129);
			match(LBRACE);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARC) | (1L << HOLD) | (1L << SCENE_CTRL) | (1L << CAMERA) | (1L << TIMING) | (1L << TIMING_GROUP) | (1L << LPAREN))) != 0)) {
				{
				{
				setState(130);
				statement();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(RBRACE);
			setState(137);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimingGroupModifiersContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AffParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AffParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AffParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AffParser.COMMA, i);
		}
		public TimingGroupModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timingGroupModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).enterTimingGroupModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).exitTimingGroupModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffParserVisitor ) return ((AffParserVisitor<? extends T>)visitor).visitTimingGroupModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimingGroupModifiersContext timingGroupModifiers() throws RecognitionException {
		TimingGroupModifiersContext _localctx = new TimingGroupModifiersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_timingGroupModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(139);
				match(IDENTIFIER);
				}
			}

			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(142);
				match(COMMA);
				setState(143);
				match(IDENTIFIER);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArcStatementContext extends ParserRuleContext {
		public Token startTime;
		public Token endTime;
		public Token startX;
		public Token endX;
		public Token easing;
		public Token startY;
		public Token endY;
		public Token color;
		public Token fx;
		public Token skyLineBool;
		public TerminalNode ARC() { return getToken(AffParser.ARC, 0); }
		public TerminalNode LPAREN() { return getToken(AffParser.LPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AffParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AffParser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(AffParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AffParser.SEMICOLON, 0); }
		public List<TerminalNode> INTEGER_LITERAL() { return getTokens(AffParser.INTEGER_LITERAL); }
		public TerminalNode INTEGER_LITERAL(int i) {
			return getToken(AffParser.INTEGER_LITERAL, i);
		}
		public List<TerminalNode> FLOAT_LITERAL() { return getTokens(AffParser.FLOAT_LITERAL); }
		public TerminalNode FLOAT_LITERAL(int i) {
			return getToken(AffParser.FLOAT_LITERAL, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AffParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AffParser.IDENTIFIER, i);
		}
		public TerminalNode BOOL_LITERAL() { return getToken(AffParser.BOOL_LITERAL, 0); }
		public ArcTapTailContext arcTapTail() {
			return getRuleContext(ArcTapTailContext.class,0);
		}
		public ArcStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arcStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).enterArcStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).exitArcStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffParserVisitor ) return ((AffParserVisitor<? extends T>)visitor).visitArcStatement(this);
			else return visitor.visitChildren(this);
		}

		@Override
		public String toString() {
			return "ArcStatementContext{" +
					"startTime=" + startTime +
					", endTime=" + endTime +
					", startX=" + startX +
					", endX=" + endX +
					", easing=" + easing +
					", startY=" + startY +
					", endY=" + endY +
					", color=" + color +
					", fx=" + fx +
					", skyLineBool=" + skyLineBool +
					'}';
		}
	}

	public final ArcStatementContext arcStatement() throws RecognitionException {
		ArcStatementContext _localctx = new ArcStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arcStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(ARC);
			setState(150);
			match(LPAREN);
			setState(151);
			((ArcStatementContext)_localctx).startTime = match(INTEGER_LITERAL);
			setState(152);
			match(COMMA);
			setState(153);
			((ArcStatementContext)_localctx).endTime = match(INTEGER_LITERAL);
			setState(154);
			match(COMMA);
			setState(155);
			((ArcStatementContext)_localctx).startX = match(FLOAT_LITERAL);
			setState(156);
			match(COMMA);
			setState(157);
			((ArcStatementContext)_localctx).endX = match(FLOAT_LITERAL);
			setState(158);
			match(COMMA);
			setState(159);
			((ArcStatementContext)_localctx).easing = match(IDENTIFIER);
			setState(160);
			match(COMMA);
			setState(161);
			((ArcStatementContext)_localctx).startY = match(FLOAT_LITERAL);
			setState(162);
			match(COMMA);
			setState(163);
			((ArcStatementContext)_localctx).endY = match(FLOAT_LITERAL);
			setState(164);
			match(COMMA);
			setState(165);
			((ArcStatementContext)_localctx).color = match(INTEGER_LITERAL);
			setState(166);
			match(COMMA);
			setState(167);
			((ArcStatementContext)_localctx).fx = match(IDENTIFIER);
			setState(168);
			match(COMMA);
			setState(169);
			((ArcStatementContext)_localctx).skyLineBool = match(BOOL_LITERAL);
			setState(170);
			match(RPAREN);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(171);
				arcTapTail();
				}
			}

			setState(174);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArcTapTailContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(AffParser.LBRACK, 0); }
		public List<ArcTapContext> arcTap() {
			return getRuleContexts(ArcTapContext.class);
		}
		public ArcTapContext arcTap(int i) {
			return getRuleContext(ArcTapContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(AffParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AffParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AffParser.COMMA, i);
		}
		public ArcTapTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arcTapTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).enterArcTapTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).exitArcTapTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffParserVisitor ) return ((AffParserVisitor<? extends T>)visitor).visitArcTapTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArcTapTailContext arcTapTail() throws RecognitionException {
		ArcTapTailContext _localctx = new ArcTapTailContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arcTapTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(LBRACK);
			setState(177);
			arcTap();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(178);
				match(COMMA);
				setState(179);
				arcTap();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArcTapContext extends ParserRuleContext {
		public Token time;
		public TerminalNode ARCTAP() { return getToken(AffParser.ARCTAP, 0); }
		public TerminalNode LPAREN() { return getToken(AffParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AffParser.RPAREN, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(AffParser.INTEGER_LITERAL, 0); }
		public ArcTapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arcTap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).enterArcTap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AffParserListener ) ((AffParserListener)listener).exitArcTap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AffParserVisitor ) return ((AffParserVisitor<? extends T>)visitor).visitArcTap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArcTapContext arcTap() throws RecognitionException {
		ArcTapContext _localctx = new ArcTapContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arcTap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(ARCTAP);
			setState(188);
			match(LPAREN);
			setState(189);
			((ArcTapContext)_localctx).time = match(INTEGER_LITERAL);
			setState(190);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0016\u00c1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0005\u0000\u001f"+
		"\b\u0000\n\u0000\f\u0000\"\t\u0000\u0001\u0001\u0005\u0001%\b\u0001\n"+
		"\u0001\f\u0001(\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00037\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\\\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0084\b\t\n\t\f\t\u0087\t\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0003\n\u008d\b\n\u0001\n\u0001\n\u0005"+
		"\n\u0091\b\n\n\n\f\n\u0094\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00ad\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u00b5\b\f\n\f\f\f\u00b8\t\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0000\u0000\u000e"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u0000\u0001\u0001\u0000\u0014\u0015\u00c0\u0000\u001c\u0001\u0000\u0000"+
		"\u0000\u0002&\u0001\u0000\u0000\u0000\u0004+\u0001\u0000\u0000\u0000\u0006"+
		"6\u0001\u0000\u0000\u0000\b8\u0001\u0000\u0000\u0000\n?\u0001\u0000\u0000"+
		"\u0000\f[\u0001\u0000\u0000\u0000\u000e]\u0001\u0000\u0000\u0000\u0010"+
		"s\u0001\u0000\u0000\u0000\u0012}\u0001\u0000\u0000\u0000\u0014\u008c\u0001"+
		"\u0000\u0000\u0000\u0016\u0095\u0001\u0000\u0000\u0000\u0018\u00b0\u0001"+
		"\u0000\u0000\u0000\u001a\u00bb\u0001\u0000\u0000\u0000\u001c \u0003\u0002"+
		"\u0001\u0000\u001d\u001f\u0003\u0006\u0003\u0000\u001e\u001d\u0001\u0000"+
		"\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000"+
		"\u0000 !\u0001\u0000\u0000\u0000!\u0001\u0001\u0000\u0000\u0000\" \u0001"+
		"\u0000\u0000\u0000#%\u0003\u0004\u0002\u0000$#\u0001\u0000\u0000\u0000"+
		"%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000"+
		"\u0000\')\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000)*\u0005\u0012"+
		"\u0000\u0000*\u0003\u0001\u0000\u0000\u0000+,\u0005\t\u0000\u0000,-\u0005"+
		"\u0013\u0000\u0000-.\u0007\u0000\u0000\u0000.\u0005\u0001\u0000\u0000"+
		"\u0000/7\u0003\b\u0004\u000007\u0003\n\u0005\u000017\u0003\u0016\u000b"+
		"\u000027\u0003\f\u0006\u000037\u0003\u000e\u0007\u000047\u0003\u0010\b"+
		"\u000057\u0003\u0012\t\u00006/\u0001\u0000\u0000\u000060\u0001\u0000\u0000"+
		"\u000061\u0001\u0000\u0000\u000062\u0001\u0000\u0000\u000063\u0001\u0000"+
		"\u0000\u000064\u0001\u0000\u0000\u000065\u0001\u0000\u0000\u00007\u0007"+
		"\u0001\u0000\u0000\u000089\u0005\n\u0000\u00009:\u0005\u0014\u0000\u0000"+
		":;\u0005\u0010\u0000\u0000;<\u0005\u0014\u0000\u0000<=\u0005\u000b\u0000"+
		"\u0000=>\u0005\u0011\u0000\u0000>\t\u0001\u0000\u0000\u0000?@\u0005\u0003"+
		"\u0000\u0000@A\u0005\n\u0000\u0000AB\u0005\u0014\u0000\u0000BC\u0005\u0010"+
		"\u0000\u0000CD\u0005\u0014\u0000\u0000DE\u0005\u0010\u0000\u0000EF\u0005"+
		"\u0014\u0000\u0000FG\u0005\u000b\u0000\u0000GH\u0005\u0011\u0000\u0000"+
		"H\u000b\u0001\u0000\u0000\u0000IJ\u0005\u0004\u0000\u0000JK\u0005\n\u0000"+
		"\u0000KL\u0005\u0014\u0000\u0000LM\u0005\u0010\u0000\u0000MN\u0005\t\u0000"+
		"\u0000NO\u0005\u0010\u0000\u0000OP\u0005\u0015\u0000\u0000PQ\u0005\u0010"+
		"\u0000\u0000QR\u0005\u0014\u0000\u0000RS\u0005\u000b\u0000\u0000S\\\u0005"+
		"\u0011\u0000\u0000TU\u0005\u0004\u0000\u0000UV\u0005\n\u0000\u0000VW\u0005"+
		"\u0014\u0000\u0000WX\u0005\u0010\u0000\u0000XY\u0005\t\u0000\u0000YZ\u0005"+
		"\u000b\u0000\u0000Z\\\u0005\u0011\u0000\u0000[I\u0001\u0000\u0000\u0000"+
		"[T\u0001\u0000\u0000\u0000\\\r\u0001\u0000\u0000\u0000]^\u0005\u0005\u0000"+
		"\u0000^_\u0005\n\u0000\u0000_`\u0005\u0014\u0000\u0000`a\u0005\u0010\u0000"+
		"\u0000ab\u0005\u0015\u0000\u0000bc\u0005\u0010\u0000\u0000cd\u0005\u0015"+
		"\u0000\u0000de\u0005\u0010\u0000\u0000ef\u0005\u0015\u0000\u0000fg\u0005"+
		"\u0010\u0000\u0000gh\u0005\u0014\u0000\u0000hi\u0005\u0010\u0000\u0000"+
		"ij\u0005\u0014\u0000\u0000jk\u0005\u0010\u0000\u0000kl\u0005\u0014\u0000"+
		"\u0000lm\u0005\u0010\u0000\u0000mn\u0005\t\u0000\u0000no\u0005\u0010\u0000"+
		"\u0000op\u0005\u0014\u0000\u0000pq\u0005\u000b\u0000\u0000qr\u0005\u0011"+
		"\u0000\u0000r\u000f\u0001\u0000\u0000\u0000st\u0005\u0006\u0000\u0000"+
		"tu\u0005\n\u0000\u0000uv\u0005\u0014\u0000\u0000vw\u0005\u0010\u0000\u0000"+
		"wx\u0005\u0015\u0000\u0000xy\u0005\u0010\u0000\u0000yz\u0005\u0015\u0000"+
		"\u0000z{\u0005\u000b\u0000\u0000{|\u0005\u0011\u0000\u0000|\u0011\u0001"+
		"\u0000\u0000\u0000}~\u0005\u0007\u0000\u0000~\u007f\u0005\n\u0000\u0000"+
		"\u007f\u0080\u0003\u0014\n\u0000\u0080\u0081\u0005\u000b\u0000\u0000\u0081"+
		"\u0085\u0005\f\u0000\u0000\u0082\u0084\u0003\u0006\u0003\u0000\u0083\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088"+
		"\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0005\r\u0000\u0000\u0089\u008a\u0005\u0011\u0000\u0000\u008a\u0013\u0001"+
		"\u0000\u0000\u0000\u008b\u008d\u0005\t\u0000\u0000\u008c\u008b\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u0092\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0005\u0010\u0000\u0000\u008f\u0091\u0005\t\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000"+
		"\u0000\u0093\u0015\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005\u0001\u0000\u0000\u0096\u0097\u0005\n\u0000\u0000"+
		"\u0097\u0098\u0005\u0014\u0000\u0000\u0098\u0099\u0005\u0010\u0000\u0000"+
		"\u0099\u009a\u0005\u0014\u0000\u0000\u009a\u009b\u0005\u0010\u0000\u0000"+
		"\u009b\u009c\u0005\u0015\u0000\u0000\u009c\u009d\u0005\u0010\u0000\u0000"+
		"\u009d\u009e\u0005\u0015\u0000\u0000\u009e\u009f\u0005\u0010\u0000\u0000"+
		"\u009f\u00a0\u0005\t\u0000\u0000\u00a0\u00a1\u0005\u0010\u0000\u0000\u00a1"+
		"\u00a2\u0005\u0015\u0000\u0000\u00a2\u00a3\u0005\u0010\u0000\u0000\u00a3"+
		"\u00a4\u0005\u0015\u0000\u0000\u00a4\u00a5\u0005\u0010\u0000\u0000\u00a5"+
		"\u00a6\u0005\u0014\u0000\u0000\u00a6\u00a7\u0005\u0010\u0000\u0000\u00a7"+
		"\u00a8\u0005\t\u0000\u0000\u00a8\u00a9\u0005\u0010\u0000\u0000\u00a9\u00aa"+
		"\u0005\b\u0000\u0000\u00aa\u00ac\u0005\u000b\u0000\u0000\u00ab\u00ad\u0003"+
		"\u0018\f\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0011"+
		"\u0000\u0000\u00af\u0017\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u000e"+
		"\u0000\u0000\u00b1\u00b6\u0003\u001a\r\u0000\u00b2\u00b3\u0005\u0010\u0000"+
		"\u0000\u00b3\u00b5\u0003\u001a\r\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u000f\u0000\u0000"+
		"\u00ba\u0019\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u0002\u0000\u0000"+
		"\u00bc\u00bd\u0005\n\u0000\u0000\u00bd\u00be\u0005\u0014\u0000\u0000\u00be"+
		"\u00bf\u0005\u000b\u0000\u0000\u00bf\u001b\u0001\u0000\u0000\u0000\t "+
		"&6[\u0085\u008c\u0092\u00ac\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}