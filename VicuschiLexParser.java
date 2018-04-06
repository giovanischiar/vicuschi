// Generated from VicuschiLex.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, LITERAL=4, IF=5, ENDIF=6, FOR=7, ENDFOR=8, CASE=9, 
		WHEN=10, WHILE=11, ENDWHILE=12, ENDCASE=13, CONTINUE=14, ENDF=15, RETURN=16, 
		INT=17, FLOAT=18, STRING=19, BOOLEAN=20, NOT_ID=21, MAJOR=22, MINOR=23, 
		EQUALS=24, MAJOR_EQUALS=25, MINOR_EQUALS=26, DIFFERENT=27, ATTRIBUTION=28, 
		INCREMENT=29, DECREMENT=30, LOGICAL_AND=31, LOGICAL_OR=32, SEMICOLON=33, 
		INDEX=34, EACH=35, BOOL=36, NUMBER=37, WORD=38, ARRAY=39, INTERVAL=40, 
		INTEGER_DECLARATION=41, FLOAT_DECLARATION=42, STRING_DECLARATION=43, BOOLEAN_DECLARATION=44, 
		INTEGER_ARRAY_DECLARATION=45, FLOAT_ARRAY_DECLARATION=46, STRING_ARRAY_DECLARATION=47, 
		BOOLEAN_ARRAY_DECLARATION=48, GENERIC_DECLARATION=49, GENERIC_ARRAY_DECLARATION=50, 
		DECLARATION_ATTRIBUITION=51, ATTRIBUITION=52, ID=53, S_COMMENTARY=54, 
		M_COMMENTARY=55, WS=56;
	public static final int
		RULE_r = 0, RULE_stmt = 1, RULE_simple_stmt = 2, RULE_while_declaration = 3, 
		RULE_logic_expr = 4, RULE_logic_factor = 5;
	public static final String[] ruleNames = {
		"r", "stmt", "simple_stmt", "while_declaration", "logic_expr", "logic_factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'||'", "'('", "')'", null, "'if'", "'endif'", "'for'", "'endfor'", 
		"'case'", "'when'", "'while'", "'endwhile'", "'endcase'", "'continue'", 
		"'endf'", "'return'", "'int'", "'float'", "'string'", "'boolean'", null, 
		"'>'", "'<'", "'=='", "'>='", "'<='", "'!='", "'='", "'++'", "'--'", "'&&'", 
		"'|'", "';'", null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "LITERAL", "IF", "ENDIF", "FOR", "ENDFOR", "CASE", 
		"WHEN", "WHILE", "ENDWHILE", "ENDCASE", "CONTINUE", "ENDF", "RETURN", 
		"INT", "FLOAT", "STRING", "BOOLEAN", "NOT_ID", "MAJOR", "MINOR", "EQUALS", 
		"MAJOR_EQUALS", "MINOR_EQUALS", "DIFFERENT", "ATTRIBUTION", "INCREMENT", 
		"DECREMENT", "LOGICAL_AND", "LOGICAL_OR", "SEMICOLON", "INDEX", "EACH", 
		"BOOL", "NUMBER", "WORD", "ARRAY", "INTERVAL", "INTEGER_DECLARATION", 
		"FLOAT_DECLARATION", "STRING_DECLARATION", "BOOLEAN_DECLARATION", "INTEGER_ARRAY_DECLARATION", 
		"FLOAT_ARRAY_DECLARATION", "STRING_ARRAY_DECLARATION", "BOOLEAN_ARRAY_DECLARATION", 
		"GENERIC_DECLARATION", "GENERIC_ARRAY_DECLARATION", "DECLARATION_ATTRIBUITION", 
		"ATTRIBUITION", "ID", "S_COMMENTARY", "M_COMMENTARY", "WS"
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
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
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
			setState(12);
			stmt();
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

	public static class StmtContext extends ParserRuleContext {
		public List<Simple_stmtContext> simple_stmt() {
			return getRuleContexts(Simple_stmtContext.class);
		}
		public Simple_stmtContext simple_stmt(int i) {
			return getRuleContext(Simple_stmtContext.class,i);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				simple_stmt();
				setState(15);
				match(SEMICOLON);
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHILE || _la==DECLARATION_ATTRIBUITION );
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

	public static class Simple_stmtContext extends ParserRuleContext {
		public While_declarationContext while_declaration() {
			return getRuleContext(While_declarationContext.class,0);
		}
		public TerminalNode DECLARATION_ATTRIBUITION() { return getToken(VicuschiLexParser.DECLARATION_ATTRIBUITION, 0); }
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterSimple_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitSimple_stmt(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simple_stmt);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				while_declaration();
				}
				break;
			case DECLARATION_ATTRIBUITION:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				match(DECLARATION_ATTRIBUITION);
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

	public static class While_declarationContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(VicuschiLexParser.WHILE, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode ENDWHILE() { return getToken(VicuschiLexParser.ENDWHILE, 0); }
		public While_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterWhile_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitWhile_declaration(this);
		}
	}

	public final While_declarationContext while_declaration() throws RecognitionException {
		While_declarationContext _localctx = new While_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_while_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(WHILE);
			setState(26);
			logic_expr(0);
			setState(27);
			stmt();
			setState(28);
			match(ENDWHILE);
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

	public static class Logic_exprContext extends ParserRuleContext {
		public Logic_factorContext logic_factor() {
			return getRuleContext(Logic_factorContext.class,0);
		}
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public Logic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterLogic_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitLogic_expr(this);
		}
	}

	public final Logic_exprContext logic_expr() throws RecognitionException {
		return logic_expr(0);
	}

	private Logic_exprContext logic_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logic_exprContext _localctx = new Logic_exprContext(_ctx, _parentState);
		Logic_exprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_logic_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(31);
			logic_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(38);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logic_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logic_expr);
					setState(33);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(34);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==LOGICAL_AND) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(35);
					logic_factor();
					}
					} 
				}
				setState(40);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Logic_factorContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(VicuschiLexParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(VicuschiLexParser.ID, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public Logic_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterLogic_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitLogic_factor(this);
		}
	}

	public final Logic_factorContext logic_factor() throws RecognitionException {
		Logic_factorContext _localctx = new Logic_factorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_logic_factor);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(NUMBER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(ID);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				match(T__1);
				setState(44);
				logic_expr(0);
				setState(45);
				match(T__2);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return logic_expr_sempred((Logic_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logic_expr_sempred(Logic_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\64\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\6\3\24\n\3\r\3"+
		"\16\3\25\3\4\3\4\5\4\32\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\7\6\'\n\6\f\6\16\6*\13\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\62\n\7\3\7\2\3"+
		"\n\b\2\4\6\b\n\f\2\3\4\2\3\3!!\2\62\2\16\3\2\2\2\4\23\3\2\2\2\6\31\3\2"+
		"\2\2\b\33\3\2\2\2\n \3\2\2\2\f\61\3\2\2\2\16\17\5\4\3\2\17\3\3\2\2\2\20"+
		"\21\5\6\4\2\21\22\7#\2\2\22\24\3\2\2\2\23\20\3\2\2\2\24\25\3\2\2\2\25"+
		"\23\3\2\2\2\25\26\3\2\2\2\26\5\3\2\2\2\27\32\5\b\5\2\30\32\7\65\2\2\31"+
		"\27\3\2\2\2\31\30\3\2\2\2\32\7\3\2\2\2\33\34\7\r\2\2\34\35\5\n\6\2\35"+
		"\36\5\4\3\2\36\37\7\16\2\2\37\t\3\2\2\2 !\b\6\1\2!\"\5\f\7\2\"(\3\2\2"+
		"\2#$\f\3\2\2$%\t\2\2\2%\'\5\f\7\2&#\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2"+
		"\2\2)\13\3\2\2\2*(\3\2\2\2+\62\7\'\2\2,\62\7\67\2\2-.\7\4\2\2./\5\n\6"+
		"\2/\60\7\5\2\2\60\62\3\2\2\2\61+\3\2\2\2\61,\3\2\2\2\61-\3\2\2\2\62\r"+
		"\3\2\2\2\6\25\31(\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}