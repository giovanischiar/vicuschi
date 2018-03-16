// Generated from /home/giovani/vicuschi/java/VicuschiLex.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VicuschiLexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ENDIF=2, FOR=3, ENDFOR=4, CASE=5, WHEN=6, ENDCASE=7, CONTINUE=8, 
		ENDF=9, RETURN=10, BOOLEAN=11, NUMBER=12, WORD=13, ATTRIBUTION=14, MAJOR_EQUALS=15, 
		SEMICOLON=16, INT=17, FLOAT=18, STRING=19, ID=20, WS=21;
	public static final int
		RULE_r = 0;
	public static final String[] ruleNames = {
		"r"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'endif'", "'for'", "'endfor'", "'case'", "'when'", "'endcase'", 
		"'continue'", "'endf'", "'return'", null, null, null, "'='", "'>='", "';'", 
		"'int'", "'float'", "'string'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "ENDIF", "FOR", "ENDFOR", "CASE", "WHEN", "ENDCASE", "CONTINUE", 
		"ENDF", "RETURN", "BOOLEAN", "NUMBER", "WORD", "ATTRIBUTION", "MAJOR_EQUALS", 
		"SEMICOLON", "INT", "FLOAT", "STRING", "ID", "WS"
	};
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
	public String getGrammarFileName() { return "VicuschiLex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VicuschiLexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(VicuschiLexParser.IF, 0); }
		public TerminalNode NUMBER() { return getToken(VicuschiLexParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(VicuschiLexParser.BOOLEAN, 0); }
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(IF);
			setState(3);
			match(NUMBER);
			setState(4);
			match(BOOLEAN);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\t\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\3\2\2\2\3\2\2\2\7\2\4\3\2\2\2\4\5\7\3\2\2\5\6\7\16\2\2\6"+
		"\7\7\r\2\2\7\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}