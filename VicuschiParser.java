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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, IF=8, ENDIF=9, 
		FOR=10, ENDFOR=11, CASE=12, WHEN=13, WHILE=14, ENDWHILE=15, ENDCASE=16, 
		CONTINUE=17, ENDF=18, RETURN=19, IMPORT=20, INT=21, FLOAT=22, STRING=23, 
		BOOLEAN=24, MAJOR=25, MINOR=26, EQUALS=27, MAJOR_EQUALS=28, MINOR_EQUALS=29, 
		DIFFERENT=30, ATTRIBUTION=31, INCREMENT=32, DECREMENT=33, THEN=34, UNARY_PLUS=35, 
		UNARY_MINUS=36, LOGICAL_AND=37, LOGICAL_OR=38, SEMICOLON=39, INDEX=40, 
		EACH=41, BOOL=42, NUMBER=43, WORD=44, ARRAY=45, INTERVAL=46, ID=47, S_COMMENTARY=48, 
		M_COMMENTARY=49, WS=50;
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
		RULE_integer_declaration = 31, RULE_float_declaration = 32, RULE_string_declaration = 33, 
		RULE_boolean_declaration = 34, RULE_declaration_attribution = 35, RULE_integer_array_declaration = 36, 
		RULE_float_array_declaration = 37, RULE_string_array_declaration = 38, 
		RULE_boolean_array_declaration = 39, RULE_generic_declaration = 40, RULE_generic_array = 41, 
		RULE_generic_array_declaration = 42, RULE_generic_attribution = 43, RULE_literal = 44, 
		RULE_comparator = 45;
	public static final String[] ruleNames = {
		"program", "stmt", "simple_stmt", "import_declaration", "arith_expr", 
		"arith_expr_1", "term", "term_a", "factor", "factor_a", "r_arith", "arith_id", 
		"arith_number", "function_call", "function_declaration", "declaration_params", 
		"params", "attributed", "attribution", "unary_expression", "decrement", 
		"increment", "if_declaration", "while_declaration", "for_declaration", 
		"logic_expr", "logic_expr_1", "logic_term", "logic_term_a", "r_logic", 
		"not_id", "integer_declaration", "float_declaration", "string_declaration", 
		"boolean_declaration", "declaration_attribution", "integer_array_declaration", 
		"float_array_declaration", "string_array_declaration", "boolean_array_declaration", 
		"generic_declaration", "generic_array", "generic_array_declaration", "generic_attribution", 
		"literal", "comparator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", "'/'", "'^'", "'('", "')'", "','", "'!'", "'if'", "'endif'", 
		"'for'", "'endfor'", "'case'", "'when'", "'while'", "'endwhile'", "'endcase'", 
		"'continue'", "'endf'", "'return'", "'import'", "'int'", "'float'", "'string'", 
		"'boolean'", "'>'", "'<'", "'=='", "'>='", "'<='", "'!='", "'='", "'++'", 
		"'--'", "'->'", "'+'", "'-'", "'&'", "'|'", "';'", null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "IF", "ENDIF", "FOR", 
		"ENDFOR", "CASE", "WHEN", "WHILE", "ENDWHILE", "ENDCASE", "CONTINUE", 
		"ENDF", "RETURN", "IMPORT", "INT", "FLOAT", "STRING", "BOOLEAN", "MAJOR", 
		"MINOR", "EQUALS", "MAJOR_EQUALS", "MINOR_EQUALS", "DIFFERENT", "ATTRIBUTION", 
		"INCREMENT", "DECREMENT", "THEN", "UNARY_PLUS", "UNARY_MINUS", "LOGICAL_AND", 
		"LOGICAL_OR", "SEMICOLON", "INDEX", "EACH", "BOOL", "NUMBER", "WORD", 
		"ARRAY", "INTERVAL", "ID", "S_COMMENTARY", "M_COMMENTARY", "WS"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				simple_stmt();
				setState(95);
				match(SEMICOLON);
				}
				}
				setState(99); 
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
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterSimple_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitSimple_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitSimple_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simple_stmt);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				declaration_attribution();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				while_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				for_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				if_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				generic_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				unary_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				generic_attribution();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(108);
				function_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(109);
				function_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(110);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitImport_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_declarationContext import_declaration() throws RecognitionException {
		Import_declarationContext _localctx = new Import_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_import_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(IMPORT);
			setState(114);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitArith_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arith_exprContext arith_expr() throws RecognitionException {
		Arith_exprContext _localctx = new Arith_exprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arith_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			term();
			setState(117);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitArith_expr_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arith_expr_1Context arith_expr_1() throws RecognitionException {
		Arith_expr_1Context _localctx = new Arith_expr_1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_arith_expr_1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNARY_PLUS || _la==UNARY_MINUS) {
				{
				setState(119);
				_la = _input.LA(1);
				if ( !(_la==UNARY_PLUS || _la==UNARY_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(120);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			factor();
			setState(124);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitTerm_a(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_aContext term_a() throws RecognitionException {
		Term_aContext _localctx = new Term_aContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_term_a);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(126);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(127);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			r_arith();
			setState(131);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitFactor_a(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor_aContext factor_a() throws RecognitionException {
		Factor_aContext _localctx = new Factor_aContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_factor_a);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(133);
				match(T__2);
				setState(134);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitR_arith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_arithContext r_arith() throws RecognitionException {
		R_arithContext _localctx = new R_arithContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_r_arith);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(T__3);
				setState(138);
				arith_expr();
				setState(139);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				arith_id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitArith_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arith_idContext arith_id() throws RecognitionException {
		Arith_idContext _localctx = new Arith_idContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arith_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNARY_PLUS || _la==UNARY_MINUS) {
				{
				setState(145);
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

			setState(148);
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
		public TerminalNode NUMBER() { return getToken(VicuschiParser.NUMBER, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitArith_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arith_numberContext arith_number() throws RecognitionException {
		Arith_numberContext _localctx = new Arith_numberContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arith_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNARY_PLUS || _la==UNARY_MINUS) {
				{
				setState(150);
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

			setState(153);
			match(NUMBER);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ID);
			setState(156);
			match(T__3);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << UNARY_PLUS) | (1L << UNARY_MINUS) | (1L << BOOL) | (1L << NUMBER) | (1L << WORD) | (1L << ARRAY) | (1L << ID))) != 0)) {
				{
				setState(157);
				params();
				}
			}

			setState(160);
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
		public Generic_declarationContext generic_declaration() {
			return getRuleContext(Generic_declarationContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			generic_declaration();
			setState(163);
			match(T__3);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN))) != 0)) {
				{
				setState(164);
				declaration_params();
				}
			}

			setState(167);
			match(T__4);
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
			stmt();
			setState(172);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitDeclaration_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_paramsContext declaration_params() throws RecognitionException {
		Declaration_paramsContext _localctx = new Declaration_paramsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaration_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			generic_declaration();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(175);
				match(T__5);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(176);
					match(WS);
					}
				}

				setState(179);
				generic_declaration();
				}
				}
				setState(184);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			attributed();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(186);
				match(T__5);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(187);
					match(WS);
					}
				}

				setState(190);
				attributed();
				}
				}
				setState(195);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitAttributed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributedContext attributed() throws RecognitionException {
		AttributedContext _localctx = new AttributedContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_attributed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(196);
				literal();
				}
				break;
			case 2:
				{
				setState(197);
				unary_expression();
				}
				break;
			case 3:
				{
				setState(198);
				logic_expr();
				}
				break;
			case 4:
				{
				setState(199);
				function_call();
				}
				break;
			case 5:
				{
				setState(200);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitAttribution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributionContext attribution() throws RecognitionException {
		AttributionContext _localctx = new AttributionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(ATTRIBUTION);
			setState(204);
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
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unary_expression);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				decrement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_decrement);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(DECREMENT);
				setState(211);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(ID);
				setState(213);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_increment);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(INCREMENT);
				setState(217);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(ID);
				setState(219);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitIf_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_declarationContext if_declaration() throws RecognitionException {
		If_declarationContext _localctx = new If_declarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_if_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(IF);
			setState(223);
			logic_expr();
			setState(224);
			stmt();
			setState(225);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitWhile_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_declarationContext while_declaration() throws RecognitionException {
		While_declarationContext _localctx = new While_declarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_while_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(WHILE);
			setState(228);
			logic_expr();
			setState(229);
			stmt();
			setState(230);
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
		public TerminalNode INTERVAL() { return getToken(VicuschiParser.INTERVAL, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitFor_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_declarationContext for_declaration() throws RecognitionException {
		For_declarationContext _localctx = new For_declarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_for_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(FOR);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(233);
				match(ID);
				}
			}

			setState(236);
			match(EACH);
			setState(237);
			match(INTERVAL);
			setState(238);
			stmt();
			setState(239);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitLogic_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_exprContext logic_expr() throws RecognitionException {
		Logic_exprContext _localctx = new Logic_exprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_logic_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			logic_term();
			setState(242);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitLogic_expr_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_expr_1Context logic_expr_1() throws RecognitionException {
		Logic_expr_1Context _localctx = new Logic_expr_1Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_logic_expr_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(244);
				match(LOGICAL_OR);
				setState(245);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitLogic_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_termContext logic_term() throws RecognitionException {
		Logic_termContext _localctx = new Logic_termContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_logic_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			r_logic();
			setState(249);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitLogic_term_a(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_term_aContext logic_term_a() throws RecognitionException {
		Logic_term_aContext _localctx = new Logic_term_aContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_logic_term_a);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(251);
				match(LOGICAL_AND);
				setState(252);
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
		public Arith_idContext arith_id() {
			return getRuleContext(Arith_idContext.class,0);
		}
		public Arith_numberContext arith_number() {
			return getRuleContext(Arith_numberContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(VicuschiParser.BOOL, 0); }
		public Not_idContext not_id() {
			return getRuleContext(Not_idContext.class,0);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(VicuschiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VicuschiParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(VicuschiParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(VicuschiParser.NUMBER, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitR_logic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_logicContext r_logic() throws RecognitionException {
		R_logicContext _localctx = new R_logicContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_r_logic);
		int _la;
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(T__3);
				setState(256);
				logic_expr();
				setState(257);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(T__6);
				setState(260);
				logic_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				arith_id();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				arith_number();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(263);
				match(BOOL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(264);
				not_id();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(265);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(266);
				comparator();
				setState(267);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitNot_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_idContext not_id() throws RecognitionException {
		Not_idContext _localctx = new Not_idContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_not_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__6);
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(272);
				match(ID);
				}
				break;
			case 2:
				{
				setState(273);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitInteger_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_declarationContext integer_declaration() throws RecognitionException {
		Integer_declarationContext _localctx = new Integer_declarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_integer_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(INT);
			setState(277);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitFloat_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_declarationContext float_declaration() throws RecognitionException {
		Float_declarationContext _localctx = new Float_declarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_float_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(FLOAT);
			setState(280);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitString_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_declarationContext string_declaration() throws RecognitionException {
		String_declarationContext _localctx = new String_declarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_string_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(STRING);
			setState(283);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitBoolean_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_declarationContext boolean_declaration() throws RecognitionException {
		Boolean_declarationContext _localctx = new Boolean_declarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_boolean_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(BOOLEAN);
			setState(286);
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
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterDeclaration_attribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitDeclaration_attribution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitDeclaration_attribution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_attributionContext declaration_attribution() throws RecognitionException {
		Declaration_attributionContext _localctx = new Declaration_attributionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_declaration_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			generic_declaration();
			setState(289);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitInteger_array_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_array_declarationContext integer_array_declaration() throws RecognitionException {
		Integer_array_declarationContext _localctx = new Integer_array_declarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_integer_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(INT);
			setState(292);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitFloat_array_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_array_declarationContext float_array_declaration() throws RecognitionException {
		Float_array_declarationContext _localctx = new Float_array_declarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_float_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(FLOAT);
			setState(295);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitString_array_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_array_declarationContext string_array_declaration() throws RecognitionException {
		String_array_declarationContext _localctx = new String_array_declarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_string_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(STRING);
			setState(298);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitBoolean_array_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_array_declarationContext boolean_array_declaration() throws RecognitionException {
		Boolean_array_declarationContext _localctx = new Boolean_array_declarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_boolean_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(BOOLEAN);
			setState(301);
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
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterGeneric_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitGeneric_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitGeneric_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_declarationContext generic_declaration() throws RecognitionException {
		Generic_declarationContext _localctx = new Generic_declarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_generic_declaration);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				integer_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				float_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				string_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				boolean_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(307);
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
		public TerminalNode ID() { return getToken(VicuschiParser.ID, 0); }
		public TerminalNode INDEX() { return getToken(VicuschiParser.INDEX, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitGeneric_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_arrayContext generic_array() throws RecognitionException {
		Generic_arrayContext _localctx = new Generic_arrayContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_generic_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(ID);
			setState(311);
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
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterGeneric_array_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitGeneric_array_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitGeneric_array_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_array_declarationContext generic_array_declaration() throws RecognitionException {
		Generic_array_declarationContext _localctx = new Generic_array_declarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_generic_array_declaration);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				integer_array_declaration();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				float_array_declaration();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				string_array_declaration();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(316);
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
		public TerminalNode ID() { return getToken(VicuschiParser.ID, 0); }
		public Generic_arrayContext generic_array() {
			return getRuleContext(Generic_arrayContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitGeneric_attribution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_attributionContext generic_attribution() throws RecognitionException {
		Generic_attributionContext _localctx = new Generic_attributionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_generic_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(319);
				match(ID);
				}
				break;
			case 2:
				{
				setState(320);
				generic_array();
				}
				break;
			}
			setState(323);
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
		public TerminalNode NUMBER() { return getToken(VicuschiParser.NUMBER, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << NUMBER) | (1L << WORD) | (1L << ARRAY))) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u014c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\3\6\3d\n\3\r\3\16\3e\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4r\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7"+
		"\3\7\5\7|\n\7\3\b\3\b\3\b\3\t\3\t\5\t\u0083\n\t\3\n\3\n\3\n\3\13\3\13"+
		"\5\13\u008a\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0092\n\f\3\r\5\r\u0095\n"+
		"\r\3\r\3\r\3\16\5\16\u009a\n\16\3\16\3\16\3\17\3\17\3\17\5\17\u00a1\n"+
		"\17\3\17\3\17\3\20\3\20\3\20\5\20\u00a8\n\20\3\20\3\20\5\20\u00ac\n\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00b4\n\21\3\21\7\21\u00b7\n\21\f"+
		"\21\16\21\u00ba\13\21\3\22\3\22\3\22\5\22\u00bf\n\22\3\22\7\22\u00c2\n"+
		"\22\f\22\16\22\u00c5\13\22\3\23\3\23\3\23\3\23\3\23\5\23\u00cc\n\23\3"+
		"\24\3\24\3\24\3\25\3\25\5\25\u00d3\n\25\3\26\3\26\3\26\3\26\5\26\u00d9"+
		"\n\26\3\27\3\27\3\27\3\27\5\27\u00df\n\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\5\32\u00ed\n\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\5\34\u00f9\n\34\3\35\3\35\3\35\3\36\3\36\5\36"+
		"\u0100\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u0110\n\37\3 \3 \3 \5 \u0115\n \3!\3!\3!\3\"\3\"\3\"\3"+
		"#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3"+
		"*\3*\3*\3*\5*\u0137\n*\3+\3+\3+\3,\3,\3,\3,\5,\u0140\n,\3-\3-\5-\u0144"+
		"\n-\3-\3-\3.\3.\3/\3/\3/\2\2\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\7\3\2%&\3\2\3\4\4\2--\61\61"+
		"\3\2,/\3\2\33 \2\u014e\2^\3\2\2\2\4c\3\2\2\2\6q\3\2\2\2\bs\3\2\2\2\nv"+
		"\3\2\2\2\f{\3\2\2\2\16}\3\2\2\2\20\u0082\3\2\2\2\22\u0084\3\2\2\2\24\u0089"+
		"\3\2\2\2\26\u0091\3\2\2\2\30\u0094\3\2\2\2\32\u0099\3\2\2\2\34\u009d\3"+
		"\2\2\2\36\u00a4\3\2\2\2 \u00b0\3\2\2\2\"\u00bb\3\2\2\2$\u00cb\3\2\2\2"+
		"&\u00cd\3\2\2\2(\u00d2\3\2\2\2*\u00d8\3\2\2\2,\u00de\3\2\2\2.\u00e0\3"+
		"\2\2\2\60\u00e5\3\2\2\2\62\u00ea\3\2\2\2\64\u00f3\3\2\2\2\66\u00f8\3\2"+
		"\2\28\u00fa\3\2\2\2:\u00ff\3\2\2\2<\u010f\3\2\2\2>\u0111\3\2\2\2@\u0116"+
		"\3\2\2\2B\u0119\3\2\2\2D\u011c\3\2\2\2F\u011f\3\2\2\2H\u0122\3\2\2\2J"+
		"\u0125\3\2\2\2L\u0128\3\2\2\2N\u012b\3\2\2\2P\u012e\3\2\2\2R\u0136\3\2"+
		"\2\2T\u0138\3\2\2\2V\u013f\3\2\2\2X\u0143\3\2\2\2Z\u0147\3\2\2\2\\\u0149"+
		"\3\2\2\2^_\5\4\3\2_\3\3\2\2\2`a\5\6\4\2ab\7)\2\2bd\3\2\2\2c`\3\2\2\2d"+
		"e\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\5\3\2\2\2gr\5H%\2hr\5\60\31\2ir\5\62\32"+
		"\2jr\5.\30\2kr\5R*\2lr\5(\25\2mr\5X-\2nr\5\36\20\2or\5\34\17\2pr\5\b\5"+
		"\2qg\3\2\2\2qh\3\2\2\2qi\3\2\2\2qj\3\2\2\2qk\3\2\2\2ql\3\2\2\2qm\3\2\2"+
		"\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\7\3\2\2\2st\7\26\2\2tu\7.\2\2u\t\3\2"+
		"\2\2vw\5\16\b\2wx\5\f\7\2x\13\3\2\2\2yz\t\2\2\2z|\5\n\6\2{y\3\2\2\2{|"+
		"\3\2\2\2|\r\3\2\2\2}~\5\22\n\2~\177\5\20\t\2\177\17\3\2\2\2\u0080\u0081"+
		"\t\3\2\2\u0081\u0083\5\16\b\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\21\3\2\2\2\u0084\u0085\5\26\f\2\u0085\u0086\5\24\13\2\u0086\23"+
		"\3\2\2\2\u0087\u0088\7\5\2\2\u0088\u008a\5\22\n\2\u0089\u0087\3\2\2\2"+
		"\u0089\u008a\3\2\2\2\u008a\25\3\2\2\2\u008b\u008c\7\6\2\2\u008c\u008d"+
		"\5\n\6\2\u008d\u008e\7\7\2\2\u008e\u0092\3\2\2\2\u008f\u0092\5\30\r\2"+
		"\u0090\u0092\5\32\16\2\u0091\u008b\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090"+
		"\3\2\2\2\u0092\27\3\2\2\2\u0093\u0095\t\2\2\2\u0094\u0093\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7\61\2\2\u0097\31\3\2\2"+
		"\2\u0098\u009a\t\2\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u009c\7-\2\2\u009c\33\3\2\2\2\u009d\u009e\7\61\2\2\u009e"+
		"\u00a0\7\6\2\2\u009f\u00a1\5\"\22\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\7\2\2\u00a3\35\3\2\2\2\u00a4"+
		"\u00a5\5R*\2\u00a5\u00a7\7\6\2\2\u00a6\u00a8\5 \21\2\u00a7\u00a6\3\2\2"+
		"\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\7\7\2\2\u00aa\u00ac"+
		"\7\64\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2"+
		"\u00ad\u00ae\5\4\3\2\u00ae\u00af\7\24\2\2\u00af\37\3\2\2\2\u00b0\u00b8"+
		"\5R*\2\u00b1\u00b3\7\b\2\2\u00b2\u00b4\7\64\2\2\u00b3\u00b2\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\5R*\2\u00b6\u00b1\3\2\2"+
		"\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9!"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00c3\5$\23\2\u00bc\u00be\7\b\2\2\u00bd"+
		"\u00bf\7\64\2\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3"+
		"\2\2\2\u00c0\u00c2\5$\23\2\u00c1\u00bc\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4#\3\2\2\2\u00c5\u00c3\3\2\2\2"+
		"\u00c6\u00cc\5Z.\2\u00c7\u00cc\5(\25\2\u00c8\u00cc\5\64\33\2\u00c9\u00cc"+
		"\5\34\17\2\u00ca\u00cc\5\n\6\2\u00cb\u00c6\3\2\2\2\u00cb\u00c7\3\2\2\2"+
		"\u00cb\u00c8\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc%\3"+
		"\2\2\2\u00cd\u00ce\7!\2\2\u00ce\u00cf\5$\23\2\u00cf\'\3\2\2\2\u00d0\u00d3"+
		"\5*\26\2\u00d1\u00d3\5,\27\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3"+
		")\3\2\2\2\u00d4\u00d5\7#\2\2\u00d5\u00d9\7\61\2\2\u00d6\u00d7\7\61\2\2"+
		"\u00d7\u00d9\7#\2\2\u00d8\u00d4\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9+\3\2"+
		"\2\2\u00da\u00db\7\"\2\2\u00db\u00df\7\61\2\2\u00dc\u00dd\7\61\2\2\u00dd"+
		"\u00df\7\"\2\2\u00de\u00da\3\2\2\2\u00de\u00dc\3\2\2\2\u00df-\3\2\2\2"+
		"\u00e0\u00e1\7\n\2\2\u00e1\u00e2\5\64\33\2\u00e2\u00e3\5\4\3\2\u00e3\u00e4"+
		"\7\13\2\2\u00e4/\3\2\2\2\u00e5\u00e6\7\20\2\2\u00e6\u00e7\5\64\33\2\u00e7"+
		"\u00e8\5\4\3\2\u00e8\u00e9\7\21\2\2\u00e9\61\3\2\2\2\u00ea\u00ec\7\f\2"+
		"\2\u00eb\u00ed\7\61\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ef\7+\2\2\u00ef\u00f0\7\60\2\2\u00f0\u00f1\5\4"+
		"\3\2\u00f1\u00f2\7\r\2\2\u00f2\63\3\2\2\2\u00f3\u00f4\58\35\2\u00f4\u00f5"+
		"\5\66\34\2\u00f5\65\3\2\2\2\u00f6\u00f7\7(\2\2\u00f7\u00f9\5\64\33\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\67\3\2\2\2\u00fa\u00fb\5<\37"+
		"\2\u00fb\u00fc\5:\36\2\u00fc9\3\2\2\2\u00fd\u00fe\7\'\2\2\u00fe\u0100"+
		"\58\35\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100;\3\2\2\2\u0101"+
		"\u0102\7\6\2\2\u0102\u0103\5\64\33\2\u0103\u0104\7\7\2\2\u0104\u0110\3"+
		"\2\2\2\u0105\u0106\7\t\2\2\u0106\u0110\5\64\33\2\u0107\u0110\5\30\r\2"+
		"\u0108\u0110\5\32\16\2\u0109\u0110\7,\2\2\u010a\u0110\5> \2\u010b\u010c"+
		"\t\4\2\2\u010c\u010d\5\\/\2\u010d\u010e\t\4\2\2\u010e\u0110\3\2\2\2\u010f"+
		"\u0101\3\2\2\2\u010f\u0105\3\2\2\2\u010f\u0107\3\2\2\2\u010f\u0108\3\2"+
		"\2\2\u010f\u0109\3\2\2\2\u010f\u010a\3\2\2\2\u010f\u010b\3\2\2\2\u0110"+
		"=\3\2\2\2\u0111\u0114\7\t\2\2\u0112\u0115\7\61\2\2\u0113\u0115\5T+\2\u0114"+
		"\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115?\3\2\2\2\u0116\u0117\7\27\2\2"+
		"\u0117\u0118\7\61\2\2\u0118A\3\2\2\2\u0119\u011a\7\30\2\2\u011a\u011b"+
		"\7\61\2\2\u011bC\3\2\2\2\u011c\u011d\7\31\2\2\u011d\u011e\7\61\2\2\u011e"+
		"E\3\2\2\2\u011f\u0120\7\32\2\2\u0120\u0121\7\61\2\2\u0121G\3\2\2\2\u0122"+
		"\u0123\5R*\2\u0123\u0124\5&\24\2\u0124I\3\2\2\2\u0125\u0126\7\27\2\2\u0126"+
		"\u0127\5T+\2\u0127K\3\2\2\2\u0128\u0129\7\30\2\2\u0129\u012a\5T+\2\u012a"+
		"M\3\2\2\2\u012b\u012c\7\31\2\2\u012c\u012d\5T+\2\u012dO\3\2\2\2\u012e"+
		"\u012f\7\32\2\2\u012f\u0130\5T+\2\u0130Q\3\2\2\2\u0131\u0137\5@!\2\u0132"+
		"\u0137\5B\"\2\u0133\u0137\5D#\2\u0134\u0137\5F$\2\u0135\u0137\5V,\2\u0136"+
		"\u0131\3\2\2\2\u0136\u0132\3\2\2\2\u0136\u0133\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0136\u0135\3\2\2\2\u0137S\3\2\2\2\u0138\u0139\7\61\2\2\u0139\u013a"+
		"\7*\2\2\u013aU\3\2\2\2\u013b\u0140\5J&\2\u013c\u0140\5L\'\2\u013d\u0140"+
		"\5N(\2\u013e\u0140\5P)\2\u013f\u013b\3\2\2\2\u013f\u013c\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140W\3\2\2\2\u0141\u0144\7\61\2\2"+
		"\u0142\u0144\5T+\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0146\5&\24\2\u0146Y\3\2\2\2\u0147\u0148\t\5\2\2\u0148"+
		"[\3\2\2\2\u0149\u014a\t\6\2\2\u014a]\3\2\2\2\35eq{\u0082\u0089\u0091\u0094"+
		"\u0099\u00a0\u00a7\u00ab\u00b3\u00b8\u00be\u00c3\u00cb\u00d2\u00d8\u00de"+
		"\u00ec\u00f8\u00ff\u010f\u0114\u0136\u013f\u0143";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}