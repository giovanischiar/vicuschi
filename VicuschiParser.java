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
		WORD=48, ARRAY=49, INTERVAL=50, ID=51, S_COMMENTARY=52, M_COMMENTARY=53, 
		WS=54;
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
		RULE_generic_attribution = 45, RULE_attribuition_id = 46, RULE_attribuition_array = 47, 
		RULE_literal = 48, RULE_comparator = 49;
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
		"index", "generic_attribution", "attribuition_id", "attribuition_array", 
		"literal", "comparator"
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
			setState(100);
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
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102);
				simple_stmt();
				setState(103);
				match(SEMICOLON);
				}
				}
				setState(107); 
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
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				declaration_attribution();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				while_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				for_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				if_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				generic_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				unary_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(115);
				generic_attribution();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(116);
				function_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(117);
				function_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(118);
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
			setState(121);
			match(IMPORT);
			setState(122);
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
			setState(124);
			term();
			setState(125);
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
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNARY_PLUS || _la==UNARY_MINUS) {
				{
				setState(127);
				_la = _input.LA(1);
				if ( !(_la==UNARY_PLUS || _la==UNARY_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(128);
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
			setState(131);
			factor();
			setState(132);
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
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(134);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(135);
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
			setState(138);
			r_arith();
			setState(139);
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
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(141);
				match(T__2);
				setState(142);
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
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(T__3);
				setState(146);
				arith_expr();
				setState(147);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				arith_id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
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
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNARY_PLUS || _la==UNARY_MINUS) {
				{
				setState(153);
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

			setState(156);
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
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNARY_PLUS || _la==UNARY_MINUS) {
				{
				setState(158);
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

			setState(161);
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
			setState(163);
			match(ID);
			setState(164);
			match(T__3);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << UNARY_PLUS) | (1L << UNARY_MINUS) | (1L << INT_NUMBER) | (1L << FLOAT_NUMBER) | (1L << BOOL) | (1L << NUMBER) | (1L << WORD) | (1L << ARRAY) | (1L << ID))) != 0)) {
				{
				setState(165);
				params();
				}
			}

			setState(168);
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
			setState(170);
			generic_unary_declaration();
			setState(171);
			match(T__3);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOLEAN))) != 0)) {
				{
				setState(172);
				declaration_params();
				}
			}

			setState(175);
			match(T__4);
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
			stmt();
			setState(180);
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
			setState(182);
			generic_declaration();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(183);
				match(T__5);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(184);
					match(WS);
					}
				}

				setState(187);
				generic_declaration();
				}
				}
				setState(192);
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
			setState(193);
			attributed();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(194);
				match(T__5);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(195);
					match(WS);
					}
				}

				setState(198);
				attributed();
				}
				}
				setState(203);
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
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				unary_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				logic_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				function_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(208);
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
			setState(211);
			match(ATTRIBUTION);
			setState(212);
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
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				decrement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
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
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(DECREMENT);
				setState(219);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(ID);
				setState(221);
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
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(INCREMENT);
				setState(225);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(ID);
				setState(227);
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
			setState(230);
			match(IF);
			setState(231);
			logic_expr();
			setState(232);
			stmt();
			setState(233);
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
			setState(235);
			match(WHILE);
			setState(236);
			logic_expr();
			setState(237);
			stmt();
			setState(238);
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
			setState(240);
			match(FOR);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(241);
				match(ID);
				}
			}

			setState(244);
			match(EACH);
			setState(245);
			match(INTERVAL);
			setState(246);
			stmt();
			setState(247);
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
			setState(249);
			logic_term();
			setState(250);
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
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(252);
				match(LOGICAL_OR);
				setState(253);
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
			setState(256);
			r_logic();
			setState(257);
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
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(259);
				match(LOGICAL_AND);
				setState(260);
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
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(T__3);
				setState(264);
				logic_expr();
				setState(265);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(T__6);
				setState(268);
				logic_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				match(BOOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(271);
				match(ID);
				setState(272);
				index();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(273);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(274);
				comparator();
				setState(275);
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
			setState(279);
			match(T__6);
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(280);
				match(ID);
				}
				break;
			case 2:
				{
				setState(281);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitDeclaration_attribution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_attributionContext declaration_attribution() throws RecognitionException {
		Declaration_attributionContext _localctx = new Declaration_attributionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_declaration_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			generic_declaration();
			setState(285);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitGeneric_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_declarationContext generic_declaration() throws RecognitionException {
		Generic_declarationContext _localctx = new Generic_declarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_generic_declaration);
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				generic_unary_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitGeneric_unary_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_unary_declarationContext generic_unary_declaration() throws RecognitionException {
		Generic_unary_declarationContext _localctx = new Generic_unary_declarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_generic_unary_declaration);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				integer_declaration();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				float_declaration();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				string_declaration();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitInteger_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_declarationContext integer_declaration() throws RecognitionException {
		Integer_declarationContext _localctx = new Integer_declarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_integer_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(INT);
			setState(298);
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
		enterRule(_localctx, 70, RULE_float_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(FLOAT);
			setState(301);
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
		enterRule(_localctx, 72, RULE_string_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(STRING);
			setState(304);
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
		enterRule(_localctx, 74, RULE_boolean_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(BOOLEAN);
			setState(307);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitGeneric_array_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_array_declarationContext generic_array_declaration() throws RecognitionException {
		Generic_array_declarationContext _localctx = new Generic_array_declarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_generic_array_declaration);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				integer_array_declaration();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				float_array_declaration();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				string_array_declaration();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(312);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitInteger_array_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_array_declarationContext integer_array_declaration() throws RecognitionException {
		Integer_array_declarationContext _localctx = new Integer_array_declarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_integer_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(INT);
			setState(316);
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
		enterRule(_localctx, 80, RULE_float_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(FLOAT);
			setState(319);
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
		enterRule(_localctx, 82, RULE_string_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(STRING);
			setState(322);
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
		enterRule(_localctx, 84, RULE_boolean_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(BOOLEAN);
			setState(325);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitGeneric_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_arrayContext generic_array() throws RecognitionException {
		Generic_arrayContext _localctx = new Generic_arrayContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_generic_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(ID);
			setState(328);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_index);
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(T__7);
				setState(331);
				match(ID);
				setState(332);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				match(T__7);
				setState(334);
				match(INT_NUMBER);
				setState(335);
				match(T__8);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(336);
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
		public Attribuition_arrayContext attribuition_array() {
			return getRuleContext(Attribuition_arrayContext.class,0);
		}
		public Attribuition_idContext attribuition_id() {
			return getRuleContext(Attribuition_idContext.class,0);
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
		enterRule(_localctx, 90, RULE_generic_attribution);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				attribuition_array();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				attribuition_id();
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

	public static class Attribuition_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VicuschiParser.ID, 0); }
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public Attribuition_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribuition_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterAttribuition_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitAttribuition_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitAttribuition_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribuition_idContext attribuition_id() throws RecognitionException {
		Attribuition_idContext _localctx = new Attribuition_idContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_attribuition_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(ID);
			setState(344);
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

	public static class Attribuition_arrayContext extends ParserRuleContext {
		public Generic_arrayContext generic_array() {
			return getRuleContext(Generic_arrayContext.class,0);
		}
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public Attribuition_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribuition_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).enterAttribuition_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VicuschiListener ) ((VicuschiListener)listener).exitAttribuition_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitAttribuition_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribuition_arrayContext attribuition_array() throws RecognitionException {
		Attribuition_arrayContext _localctx = new Attribuition_arrayContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_attribuition_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			generic_array();
			setState(347);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VicuschiVisitor ) return ((VicuschiVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0164\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\3\3\3\3\3\6\3l\n\3\r\3\16\3m\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4z\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\5\7\u0084\n\7\3\b\3\b\3\b"+
		"\3\t\3\t\5\t\u008b\n\t\3\n\3\n\3\n\3\13\3\13\5\13\u0092\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u009a\n\f\3\r\5\r\u009d\n\r\3\r\3\r\3\16\5\16\u00a2"+
		"\n\16\3\16\3\16\3\17\3\17\3\17\5\17\u00a9\n\17\3\17\3\17\3\20\3\20\3\20"+
		"\5\20\u00b0\n\20\3\20\3\20\5\20\u00b4\n\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\5\21\u00bc\n\21\3\21\7\21\u00bf\n\21\f\21\16\21\u00c2\13\21\3\22\3"+
		"\22\3\22\5\22\u00c7\n\22\3\22\7\22\u00ca\n\22\f\22\16\22\u00cd\13\22\3"+
		"\23\3\23\3\23\3\23\3\23\5\23\u00d4\n\23\3\24\3\24\3\24\3\25\3\25\5\25"+
		"\u00db\n\25\3\26\3\26\3\26\3\26\5\26\u00e1\n\26\3\27\3\27\3\27\3\27\5"+
		"\27\u00e7\n\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\5\32\u00f5\n\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\5\34\u0101\n\34\3\35\3\35\3\35\3\36\3\36\5\36\u0108\n\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0118"+
		"\n\37\3 \3 \3 \5 \u011d\n \3!\3!\3!\3\"\3\"\5\"\u0124\n\"\3#\3#\3#\3#"+
		"\5#\u012a\n#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\5(\u013c"+
		"\n(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3.\3."+
		"\5.\u0154\n.\3/\3/\5/\u0158\n/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\63\2\2\64\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd\2\7\3\2()\3\2\3\4\4\2\61\61\65\65"+
		"\5\2-.\60\60\62\63\3\2\36#\2\u0163\2f\3\2\2\2\4k\3\2\2\2\6y\3\2\2\2\b"+
		"{\3\2\2\2\n~\3\2\2\2\f\u0083\3\2\2\2\16\u0085\3\2\2\2\20\u008a\3\2\2\2"+
		"\22\u008c\3\2\2\2\24\u0091\3\2\2\2\26\u0099\3\2\2\2\30\u009c\3\2\2\2\32"+
		"\u00a1\3\2\2\2\34\u00a5\3\2\2\2\36\u00ac\3\2\2\2 \u00b8\3\2\2\2\"\u00c3"+
		"\3\2\2\2$\u00d3\3\2\2\2&\u00d5\3\2\2\2(\u00da\3\2\2\2*\u00e0\3\2\2\2,"+
		"\u00e6\3\2\2\2.\u00e8\3\2\2\2\60\u00ed\3\2\2\2\62\u00f2\3\2\2\2\64\u00fb"+
		"\3\2\2\2\66\u0100\3\2\2\28\u0102\3\2\2\2:\u0107\3\2\2\2<\u0117\3\2\2\2"+
		">\u0119\3\2\2\2@\u011e\3\2\2\2B\u0123\3\2\2\2D\u0129\3\2\2\2F\u012b\3"+
		"\2\2\2H\u012e\3\2\2\2J\u0131\3\2\2\2L\u0134\3\2\2\2N\u013b\3\2\2\2P\u013d"+
		"\3\2\2\2R\u0140\3\2\2\2T\u0143\3\2\2\2V\u0146\3\2\2\2X\u0149\3\2\2\2Z"+
		"\u0153\3\2\2\2\\\u0157\3\2\2\2^\u0159\3\2\2\2`\u015c\3\2\2\2b\u015f\3"+
		"\2\2\2d\u0161\3\2\2\2fg\5\4\3\2g\3\3\2\2\2hi\5\6\4\2ij\7,\2\2jl\3\2\2"+
		"\2kh\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\5\3\2\2\2oz\5@!\2pz\5\60\31"+
		"\2qz\5\62\32\2rz\5.\30\2sz\5B\"\2tz\5(\25\2uz\5\\/\2vz\5\36\20\2wz\5\34"+
		"\17\2xz\5\b\5\2yo\3\2\2\2yp\3\2\2\2yq\3\2\2\2yr\3\2\2\2ys\3\2\2\2yt\3"+
		"\2\2\2yu\3\2\2\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\7\3\2\2\2{|\7\31\2\2|"+
		"}\7\62\2\2}\t\3\2\2\2~\177\5\16\b\2\177\u0080\5\f\7\2\u0080\13\3\2\2\2"+
		"\u0081\u0082\t\2\2\2\u0082\u0084\5\n\6\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\r\3\2\2\2\u0085\u0086\5\22\n\2\u0086\u0087\5\20\t\2\u0087"+
		"\17\3\2\2\2\u0088\u0089\t\3\2\2\u0089\u008b\5\16\b\2\u008a\u0088\3\2\2"+
		"\2\u008a\u008b\3\2\2\2\u008b\21\3\2\2\2\u008c\u008d\5\26\f\2\u008d\u008e"+
		"\5\24\13\2\u008e\23\3\2\2\2\u008f\u0090\7\5\2\2\u0090\u0092\5\22\n\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\25\3\2\2\2\u0093\u0094\7\6\2"+
		"\2\u0094\u0095\5\n\6\2\u0095\u0096\7\7\2\2\u0096\u009a\3\2\2\2\u0097\u009a"+
		"\5\30\r\2\u0098\u009a\5\32\16\2\u0099\u0093\3\2\2\2\u0099\u0097\3\2\2"+
		"\2\u0099\u0098\3\2\2\2\u009a\27\3\2\2\2\u009b\u009d\t\2\2\2\u009c\u009b"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\65\2\2"+
		"\u009f\31\3\2\2\2\u00a0\u00a2\t\2\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\61\2\2\u00a4\33\3\2\2\2\u00a5"+
		"\u00a6\7\65\2\2\u00a6\u00a8\7\6\2\2\u00a7\u00a9\5\"\22\2\u00a8\u00a7\3"+
		"\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\7\2\2\u00ab"+
		"\35\3\2\2\2\u00ac\u00ad\5D#\2\u00ad\u00af\7\6\2\2\u00ae\u00b0\5 \21\2"+
		"\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3"+
		"\7\7\2\2\u00b2\u00b4\78\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\5\4\3\2\u00b6\u00b7\7\27\2\2\u00b7\37\3\2\2"+
		"\2\u00b8\u00c0\5B\"\2\u00b9\u00bb\7\b\2\2\u00ba\u00bc\78\2\2\u00bb\u00ba"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\5B\"\2\u00be"+
		"\u00b9\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1!\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00cb\5$\23\2\u00c4\u00c6"+
		"\7\b\2\2\u00c5\u00c7\78\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00ca\5$\23\2\u00c9\u00c4\3\2\2\2\u00ca\u00cd\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc#\3\2\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00ce\u00d4\5b\62\2\u00cf\u00d4\5(\25\2\u00d0\u00d4\5\64\33\2"+
		"\u00d1\u00d4\5\34\17\2\u00d2\u00d4\5\n\6\2\u00d3\u00ce\3\2\2\2\u00d3\u00cf"+
		"\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"%\3\2\2\2\u00d5\u00d6\7$\2\2\u00d6\u00d7\5$\23\2\u00d7\'\3\2\2\2\u00d8"+
		"\u00db\5*\26\2\u00d9\u00db\5,\27\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2"+
		"\2\2\u00db)\3\2\2\2\u00dc\u00dd\7&\2\2\u00dd\u00e1\7\65\2\2\u00de\u00df"+
		"\7\65\2\2\u00df\u00e1\7&\2\2\u00e0\u00dc\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"+\3\2\2\2\u00e2\u00e3\7%\2\2\u00e3\u00e7\7\65\2\2\u00e4\u00e5\7\65\2\2"+
		"\u00e5\u00e7\7%\2\2\u00e6\u00e2\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7-\3\2"+
		"\2\2\u00e8\u00e9\7\r\2\2\u00e9\u00ea\5\64\33\2\u00ea\u00eb\5\4\3\2\u00eb"+
		"\u00ec\7\16\2\2\u00ec/\3\2\2\2\u00ed\u00ee\7\23\2\2\u00ee\u00ef\5\64\33"+
		"\2\u00ef\u00f0\5\4\3\2\u00f0\u00f1\7\24\2\2\u00f1\61\3\2\2\2\u00f2\u00f4"+
		"\7\17\2\2\u00f3\u00f5\7\65\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2"+
		"\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7/\2\2\u00f7\u00f8\7\64\2\2\u00f8\u00f9"+
		"\5\4\3\2\u00f9\u00fa\7\20\2\2\u00fa\63\3\2\2\2\u00fb\u00fc\58\35\2\u00fc"+
		"\u00fd\5\66\34\2\u00fd\65\3\2\2\2\u00fe\u00ff\7+\2\2\u00ff\u0101\5\64"+
		"\33\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\67\3\2\2\2\u0102\u0103"+
		"\5<\37\2\u0103\u0104\5:\36\2\u01049\3\2\2\2\u0105\u0106\7*\2\2\u0106\u0108"+
		"\58\35\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108;\3\2\2\2\u0109"+
		"\u010a\7\6\2\2\u010a\u010b\5\64\33\2\u010b\u010c\7\7\2\2\u010c\u0118\3"+
		"\2\2\2\u010d\u010e\7\t\2\2\u010e\u0118\5\64\33\2\u010f\u0118\7\65\2\2"+
		"\u0110\u0118\7\60\2\2\u0111\u0112\7\65\2\2\u0112\u0118\5Z.\2\u0113\u0114"+
		"\t\4\2\2\u0114\u0115\5d\63\2\u0115\u0116\t\4\2\2\u0116\u0118\3\2\2\2\u0117"+
		"\u0109\3\2\2\2\u0117\u010d\3\2\2\2\u0117\u010f\3\2\2\2\u0117\u0110\3\2"+
		"\2\2\u0117\u0111\3\2\2\2\u0117\u0113\3\2\2\2\u0118=\3\2\2\2\u0119\u011c"+
		"\7\t\2\2\u011a\u011d\7\65\2\2\u011b\u011d\5X-\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011b\3\2\2\2\u011d?\3\2\2\2\u011e\u011f\5B\"\2\u011f\u0120\5&\24\2\u0120"+
		"A\3\2\2\2\u0121\u0124\5D#\2\u0122\u0124\5N(\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0122\3\2\2\2\u0124C\3\2\2\2\u0125\u012a\5F$\2\u0126\u012a\5H%\2\u0127"+
		"\u012a\5J&\2\u0128\u012a\5L\'\2\u0129\u0125\3\2\2\2\u0129\u0126\3\2\2"+
		"\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012aE\3\2\2\2\u012b\u012c"+
		"\7\32\2\2\u012c\u012d\7\65\2\2\u012dG\3\2\2\2\u012e\u012f\7\33\2\2\u012f"+
		"\u0130\7\65\2\2\u0130I\3\2\2\2\u0131\u0132\7\34\2\2\u0132\u0133\7\65\2"+
		"\2\u0133K\3\2\2\2\u0134\u0135\7\35\2\2\u0135\u0136\7\65\2\2\u0136M\3\2"+
		"\2\2\u0137\u013c\5P)\2\u0138\u013c\5R*\2\u0139\u013c\5T+\2\u013a\u013c"+
		"\5V,\2\u013b\u0137\3\2\2\2\u013b\u0138\3\2\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013a\3\2\2\2\u013cO\3\2\2\2\u013d\u013e\7\32\2\2\u013e\u013f\5X-\2\u013f"+
		"Q\3\2\2\2\u0140\u0141\7\33\2\2\u0141\u0142\5X-\2\u0142S\3\2\2\2\u0143"+
		"\u0144\7\34\2\2\u0144\u0145\5X-\2\u0145U\3\2\2\2\u0146\u0147\7\35\2\2"+
		"\u0147\u0148\5X-\2\u0148W\3\2\2\2\u0149\u014a\7\65\2\2\u014a\u014b\5Z"+
		".\2\u014bY\3\2\2\2\u014c\u014d\7\n\2\2\u014d\u014e\7\65\2\2\u014e\u0154"+
		"\7\13\2\2\u014f\u0150\7\n\2\2\u0150\u0151\7-\2\2\u0151\u0154\7\13\2\2"+
		"\u0152\u0154\7\f\2\2\u0153\u014c\3\2\2\2\u0153\u014f\3\2\2\2\u0153\u0152"+
		"\3\2\2\2\u0154[\3\2\2\2\u0155\u0158\5`\61\2\u0156\u0158\5^\60\2\u0157"+
		"\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158]\3\2\2\2\u0159\u015a\7\65\2\2"+
		"\u015a\u015b\5&\24\2\u015b_\3\2\2\2\u015c\u015d\5X-\2\u015d\u015e\5&\24"+
		"\2\u015ea\3\2\2\2\u015f\u0160\t\5\2\2\u0160c\3\2\2\2\u0161\u0162\t\6\2"+
		"\2\u0162e\3\2\2\2\37my\u0083\u008a\u0091\u0099\u009c\u00a1\u00a8\u00af"+
		"\u00b3\u00bb\u00c0\u00c6\u00cb\u00d3\u00da\u00e0\u00e6\u00f4\u0100\u0107"+
		"\u0117\u011c\u0123\u0129\u013b\u0153\u0157";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}