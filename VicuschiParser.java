// Generated from Vicuschi.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VicuschiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, IF=11, ENDIF=12, FOR=13, ENDFOR=14, CASE=15, WHEN=16, WHILE=17, 
		ENDWHILE=18, ENDCASE=19, CONTINUE=20, ENDF=21, RETURN=22, IMPORT=23, INT=24, 
		FLOAT=25, STRING=26, BOOLEAN=27, MAJOR=28, MINOR=29, EQUALS=30, MAJOR_EQUALS=31, 
		MINOR_EQUALS=32, DIFFERENT=33, ATTRIBUTION=34, INCREMENT=35, DECREMENT=36, 
		THEN=37, UNARY_PLUS=38, UNARY_MINUS=39, LOGICAL_AND=40, LOGICAL_OR=41, 
		SEMICOLON=42, INT_NUMBER=43, FLOAT_NUMBER=44, EACH=45, BOOL=46, NUMBER=47, 
		WORD=48, ARRAY=49, ID=50, S_COMMENTARY=51, M_COMMENTARY=52, WS=53;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_simple_stmt = 2, RULE_import_declaration = 3, 
		RULE_arith_expr = 4, RULE_arith_expr_1 = 5, RULE_term = 6, RULE_term_a = 7, 
		RULE_factor = 8, RULE_factor_a = 9, RULE_r_arith = 10, RULE_arith_id = 11, 
		RULE_arith_number = 12, RULE_function_call = 13, RULE_function_declaration = 14, 
		RULE_declaration_params = 15, RULE_params = 16, RULE_attributed = 17, 
		RULE_attribution = 18, RULE_unary_expression = 19, RULE_decrement = 20, 
		RULE_increment = 21, RULE_if_declaration = 22, RULE_while_declaration = 23, 
		RULE_for_declaration = 24, RULE_logic_expr = 25, RULE_logic_expr_1 = 26, 
		RULE_logic_term = 27, RULE_logic_term_a = 28, RULE_r_logic = 29, RULE_not_id = 30, 
		RULE_declaration_attribution = 31, RULE_generic_declaration = 32, RULE_generic_unary_declaration = 33, 
		RULE_integer_declaration = 34, RULE_float_declaration = 35, RULE_string_declaration = 36, 
		RULE_boolean_declaration = 37, RULE_generic_array_declaration = 38, RULE_integer_array_declaration = 39, 
		RULE_float_array_declaration = 40, RULE_string_array_declaration = 41, 
		RULE_boolean_array_declaration = 42, RULE_generic_array = 43, RULE_index = 44, 
		RULE_generic_attribution = 45, RULE_attribution_id = 46, RULE_attribution_array = 47, 
		RULE_literal = 48, RULE_comparator = 49, RULE_interval = 50, RULE_inclusive_interval = 51, 
		RULE_nonInclusive_interval = 52;
	public static final String[] ruleNames = {
		"program", "stmt", "simple_stmt", "import_declaration", "arith_expr", 
		"arith_expr_1", "term", "term_a", "factor", "factor_a", "r_arith", "arith_id", 
		"arith_number", "function_call", "function_declaration", "declaration_params", 
		"params", "attributed", "attribution", "unary_expression", "decrement", 
		"increment", "if_declaration", "while_declaration", "for_declaration", 
		"logic_expr", "logic_expr_1", "logic_term", "logic_term_a", "r_logic", 
		"not_id", "declaration_attribution", "generic_declaration", "generic_unary_declaration", 
		"integer_declaration", "float_declaration", "string_declaration", "boolean_declaration", 
		"generic_array_declaration", "integer_array_declaration", "float_array_declaration", 
		"string_array_declaration", "boolean_array_declaration", "generic_array", 
		"index", "generic_attribution", "attribution_id", "attribution_array", 
		"literal", "comparator", "interval", "inclusive_interval", "nonInclusive_interval"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", "'/'", "'^'", "'('", "')'", "','", "'!'", "'['", "']'", "'[]'", 
		"'if'", "'endif'", "'for'", "'endfor'", "'case'", "'when'", "'while'", 
		"'endwhile'", "'endcase'", "'continue'", "'endf'", "'return'", "'import'", 
		"'int'", "'float'", "'string'", "'boolean'", "'>'", "'<'", "'=='", "'>='", 
		"'<='", "'!='", "'='", "'++'", "'--'", "'->'", "'+'", "'-'", "'&'", "'|'", 
		"';'", null, null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "IF", 
		"ENDIF", "FOR", "ENDFOR", "CASE", "WHEN", "WHILE", "ENDWHILE", "ENDCASE", 
		"CONTINUE", "ENDF", "RETURN", "IMPORT", "INT", "FLOAT", "STRING", "BOOLEAN", 
		"MAJOR", "MINOR", "EQUALS", "MAJOR_EQUALS", "MINOR_EQUALS", "DIFFERENT", 
		"ATTRIBUTION", "INCREMENT", "DECREMENT", "THEN", "UNARY_PLUS", "UNARY_MINUS", 
		"LOGICAL_AND", "LOGICAL_OR", "SEMICOLON", "INT_NUMBER", "FLOAT_NUMBER", 
		"EACH", "BOOL", "NUMBER", "WORD", "ARRAY", "ID", "S_COMMENTARY", "M_COMMENTARY", 
		"WS"
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
	public String getGrammarFileName() { return "Vicuschi.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VicuschiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
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
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				simple_stmt();
				setState(109);
				match(SEMICOLON);
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << IMPORT) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << ID))) != 0) );
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
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterSimple_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitSimple_stmt(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simple_stmt);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				declaration_attribution();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				while_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				for_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				if_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				generic_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				unary_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(121);
				generic_attribution();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(122);
				function_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(123);
				function_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(124);
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
		public TerminalNode IMPORT() { return getToken(VicuschiParser.IMPORT, 0); }
		public TerminalNode WORD() { return getToken(VicuschiParser.WORD, 0); }
		public Import_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterImport_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitImport_declaration(this);
		}
	}

	public final Import_declarationContext import_declaration() throws RecognitionException {
		Import_declarationContext _localctx = new Import_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_import_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(IMPORT);
			setState(128);
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
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterArith_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitArith_expr(this);
		}
	}

	public final Arith_exprContext arith_expr() throws RecognitionException {
		Arith_exprContext _localctx = new Arith_exprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arith_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			term();
			setState(131);
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
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterArith_expr_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitArith_expr_1(this);
		}
	}

	public final Arith_expr_1Context arith_expr_1() throws RecognitionException {
		Arith_expr_1Context _localctx = new Arith_expr_1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_arith_expr_1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNARY_PLUS || _la==UNARY_MINUS) {
				{
				setState(133);
				_la = _input.LA(1);
				if ( !(_la==UNARY_PLUS || _la==UNARY_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(134);
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
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			factor();
			setState(138);
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
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterTerm_a(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitTerm_a(this);
		}
	}

	public final Term_aContext term_a() throws RecognitionException {
		Term_aContext _localctx = new Term_aContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_term_a);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(140);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(141);
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
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			r_arith();
			setState(145);
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
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterFactor_a(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitFactor_a(this);
		}
	}

	public final Factor_aContext factor_a() throws RecognitionException {
		Factor_aContext _localctx = new Factor_aContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_factor_a);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(147);
				match(T__2);
				setState(148);
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
		public Arith_idContext arith_id() {
			return getRuleContext(Arith_idContext.class,0);
		}
		public Arith_numberContext arith_number() {
			return getRuleContext(Arith_numberContext.class,0);
		}
		public R_arithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_arith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterR_arith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitR_arith(this);
		}
	}

	public final R_arithContext r_arith() throws RecognitionException {
		R_arithContext _localctx = new R_arithContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_r_arith);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(T__3);
				setState(152);
				arith_expr();
				setState(153);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				arith_id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				arith_number();
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

	public static class Arith_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VicuschiParser.ID, 0); }
		public TerminalNode UNARY_PLUS() { return getToken(VicuschiParser.UNARY_PLUS, 0); }
		public TerminalNode UNARY_MINUS() { return getToken(VicuschiParser.UNARY_MINUS, 0); }
		public Arith_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterArith_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitArith_id(this);
		}
	}

	public final Arith_idContext arith_id() throws RecognitionException {
		Arith_idContext _localctx = new Arith_idContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arith_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNARY_PLUS || _la==UNARY_MINUS) {
				{
				setState(159);
				_la = _input.LA(1);
				if ( !(_la==UNARY_PLUS || _la==UNARY_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(162);
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

	public static class Arith_numberContext extends ParserRuleContext {
		public TerminalNode INT_NUMBER() { return getToken(VicuschiParser.INT_NUMBER, 0); }
		public TerminalNode FLOAT_NUMBER() { return getToken(VicuschiParser.FLOAT_NUMBER, 0); }
		public TerminalNode UNARY_PLUS() { return getToken(VicuschiParser.UNARY_PLUS, 0); }
		public TerminalNode UNARY_MINUS() { return getToken(VicuschiParser.UNARY_MINUS, 0); }
		public Arith_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterArith_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitArith_number(this);
		}
	}

	public final Arith_numberContext arith_number() throws RecognitionException {
		Arith_numberContext _localctx = new Arith_numberContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arith_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNARY_PLUS || _la==UNARY_MINUS) {
				{
				setState(164);
				_la = _input.LA(1);
				if ( !(_la==UNARY_PLUS || _la==UNARY_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(167);
			_la = _input.LA(1);
			if ( !(_la==INT_NUMBER || _la==FLOAT_NUMBER) ) {
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VicuschiParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(ID);
			setState(170);
			match(T__3);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << UNARY_PLUS) | (1L << UNARY_MINUS) | (1L << INT_NUMBER) | (1L << FLOAT_NUMBER) | (1L << BOOL) | (1L << WORD) | (1L << ARRAY) | (1L << ID))) != 0)) {
				{
				setState(171);
				params();
				}
			}

			setState(174);
			match(T__4);
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
		public Generic_unary_declarationContext generic_unary_declaration() {
			return getRuleContext(Generic_unary_declarationContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode ENDF() { return getToken(VicuschiParser.ENDF, 0); }
		public Declaration_paramsContext declaration_params() {
			return getRuleContext(Declaration_paramsContext.class,0);
		}
		public TerminalNode WS() { return getToken(VicuschiParser.WS, 0); }
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitFunction_declaration(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			generic_unary_declaration();
			setState(177);
			match(T__3);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN))) != 0)) {
				{
				setState(178);
				declaration_params();
				}
			}

			setState(181);
			match(T__4);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(182);
				match(WS);
				}
			}

			setState(185);
			stmt();
			setState(186);
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
		public List<TerminalNode> WS() { return getTokens(VicuschiParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VicuschiParser.WS, i);
		}
		public Declaration_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterDeclaration_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitDeclaration_params(this);
		}
	}

	public final Declaration_paramsContext declaration_params() throws RecognitionException {
		Declaration_paramsContext _localctx = new Declaration_paramsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaration_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			generic_declaration();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(189);
				match(T__5);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(190);
					match(WS);
					}
				}

				setState(193);
				generic_declaration();
				}
				}
				setState(198);
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
		public List<TerminalNode> WS() { return getTokens(VicuschiParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VicuschiParser.WS, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			attributed();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(200);
				match(T__5);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(201);
					match(WS);
					}
				}

				setState(204);
				attributed();
				}
				}
				setState(209);
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
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterAttributed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitAttributed(this);
		}
	}

	public final AttributedContext attributed() throws RecognitionException {
		AttributedContext _localctx = new AttributedContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_attributed);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				unary_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				logic_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				function_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				arith_expr();
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

	public static class AttributionContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTION() { return getToken(VicuschiParser.ATTRIBUTION, 0); }
		public AttributedContext attributed() {
			return getRuleContext(AttributedContext.class,0);
		}
		public AttributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterAttribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitAttribution(this);
		}
	}

	public final AttributionContext attribution() throws RecognitionException {
		AttributionContext _localctx = new AttributionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(ATTRIBUTION);
			setState(218);
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
		public Not_idContext not_id() {
			return getRuleContext(Not_idContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitUnary_expression(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unary_expression);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				decrement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				increment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				not_id();
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
		public TerminalNode DECREMENT() { return getToken(VicuschiParser.DECREMENT, 0); }
		public TerminalNode ID() { return getToken(VicuschiParser.ID, 0); }
		public DecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitDecrement(this);
		}
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_decrement);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(DECREMENT);
				setState(226);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(ID);
				setState(228);
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
		public TerminalNode INCREMENT() { return getToken(VicuschiParser.INCREMENT, 0); }
		public TerminalNode ID() { return getToken(VicuschiParser.ID, 0); }
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitIncrement(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_increment);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(INCREMENT);
				setState(232);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(ID);
				setState(234);
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
		public TerminalNode IF() { return getToken(VicuschiParser.IF, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(VicuschiParser.ENDIF, 0); }
		public If_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterIf_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitIf_declaration(this);
		}
	}

	public final If_declarationContext if_declaration() throws RecognitionException {
		If_declarationContext _localctx = new If_declarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_if_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(IF);
			setState(238);
			logic_expr();
			setState(239);
			stmt();
			setState(240);
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
		public TerminalNode WHILE() { return getToken(VicuschiParser.WHILE, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode ENDWHILE() { return getToken(VicuschiParser.ENDWHILE, 0); }
		public While_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterWhile_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitWhile_declaration(this);
		}
	}

	public final While_declarationContext while_declaration() throws RecognitionException {
		While_declarationContext _localctx = new While_declarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_while_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(WHILE);
			setState(243);
			logic_expr();
			setState(244);
			stmt();
			setState(245);
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
		public TerminalNode FOR() { return getToken(VicuschiParser.FOR, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode ENDFOR() { return getToken(VicuschiParser.ENDFOR, 0); }
		public TerminalNode ID() { return getToken(VicuschiParser.ID, 0); }
		public For_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterFor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitFor_declaration(this);
		}
	}

	public final For_declarationContext for_declaration() throws RecognitionException {
		For_declarationContext _localctx = new For_declarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_for_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(FOR);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(248);
				match(ID);
				}
			}

			setState(251);
			match(EACH);
			setState(252);
			interval();
			setState(253);
			stmt();
			setState(254);
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
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterLogic_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitLogic_expr(this);
		}
	}

	public final Logic_exprContext logic_expr() throws RecognitionException {
		Logic_exprContext _localctx = new Logic_exprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_logic_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			logic_term();
			setState(257);
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
		public TerminalNode LOGICAL_OR() { return getToken(VicuschiParser.LOGICAL_OR, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public Logic_expr_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expr_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterLogic_expr_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitLogic_expr_1(this);
		}
	}

	public final Logic_expr_1Context logic_expr_1() throws RecognitionException {
		Logic_expr_1Context _localctx = new Logic_expr_1Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_logic_expr_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(259);
				match(LOGICAL_OR);
				setState(260);
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
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterLogic_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitLogic_term(this);
		}
	}

	public final Logic_termContext logic_term() throws RecognitionException {
		Logic_termContext _localctx = new Logic_termContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_logic_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			r_logic();
			setState(264);
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
		public TerminalNode LOGICAL_AND() { return getToken(VicuschiParser.LOGICAL_AND, 0); }
		public Logic_termContext logic_term() {
			return getRuleContext(Logic_termContext.class,0);
		}
		public Logic_term_aContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_term_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterLogic_term_a(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitLogic_term_a(this);
		}
	}

	public final Logic_term_aContext logic_term_a() throws RecognitionException {
		Logic_term_aContext _localctx = new Logic_term_aContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_logic_term_a);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(266);
				match(LOGICAL_AND);
				setState(267);
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
		public List<TerminalNode> ID() { return getTokens(VicuschiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VicuschiParser.ID, i);
		}
		public TerminalNode BOOL() { return getToken(VicuschiParser.BOOL, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public List<TerminalNode> INT_NUMBER() { return getTokens(VicuschiParser.INT_NUMBER); }
		public TerminalNode INT_NUMBER(int i) {
			return getToken(VicuschiParser.INT_NUMBER, i);
		}
		public List<TerminalNode> FLOAT_NUMBER() { return getTokens(VicuschiParser.FLOAT_NUMBER); }
		public TerminalNode FLOAT_NUMBER(int i) {
			return getToken(VicuschiParser.FLOAT_NUMBER, i);
		}
		public R_logicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterR_logic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitR_logic(this);
		}
	}

	public final R_logicContext r_logic() throws RecognitionException {
		R_logicContext _localctx = new R_logicContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_r_logic);
		int _la;
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(T__3);
				setState(271);
				logic_expr();
				setState(272);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(T__6);
				setState(275);
				logic_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				match(BOOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(278);
				match(ID);
				setState(279);
				index();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(280);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_NUMBER) | (1L << FLOAT_NUMBER) | (1L << ID))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(281);
				comparator();
				setState(282);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_NUMBER) | (1L << FLOAT_NUMBER) | (1L << ID))) != 0)) ) {
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
		public TerminalNode ID() { return getToken(VicuschiParser.ID, 0); }
		public Generic_arrayContext generic_array() {
			return getRuleContext(Generic_arrayContext.class,0);
		}
		public Not_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterNot_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitNot_id(this);
		}
	}

	public final Not_idContext not_id() throws RecognitionException {
		Not_idContext _localctx = new Not_idContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_not_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__6);
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(287);
				match(ID);
				}
				break;
			case 2:
				{
				setState(288);
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
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterDeclaration_attribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitDeclaration_attribution(this);
		}
	}

	public final Declaration_attributionContext declaration_attribution() throws RecognitionException {
		Declaration_attributionContext _localctx = new Declaration_attributionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_declaration_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			generic_declaration();
			setState(292);
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

	public static class Generic_declarationContext extends ParserRuleContext {
		public Generic_unary_declarationContext generic_unary_declaration() {
			return getRuleContext(Generic_unary_declarationContext.class,0);
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
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterGeneric_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitGeneric_declaration(this);
		}
	}

	public final Generic_declarationContext generic_declaration() throws RecognitionException {
		Generic_declarationContext _localctx = new Generic_declarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_generic_declaration);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				generic_unary_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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

	public static class Generic_unary_declarationContext extends ParserRuleContext {
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
		public Generic_unary_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_unary_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterGeneric_unary_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitGeneric_unary_declaration(this);
		}
	}

	public final Generic_unary_declarationContext generic_unary_declaration() throws RecognitionException {
		Generic_unary_declarationContext _localctx = new Generic_unary_declarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_generic_unary_declaration);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				integer_declaration();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				float_declaration();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				string_declaration();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				boolean_declaration();
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

	public static class Integer_declarationContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(VicuschiParser.INT, 0); }
		public TerminalNode ID() { return getToken(VicuschiParser.ID, 0); }
		public Integer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterInteger_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitInteger_declaration(this);
		}
	}

	public final Integer_declarationContext integer_declaration() throws RecognitionException {
		Integer_declarationContext _localctx = new Integer_declarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_integer_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(INT);
			setState(305);
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
		public TerminalNode FLOAT() { return getToken(VicuschiParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(VicuschiParser.ID, 0); }
		public Float_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterFloat_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitFloat_declaration(this);
		}
	}

	public final Float_declarationContext float_declaration() throws RecognitionException {
		Float_declarationContext _localctx = new Float_declarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_float_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(FLOAT);
			setState(308);
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
		public TerminalNode STRING() { return getToken(VicuschiParser.STRING, 0); }
		public TerminalNode ID() { return getToken(VicuschiParser.ID, 0); }
		public String_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterString_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitString_declaration(this);
		}
	}

	public final String_declarationContext string_declaration() throws RecognitionException {
		String_declarationContext _localctx = new String_declarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_string_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(STRING);
			setState(311);
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
		public TerminalNode BOOLEAN() { return getToken(VicuschiParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(VicuschiParser.ID, 0); }
		public Boolean_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterBoolean_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitBoolean_declaration(this);
		}
	}

	public final Boolean_declarationContext boolean_declaration() throws RecognitionException {
		Boolean_declarationContext _localctx = new Boolean_declarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_boolean_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(BOOLEAN);
			setState(314);
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
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterGeneric_array_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitGeneric_array_declaration(this);
		}
	}

	public final Generic_array_declarationContext generic_array_declaration() throws RecognitionException {
		Generic_array_declarationContext _localctx = new Generic_array_declarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_generic_array_declaration);
		try {
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				integer_array_declaration();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				float_array_declaration();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				string_array_declaration();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
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

	public static class Integer_array_declarationContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(VicuschiParser.INT, 0); }
		public Generic_arrayContext generic_array() {
			return getRuleContext(Generic_arrayContext.class,0);
		}
		public Integer_array_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_array_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterInteger_array_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitInteger_array_declaration(this);
		}
	}

	public final Integer_array_declarationContext integer_array_declaration() throws RecognitionException {
		Integer_array_declarationContext _localctx = new Integer_array_declarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_integer_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(INT);
			setState(323);
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
		public TerminalNode FLOAT() { return getToken(VicuschiParser.FLOAT, 0); }
		public Generic_arrayContext generic_array() {
			return getRuleContext(Generic_arrayContext.class,0);
		}
		public Float_array_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_array_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterFloat_array_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitFloat_array_declaration(this);
		}
	}

	public final Float_array_declarationContext float_array_declaration() throws RecognitionException {
		Float_array_declarationContext _localctx = new Float_array_declarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_float_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(FLOAT);
			setState(326);
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
		public TerminalNode STRING() { return getToken(VicuschiParser.STRING, 0); }
		public Generic_arrayContext generic_array() {
			return getRuleContext(Generic_arrayContext.class,0);
		}
		public String_array_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_array_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterString_array_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitString_array_declaration(this);
		}
	}

	public final String_array_declarationContext string_array_declaration() throws RecognitionException {
		String_array_declarationContext _localctx = new String_array_declarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_string_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(STRING);
			setState(329);
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
		public TerminalNode BOOLEAN() { return getToken(VicuschiParser.BOOLEAN, 0); }
		public Generic_arrayContext generic_array() {
			return getRuleContext(Generic_arrayContext.class,0);
		}
		public Boolean_array_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_array_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterBoolean_array_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitBoolean_array_declaration(this);
		}
	}

	public final Boolean_array_declarationContext boolean_array_declaration() throws RecognitionException {
		Boolean_array_declarationContext _localctx = new Boolean_array_declarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_boolean_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(BOOLEAN);
			setState(332);
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

	public static class Generic_arrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VicuschiParser.ID, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public Generic_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterGeneric_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitGeneric_array(this);
		}
	}

	public final Generic_arrayContext generic_array() throws RecognitionException {
		Generic_arrayContext _localctx = new Generic_arrayContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_generic_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(ID);
			setState(335);
			index();
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

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VicuschiParser.ID, 0); }
		public TerminalNode INT_NUMBER() { return getToken(VicuschiParser.INT_NUMBER, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitIndex(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_index);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(T__7);
				setState(338);
				match(ID);
				setState(339);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				match(T__7);
				setState(341);
				match(INT_NUMBER);
				setState(342);
				match(T__8);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				match(T__9);
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

	public static class Generic_attributionContext extends ParserRuleContext {
		public Attribution_arrayContext attribution_array() {
			return getRuleContext(Attribution_arrayContext.class,0);
		}
		public Attribution_idContext attribution_id() {
			return getRuleContext(Attribution_idContext.class,0);
		}
		public Generic_attributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_attribution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterGeneric_attribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitGeneric_attribution(this);
		}
	}

	public final Generic_attributionContext generic_attribution() throws RecognitionException {
		Generic_attributionContext _localctx = new Generic_attributionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_generic_attribution);
		try {
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				attribution_array();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				attribution_id();
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

	public static class Attribution_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VicuschiParser.ID, 0); }
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public Attribution_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribution_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterAttribution_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitAttribution_id(this);
		}
	}

	public final Attribution_idContext attribution_id() throws RecognitionException {
		Attribution_idContext _localctx = new Attribution_idContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_attribution_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(ID);
			setState(351);
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

	public static class Attribution_arrayContext extends ParserRuleContext {
		public Generic_arrayContext generic_array() {
			return getRuleContext(Generic_arrayContext.class,0);
		}
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public Attribution_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribution_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterAttribution_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitAttribution_array(this);
		}
	}

	public final Attribution_arrayContext attribution_array() throws RecognitionException {
		Attribution_arrayContext _localctx = new Attribution_arrayContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_attribution_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			generic_array();
			setState(354);
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
		public TerminalNode ARRAY() { return getToken(VicuschiParser.ARRAY, 0); }
		public TerminalNode BOOL() { return getToken(VicuschiParser.BOOL, 0); }
		public TerminalNode INT_NUMBER() { return getToken(VicuschiParser.INT_NUMBER, 0); }
		public TerminalNode FLOAT_NUMBER() { return getToken(VicuschiParser.FLOAT_NUMBER, 0); }
		public TerminalNode WORD() { return getToken(VicuschiParser.WORD, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_NUMBER) | (1L << FLOAT_NUMBER) | (1L << BOOL) | (1L << WORD) | (1L << ARRAY))) != 0)) ) {
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
		public TerminalNode MAJOR() { return getToken(VicuschiParser.MAJOR, 0); }
		public TerminalNode MINOR() { return getToken(VicuschiParser.MINOR, 0); }
		public TerminalNode EQUALS() { return getToken(VicuschiParser.EQUALS, 0); }
		public TerminalNode MAJOR_EQUALS() { return getToken(VicuschiParser.MAJOR_EQUALS, 0); }
		public TerminalNode MINOR_EQUALS() { return getToken(VicuschiParser.MINOR_EQUALS, 0); }
		public TerminalNode DIFFERENT() { return getToken(VicuschiParser.DIFFERENT, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitComparator(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
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

	public static class IntervalContext extends ParserRuleContext {
		public Inclusive_intervalContext inclusive_interval() {
			return getRuleContext(Inclusive_intervalContext.class,0);
		}
		public NonInclusive_intervalContext nonInclusive_interval() {
			return getRuleContext(NonInclusive_intervalContext.class,0);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitInterval(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_interval);
		try {
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				inclusive_interval();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				nonInclusive_interval();
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

	public static class Inclusive_intervalContext extends ParserRuleContext {
		public List<TerminalNode> INT_NUMBER() { return getTokens(VicuschiParser.INT_NUMBER); }
		public TerminalNode INT_NUMBER(int i) {
			return getToken(VicuschiParser.INT_NUMBER, i);
		}
		public TerminalNode WS() { return getToken(VicuschiParser.WS, 0); }
		public Inclusive_intervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterInclusive_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitInclusive_interval(this);
		}
	}

	public final Inclusive_intervalContext inclusive_interval() throws RecognitionException {
		Inclusive_intervalContext _localctx = new Inclusive_intervalContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_inclusive_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(T__7);
			setState(365);
			match(INT_NUMBER);
			setState(366);
			match(T__5);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(367);
				match(WS);
				}
			}

			setState(370);
			match(INT_NUMBER);
			setState(371);
			match(T__8);
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

	public static class NonInclusive_intervalContext extends ParserRuleContext {
		public List<TerminalNode> INT_NUMBER() { return getTokens(VicuschiParser.INT_NUMBER); }
		public TerminalNode INT_NUMBER(int i) {
			return getToken(VicuschiParser.INT_NUMBER, i);
		}
		public TerminalNode WS() { return getToken(VicuschiParser.WS, 0); }
		public NonInclusive_intervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonInclusive_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterNonInclusive_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitNonInclusive_interval(this);
		}
	}

	public final NonInclusive_intervalContext nonInclusive_interval() throws RecognitionException {
		NonInclusive_intervalContext _localctx = new NonInclusive_intervalContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_nonInclusive_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(T__7);
			setState(374);
			match(INT_NUMBER);
			setState(375);
			match(T__5);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(376);
				match(WS);
				}
			}

			setState(379);
			match(INT_NUMBER);
			setState(380);
			match(T__4);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u0181\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\3\6\3r\n\3\r\3\16\3s\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0080\n\4\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\5\7\u008a\n\7\3\b\3\b\3\b\3\t\3\t\5\t\u0091\n\t\3\n\3\n\3\n\3"+
		"\13\3\13\5\13\u0098\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a0\n\f\3\r\5\r"+
		"\u00a3\n\r\3\r\3\r\3\16\5\16\u00a8\n\16\3\16\3\16\3\17\3\17\3\17\5\17"+
		"\u00af\n\17\3\17\3\17\3\20\3\20\3\20\5\20\u00b6\n\20\3\20\3\20\5\20\u00ba"+
		"\n\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00c2\n\21\3\21\7\21\u00c5\n"+
		"\21\f\21\16\21\u00c8\13\21\3\22\3\22\3\22\5\22\u00cd\n\22\3\22\7\22\u00d0"+
		"\n\22\f\22\16\22\u00d3\13\22\3\23\3\23\3\23\3\23\3\23\5\23\u00da\n\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u00e2\n\25\3\26\3\26\3\26\3\26\5\26"+
		"\u00e8\n\26\3\27\3\27\3\27\3\27\5\27\u00ee\n\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\5\32\u00fc\n\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\5\34\u0108\n\34\3\35\3\35\3\35\3\36"+
		"\3\36\5\36\u010f\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u011f\n\37\3 \3 \3 \5 \u0124\n \3!\3!\3!\3\""+
		"\3\"\5\"\u012b\n\"\3#\3#\3#\3#\5#\u0131\n#\3$\3$\3$\3%\3%\3%\3&\3&\3&"+
		"\3\'\3\'\3\'\3(\3(\3(\3(\5(\u0143\n(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,"+
		"\3,\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\5.\u015b\n.\3/\3/\5/\u015f\n/\3\60\3"+
		"\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\5\64\u016d\n\64"+
		"\3\65\3\65\3\65\3\65\5\65\u0173\n\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\5\66\u017c\n\66\3\66\3\66\3\66\3\66\2\2\67\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj\2\b\3\2("+
		")\3\2\3\4\3\2-.\4\2-.\64\64\5\2-.\60\60\62\63\3\2\36#\2\u0181\2l\3\2\2"+
		"\2\4q\3\2\2\2\6\177\3\2\2\2\b\u0081\3\2\2\2\n\u0084\3\2\2\2\f\u0089\3"+
		"\2\2\2\16\u008b\3\2\2\2\20\u0090\3\2\2\2\22\u0092\3\2\2\2\24\u0097\3\2"+
		"\2\2\26\u009f\3\2\2\2\30\u00a2\3\2\2\2\32\u00a7\3\2\2\2\34\u00ab\3\2\2"+
		"\2\36\u00b2\3\2\2\2 \u00be\3\2\2\2\"\u00c9\3\2\2\2$\u00d9\3\2\2\2&\u00db"+
		"\3\2\2\2(\u00e1\3\2\2\2*\u00e7\3\2\2\2,\u00ed\3\2\2\2.\u00ef\3\2\2\2\60"+
		"\u00f4\3\2\2\2\62\u00f9\3\2\2\2\64\u0102\3\2\2\2\66\u0107\3\2\2\28\u0109"+
		"\3\2\2\2:\u010e\3\2\2\2<\u011e\3\2\2\2>\u0120\3\2\2\2@\u0125\3\2\2\2B"+
		"\u012a\3\2\2\2D\u0130\3\2\2\2F\u0132\3\2\2\2H\u0135\3\2\2\2J\u0138\3\2"+
		"\2\2L\u013b\3\2\2\2N\u0142\3\2\2\2P\u0144\3\2\2\2R\u0147\3\2\2\2T\u014a"+
		"\3\2\2\2V\u014d\3\2\2\2X\u0150\3\2\2\2Z\u015a\3\2\2\2\\\u015e\3\2\2\2"+
		"^\u0160\3\2\2\2`\u0163\3\2\2\2b\u0166\3\2\2\2d\u0168\3\2\2\2f\u016c\3"+
		"\2\2\2h\u016e\3\2\2\2j\u0177\3\2\2\2lm\5\4\3\2m\3\3\2\2\2no\5\6\4\2op"+
		"\7,\2\2pr\3\2\2\2qn\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\5\3\2\2\2u"+
		"\u0080\5@!\2v\u0080\5\60\31\2w\u0080\5\62\32\2x\u0080\5.\30\2y\u0080\5"+
		"B\"\2z\u0080\5(\25\2{\u0080\5\\/\2|\u0080\5\36\20\2}\u0080\5\34\17\2~"+
		"\u0080\5\b\5\2\177u\3\2\2\2\177v\3\2\2\2\177w\3\2\2\2\177x\3\2\2\2\177"+
		"y\3\2\2\2\177z\3\2\2\2\177{\3\2\2\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2"+
		"\2\2\u0080\7\3\2\2\2\u0081\u0082\7\31\2\2\u0082\u0083\7\62\2\2\u0083\t"+
		"\3\2\2\2\u0084\u0085\5\16\b\2\u0085\u0086\5\f\7\2\u0086\13\3\2\2\2\u0087"+
		"\u0088\t\2\2\2\u0088\u008a\5\n\6\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\r\3\2\2\2\u008b\u008c\5\22\n\2\u008c\u008d\5\20\t\2\u008d\17"+
		"\3\2\2\2\u008e\u008f\t\3\2\2\u008f\u0091\5\16\b\2\u0090\u008e\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\21\3\2\2\2\u0092\u0093\5\26\f\2\u0093\u0094"+
		"\5\24\13\2\u0094\23\3\2\2\2\u0095\u0096\7\5\2\2\u0096\u0098\5\22\n\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\25\3\2\2\2\u0099\u009a\7\6\2"+
		"\2\u009a\u009b\5\n\6\2\u009b\u009c\7\7\2\2\u009c\u00a0\3\2\2\2\u009d\u00a0"+
		"\5\30\r\2\u009e\u00a0\5\32\16\2\u009f\u0099\3\2\2\2\u009f\u009d\3\2\2"+
		"\2\u009f\u009e\3\2\2\2\u00a0\27\3\2\2\2\u00a1\u00a3\t\2\2\2\u00a2\u00a1"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7\64\2\2"+
		"\u00a5\31\3\2\2\2\u00a6\u00a8\t\2\2\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\t\4\2\2\u00aa\33\3\2\2\2\u00ab"+
		"\u00ac\7\64\2\2\u00ac\u00ae\7\6\2\2\u00ad\u00af\5\"\22\2\u00ae\u00ad\3"+
		"\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7\7\2\2\u00b1"+
		"\35\3\2\2\2\u00b2\u00b3\5D#\2\u00b3\u00b5\7\6\2\2\u00b4\u00b6\5 \21\2"+
		"\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9"+
		"\7\7\2\2\u00b8\u00ba\7\67\2\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2"+
		"\u00ba\u00bb\3\2\2\2\u00bb\u00bc\5\4\3\2\u00bc\u00bd\7\27\2\2\u00bd\37"+
		"\3\2\2\2\u00be\u00c6\5B\"\2\u00bf\u00c1\7\b\2\2\u00c0\u00c2\7\67\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\5B"+
		"\"\2\u00c4\u00bf\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7!\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00d1\5$\23\2"+
		"\u00ca\u00cc\7\b\2\2\u00cb\u00cd\7\67\2\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\5$\23\2\u00cf\u00ca\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2#\3\2\2\2"+
		"\u00d3\u00d1\3\2\2\2\u00d4\u00da\5b\62\2\u00d5\u00da\5(\25\2\u00d6\u00da"+
		"\5\64\33\2\u00d7\u00da\5\34\17\2\u00d8\u00da\5\n\6\2\u00d9\u00d4\3\2\2"+
		"\2\u00d9\u00d5\3\2\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8"+
		"\3\2\2\2\u00da%\3\2\2\2\u00db\u00dc\7$\2\2\u00dc\u00dd\5$\23\2\u00dd\'"+
		"\3\2\2\2\u00de\u00e2\5*\26\2\u00df\u00e2\5,\27\2\u00e0\u00e2\5> \2\u00e1"+
		"\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2)\3\2\2\2"+
		"\u00e3\u00e4\7&\2\2\u00e4\u00e8\7\64\2\2\u00e5\u00e6\7\64\2\2\u00e6\u00e8"+
		"\7&\2\2\u00e7\u00e3\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8+\3\2\2\2\u00e9\u00ea"+
		"\7%\2\2\u00ea\u00ee\7\64\2\2\u00eb\u00ec\7\64\2\2\u00ec\u00ee\7%\2\2\u00ed"+
		"\u00e9\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee-\3\2\2\2\u00ef\u00f0\7\r\2\2"+
		"\u00f0\u00f1\5\64\33\2\u00f1\u00f2\5\4\3\2\u00f2\u00f3\7\16\2\2\u00f3"+
		"/\3\2\2\2\u00f4\u00f5\7\23\2\2\u00f5\u00f6\5\64\33\2\u00f6\u00f7\5\4\3"+
		"\2\u00f7\u00f8\7\24\2\2\u00f8\61\3\2\2\2\u00f9\u00fb\7\17\2\2\u00fa\u00fc"+
		"\7\64\2\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2"+
		"\u00fd\u00fe\7/\2\2\u00fe\u00ff\5f\64\2\u00ff\u0100\5\4\3\2\u0100\u0101"+
		"\7\20\2\2\u0101\63\3\2\2\2\u0102\u0103\58\35\2\u0103\u0104\5\66\34\2\u0104"+
		"\65\3\2\2\2\u0105\u0106\7+\2\2\u0106\u0108\5\64\33\2\u0107\u0105\3\2\2"+
		"\2\u0107\u0108\3\2\2\2\u0108\67\3\2\2\2\u0109\u010a\5<\37\2\u010a\u010b"+
		"\5:\36\2\u010b9\3\2\2\2\u010c\u010d\7*\2\2\u010d\u010f\58\35\2\u010e\u010c"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f;\3\2\2\2\u0110\u0111\7\6\2\2\u0111"+
		"\u0112\5\64\33\2\u0112\u0113\7\7\2\2\u0113\u011f\3\2\2\2\u0114\u0115\7"+
		"\t\2\2\u0115\u011f\5\64\33\2\u0116\u011f\7\64\2\2\u0117\u011f\7\60\2\2"+
		"\u0118\u0119\7\64\2\2\u0119\u011f\5Z.\2\u011a\u011b\t\5\2\2\u011b\u011c"+
		"\5d\63\2\u011c\u011d\t\5\2\2\u011d\u011f\3\2\2\2\u011e\u0110\3\2\2\2\u011e"+
		"\u0114\3\2\2\2\u011e\u0116\3\2\2\2\u011e\u0117\3\2\2\2\u011e\u0118\3\2"+
		"\2\2\u011e\u011a\3\2\2\2\u011f=\3\2\2\2\u0120\u0123\7\t\2\2\u0121\u0124"+
		"\7\64\2\2\u0122\u0124\5X-\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124"+
		"?\3\2\2\2\u0125\u0126\5B\"\2\u0126\u0127\5&\24\2\u0127A\3\2\2\2\u0128"+
		"\u012b\5D#\2\u0129\u012b\5N(\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2"+
		"\u012bC\3\2\2\2\u012c\u0131\5F$\2\u012d\u0131\5H%\2\u012e\u0131\5J&\2"+
		"\u012f\u0131\5L\'\2\u0130\u012c\3\2\2\2\u0130\u012d\3\2\2\2\u0130\u012e"+
		"\3\2\2\2\u0130\u012f\3\2\2\2\u0131E\3\2\2\2\u0132\u0133\7\32\2\2\u0133"+
		"\u0134\7\64\2\2\u0134G\3\2\2\2\u0135\u0136\7\33\2\2\u0136\u0137\7\64\2"+
		"\2\u0137I\3\2\2\2\u0138\u0139\7\34\2\2\u0139\u013a\7\64\2\2\u013aK\3\2"+
		"\2\2\u013b\u013c\7\35\2\2\u013c\u013d\7\64\2\2\u013dM\3\2\2\2\u013e\u0143"+
		"\5P)\2\u013f\u0143\5R*\2\u0140\u0143\5T+\2\u0141\u0143\5V,\2\u0142\u013e"+
		"\3\2\2\2\u0142\u013f\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143"+
		"O\3\2\2\2\u0144\u0145\7\32\2\2\u0145\u0146\5X-\2\u0146Q\3\2\2\2\u0147"+
		"\u0148\7\33\2\2\u0148\u0149\5X-\2\u0149S\3\2\2\2\u014a\u014b\7\34\2\2"+
		"\u014b\u014c\5X-\2\u014cU\3\2\2\2\u014d\u014e\7\35\2\2\u014e\u014f\5X"+
		"-\2\u014fW\3\2\2\2\u0150\u0151\7\64\2\2\u0151\u0152\5Z.\2\u0152Y\3\2\2"+
		"\2\u0153\u0154\7\n\2\2\u0154\u0155\7\64\2\2\u0155\u015b\7\13\2\2\u0156"+
		"\u0157\7\n\2\2\u0157\u0158\7-\2\2\u0158\u015b\7\13\2\2\u0159\u015b\7\f"+
		"\2\2\u015a\u0153\3\2\2\2\u015a\u0156\3\2\2\2\u015a\u0159\3\2\2\2\u015b"+
		"[\3\2\2\2\u015c\u015f\5`\61\2\u015d\u015f\5^\60\2\u015e\u015c\3\2\2\2"+
		"\u015e\u015d\3\2\2\2\u015f]\3\2\2\2\u0160\u0161\7\64\2\2\u0161\u0162\5"+
		"&\24\2\u0162_\3\2\2\2\u0163\u0164\5X-\2\u0164\u0165\5&\24\2\u0165a\3\2"+
		"\2\2\u0166\u0167\t\6\2\2\u0167c\3\2\2\2\u0168\u0169\t\7\2\2\u0169e\3\2"+
		"\2\2\u016a\u016d\5h\65\2\u016b\u016d\5j\66\2\u016c\u016a\3\2\2\2\u016c"+
		"\u016b\3\2\2\2\u016dg\3\2\2\2\u016e\u016f\7\n\2\2\u016f\u0170\7-\2\2\u0170"+
		"\u0172\7\b\2\2\u0171\u0173\7\67\2\2\u0172\u0171\3\2\2\2\u0172\u0173\3"+
		"\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\7-\2\2\u0175\u0176\7\13\2\2\u0176"+
		"i\3\2\2\2\u0177\u0178\7\n\2\2\u0178\u0179\7-\2\2\u0179\u017b\7\b\2\2\u017a"+
		"\u017c\7\67\2\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3"+
		"\2\2\2\u017d\u017e\7-\2\2\u017e\u017f\7\7\2\2\u017fk\3\2\2\2\"s\177\u0089"+
		"\u0090\u0097\u009f\u00a2\u00a7\u00ae\u00b5\u00b9\u00c1\u00c6\u00cc\u00d1"+
		"\u00d9\u00e1\u00e7\u00ed\u00fb\u0107\u010e\u011e\u0123\u012a\u0130\u0142"+
		"\u015a\u015e\u016c\u0172\u017b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}