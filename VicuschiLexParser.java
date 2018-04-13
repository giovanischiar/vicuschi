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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, IF=11, ENDIF=12, FOR=13, ENDFOR=14, CASE=15, WHEN=16, WHILE=17, 
		ENDWHILE=18, ENDCASE=19, CONTINUE=20, ENDF=21, RETURN=22, INT=23, FLOAT=24, 
		STRING=25, BOOLEAN=26, MAJOR=27, MINOR=28, EQUALS=29, MAJOR_EQUALS=30, 
		MINOR_EQUALS=31, DIFFERENT=32, ATTRIBUTION=33, INCREMENT=34, DECREMENT=35, 
		LOGICAL_AND=36, LOGICAL_OR=37, SEMICOLON=38, INDEX=39, EACH=40, BOOL=41, 
		NUMBER=42, WORD=43, ARRAY=44, INTERVAL=45, ID=46, S_COMMENTARY=47, M_COMMENTARY=48, 
		WS=49;
	public static final int
		RULE_r = 0, RULE_stmt = 1, RULE_simple_stmt = 2, RULE_arith_expr = 3, 
		RULE_arith_expr_1 = 4, RULE_term = 5, RULE_term_a = 6, RULE_factor = 7, 
		RULE_function_call = 8, RULE_function_declaration = 9, RULE_declaration_params = 10, 
		RULE_params = 11, RULE_attributed = 12, RULE_attribution = 13, RULE_unary_expression = 14, 
		RULE_decrement = 15, RULE_increment = 16, RULE_if_declaration = 17, RULE_while_declaration = 18, 
		RULE_for_declaration = 19, RULE_logic_expr = 20, RULE_logic_factor = 21, 
		RULE_logic_factor_1 = 22, RULE_not_id = 23, RULE_integer_declaration = 24, 
		RULE_float_declaration = 25, RULE_string_declaration = 26, RULE_boolean_declaration = 27, 
		RULE_declaration_attribution = 28, RULE_integer_array_declaration = 29, 
		RULE_float_array_declaration = 30, RULE_string_array_declaration = 31, 
		RULE_boolean_array_declaration = 32, RULE_generic_declaration = 33, RULE_generic_array = 34, 
		RULE_generic_array_declaration = 35, RULE_generic_attribution = 36, RULE_literal = 37, 
		RULE_comparator = 38;
	public static final String[] ruleNames = {
		"r", "stmt", "simple_stmt", "arith_expr", "arith_expr_1", "term", "term_a", 
		"factor", "function_call", "function_declaration", "declaration_params", 
		"params", "attributed", "attribution", "unary_expression", "decrement", 
		"increment", "if_declaration", "while_declaration", "for_declaration", 
		"logic_expr", "logic_factor", "logic_factor_1", "not_id", "integer_declaration", 
		"float_declaration", "string_declaration", "boolean_declaration", "declaration_attribution", 
		"integer_array_declaration", "float_array_declaration", "string_array_declaration", 
		"boolean_array_declaration", "generic_declaration", "generic_array", "generic_array_declaration", 
		"generic_attribution", "literal", "comparator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "')'", "','", "'||'", 
		"'!'", "'if'", "'endif'", "'for'", "'endfor'", "'case'", "'when'", "'while'", 
		"'endwhile'", "'endcase'", "'continue'", "'endf'", "'return'", "'int'", 
		"'float'", "'string'", "'boolean'", "'>'", "'<'", "'=='", "'>='", "'<='", 
		"'!='", "'='", "'++'", "'--'", "'&&'", "'|'", "';'", null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "IF", 
		"ENDIF", "FOR", "ENDFOR", "CASE", "WHEN", "WHILE", "ENDWHILE", "ENDCASE", 
		"CONTINUE", "ENDF", "RETURN", "INT", "FLOAT", "STRING", "BOOLEAN", "MAJOR", 
		"MINOR", "EQUALS", "MAJOR_EQUALS", "MINOR_EQUALS", "DIFFERENT", "ATTRIBUTION", 
		"INCREMENT", "DECREMENT", "LOGICAL_AND", "LOGICAL_OR", "SEMICOLON", "INDEX", 
		"EACH", "BOOL", "NUMBER", "WORD", "ARRAY", "INTERVAL", "ID", "S_COMMENTARY", 
		"M_COMMENTARY", "WS"
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
			setState(78);
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
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				simple_stmt();
				setState(81);
				match(SEMICOLON);
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << ID))) != 0) );
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
		public Declaration_attributionContext declaration_attribution() {
			return getRuleContext(Declaration_attributionContext.class,0);
		}
		public While_declarationContext while_declaration() {
			return getRuleContext(While_declarationContext.class,0);
		}
		public For_declarationContext for_declaration() {
			return getRuleContext(For_declarationContext.class,0);
		}
		public If_declarationContext if_declaration() {
			return getRuleContext(If_declarationContext.class,0);
		}
		public Generic_declarationContext generic_declaration() {
			return getRuleContext(Generic_declarationContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Generic_attributionContext generic_attribution() {
			return getRuleContext(Generic_attributionContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
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
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				declaration_attribution();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				while_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				for_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				if_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				generic_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				unary_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(93);
				generic_attribution();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(94);
				function_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(95);
				function_call();
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

	public static class Arith_exprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Arith_expr_1Context arith_expr_1() {
			return getRuleContext(Arith_expr_1Context.class,0);
		}
		public Arith_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterArith_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitArith_expr(this);
		}
	}

	public final Arith_exprContext arith_expr() throws RecognitionException {
		Arith_exprContext _localctx = new Arith_exprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arith_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			term();
			setState(99);
			arith_expr_1();
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

	public static class Arith_expr_1Context extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<Arith_expr_1Context> arith_expr_1() {
			return getRuleContexts(Arith_expr_1Context.class);
		}
		public Arith_expr_1Context arith_expr_1(int i) {
			return getRuleContext(Arith_expr_1Context.class,i);
		}
		public Arith_expr_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expr_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterArith_expr_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitArith_expr_1(this);
		}
	}

	public final Arith_expr_1Context arith_expr_1() throws RecognitionException {
		Arith_expr_1Context _localctx = new Arith_expr_1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_arith_expr_1);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(101);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(102);
					term();
					setState(103);
					arith_expr_1();
					}
					} 
				}
				setState(109);
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
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Term_aContext term_a() {
			return getRuleContext(Term_aContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_term);
		int _la;
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				term_a(0);
				setState(112);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(113);
				factor();
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

	public static class Term_aContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Term_aContext term_a() {
			return getRuleContext(Term_aContext.class,0);
		}
		public Term_aContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterTerm_a(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitTerm_a(this);
		}
	}

	public final Term_aContext term_a() throws RecognitionException {
		return term_a(0);
	}

	private Term_aContext term_a(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Term_aContext _localctx = new Term_aContext(_ctx, _parentState);
		Term_aContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_term_a, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(118);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Term_aContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term_a);
					setState(120);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(121);
					match(T__4);
					setState(122);
					factor();
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(VicuschiLexParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(VicuschiLexParser.ID, 0); }
		public Arith_exprContext arith_expr() {
			return getRuleContext(Arith_exprContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_factor);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(NUMBER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(ID);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(T__5);
				setState(131);
				arith_expr();
				setState(132);
				match(T__6);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VicuschiLexParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ID);
			setState(137);
			match(T__5);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__9) | (1L << STRING) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << BOOL) | (1L << NUMBER) | (1L << ARRAY) | (1L << ID))) != 0)) {
				{
				setState(138);
				params();
				}
			}

			setState(141);
			match(T__6);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public Generic_declarationContext generic_declaration() {
			return getRuleContext(Generic_declarationContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode ENDF() { return getToken(VicuschiLexParser.ENDF, 0); }
		public Declaration_paramsContext declaration_params() {
			return getRuleContext(Declaration_paramsContext.class,0);
		}
		public TerminalNode WS() { return getToken(VicuschiLexParser.WS, 0); }
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitFunction_declaration(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			generic_declaration();
			setState(144);
			match(T__5);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN))) != 0)) {
				{
				setState(145);
				declaration_params();
				}
			}

			setState(148);
			match(T__6);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(149);
				match(WS);
				}
			}

			setState(152);
			stmt();
			setState(153);
			match(ENDF);
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

	public static class Declaration_paramsContext extends ParserRuleContext {
		public List<Generic_declarationContext> generic_declaration() {
			return getRuleContexts(Generic_declarationContext.class);
		}
		public Generic_declarationContext generic_declaration(int i) {
			return getRuleContext(Generic_declarationContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(VicuschiLexParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VicuschiLexParser.WS, i);
		}
		public Declaration_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterDeclaration_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitDeclaration_params(this);
		}
	}

	public final Declaration_paramsContext declaration_params() throws RecognitionException {
		Declaration_paramsContext _localctx = new Declaration_paramsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			generic_declaration();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(156);
				match(T__7);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(157);
					match(WS);
					}
				}

				setState(160);
				generic_declaration();
				}
				}
				setState(165);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<AttributedContext> attributed() {
			return getRuleContexts(AttributedContext.class);
		}
		public AttributedContext attributed(int i) {
			return getRuleContext(AttributedContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(VicuschiLexParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VicuschiLexParser.WS, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			attributed();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(167);
				match(T__7);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(168);
					match(WS);
					}
				}

				setState(171);
				attributed();
				}
				}
				setState(176);
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

	public static class AttributedContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Arith_exprContext arith_expr() {
			return getRuleContext(Arith_exprContext.class,0);
		}
		public AttributedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterAttributed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitAttributed(this);
		}
	}

	public final AttributedContext attributed() throws RecognitionException {
		AttributedContext _localctx = new AttributedContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attributed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(177);
				literal();
				}
				break;
			case 2:
				{
				setState(178);
				unary_expression();
				}
				break;
			case 3:
				{
				setState(179);
				logic_expr(0);
				}
				break;
			case 4:
				{
				setState(180);
				function_call();
				}
				break;
			case 5:
				{
				setState(181);
				arith_expr();
				}
				break;
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

	public static class AttributionContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTION() { return getToken(VicuschiLexParser.ATTRIBUTION, 0); }
		public AttributedContext attributed() {
			return getRuleContext(AttributedContext.class,0);
		}
		public AttributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterAttribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitAttribution(this);
		}
	}

	public final AttributionContext attribution() throws RecognitionException {
		AttributionContext _localctx = new AttributionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(ATTRIBUTION);
			setState(185);
			attributed();
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

	public static class Unary_expressionContext extends ParserRuleContext {
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitUnary_expression(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unary_expression);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				decrement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				increment();
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

	public static class DecrementContext extends ParserRuleContext {
		public TerminalNode DECREMENT() { return getToken(VicuschiLexParser.DECREMENT, 0); }
		public TerminalNode ID() { return getToken(VicuschiLexParser.ID, 0); }
		public DecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitDecrement(this);
		}
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_decrement);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(DECREMENT);
				setState(192);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(ID);
				setState(194);
				match(DECREMENT);
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

	public static class IncrementContext extends ParserRuleContext {
		public TerminalNode INCREMENT() { return getToken(VicuschiLexParser.INCREMENT, 0); }
		public TerminalNode ID() { return getToken(VicuschiLexParser.ID, 0); }
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitIncrement(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_increment);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(INCREMENT);
				setState(198);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(ID);
				setState(200);
				match(INCREMENT);
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

	public static class If_declarationContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(VicuschiLexParser.IF, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(VicuschiLexParser.ENDIF, 0); }
		public If_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterIf_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitIf_declaration(this);
		}
	}

	public final If_declarationContext if_declaration() throws RecognitionException {
		If_declarationContext _localctx = new If_declarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_if_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(IF);
			setState(204);
			logic_expr(0);
			setState(205);
			stmt();
			setState(206);
			match(ENDIF);
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
		enterRule(_localctx, 36, RULE_while_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(WHILE);
			setState(209);
			logic_expr(0);
			setState(210);
			stmt();
			setState(211);
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

	public static class For_declarationContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(VicuschiLexParser.FOR, 0); }
		public TerminalNode INTERVAL() { return getToken(VicuschiLexParser.INTERVAL, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode ENDFOR() { return getToken(VicuschiLexParser.ENDFOR, 0); }
		public TerminalNode ID() { return getToken(VicuschiLexParser.ID, 0); }
		public For_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterFor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitFor_declaration(this);
		}
	}

	public final For_declarationContext for_declaration() throws RecognitionException {
		For_declarationContext _localctx = new For_declarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_for_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(FOR);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(214);
				match(ID);
				}
			}

			setState(217);
			match(EACH);
			setState(218);
			match(INTERVAL);
			setState(219);
			stmt();
			setState(220);
			match(ENDFOR);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_logic_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(223);
			logic_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logic_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logic_expr);
					setState(225);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(226);
					_la = _input.LA(1);
					if ( !(_la==T__8 || _la==LOGICAL_AND) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(227);
					logic_factor();
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		public Logic_factor_1Context logic_factor_1() {
			return getRuleContext(Logic_factor_1Context.class,0);
		}
		public TerminalNode ID() { return getToken(VicuschiLexParser.ID, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(VicuschiLexParser.BOOL, 0); }
		public Not_idContext not_id() {
			return getRuleContext(Not_idContext.class,0);
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
		enterRule(_localctx, 42, RULE_logic_factor);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(NUMBER);
				setState(234);
				logic_factor_1();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(ID);
				setState(236);
				logic_factor_1();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				match(T__5);
				setState(238);
				logic_expr(0);
				setState(239);
				match(T__6);
				setState(240);
				logic_factor_1();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				match(BOOL);
				setState(243);
				logic_factor_1();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				not_id();
				setState(245);
				logic_factor_1();
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

	public static class Logic_factor_1Context extends ParserRuleContext {
		public List<ComparatorContext> comparator() {
			return getRuleContexts(ComparatorContext.class);
		}
		public ComparatorContext comparator(int i) {
			return getRuleContext(ComparatorContext.class,i);
		}
		public List<Logic_factorContext> logic_factor() {
			return getRuleContexts(Logic_factorContext.class);
		}
		public Logic_factorContext logic_factor(int i) {
			return getRuleContext(Logic_factorContext.class,i);
		}
		public List<Logic_factor_1Context> logic_factor_1() {
			return getRuleContexts(Logic_factor_1Context.class);
		}
		public Logic_factor_1Context logic_factor_1(int i) {
			return getRuleContext(Logic_factor_1Context.class,i);
		}
		public Logic_factor_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_factor_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterLogic_factor_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitLogic_factor_1(this);
		}
	}

	public final Logic_factor_1Context logic_factor_1() throws RecognitionException {
		Logic_factor_1Context _localctx = new Logic_factor_1Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_logic_factor_1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(249);
					comparator();
					setState(250);
					logic_factor();
					setState(252);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(251);
						logic_factor_1();
						}
						break;
					}
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class Not_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VicuschiLexParser.ID, 0); }
		public Generic_arrayContext generic_array() {
			return getRuleContext(Generic_arrayContext.class,0);
		}
		public Not_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterNot_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitNot_id(this);
		}
	}

	public final Not_idContext not_id() throws RecognitionException {
		Not_idContext _localctx = new Not_idContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_not_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__9);
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(260);
				match(ID);
				}
				break;
			case 2:
				{
				setState(261);
				generic_array();
				}
				break;
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

	public static class Integer_declarationContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(VicuschiLexParser.INT, 0); }
		public TerminalNode ID() { return getToken(VicuschiLexParser.ID, 0); }
		public Integer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterInteger_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitInteger_declaration(this);
		}
	}

	public final Integer_declarationContext integer_declaration() throws RecognitionException {
		Integer_declarationContext _localctx = new Integer_declarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_integer_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(INT);
			setState(265);
			match(ID);
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

	public static class Float_declarationContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(VicuschiLexParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(VicuschiLexParser.ID, 0); }
		public Float_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterFloat_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitFloat_declaration(this);
		}
	}

	public final Float_declarationContext float_declaration() throws RecognitionException {
		Float_declarationContext _localctx = new Float_declarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_float_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(FLOAT);
			setState(268);
			match(ID);
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

	public static class String_declarationContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VicuschiLexParser.STRING, 0); }
		public TerminalNode ID() { return getToken(VicuschiLexParser.ID, 0); }
		public String_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterString_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitString_declaration(this);
		}
	}

	public final String_declarationContext string_declaration() throws RecognitionException {
		String_declarationContext _localctx = new String_declarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_string_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(STRING);
			setState(271);
			match(ID);
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

	public static class Boolean_declarationContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(VicuschiLexParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(VicuschiLexParser.ID, 0); }
		public Boolean_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterBoolean_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitBoolean_declaration(this);
		}
	}

	public final Boolean_declarationContext boolean_declaration() throws RecognitionException {
		Boolean_declarationContext _localctx = new Boolean_declarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_boolean_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(BOOLEAN);
			setState(274);
			match(ID);
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

	public static class Declaration_attributionContext extends ParserRuleContext {
		public Generic_declarationContext generic_declaration() {
			return getRuleContext(Generic_declarationContext.class,0);
		}
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public Declaration_attributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_attribution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterDeclaration_attribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitDeclaration_attribution(this);
		}
	}

	public final Declaration_attributionContext declaration_attribution() throws RecognitionException {
		Declaration_attributionContext _localctx = new Declaration_attributionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_declaration_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			generic_declaration();
			setState(277);
			attribution();
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

	public static class Integer_array_declarationContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(VicuschiLexParser.INT, 0); }
		public Generic_arrayContext generic_array() {
			return getRuleContext(Generic_arrayContext.class,0);
		}
		public Integer_array_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_array_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterInteger_array_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitInteger_array_declaration(this);
		}
	}

	public final Integer_array_declarationContext integer_array_declaration() throws RecognitionException {
		Integer_array_declarationContext _localctx = new Integer_array_declarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_integer_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(INT);
			setState(280);
			generic_array();
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

	public static class Float_array_declarationContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(VicuschiLexParser.FLOAT, 0); }
		public Generic_arrayContext generic_array() {
			return getRuleContext(Generic_arrayContext.class,0);
		}
		public Float_array_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_array_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterFloat_array_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitFloat_array_declaration(this);
		}
	}

	public final Float_array_declarationContext float_array_declaration() throws RecognitionException {
		Float_array_declarationContext _localctx = new Float_array_declarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_float_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(FLOAT);
			setState(283);
			generic_array();
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

	public static class String_array_declarationContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VicuschiLexParser.STRING, 0); }
		public Generic_arrayContext generic_array() {
			return getRuleContext(Generic_arrayContext.class,0);
		}
		public String_array_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_array_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterString_array_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitString_array_declaration(this);
		}
	}

	public final String_array_declarationContext string_array_declaration() throws RecognitionException {
		String_array_declarationContext _localctx = new String_array_declarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_string_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(STRING);
			setState(286);
			generic_array();
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

	public static class Boolean_array_declarationContext extends ParserRuleContext {
		public Generic_arrayContext generic_array() {
			return getRuleContext(Generic_arrayContext.class,0);
		}
		public Boolean_array_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_array_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterBoolean_array_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitBoolean_array_declaration(this);
		}
	}

	public final Boolean_array_declarationContext boolean_array_declaration() throws RecognitionException {
		Boolean_array_declarationContext _localctx = new Boolean_array_declarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_boolean_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(BOOLEAN);
			setState(289);
			generic_array();
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

	public static class Generic_declarationContext extends ParserRuleContext {
		public Integer_declarationContext integer_declaration() {
			return getRuleContext(Integer_declarationContext.class,0);
		}
		public Float_declarationContext float_declaration() {
			return getRuleContext(Float_declarationContext.class,0);
		}
		public String_declarationContext string_declaration() {
			return getRuleContext(String_declarationContext.class,0);
		}
		public Boolean_declarationContext boolean_declaration() {
			return getRuleContext(Boolean_declarationContext.class,0);
		}
		public Generic_array_declarationContext generic_array_declaration() {
			return getRuleContext(Generic_array_declarationContext.class,0);
		}
		public Generic_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterGeneric_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitGeneric_declaration(this);
		}
	}

	public final Generic_declarationContext generic_declaration() throws RecognitionException {
		Generic_declarationContext _localctx = new Generic_declarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_generic_declaration);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				integer_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				float_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				string_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				boolean_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				generic_array_declaration();
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

	public static class Generic_arrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VicuschiLexParser.ID, 0); }
		public TerminalNode INDEX() { return getToken(VicuschiLexParser.INDEX, 0); }
		public Generic_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterGeneric_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitGeneric_array(this);
		}
	}

	public final Generic_arrayContext generic_array() throws RecognitionException {
		Generic_arrayContext _localctx = new Generic_arrayContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_generic_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(ID);
			setState(299);
			match(INDEX);
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

	public static class Generic_array_declarationContext extends ParserRuleContext {
		public Integer_array_declarationContext integer_array_declaration() {
			return getRuleContext(Integer_array_declarationContext.class,0);
		}
		public Float_array_declarationContext float_array_declaration() {
			return getRuleContext(Float_array_declarationContext.class,0);
		}
		public String_array_declarationContext string_array_declaration() {
			return getRuleContext(String_array_declarationContext.class,0);
		}
		public Boolean_array_declarationContext boolean_array_declaration() {
			return getRuleContext(Boolean_array_declarationContext.class,0);
		}
		public Generic_array_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_array_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterGeneric_array_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitGeneric_array_declaration(this);
		}
	}

	public final Generic_array_declarationContext generic_array_declaration() throws RecognitionException {
		Generic_array_declarationContext _localctx = new Generic_array_declarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_generic_array_declaration);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				integer_array_declaration();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				float_array_declaration();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				string_array_declaration();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(304);
				boolean_array_declaration();
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

	public static class Generic_attributionContext extends ParserRuleContext {
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public TerminalNode ID() { return getToken(VicuschiLexParser.ID, 0); }
		public Generic_arrayContext generic_array() {
			return getRuleContext(Generic_arrayContext.class,0);
		}
		public Generic_attributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_attribution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterGeneric_attribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitGeneric_attribution(this);
		}
	}

	public final Generic_attributionContext generic_attribution() throws RecognitionException {
		Generic_attributionContext _localctx = new Generic_attributionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_generic_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(307);
				match(ID);
				}
				break;
			case 2:
				{
				setState(308);
				generic_array();
				}
				break;
			}
			setState(311);
			attribution();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(VicuschiLexParser.ARRAY, 0); }
		public TerminalNode BOOL() { return getToken(VicuschiLexParser.BOOL, 0); }
		public TerminalNode NUMBER() { return getToken(VicuschiLexParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(VicuschiLexParser.STRING, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << BOOL) | (1L << NUMBER) | (1L << ARRAY))) != 0)) ) {
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

	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode MAJOR() { return getToken(VicuschiLexParser.MAJOR, 0); }
		public TerminalNode MINOR() { return getToken(VicuschiLexParser.MINOR, 0); }
		public TerminalNode EQUALS() { return getToken(VicuschiLexParser.EQUALS, 0); }
		public TerminalNode MAJOR_EQUALS() { return getToken(VicuschiLexParser.MAJOR_EQUALS, 0); }
		public TerminalNode MINOR_EQUALS() { return getToken(VicuschiLexParser.MINOR_EQUALS, 0); }
		public TerminalNode DIFFERENT() { return getToken(VicuschiLexParser.DIFFERENT, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitComparator(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAJOR) | (1L << MINOR) | (1L << EQUALS) | (1L << MAJOR_EQUALS) | (1L << MINOR_EQUALS) | (1L << DIFFERENT))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return term_a_sempred((Term_aContext)_localctx, predIndex);
		case 20:
			return logic_expr_sempred((Logic_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_a_sempred(Term_aContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logic_expr_sempred(Logic_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0140\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\3"+
		"\6\3V\n\3\r\3\16\3W\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4c\n\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\7\3\7\3\7\3\7\3\7\5\7"+
		"v\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b~\n\b\f\b\16\b\u0081\13\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u0089\n\t\3\n\3\n\3\n\5\n\u008e\n\n\3\n\3\n\3\13\3\13"+
		"\3\13\5\13\u0095\n\13\3\13\3\13\5\13\u0099\n\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\5\f\u00a1\n\f\3\f\7\f\u00a4\n\f\f\f\16\f\u00a7\13\f\3\r\3\r\3\r\5"+
		"\r\u00ac\n\r\3\r\7\r\u00af\n\r\f\r\16\r\u00b2\13\r\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00b9\n\16\3\17\3\17\3\17\3\20\3\20\5\20\u00c0\n\20\3\21\3"+
		"\21\3\21\3\21\5\21\u00c6\n\21\3\22\3\22\3\22\3\22\5\22\u00cc\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u00da\n\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00e7\n\26"+
		"\f\26\16\26\u00ea\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\5\27\u00fa\n\27\3\30\3\30\3\30\5\30\u00ff\n\30"+
		"\7\30\u0101\n\30\f\30\16\30\u0104\13\30\3\31\3\31\3\31\5\31\u0109\n\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\5#\u012b"+
		"\n#\3$\3$\3$\3%\3%\3%\3%\5%\u0134\n%\3&\3&\5&\u0138\n&\3&\3&\3\'\3\'\3"+
		"(\3(\3(\2\4\16*)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLN\2\7\3\2\3\4\3\2\5\6\4\2\13\13&&\5\2\33\33+,..\3\2\35"+
		"\"\2\u0145\2P\3\2\2\2\4U\3\2\2\2\6b\3\2\2\2\bd\3\2\2\2\nm\3\2\2\2\fu\3"+
		"\2\2\2\16w\3\2\2\2\20\u0088\3\2\2\2\22\u008a\3\2\2\2\24\u0091\3\2\2\2"+
		"\26\u009d\3\2\2\2\30\u00a8\3\2\2\2\32\u00b8\3\2\2\2\34\u00ba\3\2\2\2\36"+
		"\u00bf\3\2\2\2 \u00c5\3\2\2\2\"\u00cb\3\2\2\2$\u00cd\3\2\2\2&\u00d2\3"+
		"\2\2\2(\u00d7\3\2\2\2*\u00e0\3\2\2\2,\u00f9\3\2\2\2.\u0102\3\2\2\2\60"+
		"\u0105\3\2\2\2\62\u010a\3\2\2\2\64\u010d\3\2\2\2\66\u0110\3\2\2\28\u0113"+
		"\3\2\2\2:\u0116\3\2\2\2<\u0119\3\2\2\2>\u011c\3\2\2\2@\u011f\3\2\2\2B"+
		"\u0122\3\2\2\2D\u012a\3\2\2\2F\u012c\3\2\2\2H\u0133\3\2\2\2J\u0137\3\2"+
		"\2\2L\u013b\3\2\2\2N\u013d\3\2\2\2PQ\5\4\3\2Q\3\3\2\2\2RS\5\6\4\2ST\7"+
		"(\2\2TV\3\2\2\2UR\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\5\3\2\2\2Yc\5"+
		":\36\2Zc\5&\24\2[c\5(\25\2\\c\5$\23\2]c\5D#\2^c\5\36\20\2_c\5J&\2`c\5"+
		"\24\13\2ac\5\22\n\2bY\3\2\2\2bZ\3\2\2\2b[\3\2\2\2b\\\3\2\2\2b]\3\2\2\2"+
		"b^\3\2\2\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2c\7\3\2\2\2de\5\f\7\2ef\5\n\6"+
		"\2f\t\3\2\2\2gh\t\2\2\2hi\5\f\7\2ij\5\n\6\2jl\3\2\2\2kg\3\2\2\2lo\3\2"+
		"\2\2mk\3\2\2\2mn\3\2\2\2n\13\3\2\2\2om\3\2\2\2pv\5\20\t\2qr\5\16\b\2r"+
		"s\t\3\2\2st\5\20\t\2tv\3\2\2\2up\3\2\2\2uq\3\2\2\2v\r\3\2\2\2wx\b\b\1"+
		"\2xy\5\20\t\2y\177\3\2\2\2z{\f\3\2\2{|\7\7\2\2|~\5\20\t\2}z\3\2\2\2~\u0081"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\17\3\2\2\2\u0081\177\3\2"+
		"\2\2\u0082\u0089\7,\2\2\u0083\u0089\7\60\2\2\u0084\u0085\7\b\2\2\u0085"+
		"\u0086\5\b\5\2\u0086\u0087\7\t\2\2\u0087\u0089\3\2\2\2\u0088\u0082\3\2"+
		"\2\2\u0088\u0083\3\2\2\2\u0088\u0084\3\2\2\2\u0089\21\3\2\2\2\u008a\u008b"+
		"\7\60\2\2\u008b\u008d\7\b\2\2\u008c\u008e\5\30\r\2\u008d\u008c\3\2\2\2"+
		"\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\t\2\2\u0090\23"+
		"\3\2\2\2\u0091\u0092\5D#\2\u0092\u0094\7\b\2\2\u0093\u0095\5\26\f\2\u0094"+
		"\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\7\t"+
		"\2\2\u0097\u0099\7\63\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\5\4\3\2\u009b\u009c\7\27\2\2\u009c\25\3\2\2"+
		"\2\u009d\u00a5\5D#\2\u009e\u00a0\7\n\2\2\u009f\u00a1\7\63\2\2\u00a0\u009f"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\5D#\2\u00a3"+
		"\u009e\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\27\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00b0\5\32\16\2\u00a9"+
		"\u00ab\7\n\2\2\u00aa\u00ac\7\63\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3"+
		"\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\5\32\16\2\u00ae\u00a9\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\31\3\2\2"+
		"\2\u00b2\u00b0\3\2\2\2\u00b3\u00b9\5L\'\2\u00b4\u00b9\5\36\20\2\u00b5"+
		"\u00b9\5*\26\2\u00b6\u00b9\5\22\n\2\u00b7\u00b9\5\b\5\2\u00b8\u00b3\3"+
		"\2\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b7\3\2\2\2\u00b9\33\3\2\2\2\u00ba\u00bb\7#\2\2\u00bb\u00bc\5\32\16"+
		"\2\u00bc\35\3\2\2\2\u00bd\u00c0\5 \21\2\u00be\u00c0\5\"\22\2\u00bf\u00bd"+
		"\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\37\3\2\2\2\u00c1\u00c2\7%\2\2\u00c2"+
		"\u00c6\7\60\2\2\u00c3\u00c4\7\60\2\2\u00c4\u00c6\7%\2\2\u00c5\u00c1\3"+
		"\2\2\2\u00c5\u00c3\3\2\2\2\u00c6!\3\2\2\2\u00c7\u00c8\7$\2\2\u00c8\u00cc"+
		"\7\60\2\2\u00c9\u00ca\7\60\2\2\u00ca\u00cc\7$\2\2\u00cb\u00c7\3\2\2\2"+
		"\u00cb\u00c9\3\2\2\2\u00cc#\3\2\2\2\u00cd\u00ce\7\r\2\2\u00ce\u00cf\5"+
		"*\26\2\u00cf\u00d0\5\4\3\2\u00d0\u00d1\7\16\2\2\u00d1%\3\2\2\2\u00d2\u00d3"+
		"\7\23\2\2\u00d3\u00d4\5*\26\2\u00d4\u00d5\5\4\3\2\u00d5\u00d6\7\24\2\2"+
		"\u00d6\'\3\2\2\2\u00d7\u00d9\7\17\2\2\u00d8\u00da\7\60\2\2\u00d9\u00d8"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\7*\2\2\u00dc"+
		"\u00dd\7/\2\2\u00dd\u00de\5\4\3\2\u00de\u00df\7\20\2\2\u00df)\3\2\2\2"+
		"\u00e0\u00e1\b\26\1\2\u00e1\u00e2\5,\27\2\u00e2\u00e8\3\2\2\2\u00e3\u00e4"+
		"\f\3\2\2\u00e4\u00e5\t\4\2\2\u00e5\u00e7\5,\27\2\u00e6\u00e3\3\2\2\2\u00e7"+
		"\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9+\3\2\2\2"+
		"\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7,\2\2\u00ec\u00fa\5.\30\2\u00ed\u00ee"+
		"\7\60\2\2\u00ee\u00fa\5.\30\2\u00ef\u00f0\7\b\2\2\u00f0\u00f1\5*\26\2"+
		"\u00f1\u00f2\7\t\2\2\u00f2\u00f3\5.\30\2\u00f3\u00fa\3\2\2\2\u00f4\u00f5"+
		"\7+\2\2\u00f5\u00fa\5.\30\2\u00f6\u00f7\5\60\31\2\u00f7\u00f8\5.\30\2"+
		"\u00f8\u00fa\3\2\2\2\u00f9\u00eb\3\2\2\2\u00f9\u00ed\3\2\2\2\u00f9\u00ef"+
		"\3\2\2\2\u00f9\u00f4\3\2\2\2\u00f9\u00f6\3\2\2\2\u00fa-\3\2\2\2\u00fb"+
		"\u00fc\5N(\2\u00fc\u00fe\5,\27\2\u00fd\u00ff\5.\30\2\u00fe\u00fd\3\2\2"+
		"\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fb\3\2\2\2\u0101\u0104"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103/\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0105\u0108\7\f\2\2\u0106\u0109\7\60\2\2\u0107\u0109\5"+
		"F$\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\61\3\2\2\2\u010a\u010b"+
		"\7\31\2\2\u010b\u010c\7\60\2\2\u010c\63\3\2\2\2\u010d\u010e\7\32\2\2\u010e"+
		"\u010f\7\60\2\2\u010f\65\3\2\2\2\u0110\u0111\7\33\2\2\u0111\u0112\7\60"+
		"\2\2\u0112\67\3\2\2\2\u0113\u0114\7\34\2\2\u0114\u0115\7\60\2\2\u0115"+
		"9\3\2\2\2\u0116\u0117\5D#\2\u0117\u0118\5\34\17\2\u0118;\3\2\2\2\u0119"+
		"\u011a\7\31\2\2\u011a\u011b\5F$\2\u011b=\3\2\2\2\u011c\u011d\7\32\2\2"+
		"\u011d\u011e\5F$\2\u011e?\3\2\2\2\u011f\u0120\7\33\2\2\u0120\u0121\5F"+
		"$\2\u0121A\3\2\2\2\u0122\u0123\7\34\2\2\u0123\u0124\5F$\2\u0124C\3\2\2"+
		"\2\u0125\u012b\5\62\32\2\u0126\u012b\5\64\33\2\u0127\u012b\5\66\34\2\u0128"+
		"\u012b\58\35\2\u0129\u012b\5H%\2\u012a\u0125\3\2\2\2\u012a\u0126\3\2\2"+
		"\2\u012a\u0127\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012bE"+
		"\3\2\2\2\u012c\u012d\7\60\2\2\u012d\u012e\7)\2\2\u012eG\3\2\2\2\u012f"+
		"\u0134\5<\37\2\u0130\u0134\5> \2\u0131\u0134\5@!\2\u0132\u0134\5B\"\2"+
		"\u0133\u012f\3\2\2\2\u0133\u0130\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0132"+
		"\3\2\2\2\u0134I\3\2\2\2\u0135\u0138\7\60\2\2\u0136\u0138\5F$\2\u0137\u0135"+
		"\3\2\2\2\u0137\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\5\34\17\2"+
		"\u013aK\3\2\2\2\u013b\u013c\t\5\2\2\u013cM\3\2\2\2\u013d\u013e\t\6\2\2"+
		"\u013eO\3\2\2\2\34Wbmu\177\u0088\u008d\u0094\u0098\u00a0\u00a5\u00ab\u00b0"+
		"\u00b8\u00bf\u00c5\u00cb\u00d9\u00e8\u00f9\u00fe\u0102\u0108\u012a\u0133"+
		"\u0137";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}