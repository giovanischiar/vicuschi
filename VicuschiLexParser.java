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
		RULE_factor_a = 8, RULE_r_arith = 9, RULE_function_call = 10, RULE_function_declaration = 11, 
		RULE_declaration_params = 12, RULE_params = 13, RULE_attributed = 14, 
		RULE_attribution = 15, RULE_unary_expression = 16, RULE_decrement = 17, 
		RULE_increment = 18, RULE_if_declaration = 19, RULE_while_declaration = 20, 
		RULE_for_declaration = 21, RULE_logic_expr = 22, RULE_logic_factor = 23, 
		RULE_logic_factor_1 = 24, RULE_not_id = 25, RULE_integer_declaration = 26, 
		RULE_float_declaration = 27, RULE_string_declaration = 28, RULE_boolean_declaration = 29, 
		RULE_declaration_attribution = 30, RULE_integer_array_declaration = 31, 
		RULE_float_array_declaration = 32, RULE_string_array_declaration = 33, 
		RULE_boolean_array_declaration = 34, RULE_generic_declaration = 35, RULE_generic_array = 36, 
		RULE_generic_array_declaration = 37, RULE_generic_attribution = 38, RULE_literal = 39, 
		RULE_comparator = 40;
	public static final String[] ruleNames = {
		"r", "stmt", "simple_stmt", "arith_expr", "arith_expr_1", "term", "term_a", 
		"factor", "factor_a", "r_arith", "function_call", "function_declaration", 
		"declaration_params", "params", "attributed", "attribution", "unary_expression", 
		"decrement", "increment", "if_declaration", "while_declaration", "for_declaration", 
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
			setState(82);
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
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				simple_stmt();
				setState(85);
				match(SEMICOLON);
				}
				}
				setState(89); 
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
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				declaration_attribution();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				while_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				for_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				if_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				generic_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				unary_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(97);
				generic_attribution();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				function_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(99);
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
			setState(102);
			term();
			setState(103);
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
		public Arith_exprContext arith_expr() {
			return getRuleContext(Arith_exprContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(105);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(106);
				arith_expr();
				}
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			factor();
			setState(110);
			term_a();
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
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
		Term_aContext _localctx = new Term_aContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term_a);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2 || _la==T__3) {
				{
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
				term();
				}
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

	public static class FactorContext extends ParserRuleContext {
		public R_arithContext r_arith() {
			return getRuleContext(R_arithContext.class,0);
		}
		public Factor_aContext factor_a() {
			return getRuleContext(Factor_aContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			r_arith();
			setState(117);
			factor_a();
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

	public static class Factor_aContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Factor_aContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterFactor_a(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitFactor_a(this);
		}
	}

	public final Factor_aContext factor_a() throws RecognitionException {
		Factor_aContext _localctx = new Factor_aContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_factor_a);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(119);
				match(T__4);
				setState(120);
				factor();
				}
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

	public static class R_arithContext extends ParserRuleContext {
		public Arith_exprContext arith_expr() {
			return getRuleContext(Arith_exprContext.class,0);
		}
		public TerminalNode ID() { return getToken(VicuschiLexParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(VicuschiLexParser.NUMBER, 0); }
		public R_arithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_arith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterR_arith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitR_arith(this);
		}
	}

	public final R_arithContext r_arith() throws RecognitionException {
		R_arithContext _localctx = new R_arithContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_r_arith);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(T__5);
				setState(124);
				arith_expr();
				setState(125);
				match(T__6);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(NUMBER);
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
		enterRule(_localctx, 20, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(ID);
			setState(132);
			match(T__5);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__9) | (1L << STRING) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << BOOL) | (1L << NUMBER) | (1L << ARRAY) | (1L << ID))) != 0)) {
				{
				setState(133);
				params();
				}
			}

			setState(136);
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
		enterRule(_localctx, 22, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			generic_declaration();
			setState(139);
			match(T__5);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN))) != 0)) {
				{
				setState(140);
				declaration_params();
				}
			}

			setState(143);
			match(T__6);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(144);
				match(WS);
				}
			}

			setState(147);
			stmt();
			setState(148);
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
		enterRule(_localctx, 24, RULE_declaration_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			generic_declaration();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(151);
				match(T__7);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(152);
					match(WS);
					}
				}

				setState(155);
				generic_declaration();
				}
				}
				setState(160);
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
		enterRule(_localctx, 26, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			attributed();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(162);
				match(T__7);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(163);
					match(WS);
					}
				}

				setState(166);
				attributed();
				}
				}
				setState(171);
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
		enterRule(_localctx, 28, RULE_attributed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(172);
				literal();
				}
				break;
			case 2:
				{
				setState(173);
				unary_expression();
				}
				break;
			case 3:
				{
				setState(174);
				logic_expr(0);
				}
				break;
			case 4:
				{
				setState(175);
				function_call();
				}
				break;
			case 5:
				{
				setState(176);
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
		enterRule(_localctx, 30, RULE_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(ATTRIBUTION);
			setState(180);
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
		enterRule(_localctx, 32, RULE_unary_expression);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				decrement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
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
		enterRule(_localctx, 34, RULE_decrement);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(DECREMENT);
				setState(187);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(ID);
				setState(189);
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
		enterRule(_localctx, 36, RULE_increment);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(INCREMENT);
				setState(193);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(ID);
				setState(195);
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
		enterRule(_localctx, 38, RULE_if_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(IF);
			setState(199);
			logic_expr(0);
			setState(200);
			stmt();
			setState(201);
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
		enterRule(_localctx, 40, RULE_while_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(WHILE);
			setState(204);
			logic_expr(0);
			setState(205);
			stmt();
			setState(206);
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
		enterRule(_localctx, 42, RULE_for_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(FOR);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(209);
				match(ID);
				}
			}

			setState(212);
			match(EACH);
			setState(213);
			match(INTERVAL);
			setState(214);
			stmt();
			setState(215);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_logic_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(218);
			logic_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
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
					setState(220);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(221);
					_la = _input.LA(1);
					if ( !(_la==T__8 || _la==LOGICAL_AND) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(222);
					logic_factor();
					}
					} 
				}
				setState(227);
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
		enterRule(_localctx, 46, RULE_logic_factor);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(NUMBER);
				setState(229);
				logic_factor_1();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(ID);
				setState(231);
				logic_factor_1();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(T__5);
				setState(233);
				logic_expr(0);
				setState(234);
				match(T__6);
				setState(235);
				logic_factor_1();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				match(BOOL);
				setState(238);
				logic_factor_1();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(239);
				not_id();
				setState(240);
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
		enterRule(_localctx, 48, RULE_logic_factor_1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(244);
					comparator();
					setState(245);
					logic_factor();
					setState(247);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(246);
						logic_factor_1();
						}
						break;
					}
					}
					} 
				}
				setState(253);
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
		enterRule(_localctx, 50, RULE_not_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__9);
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(255);
				match(ID);
				}
				break;
			case 2:
				{
				setState(256);
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
		enterRule(_localctx, 52, RULE_integer_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(INT);
			setState(260);
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
		enterRule(_localctx, 54, RULE_float_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(FLOAT);
			setState(263);
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
		enterRule(_localctx, 56, RULE_string_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(STRING);
			setState(266);
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
		enterRule(_localctx, 58, RULE_boolean_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(BOOLEAN);
			setState(269);
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
		enterRule(_localctx, 60, RULE_declaration_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			generic_declaration();
			setState(272);
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
		enterRule(_localctx, 62, RULE_integer_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(INT);
			setState(275);
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
		enterRule(_localctx, 64, RULE_float_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(FLOAT);
			setState(278);
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
		enterRule(_localctx, 66, RULE_string_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(STRING);
			setState(281);
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
		enterRule(_localctx, 68, RULE_boolean_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(BOOLEAN);
			setState(284);
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
		enterRule(_localctx, 70, RULE_generic_declaration);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				integer_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				float_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				string_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				boolean_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(290);
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
		enterRule(_localctx, 72, RULE_generic_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(ID);
			setState(294);
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
		enterRule(_localctx, 74, RULE_generic_array_declaration);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				integer_array_declaration();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				float_array_declaration();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				string_array_declaration();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
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
		enterRule(_localctx, 76, RULE_generic_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(302);
				match(ID);
				}
				break;
			case 2:
				{
				setState(303);
				generic_array();
				}
				break;
			}
			setState(306);
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
		enterRule(_localctx, 78, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
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
		enterRule(_localctx, 80, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
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
		case 22:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u013b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\3\6\3Z\n\3\r\3\16\3[\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4g\n\4\3\5\3\5\3\5\3\6\3\6\5\6n\n\6\3\7\3\7\3\7\3\b\3\b\5\bu\n\b\3\t"+
		"\3\t\3\t\3\n\3\n\5\n|\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0084\n\13"+
		"\3\f\3\f\3\f\5\f\u0089\n\f\3\f\3\f\3\r\3\r\3\r\5\r\u0090\n\r\3\r\3\r\5"+
		"\r\u0094\n\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u009c\n\16\3\16\7\16\u009f"+
		"\n\16\f\16\16\16\u00a2\13\16\3\17\3\17\3\17\5\17\u00a7\n\17\3\17\7\17"+
		"\u00aa\n\17\f\17\16\17\u00ad\13\17\3\20\3\20\3\20\3\20\3\20\5\20\u00b4"+
		"\n\20\3\21\3\21\3\21\3\22\3\22\5\22\u00bb\n\22\3\23\3\23\3\23\3\23\5\23"+
		"\u00c1\n\23\3\24\3\24\3\24\3\24\5\24\u00c7\n\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u00d5\n\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u00e2\n\30\f\30\16\30\u00e5"+
		"\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u00f5\n\31\3\32\3\32\3\32\5\32\u00fa\n\32\7\32\u00fc\n\32\f"+
		"\32\16\32\u00ff\13\32\3\33\3\33\3\33\5\33\u0104\n\33\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\""+
		"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\5%\u0126\n%\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\5\'\u012f\n\'\3(\3(\5(\u0133\n(\3(\3(\3)\3)\3*\3*\3*\2\3.+\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2"+
		"\7\3\2\3\4\3\2\5\6\4\2\13\13&&\5\2\33\33+,..\3\2\35\"\2\u013e\2T\3\2\2"+
		"\2\4Y\3\2\2\2\6f\3\2\2\2\bh\3\2\2\2\nm\3\2\2\2\fo\3\2\2\2\16t\3\2\2\2"+
		"\20v\3\2\2\2\22{\3\2\2\2\24\u0083\3\2\2\2\26\u0085\3\2\2\2\30\u008c\3"+
		"\2\2\2\32\u0098\3\2\2\2\34\u00a3\3\2\2\2\36\u00b3\3\2\2\2 \u00b5\3\2\2"+
		"\2\"\u00ba\3\2\2\2$\u00c0\3\2\2\2&\u00c6\3\2\2\2(\u00c8\3\2\2\2*\u00cd"+
		"\3\2\2\2,\u00d2\3\2\2\2.\u00db\3\2\2\2\60\u00f4\3\2\2\2\62\u00fd\3\2\2"+
		"\2\64\u0100\3\2\2\2\66\u0105\3\2\2\28\u0108\3\2\2\2:\u010b\3\2\2\2<\u010e"+
		"\3\2\2\2>\u0111\3\2\2\2@\u0114\3\2\2\2B\u0117\3\2\2\2D\u011a\3\2\2\2F"+
		"\u011d\3\2\2\2H\u0125\3\2\2\2J\u0127\3\2\2\2L\u012e\3\2\2\2N\u0132\3\2"+
		"\2\2P\u0136\3\2\2\2R\u0138\3\2\2\2TU\5\4\3\2U\3\3\2\2\2VW\5\6\4\2WX\7"+
		"(\2\2XZ\3\2\2\2YV\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\5\3\2\2\2]"+
		"g\5> \2^g\5*\26\2_g\5,\27\2`g\5(\25\2ag\5H%\2bg\5\"\22\2cg\5N(\2dg\5\30"+
		"\r\2eg\5\26\f\2f]\3\2\2\2f^\3\2\2\2f_\3\2\2\2f`\3\2\2\2fa\3\2\2\2fb\3"+
		"\2\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\7\3\2\2\2hi\5\f\7\2ij\5\n\6\2j\t"+
		"\3\2\2\2kl\t\2\2\2ln\5\b\5\2mk\3\2\2\2mn\3\2\2\2n\13\3\2\2\2op\5\20\t"+
		"\2pq\5\16\b\2q\r\3\2\2\2rs\t\3\2\2su\5\f\7\2tr\3\2\2\2tu\3\2\2\2u\17\3"+
		"\2\2\2vw\5\24\13\2wx\5\22\n\2x\21\3\2\2\2yz\7\7\2\2z|\5\20\t\2{y\3\2\2"+
		"\2{|\3\2\2\2|\23\3\2\2\2}~\7\b\2\2~\177\5\b\5\2\177\u0080\7\t\2\2\u0080"+
		"\u0084\3\2\2\2\u0081\u0084\7\60\2\2\u0082\u0084\7,\2\2\u0083}\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\25\3\2\2\2\u0085\u0086"+
		"\7\60\2\2\u0086\u0088\7\b\2\2\u0087\u0089\5\34\17\2\u0088\u0087\3\2\2"+
		"\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\7\t\2\2\u008b\27"+
		"\3\2\2\2\u008c\u008d\5H%\2\u008d\u008f\7\b\2\2\u008e\u0090\5\32\16\2\u008f"+
		"\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\7\t"+
		"\2\2\u0092\u0094\7\63\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\5\4\3\2\u0096\u0097\7\27\2\2\u0097\31\3\2\2"+
		"\2\u0098\u00a0\5H%\2\u0099\u009b\7\n\2\2\u009a\u009c\7\63\2\2\u009b\u009a"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\5H%\2\u009e"+
		"\u0099\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\33\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00ab\5\36\20\2\u00a4"+
		"\u00a6\7\n\2\2\u00a5\u00a7\7\63\2\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3"+
		"\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\5\36\20\2\u00a9\u00a4\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\35\3\2\2"+
		"\2\u00ad\u00ab\3\2\2\2\u00ae\u00b4\5P)\2\u00af\u00b4\5\"\22\2\u00b0\u00b4"+
		"\5.\30\2\u00b1\u00b4\5\26\f\2\u00b2\u00b4\5\b\5\2\u00b3\u00ae\3\2\2\2"+
		"\u00b3\u00af\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2"+
		"\3\2\2\2\u00b4\37\3\2\2\2\u00b5\u00b6\7#\2\2\u00b6\u00b7\5\36\20\2\u00b7"+
		"!\3\2\2\2\u00b8\u00bb\5$\23\2\u00b9\u00bb\5&\24\2\u00ba\u00b8\3\2\2\2"+
		"\u00ba\u00b9\3\2\2\2\u00bb#\3\2\2\2\u00bc\u00bd\7%\2\2\u00bd\u00c1\7\60"+
		"\2\2\u00be\u00bf\7\60\2\2\u00bf\u00c1\7%\2\2\u00c0\u00bc\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1%\3\2\2\2\u00c2\u00c3\7$\2\2\u00c3\u00c7\7\60\2\2"+
		"\u00c4\u00c5\7\60\2\2\u00c5\u00c7\7$\2\2\u00c6\u00c2\3\2\2\2\u00c6\u00c4"+
		"\3\2\2\2\u00c7\'\3\2\2\2\u00c8\u00c9\7\r\2\2\u00c9\u00ca\5.\30\2\u00ca"+
		"\u00cb\5\4\3\2\u00cb\u00cc\7\16\2\2\u00cc)\3\2\2\2\u00cd\u00ce\7\23\2"+
		"\2\u00ce\u00cf\5.\30\2\u00cf\u00d0\5\4\3\2\u00d0\u00d1\7\24\2\2\u00d1"+
		"+\3\2\2\2\u00d2\u00d4\7\17\2\2\u00d3\u00d5\7\60\2\2\u00d4\u00d3\3\2\2"+
		"\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7*\2\2\u00d7\u00d8"+
		"\7/\2\2\u00d8\u00d9\5\4\3\2\u00d9\u00da\7\20\2\2\u00da-\3\2\2\2\u00db"+
		"\u00dc\b\30\1\2\u00dc\u00dd\5\60\31\2\u00dd\u00e3\3\2\2\2\u00de\u00df"+
		"\f\3\2\2\u00df\u00e0\t\4\2\2\u00e0\u00e2\5\60\31\2\u00e1\u00de\3\2\2\2"+
		"\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4/\3"+
		"\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7,\2\2\u00e7\u00f5\5\62\32\2\u00e8"+
		"\u00e9\7\60\2\2\u00e9\u00f5\5\62\32\2\u00ea\u00eb\7\b\2\2\u00eb\u00ec"+
		"\5.\30\2\u00ec\u00ed\7\t\2\2\u00ed\u00ee\5\62\32\2\u00ee\u00f5\3\2\2\2"+
		"\u00ef\u00f0\7+\2\2\u00f0\u00f5\5\62\32\2\u00f1\u00f2\5\64\33\2\u00f2"+
		"\u00f3\5\62\32\2\u00f3\u00f5\3\2\2\2\u00f4\u00e6\3\2\2\2\u00f4\u00e8\3"+
		"\2\2\2\u00f4\u00ea\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f5"+
		"\61\3\2\2\2\u00f6\u00f7\5R*\2\u00f7\u00f9\5\60\31\2\u00f8\u00fa\5\62\32"+
		"\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f6"+
		"\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\63\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0103\7\f\2\2\u0101\u0104\7\60\2"+
		"\2\u0102\u0104\5J&\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104\65"+
		"\3\2\2\2\u0105\u0106\7\31\2\2\u0106\u0107\7\60\2\2\u0107\67\3\2\2\2\u0108"+
		"\u0109\7\32\2\2\u0109\u010a\7\60\2\2\u010a9\3\2\2\2\u010b\u010c\7\33\2"+
		"\2\u010c\u010d\7\60\2\2\u010d;\3\2\2\2\u010e\u010f\7\34\2\2\u010f\u0110"+
		"\7\60\2\2\u0110=\3\2\2\2\u0111\u0112\5H%\2\u0112\u0113\5 \21\2\u0113?"+
		"\3\2\2\2\u0114\u0115\7\31\2\2\u0115\u0116\5J&\2\u0116A\3\2\2\2\u0117\u0118"+
		"\7\32\2\2\u0118\u0119\5J&\2\u0119C\3\2\2\2\u011a\u011b\7\33\2\2\u011b"+
		"\u011c\5J&\2\u011cE\3\2\2\2\u011d\u011e\7\34\2\2\u011e\u011f\5J&\2\u011f"+
		"G\3\2\2\2\u0120\u0126\5\66\34\2\u0121\u0126\58\35\2\u0122\u0126\5:\36"+
		"\2\u0123\u0126\5<\37\2\u0124\u0126\5L\'\2\u0125\u0120\3\2\2\2\u0125\u0121"+
		"\3\2\2\2\u0125\u0122\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126"+
		"I\3\2\2\2\u0127\u0128\7\60\2\2\u0128\u0129\7)\2\2\u0129K\3\2\2\2\u012a"+
		"\u012f\5@!\2\u012b\u012f\5B\"\2\u012c\u012f\5D#\2\u012d\u012f\5F$\2\u012e"+
		"\u012a\3\2\2\2\u012e\u012b\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2"+
		"\2\2\u012fM\3\2\2\2\u0130\u0133\7\60\2\2\u0131\u0133\5J&\2\u0132\u0130"+
		"\3\2\2\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\5 \21\2\u0135"+
		"O\3\2\2\2\u0136\u0137\t\5\2\2\u0137Q\3\2\2\2\u0138\u0139\t\6\2\2\u0139"+
		"S\3\2\2\2\34[fmt{\u0083\u0088\u008f\u0093\u009b\u00a0\u00a6\u00ab\u00b3"+
		"\u00ba\u00c0\u00c6\u00d4\u00e3\u00f4\u00f9\u00fd\u0103\u0125\u012e\u0132";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}