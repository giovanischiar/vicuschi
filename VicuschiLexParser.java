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
		IF=10, ENDIF=11, FOR=12, ENDFOR=13, CASE=14, WHEN=15, WHILE=16, ENDWHILE=17, 
		ENDCASE=18, CONTINUE=19, ENDF=20, RETURN=21, IMPORT=22, INT=23, FLOAT=24, 
		STRING=25, BOOLEAN=26, MAJOR=27, MINOR=28, EQUALS=29, MAJOR_EQUALS=30, 
		MINOR_EQUALS=31, DIFFERENT=32, ATTRIBUTION=33, INCREMENT=34, DECREMENT=35, 
		THEN=36, LOGICAL_AND=37, LOGICAL_OR=38, SEMICOLON=39, INDEX=40, EACH=41, 
		BOOL=42, NUMBER=43, WORD=44, ARRAY=45, INTERVAL=46, ID=47, S_COMMENTARY=48, 
		M_COMMENTARY=49, WS=50;
	public static final int
		RULE_r = 0, RULE_stmt = 1, RULE_simple_stmt = 2, RULE_import_declaration = 3, 
		RULE_arith_expr = 4, RULE_arith_expr_1 = 5, RULE_term = 6, RULE_term_a = 7, 
		RULE_factor = 8, RULE_factor_a = 9, RULE_r_arith = 10, RULE_function_call = 11, 
		RULE_function_declaration = 12, RULE_declaration_params = 13, RULE_params = 14, 
		RULE_attributed = 15, RULE_attribution = 16, RULE_unary_expression = 17, 
		RULE_decrement = 18, RULE_increment = 19, RULE_if_declaration = 20, RULE_while_declaration = 21, 
		RULE_for_declaration = 22, RULE_logic_expr = 23, RULE_logic_expr_1 = 24, 
		RULE_logic_term = 25, RULE_logic_term_a = 26, RULE_r_logic = 27, RULE_not_id = 28, 
		RULE_integer_declaration = 29, RULE_float_declaration = 30, RULE_string_declaration = 31, 
		RULE_boolean_declaration = 32, RULE_declaration_attribution = 33, RULE_integer_array_declaration = 34, 
		RULE_float_array_declaration = 35, RULE_string_array_declaration = 36, 
		RULE_boolean_array_declaration = 37, RULE_generic_declaration = 38, RULE_generic_array = 39, 
		RULE_generic_array_declaration = 40, RULE_generic_attribution = 41, RULE_literal = 42, 
		RULE_comparator = 43;
	public static final String[] ruleNames = {
		"r", "stmt", "simple_stmt", "import_declaration", "arith_expr", "arith_expr_1", 
		"term", "term_a", "factor", "factor_a", "r_arith", "function_call", "function_declaration", 
		"declaration_params", "params", "attributed", "attribution", "unary_expression", 
		"decrement", "increment", "if_declaration", "while_declaration", "for_declaration", 
		"logic_expr", "logic_expr_1", "logic_term", "logic_term_a", "r_logic", 
		"not_id", "integer_declaration", "float_declaration", "string_declaration", 
		"boolean_declaration", "declaration_attribution", "integer_array_declaration", 
		"float_array_declaration", "string_array_declaration", "boolean_array_declaration", 
		"generic_declaration", "generic_array", "generic_array_declaration", "generic_attribution", 
		"literal", "comparator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "')'", "','", "'!'", "'if'", 
		"'endif'", "'for'", "'endfor'", "'case'", "'when'", "'while'", "'endwhile'", 
		"'endcase'", "'continue'", "'endf'", "'return'", "'import'", "'int'", 
		"'float'", "'string'", "'boolean'", "'>'", "'<'", "'=='", "'>='", "'<='", 
		"'!='", "'='", "'++'", "'--'", "'->'", "'&'", "'|'", "';'", null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "IF", "ENDIF", 
		"FOR", "ENDFOR", "CASE", "WHEN", "WHILE", "ENDWHILE", "ENDCASE", "CONTINUE", 
		"ENDF", "RETURN", "IMPORT", "INT", "FLOAT", "STRING", "BOOLEAN", "MAJOR", 
		"MINOR", "EQUALS", "MAJOR_EQUALS", "MINOR_EQUALS", "DIFFERENT", "ATTRIBUTION", 
		"INCREMENT", "DECREMENT", "THEN", "LOGICAL_AND", "LOGICAL_OR", "SEMICOLON", 
		"INDEX", "EACH", "BOOL", "NUMBER", "WORD", "ARRAY", "INTERVAL", "ID", 
		"S_COMMENTARY", "M_COMMENTARY", "WS"
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
			setState(88);
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
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				simple_stmt();
				setState(91);
				match(SEMICOLON);
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << IMPORT) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << ID))) != 0) );
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
		public Import_declarationContext import_declaration() {
			return getRuleContext(Import_declarationContext.class,0);
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
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				declaration_attribution();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				while_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				for_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				if_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				generic_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				unary_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(103);
				generic_attribution();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(104);
				function_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(105);
				function_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(106);
				import_declaration();
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

	public static class Import_declarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(VicuschiLexParser.IMPORT, 0); }
		public TerminalNode WORD() { return getToken(VicuschiLexParser.WORD, 0); }
		public Import_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterImport_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitImport_declaration(this);
		}
	}

	public final Import_declarationContext import_declaration() throws RecognitionException {
		Import_declarationContext _localctx = new Import_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_import_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(IMPORT);
			setState(110);
			match(WORD);
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
		enterRule(_localctx, 8, RULE_arith_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			term();
			setState(113);
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
		enterRule(_localctx, 10, RULE_arith_expr_1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(115);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(116);
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
		enterRule(_localctx, 12, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			factor();
			setState(120);
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
		enterRule(_localctx, 14, RULE_term_a);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2 || _la==T__3) {
				{
				setState(122);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(123);
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
		enterRule(_localctx, 16, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			r_arith();
			setState(127);
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
		enterRule(_localctx, 18, RULE_factor_a);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(129);
				match(T__4);
				setState(130);
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
		enterRule(_localctx, 20, RULE_r_arith);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(T__5);
				setState(134);
				arith_expr();
				setState(135);
				match(T__6);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
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
		enterRule(_localctx, 22, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(ID);
			setState(142);
			match(T__5);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << STRING) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << BOOL) | (1L << NUMBER) | (1L << ARRAY) | (1L << ID))) != 0)) {
				{
				setState(143);
				params();
				}
			}

			setState(146);
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
		enterRule(_localctx, 24, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			generic_declaration();
			setState(149);
			match(T__5);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN))) != 0)) {
				{
				setState(150);
				declaration_params();
				}
			}

			setState(153);
			match(T__6);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(154);
				match(WS);
				}
			}

			setState(157);
			stmt();
			setState(158);
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
		enterRule(_localctx, 26, RULE_declaration_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			generic_declaration();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(161);
				match(T__7);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(162);
					match(WS);
					}
				}

				setState(165);
				generic_declaration();
				}
				}
				setState(170);
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
		enterRule(_localctx, 28, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			attributed();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(172);
				match(T__7);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(173);
					match(WS);
					}
				}

				setState(176);
				attributed();
				}
				}
				setState(181);
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
		enterRule(_localctx, 30, RULE_attributed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(182);
				literal();
				}
				break;
			case 2:
				{
				setState(183);
				unary_expression();
				}
				break;
			case 3:
				{
				setState(184);
				logic_expr();
				}
				break;
			case 4:
				{
				setState(185);
				function_call();
				}
				break;
			case 5:
				{
				setState(186);
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
		enterRule(_localctx, 32, RULE_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(ATTRIBUTION);
			setState(190);
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
		enterRule(_localctx, 34, RULE_unary_expression);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				decrement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
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
		enterRule(_localctx, 36, RULE_decrement);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(DECREMENT);
				setState(197);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(ID);
				setState(199);
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
		enterRule(_localctx, 38, RULE_increment);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(INCREMENT);
				setState(203);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(ID);
				setState(205);
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
		enterRule(_localctx, 40, RULE_if_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(IF);
			setState(209);
			logic_expr();
			setState(210);
			stmt();
			setState(211);
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
		enterRule(_localctx, 42, RULE_while_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(WHILE);
			setState(214);
			logic_expr();
			setState(215);
			stmt();
			setState(216);
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
		enterRule(_localctx, 44, RULE_for_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(FOR);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(219);
				match(ID);
				}
			}

			setState(222);
			match(EACH);
			setState(223);
			match(INTERVAL);
			setState(224);
			stmt();
			setState(225);
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
		public Logic_termContext logic_term() {
			return getRuleContext(Logic_termContext.class,0);
		}
		public Logic_expr_1Context logic_expr_1() {
			return getRuleContext(Logic_expr_1Context.class,0);
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
		Logic_exprContext _localctx = new Logic_exprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_logic_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			logic_term();
			setState(228);
			logic_expr_1();
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

	public static class Logic_expr_1Context extends ParserRuleContext {
		public TerminalNode LOGICAL_OR() { return getToken(VicuschiLexParser.LOGICAL_OR, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public Logic_expr_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expr_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterLogic_expr_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitLogic_expr_1(this);
		}
	}

	public final Logic_expr_1Context logic_expr_1() throws RecognitionException {
		Logic_expr_1Context _localctx = new Logic_expr_1Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_logic_expr_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(230);
				match(LOGICAL_OR);
				setState(231);
				logic_expr();
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

	public static class Logic_termContext extends ParserRuleContext {
		public R_logicContext r_logic() {
			return getRuleContext(R_logicContext.class,0);
		}
		public Logic_term_aContext logic_term_a() {
			return getRuleContext(Logic_term_aContext.class,0);
		}
		public Logic_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterLogic_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitLogic_term(this);
		}
	}

	public final Logic_termContext logic_term() throws RecognitionException {
		Logic_termContext _localctx = new Logic_termContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_logic_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			r_logic();
			setState(235);
			logic_term_a();
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

	public static class Logic_term_aContext extends ParserRuleContext {
		public TerminalNode LOGICAL_AND() { return getToken(VicuschiLexParser.LOGICAL_AND, 0); }
		public Logic_termContext logic_term() {
			return getRuleContext(Logic_termContext.class,0);
		}
		public Logic_term_aContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_term_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterLogic_term_a(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitLogic_term_a(this);
		}
	}

	public final Logic_term_aContext logic_term_a() throws RecognitionException {
		Logic_term_aContext _localctx = new Logic_term_aContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_logic_term_a);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(237);
				match(LOGICAL_AND);
				setState(238);
				logic_term();
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

	public static class R_logicContext extends ParserRuleContext {
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(VicuschiLexParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VicuschiLexParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(VicuschiLexParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(VicuschiLexParser.NUMBER, i);
		}
		public TerminalNode BOOL() { return getToken(VicuschiLexParser.BOOL, 0); }
		public Not_idContext not_id() {
			return getRuleContext(Not_idContext.class,0);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public R_logicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).enterR_logic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiLexListener ) ((VicuschiLexListener)listener).exitR_logic(this);
		}
	}

	public final R_logicContext r_logic() throws RecognitionException {
		R_logicContext _localctx = new R_logicContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_r_logic);
		int _la;
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(T__5);
				setState(242);
				logic_expr();
				setState(243);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(T__8);
				setState(246);
				logic_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				match(NUMBER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				match(BOOL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(250);
				not_id();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(251);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(252);
				comparator();
				setState(253);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
		enterRule(_localctx, 56, RULE_not_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__8);
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(258);
				match(ID);
				}
				break;
			case 2:
				{
				setState(259);
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
		enterRule(_localctx, 58, RULE_integer_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(INT);
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
		enterRule(_localctx, 60, RULE_float_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(FLOAT);
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
		enterRule(_localctx, 62, RULE_string_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(STRING);
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
		enterRule(_localctx, 64, RULE_boolean_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(BOOLEAN);
			setState(272);
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
		enterRule(_localctx, 66, RULE_declaration_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			generic_declaration();
			setState(275);
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
		enterRule(_localctx, 68, RULE_integer_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(INT);
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
		enterRule(_localctx, 70, RULE_float_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(FLOAT);
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
		enterRule(_localctx, 72, RULE_string_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(STRING);
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
		enterRule(_localctx, 74, RULE_boolean_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(BOOLEAN);
			setState(287);
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
		enterRule(_localctx, 76, RULE_generic_declaration);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				integer_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				float_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				string_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				boolean_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(293);
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
		enterRule(_localctx, 78, RULE_generic_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(ID);
			setState(297);
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
		enterRule(_localctx, 80, RULE_generic_array_declaration);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				integer_array_declaration();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				float_array_declaration();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				string_array_declaration();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
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
		enterRule(_localctx, 82, RULE_generic_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(305);
				match(ID);
				}
				break;
			case 2:
				{
				setState(306);
				generic_array();
				}
				break;
			}
			setState(309);
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
		enterRule(_localctx, 84, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
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
		enterRule(_localctx, 86, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u013e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\3\6\3`\n\3\r\3\16\3a\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4n\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\5\7x\n\7"+
		"\3\b\3\b\3\b\3\t\3\t\5\t\177\n\t\3\n\3\n\3\n\3\13\3\13\5\13\u0086\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008e\n\f\3\r\3\r\3\r\5\r\u0093\n\r\3\r\3"+
		"\r\3\16\3\16\3\16\5\16\u009a\n\16\3\16\3\16\5\16\u009e\n\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\5\17\u00a6\n\17\3\17\7\17\u00a9\n\17\f\17\16\17\u00ac"+
		"\13\17\3\20\3\20\3\20\5\20\u00b1\n\20\3\20\7\20\u00b4\n\20\f\20\16\20"+
		"\u00b7\13\20\3\21\3\21\3\21\3\21\3\21\5\21\u00be\n\21\3\22\3\22\3\22\3"+
		"\23\3\23\5\23\u00c5\n\23\3\24\3\24\3\24\3\24\5\24\u00cb\n\24\3\25\3\25"+
		"\3\25\3\25\5\25\u00d1\n\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\5\30\u00df\n\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\5\32\u00eb\n\32\3\33\3\33\3\33\3\34\3\34\5\34\u00f2\n\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5"+
		"\35\u0102\n\35\3\36\3\36\3\36\5\36\u0107\n\36\3\37\3\37\3\37\3 \3 \3 "+
		"\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\5(\u0129\n(\3)\3)\3)\3*\3*\3*\3*\5*\u0132\n*\3+\3+\5+"+
		"\u0136\n+\3+\3+\3,\3,\3-\3-\3-\2\2.\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX\2\7\3\2\3\4\3\2\5\6\4\2--\61"+
		"\61\5\2\33\33,-//\3\2\35\"\2\u0140\2Z\3\2\2\2\4_\3\2\2\2\6m\3\2\2\2\b"+
		"o\3\2\2\2\nr\3\2\2\2\fw\3\2\2\2\16y\3\2\2\2\20~\3\2\2\2\22\u0080\3\2\2"+
		"\2\24\u0085\3\2\2\2\26\u008d\3\2\2\2\30\u008f\3\2\2\2\32\u0096\3\2\2\2"+
		"\34\u00a2\3\2\2\2\36\u00ad\3\2\2\2 \u00bd\3\2\2\2\"\u00bf\3\2\2\2$\u00c4"+
		"\3\2\2\2&\u00ca\3\2\2\2(\u00d0\3\2\2\2*\u00d2\3\2\2\2,\u00d7\3\2\2\2."+
		"\u00dc\3\2\2\2\60\u00e5\3\2\2\2\62\u00ea\3\2\2\2\64\u00ec\3\2\2\2\66\u00f1"+
		"\3\2\2\28\u0101\3\2\2\2:\u0103\3\2\2\2<\u0108\3\2\2\2>\u010b\3\2\2\2@"+
		"\u010e\3\2\2\2B\u0111\3\2\2\2D\u0114\3\2\2\2F\u0117\3\2\2\2H\u011a\3\2"+
		"\2\2J\u011d\3\2\2\2L\u0120\3\2\2\2N\u0128\3\2\2\2P\u012a\3\2\2\2R\u0131"+
		"\3\2\2\2T\u0135\3\2\2\2V\u0139\3\2\2\2X\u013b\3\2\2\2Z[\5\4\3\2[\3\3\2"+
		"\2\2\\]\5\6\4\2]^\7)\2\2^`\3\2\2\2_\\\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3"+
		"\2\2\2b\5\3\2\2\2cn\5D#\2dn\5,\27\2en\5.\30\2fn\5*\26\2gn\5N(\2hn\5$\23"+
		"\2in\5T+\2jn\5\32\16\2kn\5\30\r\2ln\5\b\5\2mc\3\2\2\2md\3\2\2\2me\3\2"+
		"\2\2mf\3\2\2\2mg\3\2\2\2mh\3\2\2\2mi\3\2\2\2mj\3\2\2\2mk\3\2\2\2ml\3\2"+
		"\2\2n\7\3\2\2\2op\7\30\2\2pq\7.\2\2q\t\3\2\2\2rs\5\16\b\2st\5\f\7\2t\13"+
		"\3\2\2\2uv\t\2\2\2vx\5\n\6\2wu\3\2\2\2wx\3\2\2\2x\r\3\2\2\2yz\5\22\n\2"+
		"z{\5\20\t\2{\17\3\2\2\2|}\t\3\2\2}\177\5\16\b\2~|\3\2\2\2~\177\3\2\2\2"+
		"\177\21\3\2\2\2\u0080\u0081\5\26\f\2\u0081\u0082\5\24\13\2\u0082\23\3"+
		"\2\2\2\u0083\u0084\7\7\2\2\u0084\u0086\5\22\n\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\25\3\2\2\2\u0087\u0088\7\b\2\2\u0088\u0089\5\n\6"+
		"\2\u0089\u008a\7\t\2\2\u008a\u008e\3\2\2\2\u008b\u008e\7\61\2\2\u008c"+
		"\u008e\7-\2\2\u008d\u0087\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2"+
		"\2\2\u008e\27\3\2\2\2\u008f\u0090\7\61\2\2\u0090\u0092\7\b\2\2\u0091\u0093"+
		"\5\36\20\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2"+
		"\u0094\u0095\7\t\2\2\u0095\31\3\2\2\2\u0096\u0097\5N(\2\u0097\u0099\7"+
		"\b\2\2\u0098\u009a\5\34\17\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009d\7\t\2\2\u009c\u009e\7\64\2\2\u009d\u009c\3"+
		"\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\5\4\3\2\u00a0"+
		"\u00a1\7\26\2\2\u00a1\33\3\2\2\2\u00a2\u00aa\5N(\2\u00a3\u00a5\7\n\2\2"+
		"\u00a4\u00a6\7\64\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a9\5N(\2\u00a8\u00a3\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\35\3\2\2\2\u00ac\u00aa\3\2\2"+
		"\2\u00ad\u00b5\5 \21\2\u00ae\u00b0\7\n\2\2\u00af\u00b1\7\64\2\2\u00b0"+
		"\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\5 "+
		"\21\2\u00b3\u00ae\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\37\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00be\5V,\2"+
		"\u00b9\u00be\5$\23\2\u00ba\u00be\5\60\31\2\u00bb\u00be\5\30\r\2\u00bc"+
		"\u00be\5\n\6\2\u00bd\u00b8\3\2\2\2\u00bd\u00b9\3\2\2\2\u00bd\u00ba\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be!\3\2\2\2\u00bf\u00c0"+
		"\7#\2\2\u00c0\u00c1\5 \21\2\u00c1#\3\2\2\2\u00c2\u00c5\5&\24\2\u00c3\u00c5"+
		"\5(\25\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5%\3\2\2\2\u00c6"+
		"\u00c7\7%\2\2\u00c7\u00cb\7\61\2\2\u00c8\u00c9\7\61\2\2\u00c9\u00cb\7"+
		"%\2\2\u00ca\u00c6\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\'\3\2\2\2\u00cc\u00cd"+
		"\7$\2\2\u00cd\u00d1\7\61\2\2\u00ce\u00cf\7\61\2\2\u00cf\u00d1\7$\2\2\u00d0"+
		"\u00cc\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1)\3\2\2\2\u00d2\u00d3\7\f\2\2"+
		"\u00d3\u00d4\5\60\31\2\u00d4\u00d5\5\4\3\2\u00d5\u00d6\7\r\2\2\u00d6+"+
		"\3\2\2\2\u00d7\u00d8\7\22\2\2\u00d8\u00d9\5\60\31\2\u00d9\u00da\5\4\3"+
		"\2\u00da\u00db\7\23\2\2\u00db-\3\2\2\2\u00dc\u00de\7\16\2\2\u00dd\u00df"+
		"\7\61\2\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2"+
		"\u00e0\u00e1\7+\2\2\u00e1\u00e2\7\60\2\2\u00e2\u00e3\5\4\3\2\u00e3\u00e4"+
		"\7\17\2\2\u00e4/\3\2\2\2\u00e5\u00e6\5\64\33\2\u00e6\u00e7\5\62\32\2\u00e7"+
		"\61\3\2\2\2\u00e8\u00e9\7(\2\2\u00e9\u00eb\5\60\31\2\u00ea\u00e8\3\2\2"+
		"\2\u00ea\u00eb\3\2\2\2\u00eb\63\3\2\2\2\u00ec\u00ed\58\35\2\u00ed\u00ee"+
		"\5\66\34\2\u00ee\65\3\2\2\2\u00ef\u00f0\7\'\2\2\u00f0\u00f2\5\64\33\2"+
		"\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\67\3\2\2\2\u00f3\u00f4"+
		"\7\b\2\2\u00f4\u00f5\5\60\31\2\u00f5\u00f6\7\t\2\2\u00f6\u0102\3\2\2\2"+
		"\u00f7\u00f8\7\13\2\2\u00f8\u0102\5\60\31\2\u00f9\u0102\7\61\2\2\u00fa"+
		"\u0102\7-\2\2\u00fb\u0102\7,\2\2\u00fc\u0102\5:\36\2\u00fd\u00fe\t\4\2"+
		"\2\u00fe\u00ff\5X-\2\u00ff\u0100\t\4\2\2\u0100\u0102\3\2\2\2\u0101\u00f3"+
		"\3\2\2\2\u0101\u00f7\3\2\2\2\u0101\u00f9\3\2\2\2\u0101\u00fa\3\2\2\2\u0101"+
		"\u00fb\3\2\2\2\u0101\u00fc\3\2\2\2\u0101\u00fd\3\2\2\2\u01029\3\2\2\2"+
		"\u0103\u0106\7\13\2\2\u0104\u0107\7\61\2\2\u0105\u0107\5P)\2\u0106\u0104"+
		"\3\2\2\2\u0106\u0105\3\2\2\2\u0107;\3\2\2\2\u0108\u0109\7\31\2\2\u0109"+
		"\u010a\7\61\2\2\u010a=\3\2\2\2\u010b\u010c\7\32\2\2\u010c\u010d\7\61\2"+
		"\2\u010d?\3\2\2\2\u010e\u010f\7\33\2\2\u010f\u0110\7\61\2\2\u0110A\3\2"+
		"\2\2\u0111\u0112\7\34\2\2\u0112\u0113\7\61\2\2\u0113C\3\2\2\2\u0114\u0115"+
		"\5N(\2\u0115\u0116\5\"\22\2\u0116E\3\2\2\2\u0117\u0118\7\31\2\2\u0118"+
		"\u0119\5P)\2\u0119G\3\2\2\2\u011a\u011b\7\32\2\2\u011b\u011c\5P)\2\u011c"+
		"I\3\2\2\2\u011d\u011e\7\33\2\2\u011e\u011f\5P)\2\u011fK\3\2\2\2\u0120"+
		"\u0121\7\34\2\2\u0121\u0122\5P)\2\u0122M\3\2\2\2\u0123\u0129\5<\37\2\u0124"+
		"\u0129\5> \2\u0125\u0129\5@!\2\u0126\u0129\5B\"\2\u0127\u0129\5R*\2\u0128"+
		"\u0123\3\2\2\2\u0128\u0124\3\2\2\2\u0128\u0125\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0128\u0127\3\2\2\2\u0129O\3\2\2\2\u012a\u012b\7\61\2\2\u012b\u012c"+
		"\7*\2\2\u012cQ\3\2\2\2\u012d\u0132\5F$\2\u012e\u0132\5H%\2\u012f\u0132"+
		"\5J&\2\u0130\u0132\5L\'\2\u0131\u012d\3\2\2\2\u0131\u012e\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132S\3\2\2\2\u0133\u0136\7\61\2\2"+
		"\u0134\u0136\5P)\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137\u0138\5\"\22\2\u0138U\3\2\2\2\u0139\u013a\t\5\2\2\u013a"+
		"W\3\2\2\2\u013b\u013c\t\6\2\2\u013cY\3\2\2\2\33amw~\u0085\u008d\u0092"+
		"\u0099\u009d\u00a5\u00aa\u00b0\u00b5\u00bd\u00c4\u00ca\u00d0\u00de\u00ea"+
		"\u00f1\u0101\u0106\u0128\u0131\u0135";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}