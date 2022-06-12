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

// Generated from C:/Users/20734/IdeaProjects/ImageGenerater/src/main/kotlin/io/github/rosemoe/arcPreview/parser\AffLexer.g4 by ANTLR 4.10.1
package io.github.rosemoe.arcPreview.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AffLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARC=1, ARCTAP=2, HOLD=3, SCENE_CTRL=4, CAMERA=5, TIMING=6, TIMING_GROUP=7, 
		BOOL_LITERAL=8, IDENTIFIER=9, LPAREN=10, RPAREN=11, LBRACE=12, RBRACE=13, 
		LBRACK=14, RBRACK=15, COMMA=16, SEMICOLON=17, MINUS=18, COLON=19, INTEGER_LITERAL=20, 
		FLOAT_LITERAL=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ARC", "ARCTAP", "HOLD", "SCENE_CTRL", "CAMERA", "TIMING", "TIMING_GROUP", 
			"BOOL_LITERAL", "IDENTIFIER", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "COMMA", "SEMICOLON", "MINUS", "COLON", "INTEGER_LITERAL", 
			"FLOAT_LITERAL", "WS", "Digits", "LetterOrDigit", "Letter"
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


	public AffLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AffLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0016\u00b8\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007t\b\u0007\u0001\b\u0001\b\u0005\bx\b\b\n\b\f\b{\t\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0003\u0013\u0092\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0003\u0014"+
		"\u0097\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u009c\b"+
		"\u0014\u0001\u0015\u0004\u0015\u009f\b\u0015\u000b\u0015\f\u0015\u00a0"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0005\u0016\u00a7\b\u0016"+
		"\n\u0016\f\u0016\u00aa\t\u0016\u0001\u0016\u0003\u0016\u00ad\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u00b1\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u00b7\b\u0018\u0000\u0000\u0019\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0000/\u0000"+
		"1\u0000\u0001\u0000\u0007\u0003\u0000\t\n\f\r  \u0001\u000009\u0002\u0000"+
		"09__\u0004\u0000$$AZ__az\u0002\u0000\u0000\u007f\u8000\ud800\u8000\udbff"+
		"\u0001\u0000\u8000\ud800\u8000\udbff\u0001\u0000\u8000\udc00\u8000\udfff"+
		"\u00bf\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u00013\u0001\u0000\u0000\u0000"+
		"\u00037\u0001\u0000\u0000\u0000\u0005>\u0001\u0000\u0000\u0000\u0007C"+
		"\u0001\u0000\u0000\u0000\tP\u0001\u0000\u0000\u0000\u000bW\u0001\u0000"+
		"\u0000\u0000\r^\u0001\u0000\u0000\u0000\u000fs\u0001\u0000\u0000\u0000"+
		"\u0011u\u0001\u0000\u0000\u0000\u0013|\u0001\u0000\u0000\u0000\u0015~"+
		"\u0001\u0000\u0000\u0000\u0017\u0080\u0001\u0000\u0000\u0000\u0019\u0082"+
		"\u0001\u0000\u0000\u0000\u001b\u0084\u0001\u0000\u0000\u0000\u001d\u0086"+
		"\u0001\u0000\u0000\u0000\u001f\u0088\u0001\u0000\u0000\u0000!\u008a\u0001"+
		"\u0000\u0000\u0000#\u008c\u0001\u0000\u0000\u0000%\u008e\u0001\u0000\u0000"+
		"\u0000\'\u0091\u0001\u0000\u0000\u0000)\u0096\u0001\u0000\u0000\u0000"+
		"+\u009e\u0001\u0000\u0000\u0000-\u00a4\u0001\u0000\u0000\u0000/\u00b0"+
		"\u0001\u0000\u0000\u00001\u00b6\u0001\u0000\u0000\u000034\u0005a\u0000"+
		"\u000045\u0005r\u0000\u000056\u0005c\u0000\u00006\u0002\u0001\u0000\u0000"+
		"\u000078\u0005a\u0000\u000089\u0005r\u0000\u00009:\u0005c\u0000\u0000"+
		":;\u0005t\u0000\u0000;<\u0005a\u0000\u0000<=\u0005p\u0000\u0000=\u0004"+
		"\u0001\u0000\u0000\u0000>?\u0005h\u0000\u0000?@\u0005o\u0000\u0000@A\u0005"+
		"l\u0000\u0000AB\u0005d\u0000\u0000B\u0006\u0001\u0000\u0000\u0000CD\u0005"+
		"s\u0000\u0000DE\u0005c\u0000\u0000EF\u0005e\u0000\u0000FG\u0005n\u0000"+
		"\u0000GH\u0005e\u0000\u0000HI\u0005c\u0000\u0000IJ\u0005o\u0000\u0000"+
		"JK\u0005n\u0000\u0000KL\u0005t\u0000\u0000LM\u0005r\u0000\u0000MN\u0005"+
		"o\u0000\u0000NO\u0005l\u0000\u0000O\b\u0001\u0000\u0000\u0000PQ\u0005"+
		"c\u0000\u0000QR\u0005a\u0000\u0000RS\u0005m\u0000\u0000ST\u0005e\u0000"+
		"\u0000TU\u0005r\u0000\u0000UV\u0005a\u0000\u0000V\n\u0001\u0000\u0000"+
		"\u0000WX\u0005t\u0000\u0000XY\u0005i\u0000\u0000YZ\u0005m\u0000\u0000"+
		"Z[\u0005i\u0000\u0000[\\\u0005n\u0000\u0000\\]\u0005g\u0000\u0000]\f\u0001"+
		"\u0000\u0000\u0000^_\u0005t\u0000\u0000_`\u0005i\u0000\u0000`a\u0005m"+
		"\u0000\u0000ab\u0005i\u0000\u0000bc\u0005n\u0000\u0000cd\u0005g\u0000"+
		"\u0000de\u0005g\u0000\u0000ef\u0005r\u0000\u0000fg\u0005o\u0000\u0000"+
		"gh\u0005u\u0000\u0000hi\u0005p\u0000\u0000i\u000e\u0001\u0000\u0000\u0000"+
		"jk\u0005t\u0000\u0000kl\u0005r\u0000\u0000lm\u0005u\u0000\u0000mt\u0005"+
		"e\u0000\u0000no\u0005f\u0000\u0000op\u0005a\u0000\u0000pq\u0005l\u0000"+
		"\u0000qr\u0005s\u0000\u0000rt\u0005e\u0000\u0000sj\u0001\u0000\u0000\u0000"+
		"sn\u0001\u0000\u0000\u0000t\u0010\u0001\u0000\u0000\u0000uy\u00031\u0018"+
		"\u0000vx\u0003/\u0017\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0012\u0001"+
		"\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005(\u0000\u0000}\u0014"+
		"\u0001\u0000\u0000\u0000~\u007f\u0005)\u0000\u0000\u007f\u0016\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005{\u0000\u0000\u0081\u0018\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0005}\u0000\u0000\u0083\u001a\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0005[\u0000\u0000\u0085\u001c\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005]\u0000\u0000\u0087\u001e\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0005,\u0000\u0000\u0089 \u0001\u0000\u0000\u0000\u008a\u008b\u0005;"+
		"\u0000\u0000\u008b\"\u0001\u0000\u0000\u0000\u008c\u008d\u0005-\u0000"+
		"\u0000\u008d$\u0001\u0000\u0000\u0000\u008e\u008f\u0005:\u0000\u0000\u008f"+
		"&\u0001\u0000\u0000\u0000\u0090\u0092\u0005-\u0000\u0000\u0091\u0090\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0003-\u0016\u0000\u0094(\u0001\u0000\u0000"+
		"\u0000\u0095\u0097\u0005-\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0003-\u0016\u0000\u0099\u009b\u0005.\u0000\u0000\u009a\u009c"+
		"\u0003-\u0016\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001"+
		"\u0000\u0000\u0000\u009c*\u0001\u0000\u0000\u0000\u009d\u009f\u0007\u0000"+
		"\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0006\u0015"+
		"\u0000\u0000\u00a3,\u0001\u0000\u0000\u0000\u00a4\u00ac\u0007\u0001\u0000"+
		"\u0000\u00a5\u00a7\u0007\u0002\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ad\u0007\u0001\u0000"+
		"\u0000\u00ac\u00a8\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ad.\u0001\u0000\u0000\u0000\u00ae\u00b1\u00031\u0018\u0000\u00af"+
		"\u00b1\u0007\u0001\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0"+
		"\u00af\u0001\u0000\u0000\u0000\u00b10\u0001\u0000\u0000\u0000\u00b2\u00b7"+
		"\u0007\u0003\u0000\u0000\u00b3\u00b7\b\u0004\u0000\u0000\u00b4\u00b5\u0007"+
		"\u0005\u0000\u0000\u00b5\u00b7\u0007\u0006\u0000\u0000\u00b6\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b72\u0001\u0000\u0000\u0000\u000b\u0000sy\u0091"+
		"\u0096\u009b\u00a0\u00a8\u00ac\u00b0\u00b6\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}