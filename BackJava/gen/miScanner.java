// Generated from C:/Users/Lester Trejos/Documents/Compi/RepoProyecto1/proyecto1compi/BackJava/src/main/java\miScanner.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miScanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PyComa=1, COMA=2, UNDERSC=3, POINT=4, COMIDOBLES=5, ASSIGN=6, VIR=7, DOSPUN=8, 
		PIZQ=9, PDER=10, LLAIZQ=11, LLADER=12, PCIZQ=13, PCDER=14, REOPERATOR=15, 
		ADDITIVEOP=16, MULTIPLICATEOP=17, BOOLEAN=18, CHAR=19, INT=20, STRING=21, 
		TRUE=22, FALSE=23, SUM=24, SUB=25, OR=26, MUL=27, DIV=28, AND=29, INTERROGATION=30, 
		UNARY=31, IF=32, ELSE=33, WHILE=34, RETURN=35, CLASS=36, PRINT=37, NEW=38, 
		LENGTH=39, ID=40, INTLITERAL=41, REALLITERAL=42, STRINGLITERAL=43, WS=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PyComa", "COMA", "UNDERSC", "POINT", "COMIDOBLES", "ASSIGN", "VIR", 
			"DOSPUN", "PIZQ", "PDER", "LLAIZQ", "LLADER", "PCIZQ", "PCDER", "MENOR", 
			"MAYOR", "IGUAL", "DIFERENTE", "MENORIGUAL", "MAYORIGUAL", "REOPERATOR", 
			"ADDITIVEOP", "MULTIPLICATEOP", "BOOLEAN", "CHAR", "INT", "STRING", "TRUE", 
			"FALSE", "SUM", "SUB", "OR", "MUL", "DIV", "AND", "INTERROGATION", "UNARY", 
			"IF", "ELSE", "WHILE", "RETURN", "CLASS", "PRINT", "NEW", "LENGTH", "ID", 
			"INTLITERAL", "REALLITERAL", "STRINGLITERAL", "DIGIT", "LETTER", "PRINTABLE", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'_'", "'.'", "'\"'", "'='", "'~'", "':'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", null, null, null, "'boolean'", "'char'", 
			"'int'", "'string'", "'true'", "'false'", "'+'", "'-'", "'or'", "'*'", 
			"'/'", "'and'", "'!'", null, "'if'", "'else'", "'while'", "'return'", 
			"'class'", "'print'", "'new'", "'lenght'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PyComa", "COMA", "UNDERSC", "POINT", "COMIDOBLES", "ASSIGN", "VIR", 
			"DOSPUN", "PIZQ", "PDER", "LLAIZQ", "LLADER", "PCIZQ", "PCDER", "REOPERATOR", 
			"ADDITIVEOP", "MULTIPLICATEOP", "BOOLEAN", "CHAR", "INT", "STRING", "TRUE", 
			"FALSE", "SUM", "SUB", "OR", "MUL", "DIV", "AND", "INTERROGATION", "UNARY", 
			"IF", "ELSE", "WHILE", "RETURN", "CLASS", "PRINT", "NEW", "LENGTH", "ID", 
			"INTLITERAL", "REALLITERAL", "STRINGLITERAL", "WS"
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


	public miScanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "miScanner.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u016e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00a0\n\26\3\27\3\27"+
		"\3\27\5\27\u00a5\n\27\3\30\3\30\3\30\5\30\u00aa\n\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$"+
		"\3%\3%\3&\3&\3&\5&\u00e3\n&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)"+
		"\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-"+
		"\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\7/\u0116\n/\f/\16/\u0119\13/\5"+
		"/\u011b\n/\3\60\3\60\7\60\u011f\n\60\f\60\16\60\u0122\13\60\3\61\3\61"+
		"\7\61\u0126\n\61\f\61\16\61\u0129\13\61\3\61\3\61\7\61\u012d\n\61\f\61"+
		"\16\61\u0130\13\61\3\61\3\61\3\61\7\61\u0135\n\61\f\61\16\61\u0138\13"+
		"\61\5\61\u013a\n\61\3\62\3\62\7\62\u013e\n\62\f\62\16\62\u0141\13\62\3"+
		"\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0166\n\65\3\66\6\66\u0169\n\66"+
		"\r\66\16\66\u016a\3\66\3\66\2\2\67\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\2!\2#\2%\2\'\2)\2+\21-\22/\23\61"+
		"\24\63\25\65\26\67\279\30;\31=\32?\33A\34C\35E\36G\37I K!M\"O#Q$S%U&W"+
		"\'Y([)]*_+a,c-e\2g\2i\2k.\3\2\4\4\2C\\c|\5\2\13\f\17\17\"\"\2\u0196\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5o\3\2\2\2\7q\3\2\2\2\ts\3\2\2\2"+
		"\13u\3\2\2\2\rw\3\2\2\2\17y\3\2\2\2\21{\3\2\2\2\23}\3\2\2\2\25\177\3\2"+
		"\2\2\27\u0081\3\2\2\2\31\u0083\3\2\2\2\33\u0085\3\2\2\2\35\u0087\3\2\2"+
		"\2\37\u0089\3\2\2\2!\u008b\3\2\2\2#\u008d\3\2\2\2%\u0090\3\2\2\2\'\u0093"+
		"\3\2\2\2)\u0096\3\2\2\2+\u009f\3\2\2\2-\u00a4\3\2\2\2/\u00a9\3\2\2\2\61"+
		"\u00ab\3\2\2\2\63\u00b3\3\2\2\2\65\u00b8\3\2\2\2\67\u00bc\3\2\2\29\u00c3"+
		"\3\2\2\2;\u00c8\3\2\2\2=\u00ce\3\2\2\2?\u00d0\3\2\2\2A\u00d2\3\2\2\2C"+
		"\u00d5\3\2\2\2E\u00d7\3\2\2\2G\u00d9\3\2\2\2I\u00dd\3\2\2\2K\u00e2\3\2"+
		"\2\2M\u00e4\3\2\2\2O\u00e7\3\2\2\2Q\u00ec\3\2\2\2S\u00f2\3\2\2\2U\u00f9"+
		"\3\2\2\2W\u00ff\3\2\2\2Y\u0105\3\2\2\2[\u0109\3\2\2\2]\u011a\3\2\2\2_"+
		"\u011c\3\2\2\2a\u0139\3\2\2\2c\u013b\3\2\2\2e\u0144\3\2\2\2g\u0146\3\2"+
		"\2\2i\u0165\3\2\2\2k\u0168\3\2\2\2mn\7=\2\2n\4\3\2\2\2op\7.\2\2p\6\3\2"+
		"\2\2qr\7a\2\2r\b\3\2\2\2st\7\60\2\2t\n\3\2\2\2uv\7$\2\2v\f\3\2\2\2wx\7"+
		"?\2\2x\16\3\2\2\2yz\7\u0080\2\2z\20\3\2\2\2{|\7<\2\2|\22\3\2\2\2}~\7*"+
		"\2\2~\24\3\2\2\2\177\u0080\7+\2\2\u0080\26\3\2\2\2\u0081\u0082\7}\2\2"+
		"\u0082\30\3\2\2\2\u0083\u0084\7\177\2\2\u0084\32\3\2\2\2\u0085\u0086\7"+
		"]\2\2\u0086\34\3\2\2\2\u0087\u0088\7_\2\2\u0088\36\3\2\2\2\u0089\u008a"+
		"\7>\2\2\u008a \3\2\2\2\u008b\u008c\7@\2\2\u008c\"\3\2\2\2\u008d\u008e"+
		"\7?\2\2\u008e\u008f\7?\2\2\u008f$\3\2\2\2\u0090\u0091\7#\2\2\u0091\u0092"+
		"\7?\2\2\u0092&\3\2\2\2\u0093\u0094\7>\2\2\u0094\u0095\7?\2\2\u0095(\3"+
		"\2\2\2\u0096\u0097\7@\2\2\u0097\u0098\7?\2\2\u0098*\3\2\2\2\u0099\u00a0"+
		"\5\37\20\2\u009a\u00a0\5!\21\2\u009b\u00a0\5#\22\2\u009c\u00a0\5%\23\2"+
		"\u009d\u00a0\5\'\24\2\u009e\u00a0\5)\25\2\u009f\u0099\3\2\2\2\u009f\u009a"+
		"\3\2\2\2\u009f\u009b\3\2\2\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0,\3\2\2\2\u00a1\u00a5\5=\37\2\u00a2\u00a5\5? \2\u00a3"+
		"\u00a5\5A!\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2"+
		"\2\u00a5.\3\2\2\2\u00a6\u00aa\5C\"\2\u00a7\u00aa\5E#\2\u00a8\u00aa\5G"+
		"$\2\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\60\3\2\2\2\u00ab\u00ac\7d\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7q\2\2\u00ae"+
		"\u00af\7n\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7p\2\2"+
		"\u00b2\62\3\2\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7j\2\2\u00b5\u00b6\7"+
		"c\2\2\u00b6\u00b7\7t\2\2\u00b7\64\3\2\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba"+
		"\7p\2\2\u00ba\u00bb\7v\2\2\u00bb\66\3\2\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be"+
		"\7v\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7p\2\2\u00c1"+
		"\u00c2\7i\2\2\u00c28\3\2\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7t\2\2\u00c5"+
		"\u00c6\7w\2\2\u00c6\u00c7\7g\2\2\u00c7:\3\2\2\2\u00c8\u00c9\7h\2\2\u00c9"+
		"\u00ca\7c\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7g\2\2"+
		"\u00cd<\3\2\2\2\u00ce\u00cf\7-\2\2\u00cf>\3\2\2\2\u00d0\u00d1\7/\2\2\u00d1"+
		"@\3\2\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7t\2\2\u00d4B\3\2\2\2\u00d5\u00d6"+
		"\7,\2\2\u00d6D\3\2\2\2\u00d7\u00d8\7\61\2\2\u00d8F\3\2\2\2\u00d9\u00da"+
		"\7c\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7f\2\2\u00dcH\3\2\2\2\u00dd\u00de"+
		"\7#\2\2\u00deJ\3\2\2\2\u00df\u00e3\5=\37\2\u00e0\u00e3\5? \2\u00e1\u00e3"+
		"\5I%\2\u00e2\u00df\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"L\3\2\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7h\2\2\u00e6N\3\2\2\2\u00e7\u00e8"+
		"\7g\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7g\2\2\u00eb"+
		"P\3\2\2\2\u00ec\u00ed\7y\2\2\u00ed\u00ee\7j\2\2\u00ee\u00ef\7k\2\2\u00ef"+
		"\u00f0\7n\2\2\u00f0\u00f1\7g\2\2\u00f1R\3\2\2\2\u00f2\u00f3\7t\2\2\u00f3"+
		"\u00f4\7g\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7w\2\2\u00f6\u00f7\7t\2\2"+
		"\u00f7\u00f8\7p\2\2\u00f8T\3\2\2\2\u00f9\u00fa\7e\2\2\u00fa\u00fb\7n\2"+
		"\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7u\2\2\u00feV\3\2"+
		"\2\2\u00ff\u0100\7r\2\2\u0100\u0101\7t\2\2\u0101\u0102\7k\2\2\u0102\u0103"+
		"\7p\2\2\u0103\u0104\7v\2\2\u0104X\3\2\2\2\u0105\u0106\7p\2\2\u0106\u0107"+
		"\7g\2\2\u0107\u0108\7y\2\2\u0108Z\3\2\2\2\u0109\u010a\7n\2\2\u010a\u010b"+
		"\7g\2\2\u010b\u010c\7p\2\2\u010c\u010d\7i\2\2\u010d\u010e\7j\2\2\u010e"+
		"\u010f\7v\2\2\u010f\\\3\2\2\2\u0110\u011b\5\7\4\2\u0111\u0117\5g\64\2"+
		"\u0112\u0116\5\7\4\2\u0113\u0116\5g\64\2\u0114\u0116\5e\63\2\u0115\u0112"+
		"\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u011a\u0110\3\2\2\2\u011a\u0111\3\2\2\2\u011b^\3\2\2\2\u011c\u0120"+
		"\5e\63\2\u011d\u011f\5e\63\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121`\3\2\2\2\u0122\u0120\3\2\2\2"+
		"\u0123\u0127\5e\63\2\u0124\u0126\5e\63\2\u0125\u0124\3\2\2\2\u0126\u0129"+
		"\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u012a\u012e\5\t\5\2\u012b\u012d\5e\63\2\u012c\u012b\3\2"+
		"\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u013a\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\5\t\5\2\u0132\u0136\5e"+
		"\63\2\u0133\u0135\5e\63\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2"+
		"\2\2\u0139\u0123\3\2\2\2\u0139\u0131\3\2\2\2\u013ab\3\2\2\2\u013b\u013f"+
		"\5\13\6\2\u013c\u013e\5i\65\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2"+
		"\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013f"+
		"\3\2\2\2\u0142\u0143\5\13\6\2\u0143d\3\2\2\2\u0144\u0145\4\62;\2\u0145"+
		"f\3\2\2\2\u0146\u0147\t\2\2\2\u0147h\3\2\2\2\u0148\u0166\5e\63\2\u0149"+
		"\u0166\5g\64\2\u014a\u0166\7\"\2\2\u014b\u0166\5I%\2\u014c\u0166\5\13"+
		"\6\2\u014d\u0166\4%)\2\u014e\u0166\5\23\n\2\u014f\u0166\5\25\13\2\u0150"+
		"\u0166\5C\"\2\u0151\u0166\5=\37\2\u0152\u0166\5\5\3\2\u0153\u0166\5? "+
		"\2\u0154\u0166\5\t\5\2\u0155\u0166\5E#\2\u0156\u0166\5\21\t\2\u0157\u0166"+
		"\5\3\2\2\u0158\u0166\5\37\20\2\u0159\u0166\5\r\7\2\u015a\u0166\5!\21\2"+
		"\u015b\u0166\4AB\2\u015c\u0166\5\33\16\2\u015d\u0166\5\35\17\2\u015e\u0166"+
		"\7`\2\2\u015f\u0166\5\7\4\2\u0160\u0166\7b\2\2\u0161\u0166\5\27\f\2\u0162"+
		"\u0166\7~\2\2\u0163\u0166\5\31\r\2\u0164\u0166\5\17\b\2\u0165\u0148\3"+
		"\2\2\2\u0165\u0149\3\2\2\2\u0165\u014a\3\2\2\2\u0165\u014b\3\2\2\2\u0165"+
		"\u014c\3\2\2\2\u0165\u014d\3\2\2\2\u0165\u014e\3\2\2\2\u0165\u014f\3\2"+
		"\2\2\u0165\u0150\3\2\2\2\u0165\u0151\3\2\2\2\u0165\u0152\3\2\2\2\u0165"+
		"\u0153\3\2\2\2\u0165\u0154\3\2\2\2\u0165\u0155\3\2\2\2\u0165\u0156\3\2"+
		"\2\2\u0165\u0157\3\2\2\2\u0165\u0158\3\2\2\2\u0165\u0159\3\2\2\2\u0165"+
		"\u015a\3\2\2\2\u0165\u015b\3\2\2\2\u0165\u015c\3\2\2\2\u0165\u015d\3\2"+
		"\2\2\u0165\u015e\3\2\2\2\u0165\u015f\3\2\2\2\u0165\u0160\3\2\2\2\u0165"+
		"\u0161\3\2\2\2\u0165\u0162\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2"+
		"\2\2\u0166j\3\2\2\2\u0167\u0169\t\3\2\2\u0168\u0167\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016d\b\66\2\2\u016dl\3\2\2\2\22\2\u009f\u00a4\u00a9\u00e2\u0115\u0117"+
		"\u011a\u0120\u0127\u012e\u0136\u0139\u013f\u0165\u016a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}