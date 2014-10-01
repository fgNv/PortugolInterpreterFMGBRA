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
		VALOR_CONSTANTE=1, SE=2, PONTO_VIRGULA=3, PONTO=4, VIRGULA=5, ABRE_CHAVE=6, 
		FECHA_CHAVE=7, ABRE_COLCHETE=8, FECHA_COLCHETE=9, DOIS_PONTOS=10, ABRE_PARENTESES=11, 
		FECHA_PARENTESES=12, ATRIBUICAO=13, PROGRAMA=14, VAZIO=15, REAL_DECLARACAO=16, 
		LOGICO_DECLARACAO=17, CADEIA_DECLARACAO=18, INTEIRO_DECLARACAO=19, CARACTER_DECLARACAO=20, 
		ESCOLHA=21, CASO=22, CONTRARIO=23, CONST=24, FUNCAO=25, RETORNE=26, PARA=27, 
		PARE=28, FACA=29, ENQUANTO=30, SENAO=31, INCLUA=32, BIBLIOTECA=33, LEIA=34, 
		ESCREVA=35, LIMPA=36, SOMA=37, SUBTRACAO=38, MULTIPLICACAO=39, DIVISAO=40, 
		MODULO=41, INCREMENTO=42, DECREMENTO=43, ATRIBUICAO_INCREMENTO=44, ATRIBUICAO_DECREMENTO=45, 
		ATRIBUICAO_DIVISAO=46, ATRIBUICAO_MULTIPLICAO=47, ATRIBUICAO_MODULO=48, 
		MAIOR=49, MENOR=50, MAIOR_IGUAL=51, MENOR_IGUAL=52, IGUAL=53, DIFERENTE=54, 
		E=55, OU=56, NAO=57, E_BINARIO=58, OU_BINARIO=59, NAO_BINARIO=60, SHIFT_DIREITA=61, 
		SHIFT_ESQUERDA=62, INTEIRO=63, INTEIRO_HEXADECIMAL=64, INTEIRO_BINARIO=65, 
		REAL=66, CADEIA=67, CARACTER=68, LOGICO=69, ID=70, ALIAS_BIBLIOTECA=71, 
		LINE_COMMENT=72, COMMENT=73, WS=74;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"VALOR_CONSTANTE", "'se'", "';'", "'.'", "','", "'{'", "'}'", "'['", "']'", 
		"':'", "'('", "')'", "'='", "'programa'", "'vazio'", "'real'", "'logico'", 
		"'cadeia'", "'inteiro'", "'caracter'", "'escolha'", "'caso'", "'contrario'", 
		"'const'", "'funcao'", "'retorne'", "'para'", "'pare'", "'faca'", "'enquanto'", 
		"'senao'", "'inclua'", "'biblioteca'", "'leia'", "'escreva'", "'limpa'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'+='", "'-='", "'/='", 
		"'*='", "'%='", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'e'", "'ou'", 
		"'nao'", "'&'", "'|'", "'~'", "'>>'", "'<<'", "INTEIRO", "INTEIRO_HEXADECIMAL", 
		"INTEIRO_BINARIO", "REAL", "CADEIA", "CARACTER", "LOGICO", "ID", "'-->'", 
		"LINE_COMMENT", "COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"VALOR_CONSTANTE", "SE", "PONTO_VIRGULA", "PONTO", "VIRGULA", "ABRE_CHAVE", 
		"FECHA_CHAVE", "ABRE_COLCHETE", "FECHA_COLCHETE", "DOIS_PONTOS", "ABRE_PARENTESES", 
		"FECHA_PARENTESES", "ATRIBUICAO", "PROGRAMA", "VAZIO", "REAL_DECLARACAO", 
		"LOGICO_DECLARACAO", "CADEIA_DECLARACAO", "INTEIRO_DECLARACAO", "CARACTER_DECLARACAO", 
		"ESCOLHA", "CASO", "CONTRARIO", "CONST", "FUNCAO", "RETORNE", "PARA", 
		"PARE", "FACA", "ENQUANTO", "SENAO", "INCLUA", "BIBLIOTECA", "LEIA", "ESCREVA", 
		"LIMPA", "SOMA", "SUBTRACAO", "MULTIPLICACAO", "DIVISAO", "MODULO", "INCREMENTO", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2L\u0215\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\2\3\2\3\2\5\2\u009f\n\2\3\3\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3\'\3"+
		"\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\39\39\39\3:\3:\3:\3:\3;\3;\3"+
		"<\3<\3=\3=\3>\3>\3>\3?\3?\3?\3@\6@\u01a1\n@\r@\16@\u01a2\3A\3A\3A\6A\u01a8"+
		"\nA\rA\16A\u01a9\3B\3B\3B\6B\u01af\nB\rB\16B\u01b0\3C\6C\u01b4\nC\rC\16"+
		"C\u01b5\3C\5C\u01b9\nC\3C\6C\u01bc\nC\rC\16C\u01bd\3D\3D\3D\3D\7D\u01c4"+
		"\nD\fD\16D\u01c7\13D\3D\3D\3E\3E\3E\3E\5E\u01cf\nE\3E\3E\3F\3F\3F\3F\3"+
		"F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u01e2\nF\3G\3G\3H\3H\7H\u01e8\nH\f"+
		"H\16H\u01eb\13H\3I\3I\3I\3I\3J\3J\3J\3J\7J\u01f5\nJ\fJ\16J\u01f8\13J\3"+
		"J\5J\u01fb\nJ\3J\3J\3J\3J\3K\3K\3K\3K\7K\u0205\nK\fK\16K\u0208\13K\3K"+
		"\3K\3K\3K\3K\3L\6L\u0210\nL\rL\16L\u0211\3L\3L\5\u01c5\u01f6\u0206\2M"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008d\2"+
		"\u008fH\u0091I\u0093J\u0095K\u0097L\3\2\13\3\2\62;\4\2ZZzz\4\2\62;C\\"+
		"\4\2DDdd\3\2\62\63\5\2\n\f\16\17^^\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17"+
		"\17\"\"\u0229\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2"+
		"y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\3\u009e\3\2\2\2\5\u00a0\3\2\2\2\7\u00a3\3\2\2\2\t\u00a5\3\2\2"+
		"\2\13\u00a7\3\2\2\2\r\u00a9\3\2\2\2\17\u00ab\3\2\2\2\21\u00ad\3\2\2\2"+
		"\23\u00af\3\2\2\2\25\u00b1\3\2\2\2\27\u00b3\3\2\2\2\31\u00b5\3\2\2\2\33"+
		"\u00b7\3\2\2\2\35\u00b9\3\2\2\2\37\u00c2\3\2\2\2!\u00c8\3\2\2\2#\u00cd"+
		"\3\2\2\2%\u00d4\3\2\2\2\'\u00db\3\2\2\2)\u00e3\3\2\2\2+\u00ec\3\2\2\2"+
		"-\u00f4\3\2\2\2/\u00f9\3\2\2\2\61\u0103\3\2\2\2\63\u0109\3\2\2\2\65\u0110"+
		"\3\2\2\2\67\u0118\3\2\2\29\u011d\3\2\2\2;\u0122\3\2\2\2=\u0127\3\2\2\2"+
		"?\u0130\3\2\2\2A\u0136\3\2\2\2C\u013d\3\2\2\2E\u0148\3\2\2\2G\u014d\3"+
		"\2\2\2I\u0155\3\2\2\2K\u015b\3\2\2\2M\u015d\3\2\2\2O\u015f\3\2\2\2Q\u0161"+
		"\3\2\2\2S\u0163\3\2\2\2U\u0165\3\2\2\2W\u0168\3\2\2\2Y\u016b\3\2\2\2["+
		"\u016e\3\2\2\2]\u0171\3\2\2\2_\u0174\3\2\2\2a\u0177\3\2\2\2c\u017a\3\2"+
		"\2\2e\u017c\3\2\2\2g\u017e\3\2\2\2i\u0181\3\2\2\2k\u0184\3\2\2\2m\u0187"+
		"\3\2\2\2o\u018a\3\2\2\2q\u018c\3\2\2\2s\u018f\3\2\2\2u\u0193\3\2\2\2w"+
		"\u0195\3\2\2\2y\u0197\3\2\2\2{\u0199\3\2\2\2}\u019c\3\2\2\2\177\u01a0"+
		"\3\2\2\2\u0081\u01a4\3\2\2\2\u0083\u01ab\3\2\2\2\u0085\u01b3\3\2\2\2\u0087"+
		"\u01bf\3\2\2\2\u0089\u01ca\3\2\2\2\u008b\u01e1\3\2\2\2\u008d\u01e3\3\2"+
		"\2\2\u008f\u01e5\3\2\2\2\u0091\u01ec\3\2\2\2\u0093\u01f0\3\2\2\2\u0095"+
		"\u0200\3\2\2\2\u0097\u020f\3\2\2\2\u0099\u009f\5\177@\2\u009a\u009f\5"+
		"\u0085C\2\u009b\u009f\5\u0089E\2\u009c\u009f\5\u0087D\2\u009d\u009f\5"+
		"\u008bF\2\u009e\u0099\3\2\2\2\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2\2"+
		"\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\4\3\2\2\2\u00a0\u00a1\7"+
		"u\2\2\u00a1\u00a2\7g\2\2\u00a2\6\3\2\2\2\u00a3\u00a4\7=\2\2\u00a4\b\3"+
		"\2\2\2\u00a5\u00a6\7\60\2\2\u00a6\n\3\2\2\2\u00a7\u00a8\7.\2\2\u00a8\f"+
		"\3\2\2\2\u00a9\u00aa\7}\2\2\u00aa\16\3\2\2\2\u00ab\u00ac\7\177\2\2\u00ac"+
		"\20\3\2\2\2\u00ad\u00ae\7]\2\2\u00ae\22\3\2\2\2\u00af\u00b0\7_\2\2\u00b0"+
		"\24\3\2\2\2\u00b1\u00b2\7<\2\2\u00b2\26\3\2\2\2\u00b3\u00b4\7*\2\2\u00b4"+
		"\30\3\2\2\2\u00b5\u00b6\7+\2\2\u00b6\32\3\2\2\2\u00b7\u00b8\7?\2\2\u00b8"+
		"\34\3\2\2\2\u00b9\u00ba\7r\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7q\2\2\u00bc"+
		"\u00bd\7i\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7o\2\2"+
		"\u00c0\u00c1\7c\2\2\u00c1\36\3\2\2\2\u00c2\u00c3\7x\2\2\u00c3\u00c4\7"+
		"c\2\2\u00c4\u00c5\7|\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7q\2\2\u00c7 "+
		"\3\2\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7c\2\2\u00cb"+
		"\u00cc\7n\2\2\u00cc\"\3\2\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7q\2\2\u00cf"+
		"\u00d0\7i\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3\7q\2\2"+
		"\u00d3$\3\2\2\2\u00d4\u00d5\7e\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7f\2"+
		"\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7c\2\2\u00da&\3\2"+
		"\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7v\2\2\u00de\u00df"+
		"\7g\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7q\2\2\u00e2"+
		"(\3\2\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7t\2\2\u00e6"+
		"\u00e7\7c\2\2\u00e7\u00e8\7e\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7g\2\2"+
		"\u00ea\u00eb\7t\2\2\u00eb*\3\2\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7u\2"+
		"\2\u00ee\u00ef\7e\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2"+
		"\7j\2\2\u00f2\u00f3\7c\2\2\u00f3,\3\2\2\2\u00f4\u00f5\7e\2\2\u00f5\u00f6"+
		"\7c\2\2\u00f6\u00f7\7u\2\2\u00f7\u00f8\7q\2\2\u00f8.\3\2\2\2\u00f9\u00fa"+
		"\7e\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd\7v\2\2\u00fd"+
		"\u00fe\7t\2\2\u00fe\u00ff\7c\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7k\2\2"+
		"\u0101\u0102\7q\2\2\u0102\60\3\2\2\2\u0103\u0104\7e\2\2\u0104\u0105\7"+
		"q\2\2\u0105\u0106\7p\2\2\u0106\u0107\7u\2\2\u0107\u0108\7v\2\2\u0108\62"+
		"\3\2\2\2\u0109\u010a\7h\2\2\u010a\u010b\7w\2\2\u010b\u010c\7p\2\2\u010c"+
		"\u010d\7e\2\2\u010d\u010e\7c\2\2\u010e\u010f\7q\2\2\u010f\64\3\2\2\2\u0110"+
		"\u0111\7t\2\2\u0111\u0112\7g\2\2\u0112\u0113\7v\2\2\u0113\u0114\7q\2\2"+
		"\u0114\u0115\7t\2\2\u0115\u0116\7p\2\2\u0116\u0117\7g\2\2\u0117\66\3\2"+
		"\2\2\u0118\u0119\7r\2\2\u0119\u011a\7c\2\2\u011a\u011b\7t\2\2\u011b\u011c"+
		"\7c\2\2\u011c8\3\2\2\2\u011d\u011e\7r\2\2\u011e\u011f\7c\2\2\u011f\u0120"+
		"\7t\2\2\u0120\u0121\7g\2\2\u0121:\3\2\2\2\u0122\u0123\7h\2\2\u0123\u0124"+
		"\7c\2\2\u0124\u0125\7e\2\2\u0125\u0126\7c\2\2\u0126<\3\2\2\2\u0127\u0128"+
		"\7g\2\2\u0128\u0129\7p\2\2\u0129\u012a\7s\2\2\u012a\u012b\7w\2\2\u012b"+
		"\u012c\7c\2\2\u012c\u012d\7p\2\2\u012d\u012e\7v\2\2\u012e\u012f\7q\2\2"+
		"\u012f>\3\2\2\2\u0130\u0131\7u\2\2\u0131\u0132\7g\2\2\u0132\u0133\7p\2"+
		"\2\u0133\u0134\7c\2\2\u0134\u0135\7q\2\2\u0135@\3\2\2\2\u0136\u0137\7"+
		"k\2\2\u0137\u0138\7p\2\2\u0138\u0139\7e\2\2\u0139\u013a\7n\2\2\u013a\u013b"+
		"\7w\2\2\u013b\u013c\7c\2\2\u013cB\3\2\2\2\u013d\u013e\7d\2\2\u013e\u013f"+
		"\7k\2\2\u013f\u0140\7d\2\2\u0140\u0141\7n\2\2\u0141\u0142\7k\2\2\u0142"+
		"\u0143\7q\2\2\u0143\u0144\7v\2\2\u0144\u0145\7g\2\2\u0145\u0146\7e\2\2"+
		"\u0146\u0147\7c\2\2\u0147D\3\2\2\2\u0148\u0149\7n\2\2\u0149\u014a\7g\2"+
		"\2\u014a\u014b\7k\2\2\u014b\u014c\7c\2\2\u014cF\3\2\2\2\u014d\u014e\7"+
		"g\2\2\u014e\u014f\7u\2\2\u014f\u0150\7e\2\2\u0150\u0151\7t\2\2\u0151\u0152"+
		"\7g\2\2\u0152\u0153\7x\2\2\u0153\u0154\7c\2\2\u0154H\3\2\2\2\u0155\u0156"+
		"\7n\2\2\u0156\u0157\7k\2\2\u0157\u0158\7o\2\2\u0158\u0159\7r\2\2\u0159"+
		"\u015a\7c\2\2\u015aJ\3\2\2\2\u015b\u015c\7-\2\2\u015cL\3\2\2\2\u015d\u015e"+
		"\7/\2\2\u015eN\3\2\2\2\u015f\u0160\7,\2\2\u0160P\3\2\2\2\u0161\u0162\7"+
		"\61\2\2\u0162R\3\2\2\2\u0163\u0164\7\'\2\2\u0164T\3\2\2\2\u0165\u0166"+
		"\7-\2\2\u0166\u0167\7-\2\2\u0167V\3\2\2\2\u0168\u0169\7/\2\2\u0169\u016a"+
		"\7/\2\2\u016aX\3\2\2\2\u016b\u016c\7-\2\2\u016c\u016d\7?\2\2\u016dZ\3"+
		"\2\2\2\u016e\u016f\7/\2\2\u016f\u0170\7?\2\2\u0170\\\3\2\2\2\u0171\u0172"+
		"\7\61\2\2\u0172\u0173\7?\2\2\u0173^\3\2\2\2\u0174\u0175\7,\2\2\u0175\u0176"+
		"\7?\2\2\u0176`\3\2\2\2\u0177\u0178\7\'\2\2\u0178\u0179\7?\2\2\u0179b\3"+
		"\2\2\2\u017a\u017b\7@\2\2\u017bd\3\2\2\2\u017c\u017d\7>\2\2\u017df\3\2"+
		"\2\2\u017e\u017f\7@\2\2\u017f\u0180\7?\2\2\u0180h\3\2\2\2\u0181\u0182"+
		"\7>\2\2\u0182\u0183\7?\2\2\u0183j\3\2\2\2\u0184\u0185\7?\2\2\u0185\u0186"+
		"\7?\2\2\u0186l\3\2\2\2\u0187\u0188\7#\2\2\u0188\u0189\7?\2\2\u0189n\3"+
		"\2\2\2\u018a\u018b\7g\2\2\u018bp\3\2\2\2\u018c\u018d\7q\2\2\u018d\u018e"+
		"\7w\2\2\u018er\3\2\2\2\u018f\u0190\7p\2\2\u0190\u0191\7c\2\2\u0191\u0192"+
		"\7q\2\2\u0192t\3\2\2\2\u0193\u0194\7(\2\2\u0194v\3\2\2\2\u0195\u0196\7"+
		"~\2\2\u0196x\3\2\2\2\u0197\u0198\7\u0080\2\2\u0198z\3\2\2\2\u0199\u019a"+
		"\7@\2\2\u019a\u019b\7@\2\2\u019b|\3\2\2\2\u019c\u019d\7>\2\2\u019d\u019e"+
		"\7>\2\2\u019e~\3\2\2\2\u019f\u01a1\t\2\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u0080\3\2\2\2\u01a4"+
		"\u01a5\7\62\2\2\u01a5\u01a7\t\3\2\2\u01a6\u01a8\t\4\2\2\u01a7\u01a6\3"+
		"\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"\u0082\3\2\2\2\u01ab\u01ac\7\62\2\2\u01ac\u01ae\t\5\2\2\u01ad\u01af\t"+
		"\6\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u0084\3\2\2\2\u01b2\u01b4\t\2\2\2\u01b3\u01b2\3\2"+
		"\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b8\3\2\2\2\u01b7\u01b9\7\60\2\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3"+
		"\2\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01bc\t\2\2\2\u01bb\u01ba\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u0086\3\2"+
		"\2\2\u01bf\u01c5\7$\2\2\u01c0\u01c4\13\2\2\2\u01c1\u01c4\7$\2\2\u01c2"+
		"\u01c4\5\u008dG\2\u01c3\u01c0\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c2"+
		"\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6"+
		"\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\7$\2\2\u01c9\u0088\3\2"+
		"\2\2\u01ca\u01ce\7)\2\2\u01cb\u01cf\13\2\2\2\u01cc\u01cf\5\u008dG\2\u01cd"+
		"\u01cf\7)\2\2\u01ce\u01cb\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cd\3\2"+
		"\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\7)\2\2\u01d1"+
		"\u008a\3\2\2\2\u01d2\u01d3\7x\2\2\u01d3\u01d4\7g\2\2\u01d4\u01d5\7t\2"+
		"\2\u01d5\u01d6\7f\2\2\u01d6\u01d7\7c\2\2\u01d7\u01d8\7f\2\2\u01d8\u01d9"+
		"\7g\2\2\u01d9\u01da\7k\2\2\u01da\u01db\7t\2\2\u01db\u01e2\7q\2\2\u01dc"+
		"\u01dd\7h\2\2\u01dd\u01de\7c\2\2\u01de\u01df\7n\2\2\u01df\u01e0\7u\2\2"+
		"\u01e0\u01e2\7q\2\2\u01e1\u01d2\3\2\2\2\u01e1\u01dc\3\2\2\2\u01e2\u008c"+
		"\3\2\2\2\u01e3\u01e4\t\7\2\2\u01e4\u008e\3\2\2\2\u01e5\u01e9\t\b\2\2\u01e6"+
		"\u01e8\t\t\2\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2"+
		"\2\2\u01e9\u01ea\3\2\2\2\u01ea\u0090\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec"+
		"\u01ed\7/\2\2\u01ed\u01ee\7/\2\2\u01ee\u01ef\7@\2\2\u01ef\u0092\3\2\2"+
		"\2\u01f0\u01f1\7\61\2\2\u01f1\u01f2\7\61\2\2\u01f2\u01f6\3\2\2\2\u01f3"+
		"\u01f5\13\2\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f7\3"+
		"\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9"+
		"\u01fb\7\17\2\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\3"+
		"\2\2\2\u01fc\u01fd\7\f\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\bJ\2\2\u01ff"+
		"\u0094\3\2\2\2\u0200\u0201\7\61\2\2\u0201\u0202\7,\2\2\u0202\u0206\3\2"+
		"\2\2\u0203\u0205\13\2\2\2\u0204\u0203\3\2\2\2\u0205\u0208\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0209\3\2\2\2\u0208\u0206\3\2"+
		"\2\2\u0209\u020a\7,\2\2\u020a\u020b\7\61\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020d\bK\2\2\u020d\u0096\3\2\2\2\u020e\u0210\t\n\2\2\u020f\u020e\3\2"+
		"\2\2\u0210\u0211\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212"+
		"\u0213\3\2\2\2\u0213\u0214\bL\2\2\u0214\u0098\3\2\2\2\23\2\u009e\u01a2"+
		"\u01a9\u01b0\u01b5\u01b8\u01bd\u01c3\u01c5\u01ce\u01e1\u01e9\u01f6\u01fa"+
		"\u0206\u0211\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}