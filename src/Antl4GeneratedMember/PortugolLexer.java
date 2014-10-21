// Generated from C:\Projects\PortugolInterpreterFMGBRA\src\Portugol.g4 by ANTLR 4.2.2
package Antl4GeneratedMember;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PortugolLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SE=1, PONTO_VIRGULA=2, PONTO=3, VIRGULA=4, ABRE_CHAVE=5, FECHA_CHAVE=6, 
		ABRE_COLCHETE=7, FECHA_COLCHETE=8, DOIS_PONTOS=9, ABRE_PARENTESES=10, 
		FECHA_PARENTESES=11, ATRIBUICAO=12, PROGRAMA=13, VAZIO=14, REAL_DECLARACAO=15, 
		LOGICO_DECLARACAO=16, CADEIA_DECLARACAO=17, INTEIRO_DECLARACAO=18, CARACTER_DECLARACAO=19, 
		ESCOLHA=20, CASO=21, CONTRARIO=22, CONST=23, FUNCAO=24, RETORNE=25, PARA=26, 
		PARE=27, FACA=28, ENQUANTO=29, SENAO=30, INCLUA=31, BIBLIOTECA=32, LEIA=33, 
		ESCREVA=34, LIMPA=35, SOMA=36, SUBTRACAO=37, MULTIPLICACAO=38, DIVISAO=39, 
		MODULO=40, INCREMENTO=41, DECREMENTO=42, ATRIBUICAO_INCREMENTO=43, ATRIBUICAO_DECREMENTO=44, 
		ATRIBUICAO_DIVISAO=45, ATRIBUICAO_MULTIPLICAO=46, ATRIBUICAO_MODULO=47, 
		MAIOR=48, MENOR=49, MAIOR_IGUAL=50, MENOR_IGUAL=51, IGUAL=52, DIFERENTE=53, 
		E=54, OU=55, NAO=56, E_BINARIO=57, OU_BINARIO=58, NAO_BINARIO=59, SHIFT_DIREITA=60, 
		SHIFT_ESQUERDA=61, INTEIRO=62, INTEIRO_HEXADECIMAL=63, INTEIRO_BINARIO=64, 
		REAL=65, CADEIA=66, CARACTER=67, LOGICO=68, ID=69, ALIAS_BIBLIOTECA=70, 
		LINE_COMMENT=71, COMMENT=72, WS=73;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'se'", "';'", "'.'", "','", "'{'", "'}'", "'['", "']'", "':'", "'('", 
		"')'", "'='", "'programa'", "'vazio'", "'real'", "'logico'", "'cadeia'", 
		"'inteiro'", "'caracter'", "'escolha'", "'caso'", "'contrario'", "'const'", 
		"'funcao'", "'retorne'", "'para'", "'pare'", "'faca'", "'enquanto'", "'senao'", 
		"'inclua'", "'biblioteca'", "'leia'", "'escreva'", "'limpa'", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'++'", "'--'", "'+='", "'-='", "'/='", "'*='", "'%='", 
		"'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'e'", "'ou'", "'nao'", 
		"'&'", "'|'", "'~'", "'>>'", "'<<'", "INTEIRO", "INTEIRO_HEXADECIMAL", 
		"INTEIRO_BINARIO", "REAL", "CADEIA", "CARACTER", "LOGICO", "ID", "'-->'", 
		"LINE_COMMENT", "COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"SE", "PONTO_VIRGULA", "PONTO", "VIRGULA", "ABRE_CHAVE", "FECHA_CHAVE", 
		"ABRE_COLCHETE", "FECHA_COLCHETE", "DOIS_PONTOS", "ABRE_PARENTESES", "FECHA_PARENTESES", 
		"ATRIBUICAO", "PROGRAMA", "VAZIO", "REAL_DECLARACAO", "LOGICO_DECLARACAO", 
		"CADEIA_DECLARACAO", "INTEIRO_DECLARACAO", "CARACTER_DECLARACAO", "ESCOLHA", 
		"CASO", "CONTRARIO", "CONST", "FUNCAO", "RETORNE", "PARA", "PARE", "FACA", 
		"ENQUANTO", "SENAO", "INCLUA", "BIBLIOTECA", "LEIA", "ESCREVA", "LIMPA", 
		"SOMA", "SUBTRACAO", "MULTIPLICACAO", "DIVISAO", "MODULO", "INCREMENTO", 
		"DECREMENTO", "ATRIBUICAO_INCREMENTO", "ATRIBUICAO_DECREMENTO", "ATRIBUICAO_DIVISAO", 
		"ATRIBUICAO_MULTIPLICAO", "ATRIBUICAO_MODULO", "MAIOR", "MENOR", "MAIOR_IGUAL", 
		"MENOR_IGUAL", "IGUAL", "DIFERENTE", "E", "OU", "NAO", "E_BINARIO", "OU_BINARIO", 
		"NAO_BINARIO", "SHIFT_DIREITA", "SHIFT_ESQUERDA", "INTEIRO", "INTEIRO_HEXADECIMAL", 
		"INTEIRO_BINARIO", "REAL", "CADEIA", "CARACTER", "LOGICO", "ESCAPES", 
		"ID", "ALIAS_BIBLIOTECA", "LINE_COMMENT", "COMMENT", "WS"
	};


	public PortugolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Portugol.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2K\u020c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3$\3$\3$\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3"+
		"+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3"+
		"\67\38\38\38\39\39\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3=\3>\3>\3>\3?\6?\u0198"+
		"\n?\r?\16?\u0199\3@\3@\3@\6@\u019f\n@\r@\16@\u01a0\3A\3A\3A\6A\u01a6\n"+
		"A\rA\16A\u01a7\3B\6B\u01ab\nB\rB\16B\u01ac\3B\5B\u01b0\nB\3B\6B\u01b3"+
		"\nB\rB\16B\u01b4\3C\3C\3C\3C\7C\u01bb\nC\fC\16C\u01be\13C\3C\3C\3D\3D"+
		"\3D\3D\5D\u01c6\nD\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\5E\u01d9\nE\3F\3F\3G\3G\7G\u01df\nG\fG\16G\u01e2\13G\3H\3H\3H\3H\3I\3"+
		"I\3I\3I\7I\u01ec\nI\fI\16I\u01ef\13I\3I\5I\u01f2\nI\3I\3I\3I\3I\3J\3J"+
		"\3J\3J\7J\u01fc\nJ\fJ\16J\u01ff\13J\3J\3J\3J\3J\3J\3K\6K\u0207\nK\rK\16"+
		"K\u0208\3K\3K\5\u01bc\u01ed\u01fd\2L\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\u0085D\u0087E\u0089F\u008b\2\u008dG\u008fH\u0091I\u0093J\u0095K\3\2"+
		"\13\3\2\62;\4\2ZZzz\4\2\62;C\\\4\2DDdd\3\2\62\63\5\2\n\f\16\17^^\4\2C"+
		"\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\u021c\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2"+
		"s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\3\u0097\3\2\2\2\5\u009a\3\2\2\2\7\u009c\3\2\2"+
		"\2\t\u009e\3\2\2\2\13\u00a0\3\2\2\2\r\u00a2\3\2\2\2\17\u00a4\3\2\2\2\21"+
		"\u00a6\3\2\2\2\23\u00a8\3\2\2\2\25\u00aa\3\2\2\2\27\u00ac\3\2\2\2\31\u00ae"+
		"\3\2\2\2\33\u00b0\3\2\2\2\35\u00b9\3\2\2\2\37\u00bf\3\2\2\2!\u00c4\3\2"+
		"\2\2#\u00cb\3\2\2\2%\u00d2\3\2\2\2\'\u00da\3\2\2\2)\u00e3\3\2\2\2+\u00eb"+
		"\3\2\2\2-\u00f0\3\2\2\2/\u00fa\3\2\2\2\61\u0100\3\2\2\2\63\u0107\3\2\2"+
		"\2\65\u010f\3\2\2\2\67\u0114\3\2\2\29\u0119\3\2\2\2;\u011e\3\2\2\2=\u0127"+
		"\3\2\2\2?\u012d\3\2\2\2A\u0134\3\2\2\2C\u013f\3\2\2\2E\u0144\3\2\2\2G"+
		"\u014c\3\2\2\2I\u0152\3\2\2\2K\u0154\3\2\2\2M\u0156\3\2\2\2O\u0158\3\2"+
		"\2\2Q\u015a\3\2\2\2S\u015c\3\2\2\2U\u015f\3\2\2\2W\u0162\3\2\2\2Y\u0165"+
		"\3\2\2\2[\u0168\3\2\2\2]\u016b\3\2\2\2_\u016e\3\2\2\2a\u0171\3\2\2\2c"+
		"\u0173\3\2\2\2e\u0175\3\2\2\2g\u0178\3\2\2\2i\u017b\3\2\2\2k\u017e\3\2"+
		"\2\2m\u0181\3\2\2\2o\u0183\3\2\2\2q\u0186\3\2\2\2s\u018a\3\2\2\2u\u018c"+
		"\3\2\2\2w\u018e\3\2\2\2y\u0190\3\2\2\2{\u0193\3\2\2\2}\u0197\3\2\2\2\177"+
		"\u019b\3\2\2\2\u0081\u01a2\3\2\2\2\u0083\u01aa\3\2\2\2\u0085\u01b6\3\2"+
		"\2\2\u0087\u01c1\3\2\2\2\u0089\u01d8\3\2\2\2\u008b\u01da\3\2\2\2\u008d"+
		"\u01dc\3\2\2\2\u008f\u01e3\3\2\2\2\u0091\u01e7\3\2\2\2\u0093\u01f7\3\2"+
		"\2\2\u0095\u0206\3\2\2\2\u0097\u0098\7u\2\2\u0098\u0099\7g\2\2\u0099\4"+
		"\3\2\2\2\u009a\u009b\7=\2\2\u009b\6\3\2\2\2\u009c\u009d\7\60\2\2\u009d"+
		"\b\3\2\2\2\u009e\u009f\7.\2\2\u009f\n\3\2\2\2\u00a0\u00a1\7}\2\2\u00a1"+
		"\f\3\2\2\2\u00a2\u00a3\7\177\2\2\u00a3\16\3\2\2\2\u00a4\u00a5\7]\2\2\u00a5"+
		"\20\3\2\2\2\u00a6\u00a7\7_\2\2\u00a7\22\3\2\2\2\u00a8\u00a9\7<\2\2\u00a9"+
		"\24\3\2\2\2\u00aa\u00ab\7*\2\2\u00ab\26\3\2\2\2\u00ac\u00ad\7+\2\2\u00ad"+
		"\30\3\2\2\2\u00ae\u00af\7?\2\2\u00af\32\3\2\2\2\u00b0\u00b1\7r\2\2\u00b1"+
		"\u00b2\7t\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7i\2\2\u00b4\u00b5\7t\2\2"+
		"\u00b5\u00b6\7c\2\2\u00b6\u00b7\7o\2\2\u00b7\u00b8\7c\2\2\u00b8\34\3\2"+
		"\2\2\u00b9\u00ba\7x\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7|\2\2\u00bc\u00bd"+
		"\7k\2\2\u00bd\u00be\7q\2\2\u00be\36\3\2\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1"+
		"\7g\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7n\2\2\u00c3 \3\2\2\2\u00c4\u00c5"+
		"\7n\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7i\2\2\u00c7\u00c8\7k\2\2\u00c8"+
		"\u00c9\7e\2\2\u00c9\u00ca\7q\2\2\u00ca\"\3\2\2\2\u00cb\u00cc\7e\2\2\u00cc"+
		"\u00cd\7c\2\2\u00cd\u00ce\7f\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7k\2\2"+
		"\u00d0\u00d1\7c\2\2\u00d1$\3\2\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7p\2"+
		"\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8"+
		"\7t\2\2\u00d8\u00d9\7q\2\2\u00d9&\3\2\2\2\u00da\u00db\7e\2\2\u00db\u00dc"+
		"\7c\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7e\2\2\u00df"+
		"\u00e0\7v\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7t\2\2\u00e2(\3\2\2\2\u00e3"+
		"\u00e4\7g\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6\7e\2\2\u00e6\u00e7\7q\2\2"+
		"\u00e7\u00e8\7n\2\2\u00e8\u00e9\7j\2\2\u00e9\u00ea\7c\2\2\u00ea*\3\2\2"+
		"\2\u00eb\u00ec\7e\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7u\2\2\u00ee\u00ef"+
		"\7q\2\2\u00ef,\3\2\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3"+
		"\7p\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7c\2\2\u00f6"+
		"\u00f7\7t\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7q\2\2\u00f9.\3\2\2\2\u00fa"+
		"\u00fb\7e\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7u\2\2"+
		"\u00fe\u00ff\7v\2\2\u00ff\60\3\2\2\2\u0100\u0101\7h\2\2\u0101\u0102\7"+
		"w\2\2\u0102\u0103\7p\2\2\u0103\u0104\7e\2\2\u0104\u0105\7c\2\2\u0105\u0106"+
		"\7q\2\2\u0106\62\3\2\2\2\u0107\u0108\7t\2\2\u0108\u0109\7g\2\2\u0109\u010a"+
		"\7v\2\2\u010a\u010b\7q\2\2\u010b\u010c\7t\2\2\u010c\u010d\7p\2\2\u010d"+
		"\u010e\7g\2\2\u010e\64\3\2\2\2\u010f\u0110\7r\2\2\u0110\u0111\7c\2\2\u0111"+
		"\u0112\7t\2\2\u0112\u0113\7c\2\2\u0113\66\3\2\2\2\u0114\u0115\7r\2\2\u0115"+
		"\u0116\7c\2\2\u0116\u0117\7t\2\2\u0117\u0118\7g\2\2\u01188\3\2\2\2\u0119"+
		"\u011a\7h\2\2\u011a\u011b\7c\2\2\u011b\u011c\7e\2\2\u011c\u011d\7c\2\2"+
		"\u011d:\3\2\2\2\u011e\u011f\7g\2\2\u011f\u0120\7p\2\2\u0120\u0121\7s\2"+
		"\2\u0121\u0122\7w\2\2\u0122\u0123\7c\2\2\u0123\u0124\7p\2\2\u0124\u0125"+
		"\7v\2\2\u0125\u0126\7q\2\2\u0126<\3\2\2\2\u0127\u0128\7u\2\2\u0128\u0129"+
		"\7g\2\2\u0129\u012a\7p\2\2\u012a\u012b\7c\2\2\u012b\u012c\7q\2\2\u012c"+
		">\3\2\2\2\u012d\u012e\7k\2\2\u012e\u012f\7p\2\2\u012f\u0130\7e\2\2\u0130"+
		"\u0131\7n\2\2\u0131\u0132\7w\2\2\u0132\u0133\7c\2\2\u0133@\3\2\2\2\u0134"+
		"\u0135\7d\2\2\u0135\u0136\7k\2\2\u0136\u0137\7d\2\2\u0137\u0138\7n\2\2"+
		"\u0138\u0139\7k\2\2\u0139\u013a\7q\2\2\u013a\u013b\7v\2\2\u013b\u013c"+
		"\7g\2\2\u013c\u013d\7e\2\2\u013d\u013e\7c\2\2\u013eB\3\2\2\2\u013f\u0140"+
		"\7n\2\2\u0140\u0141\7g\2\2\u0141\u0142\7k\2\2\u0142\u0143\7c\2\2\u0143"+
		"D\3\2\2\2\u0144\u0145\7g\2\2\u0145\u0146\7u\2\2\u0146\u0147\7e\2\2\u0147"+
		"\u0148\7t\2\2\u0148\u0149\7g\2\2\u0149\u014a\7x\2\2\u014a\u014b\7c\2\2"+
		"\u014bF\3\2\2\2\u014c\u014d\7n\2\2\u014d\u014e\7k\2\2\u014e\u014f\7o\2"+
		"\2\u014f\u0150\7r\2\2\u0150\u0151\7c\2\2\u0151H\3\2\2\2\u0152\u0153\7"+
		"-\2\2\u0153J\3\2\2\2\u0154\u0155\7/\2\2\u0155L\3\2\2\2\u0156\u0157\7,"+
		"\2\2\u0157N\3\2\2\2\u0158\u0159\7\61\2\2\u0159P\3\2\2\2\u015a\u015b\7"+
		"\'\2\2\u015bR\3\2\2\2\u015c\u015d\7-\2\2\u015d\u015e\7-\2\2\u015eT\3\2"+
		"\2\2\u015f\u0160\7/\2\2\u0160\u0161\7/\2\2\u0161V\3\2\2\2\u0162\u0163"+
		"\7-\2\2\u0163\u0164\7?\2\2\u0164X\3\2\2\2\u0165\u0166\7/\2\2\u0166\u0167"+
		"\7?\2\2\u0167Z\3\2\2\2\u0168\u0169\7\61\2\2\u0169\u016a\7?\2\2\u016a\\"+
		"\3\2\2\2\u016b\u016c\7,\2\2\u016c\u016d\7?\2\2\u016d^\3\2\2\2\u016e\u016f"+
		"\7\'\2\2\u016f\u0170\7?\2\2\u0170`\3\2\2\2\u0171\u0172\7@\2\2\u0172b\3"+
		"\2\2\2\u0173\u0174\7>\2\2\u0174d\3\2\2\2\u0175\u0176\7@\2\2\u0176\u0177"+
		"\7?\2\2\u0177f\3\2\2\2\u0178\u0179\7>\2\2\u0179\u017a\7?\2\2\u017ah\3"+
		"\2\2\2\u017b\u017c\7?\2\2\u017c\u017d\7?\2\2\u017dj\3\2\2\2\u017e\u017f"+
		"\7#\2\2\u017f\u0180\7?\2\2\u0180l\3\2\2\2\u0181\u0182\7g\2\2\u0182n\3"+
		"\2\2\2\u0183\u0184\7q\2\2\u0184\u0185\7w\2\2\u0185p\3\2\2\2\u0186\u0187"+
		"\7p\2\2\u0187\u0188\7c\2\2\u0188\u0189\7q\2\2\u0189r\3\2\2\2\u018a\u018b"+
		"\7(\2\2\u018bt\3\2\2\2\u018c\u018d\7~\2\2\u018dv\3\2\2\2\u018e\u018f\7"+
		"\u0080\2\2\u018fx\3\2\2\2\u0190\u0191\7@\2\2\u0191\u0192\7@\2\2\u0192"+
		"z\3\2\2\2\u0193\u0194\7>\2\2\u0194\u0195\7>\2\2\u0195|\3\2\2\2\u0196\u0198"+
		"\t\2\2\2\u0197\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a~\3\2\2\2\u019b\u019c\7\62\2\2\u019c\u019e\t\3\2\2"+
		"\u019d\u019f\t\4\2\2\u019e\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u019e"+
		"\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u0080\3\2\2\2\u01a2\u01a3\7\62\2\2"+
		"\u01a3\u01a5\t\5\2\2\u01a4\u01a6\t\6\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a7"+
		"\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u0082\3\2\2\2\u01a9"+
		"\u01ab\t\2\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01aa\3\2"+
		"\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u01b0\7\60\2\2\u01af"+
		"\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01b3\t\2"+
		"\2\2\u01b2\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u0084\3\2\2\2\u01b6\u01bc\7$\2\2\u01b7\u01bb\13\2"+
		"\2\2\u01b8\u01bb\7$\2\2\u01b9\u01bb\5\u008bF\2\u01ba\u01b7\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01bd\3\2"+
		"\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01bf\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf"+
		"\u01c0\7$\2\2\u01c0\u0086\3\2\2\2\u01c1\u01c5\7)\2\2\u01c2\u01c6\13\2"+
		"\2\2\u01c3\u01c6\5\u008bF\2\u01c4\u01c6\7)\2\2\u01c5\u01c2\3\2\2\2\u01c5"+
		"\u01c3\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2"+
		"\2\2\u01c7\u01c8\7)\2\2\u01c8\u0088\3\2\2\2\u01c9\u01ca\7x\2\2\u01ca\u01cb"+
		"\7g\2\2\u01cb\u01cc\7t\2\2\u01cc\u01cd\7f\2\2\u01cd\u01ce\7c\2\2\u01ce"+
		"\u01cf\7f\2\2\u01cf\u01d0\7g\2\2\u01d0\u01d1\7k\2\2\u01d1\u01d2\7t\2\2"+
		"\u01d2\u01d9\7q\2\2\u01d3\u01d4\7h\2\2\u01d4\u01d5\7c\2\2\u01d5\u01d6"+
		"\7n\2\2\u01d6\u01d7\7u\2\2\u01d7\u01d9\7q\2\2\u01d8\u01c9\3\2\2\2\u01d8"+
		"\u01d3\3\2\2\2\u01d9\u008a\3\2\2\2\u01da\u01db\t\7\2\2\u01db\u008c\3\2"+
		"\2\2\u01dc\u01e0\t\b\2\2\u01dd\u01df\t\t\2\2\u01de\u01dd\3\2\2\2\u01df"+
		"\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u008e\3\2"+
		"\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4\7/\2\2\u01e4\u01e5\7/\2\2\u01e5\u01e6"+
		"\7@\2\2\u01e6\u0090\3\2\2\2\u01e7\u01e8\7\61\2\2\u01e8\u01e9\7\61\2\2"+
		"\u01e9\u01ed\3\2\2\2\u01ea\u01ec\13\2\2\2\u01eb\u01ea\3\2\2\2\u01ec\u01ef"+
		"\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef"+
		"\u01ed\3\2\2\2\u01f0\u01f2\7\17\2\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3"+
		"\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\7\f\2\2\u01f4\u01f5\3\2\2\2\u01f5"+
		"\u01f6\bI\2\2\u01f6\u0092\3\2\2\2\u01f7\u01f8\7\61\2\2\u01f8\u01f9\7,"+
		"\2\2\u01f9\u01fd\3\2\2\2\u01fa\u01fc\13\2\2\2\u01fb\u01fa\3\2\2\2\u01fc"+
		"\u01ff\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u0200\3\2"+
		"\2\2\u01ff\u01fd\3\2\2\2\u0200\u0201\7,\2\2\u0201\u0202\7\61\2\2\u0202"+
		"\u0203\3\2\2\2\u0203\u0204\bJ\2\2\u0204\u0094\3\2\2\2\u0205\u0207\t\n"+
		"\2\2\u0206\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0206\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\bK\2\2\u020b\u0096\3\2"+
		"\2\2\22\2\u0199\u01a0\u01a7\u01ac\u01af\u01b4\u01ba\u01bc\u01c5\u01d8"+
		"\u01e0\u01ed\u01f1\u01fd\u0208\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}