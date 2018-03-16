// Generated from /home/giovani/vicuschi/java/VicuschiLex.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VicuschiLexLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ENDIF=2, FOR=3, ENDFOR=4, CASE=5, WHEN=6, ENDCASE=7, CONTINUE=8, 
		ENDF=9, RETURN=10, BOOLEAN=11, NUMBER=12, WORD=13, ATTRIBUTION=14, MAJOR_EQUALS=15, 
		SEMICOLON=16, INT=17, FLOAT=18, STRING=19, ID=20, WS=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IF", "ENDIF", "FOR", "ENDFOR", "CASE", "WHEN", "ENDCASE", "CONTINUE", 
		"ENDF", "RETURN", "BOOLEAN", "NUMBER", "NUMBERTYPE", "WORD", "ATTRIBUTION", 
		"MAJOR_EQUALS", "SEMICOLON", "INT", "FLOAT", "STRING", "LETTER", "DIGIT", 
		"SYMBOL", "ID", "WS"
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


	public VicuschiLexLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "VicuschiLex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u00ce\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\5\fv\n\f\3\r\5\ry\n\r\3\r\3\r\3\16\3\16\6\16\177\n\16\r\16\16\16\u0080"+
		"\3\16\6\16\u0084\n\16\r\16\16\16\u0085\3\16\3\16\7\16\u008a\n\16\f\16"+
		"\16\16\u008d\13\16\3\16\6\16\u0090\n\16\r\16\16\16\u0091\5\16\u0094\n"+
		"\16\3\17\3\17\3\17\3\17\3\17\7\17\u009b\n\17\f\17\16\17\u009e\13\17\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\31\7\31\u00c3\n\31\f\31\16\31\u00c6\13"+
		"\31\3\32\6\32\u00c9\n\32\r\32\16\32\u00ca\3\32\3\32\2\2\33\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\2\35\17\37\20!\21#\22"+
		"%\23\'\24)\25+\2-\2/\2\61\26\63\27\3\2\7\4\2--//\4\2C\\c|\3\2\62;\n\2"+
		"##(+-\60=@]]__aa}\177\5\2\13\f\17\17\"\"\u00d8\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\58\3\2\2\2\7>\3\2\2\2\tB\3\2"+
		"\2\2\13I\3\2\2\2\rN\3\2\2\2\17S\3\2\2\2\21[\3\2\2\2\23d\3\2\2\2\25i\3"+
		"\2\2\2\27u\3\2\2\2\31x\3\2\2\2\33\u0093\3\2\2\2\35\u0095\3\2\2\2\37\u00a1"+
		"\3\2\2\2!\u00a3\3\2\2\2#\u00a6\3\2\2\2%\u00a8\3\2\2\2\'\u00ac\3\2\2\2"+
		")\u00b2\3\2\2\2+\u00b9\3\2\2\2-\u00bb\3\2\2\2/\u00bd\3\2\2\2\61\u00bf"+
		"\3\2\2\2\63\u00c8\3\2\2\2\65\66\7k\2\2\66\67\7h\2\2\67\4\3\2\2\289\7g"+
		"\2\29:\7p\2\2:;\7f\2\2;<\7k\2\2<=\7h\2\2=\6\3\2\2\2>?\7h\2\2?@\7q\2\2"+
		"@A\7t\2\2A\b\3\2\2\2BC\7g\2\2CD\7p\2\2DE\7f\2\2EF\7h\2\2FG\7q\2\2GH\7"+
		"t\2\2H\n\3\2\2\2IJ\7e\2\2JK\7c\2\2KL\7u\2\2LM\7g\2\2M\f\3\2\2\2NO\7y\2"+
		"\2OP\7j\2\2PQ\7g\2\2QR\7p\2\2R\16\3\2\2\2ST\7g\2\2TU\7p\2\2UV\7f\2\2V"+
		"W\7e\2\2WX\7c\2\2XY\7u\2\2YZ\7g\2\2Z\20\3\2\2\2[\\\7e\2\2\\]\7q\2\2]^"+
		"\7p\2\2^_\7v\2\2_`\7k\2\2`a\7p\2\2ab\7w\2\2bc\7g\2\2c\22\3\2\2\2de\7g"+
		"\2\2ef\7p\2\2fg\7f\2\2gh\7h\2\2h\24\3\2\2\2ij\7t\2\2jk\7g\2\2kl\7v\2\2"+
		"lm\7w\2\2mn\7t\2\2no\7p\2\2o\26\3\2\2\2pq\7{\2\2qr\7g\2\2rv\7u\2\2st\7"+
		"p\2\2tv\7q\2\2up\3\2\2\2us\3\2\2\2v\30\3\2\2\2wy\t\2\2\2xw\3\2\2\2xy\3"+
		"\2\2\2yz\3\2\2\2z{\5\33\16\2{\32\3\2\2\2|~\7\60\2\2}\177\5-\27\2~}\3\2"+
		"\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0094"+
		"\3\2\2\2\u0082\u0084\5-\27\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008b\7\60"+
		"\2\2\u0088\u008a\5-\27\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0094\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u0090\5-\27\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093|\3\2\2\2"+
		"\u0093\u0083\3\2\2\2\u0093\u008f\3\2\2\2\u0094\34\3\2\2\2\u0095\u009c"+
		"\7$\2\2\u0096\u009b\5\31\r\2\u0097\u009b\5+\26\2\u0098\u009b\5\63\32\2"+
		"\u0099\u009b\5/\30\2\u009a\u0096\3\2\2\2\u009a\u0097\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7$"+
		"\2\2\u00a0\36\3\2\2\2\u00a1\u00a2\7?\2\2\u00a2 \3\2\2\2\u00a3\u00a4\7"+
		"@\2\2\u00a4\u00a5\7?\2\2\u00a5\"\3\2\2\2\u00a6\u00a7\7=\2\2\u00a7$\3\2"+
		"\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7v\2\2\u00ab&\3"+
		"\2\2\2\u00ac\u00ad\7h\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7q\2\2\u00af"+
		"\u00b0\7c\2\2\u00b0\u00b1\7v\2\2\u00b1(\3\2\2\2\u00b2\u00b3\7u\2\2\u00b3"+
		"\u00b4\7v\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7p\2\2"+
		"\u00b7\u00b8\7i\2\2\u00b8*\3\2\2\2\u00b9\u00ba\t\3\2\2\u00ba,\3\2\2\2"+
		"\u00bb\u00bc\t\4\2\2\u00bc.\3\2\2\2\u00bd\u00be\t\5\2\2\u00be\60\3\2\2"+
		"\2\u00bf\u00c4\5+\26\2\u00c0\u00c3\5-\27\2\u00c1\u00c3\5+\26\2\u00c2\u00c0"+
		"\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\62\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\t\6\2"+
		"\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\b\32\2\2\u00cd\64\3\2\2\2\17"+
		"\2ux\u0080\u0085\u008b\u0091\u0093\u009a\u009c\u00c2\u00c4\u00ca\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}