// Generated from C:\Projects\PortugolInterpreterFMGBRA\src\Portugol.g4 by ANTLR 4.2.2
package Antl4GeneratedMember;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PortugolParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "VALOR_CONSTANTE", "'se'", "';'", "'.'", "','", "'{'", "'}'", 
		"'['", "']'", "':'", "'('", "')'", "'='", "'programa'", "'vazio'", "'real'", 
		"'logico'", "'cadeia'", "'inteiro'", "'caracter'", "'escolha'", "'caso'", 
		"'contrario'", "'const'", "'funcao'", "'retorne'", "'para'", "'pare'", 
		"'faca'", "'enquanto'", "'senao'", "'inclua'", "'biblioteca'", "'leia'", 
		"'escreva'", "'limpa'", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", 
		"'+='", "'-='", "'/='", "'*='", "'%='", "'>'", "'<'", "'>='", "'<='", 
		"'=='", "'!='", "'e'", "'ou'", "'nao'", "'&'", "'|'", "'~'", "'>>'", "'<<'", 
		"INTEIRO", "INTEIRO_HEXADECIMAL", "INTEIRO_BINARIO", "REAL", "CADEIA", 
		"CARACTER", "LOGICO", "ID", "'-->'", "LINE_COMMENT", "COMMENT", "WS"
	};
	public static final int
		RULE_programa = 0, RULE_corpo = 1, RULE_bibliotecas = 2, RULE_biblioteca = 3, 
		RULE_declaracoes = 4, RULE_item_var = 5, RULE_lista_var = 6, RULE_dec_var = 7, 
		RULE_inicializacao_vetor = 8, RULE_dec_constante = 9, RULE_dec_lista_param = 10, 
		RULE_dec_item_param = 11, RULE_dec_funcao = 12, RULE_operando = 13, RULE_expressao = 14, 
		RULE_tipo = 15, RULE_id = 16, RULE_valor = 17, RULE_se = 18, RULE_faca = 19, 
		RULE_enquanto = 20, RULE_para = 21, RULE_contador_para = 22, RULE_escolha = 23, 
		RULE_caso = 24, RULE_bloco = 25, RULE_comando = 26, RULE_chamada_funcao = 27, 
		RULE_lista_param = 28, RULE_retorno = 29, RULE_atribuicao = 30, RULE_operador = 31, 
		RULE_leia = 32, RULE_escreva = 33;
	public static final String[] ruleNames = {
		"programa", "corpo", "bibliotecas", "biblioteca", "declaracoes", "item_var", 
		"lista_var", "dec_var", "inicializacao_vetor", "dec_constante", "dec_lista_param", 
		"dec_item_param", "dec_funcao", "operando", "expressao", "tipo", "id", 
		"valor", "se", "faca", "enquanto", "para", "contador_para", "escolha", 
		"caso", "bloco", "comando", "chamada_funcao", "lista_param", "retorno", 
		"atribuicao", "operador", "leia", "escreva"
	};

	@Override
	public String getGrammarFileName() { return "Portugol.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PortugolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode PROGRAMA() { return getToken(PortugolParser.PROGRAMA, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(PROGRAMA);
			setState(69); match(ABRE_CHAVE);
			setState(70); corpo();
			setState(71); match(FECHA_CHAVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorpoContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public BibliotecasContext bibliotecas() {
			return getRuleContext(BibliotecasContext.class,0);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); bibliotecas();
			setState(74); declaracoes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BibliotecasContext extends ParserRuleContext {
		public BibliotecaContext biblioteca(int i) {
			return getRuleContext(BibliotecaContext.class,i);
		}
		public List<BibliotecaContext> biblioteca() {
			return getRuleContexts(BibliotecaContext.class);
		}
		public BibliotecasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bibliotecas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterBibliotecas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitBibliotecas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitBibliotecas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BibliotecasContext bibliotecas() throws RecognitionException {
		BibliotecasContext _localctx = new BibliotecasContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bibliotecas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INCLUA) {
				{
				{
				setState(76); biblioteca();
				}
				}
				setState(81);
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

	public static class BibliotecaContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PortugolParser.ID); }
		public TerminalNode INCLUA() { return getToken(PortugolParser.INCLUA, 0); }
		public TerminalNode ID(int i) {
			return getToken(PortugolParser.ID, i);
		}
		public TerminalNode BIBLIOTECA() { return getToken(PortugolParser.BIBLIOTECA, 0); }
		public BibliotecaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_biblioteca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterBiblioteca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitBiblioteca(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitBiblioteca(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BibliotecaContext biblioteca() throws RecognitionException {
		BibliotecaContext _localctx = new BibliotecaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_biblioteca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(INCLUA);
			setState(83); match(BIBLIOTECA);
			setState(84); match(ID);
			setState(87);
			_la = _input.LA(1);
			if (_la==ALIAS_BIBLIOTECA) {
				{
				setState(85); match(ALIAS_BIBLIOTECA);
				setState(86); match(ID);
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

	public static class DeclaracoesContext extends ParserRuleContext {
		public List<Dec_varContext> dec_var() {
			return getRuleContexts(Dec_varContext.class);
		}
		public Dec_constanteContext dec_constante(int i) {
			return getRuleContext(Dec_constanteContext.class,i);
		}
		public Dec_funcaoContext dec_funcao(int i) {
			return getRuleContext(Dec_funcaoContext.class,i);
		}
		public Dec_varContext dec_var(int i) {
			return getRuleContext(Dec_varContext.class,i);
		}
		public List<Dec_funcaoContext> dec_funcao() {
			return getRuleContexts(Dec_funcaoContext.class);
		}
		public List<Dec_constanteContext> dec_constante() {
			return getRuleContexts(Dec_constanteContext.class);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL_DECLARACAO) | (1L << LOGICO_DECLARACAO) | (1L << CADEIA_DECLARACAO) | (1L << INTEIRO_DECLARACAO) | (1L << CARACTER_DECLARACAO) | (1L << CONST) | (1L << FUNCAO))) != 0)) {
				{
				setState(92);
				switch (_input.LA(1)) {
				case FUNCAO:
					{
					setState(89); dec_funcao();
					}
					break;
				case REAL_DECLARACAO:
				case LOGICO_DECLARACAO:
				case CADEIA_DECLARACAO:
				case INTEIRO_DECLARACAO:
				case CARACTER_DECLARACAO:
					{
					setState(90); dec_var();
					}
					break;
				case CONST:
					{
					setState(91); dec_constante();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(96);
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

	public static class Item_varContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PortugolParser.ID); }
		public Inicializacao_vetorContext inicializacao_vetor() {
			return getRuleContext(Inicializacao_vetorContext.class,0);
		}
		public TerminalNode INTEIRO(int i) {
			return getToken(PortugolParser.INTEIRO, i);
		}
		public List<TerminalNode> INTEIRO() { return getTokens(PortugolParser.INTEIRO); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(PortugolParser.ID, i);
		}
		public Item_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterItem_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitItem_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitItem_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Item_varContext item_var() throws RecognitionException {
		Item_varContext _localctx = new Item_varContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_item_var);
		int _la;
		try {
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97); match(ID);
				setState(100);
				_la = _input.LA(1);
				if (_la==ATRIBUICAO) {
					{
					setState(98); match(ATRIBUICAO);
					setState(99); expressao(0);
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102); match(ID);
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(103); match(ABRE_COLCHETE);
					setState(105);
					_la = _input.LA(1);
					if (_la==INTEIRO || _la==ID) {
						{
						setState(104);
						_la = _input.LA(1);
						if ( !(_la==INTEIRO || _la==ID) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
					}

					setState(107); match(FECHA_COLCHETE);
					}
					}
					setState(110); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ABRE_COLCHETE );
				setState(114);
				_la = _input.LA(1);
				if (_la==ATRIBUICAO) {
					{
					setState(112); match(ATRIBUICAO);
					setState(113); inicializacao_vetor();
					}
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

	public static class Lista_varContext extends ParserRuleContext {
		public List<Item_varContext> item_var() {
			return getRuleContexts(Item_varContext.class);
		}
		public Item_varContext item_var(int i) {
			return getRuleContext(Item_varContext.class,i);
		}
		public Lista_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterLista_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitLista_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitLista_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_varContext lista_var() throws RecognitionException {
		Lista_varContext _localctx = new Lista_varContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lista_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); item_var();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(119); match(VIRGULA);
				setState(120); item_var();
				}
				}
				setState(125);
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

	public static class Dec_varContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Lista_varContext lista_var() {
			return getRuleContext(Lista_varContext.class,0);
		}
		public Dec_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterDec_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitDec_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDec_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_varContext dec_var() throws RecognitionException {
		Dec_varContext _localctx = new Dec_varContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dec_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); tipo();
			setState(127); lista_var();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inicializacao_vetorContext extends ParserRuleContext {
		public List<Inicializacao_vetorContext> inicializacao_vetor() {
			return getRuleContexts(Inicializacao_vetorContext.class);
		}
		public Inicializacao_vetorContext inicializacao_vetor(int i) {
			return getRuleContext(Inicializacao_vetorContext.class,i);
		}
		public TerminalNode VALOR_CONSTANTE(int i) {
			return getToken(PortugolParser.VALOR_CONSTANTE, i);
		}
		public List<TerminalNode> VALOR_CONSTANTE() { return getTokens(PortugolParser.VALOR_CONSTANTE); }
		public Inicializacao_vetorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacao_vetor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterInicializacao_vetor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitInicializacao_vetor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitInicializacao_vetor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inicializacao_vetorContext inicializacao_vetor() throws RecognitionException {
		Inicializacao_vetorContext _localctx = new Inicializacao_vetorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_inicializacao_vetor);
		int _la;
		try {
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129); match(ABRE_CHAVE);
				setState(130); inicializacao_vetor();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(131); match(VIRGULA);
					setState(132); inicializacao_vetor();
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(138); match(FECHA_CHAVE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140); match(ABRE_CHAVE);
				setState(141); match(VALOR_CONSTANTE);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(142); match(VIRGULA);
					setState(143); match(VALOR_CONSTANTE);
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149); match(FECHA_CHAVE);
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

	public static class Dec_constanteContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(PortugolParser.CONST, 0); }
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode VALOR_CONSTANTE() { return getToken(PortugolParser.VALOR_CONSTANTE, 0); }
		public Dec_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterDec_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitDec_constante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDec_constante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_constanteContext dec_constante() throws RecognitionException {
		Dec_constanteContext _localctx = new Dec_constanteContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dec_constante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); match(CONST);
			setState(153); tipo();
			setState(154); match(ID);
			setState(155); match(ATRIBUICAO);
			setState(156); match(VALOR_CONSTANTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dec_lista_paramContext extends ParserRuleContext {
		public List<Dec_item_paramContext> dec_item_param() {
			return getRuleContexts(Dec_item_paramContext.class);
		}
		public Dec_item_paramContext dec_item_param(int i) {
			return getRuleContext(Dec_item_paramContext.class,i);
		}
		public Dec_lista_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_lista_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterDec_lista_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitDec_lista_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDec_lista_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_lista_paramContext dec_lista_param() throws RecognitionException {
		Dec_lista_paramContext _localctx = new Dec_lista_paramContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dec_lista_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); dec_item_param();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(159); match(VIRGULA);
				setState(160); dec_item_param();
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

	public static class Dec_item_paramContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Dec_item_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_item_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterDec_item_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitDec_item_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDec_item_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_item_paramContext dec_item_param() throws RecognitionException {
		Dec_item_paramContext _localctx = new Dec_item_paramContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dec_item_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); tipo();
			setState(168);
			_la = _input.LA(1);
			if (_la==E_BINARIO) {
				{
				setState(167); match(E_BINARIO);
				}
			}

			setState(170); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dec_funcaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public Dec_lista_paramContext dec_lista_param() {
			return getRuleContext(Dec_lista_paramContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode FUNCAO() { return getToken(PortugolParser.FUNCAO, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public Dec_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterDec_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitDec_funcao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDec_funcao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_funcaoContext dec_funcao() throws RecognitionException {
		Dec_funcaoContext _localctx = new Dec_funcaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dec_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); match(FUNCAO);
			setState(175);
			switch (_input.LA(1)) {
			case REAL_DECLARACAO:
			case LOGICO_DECLARACAO:
			case CADEIA_DECLARACAO:
			case INTEIRO_DECLARACAO:
			case CARACTER_DECLARACAO:
				{
				setState(173); tipo();
				}
				break;
			case VAZIO:
				{
				setState(174); match(VAZIO);
				}
				break;
			case ID:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(177); match(ID);
			setState(178); match(ABRE_PARENTESES);
			setState(180);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL_DECLARACAO) | (1L << LOGICO_DECLARACAO) | (1L << CADEIA_DECLARACAO) | (1L << INTEIRO_DECLARACAO) | (1L << CARACTER_DECLARACAO))) != 0)) {
				{
				setState(179); dec_lista_param();
				}
			}

			setState(182); match(FECHA_PARENTESES);
			setState(183); bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandoContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public Chamada_funcaoContext chamada_funcao() {
			return getRuleContext(Chamada_funcaoContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public OperandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOperando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOperando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandoContext operando() throws RecognitionException {
		OperandoContext _localctx = new OperandoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operando);
		try {
			setState(188);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185); id();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186); valor();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187); chamada_funcao();
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

	public static class ExpressaoContext extends ParserRuleContext {
		public TerminalNode NAO_BINARIO() { return getToken(PortugolParser.NAO_BINARIO, 0); }
		public TerminalNode NAO() { return getToken(PortugolParser.NAO, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expressao, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			switch (_input.LA(1)) {
			case NAO:
			case NAO_BINARIO:
				{
				setState(191);
				_la = _input.LA(1);
				if ( !(_la==NAO || _la==NAO_BINARIO) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(192); match(ABRE_PARENTESES);
				setState(193); expressao(0);
				setState(194); match(FECHA_PARENTESES);
				}
				break;
			case VALOR_CONSTANTE:
			case ID:
				{
				setState(196); operando();
				}
				break;
			case ABRE_PARENTESES:
				{
				setState(197); match(ABRE_PARENTESES);
				setState(198); expressao(0);
				setState(199); match(FECHA_PARENTESES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(230);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(203);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(204);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICACAO) | (1L << DIVISAO) | (1L << MODULO))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(205); expressao(12);
						}
						break;

					case 2:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(206);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(207);
						_la = _input.LA(1);
						if ( !(_la==SOMA || _la==SUBTRACAO) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(208); expressao(11);
						}
						break;

					case 3:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(209);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(210);
						_la = _input.LA(1);
						if ( !(_la==SHIFT_DIREITA || _la==SHIFT_ESQUERDA) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(211); expressao(10);
						}
						break;

					case 4:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(212);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(213);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIOR) | (1L << MENOR) | (1L << MAIOR_IGUAL) | (1L << MENOR_IGUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(214); expressao(9);
						}
						break;

					case 5:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(215);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(216);
						_la = _input.LA(1);
						if ( !(_la==IGUAL || _la==DIFERENTE) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(217); expressao(8);
						}
						break;

					case 6:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(218);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(219); match(E_BINARIO);
						setState(220); expressao(7);
						}
						break;

					case 7:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(221);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(222); match(OU_BINARIO);
						setState(223); expressao(6);
						}
						break;

					case 8:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(224);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(225); match(E);
						setState(226); expressao(5);
						}
						break;

					case 9:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(227);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(228); match(OU);
						setState(229); expressao(4);
						}
						break;
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode REAL_DECLARACAO() { return getToken(PortugolParser.REAL_DECLARACAO, 0); }
		public TerminalNode INTEIRO_DECLARACAO() { return getToken(PortugolParser.INTEIRO_DECLARACAO, 0); }
		public TerminalNode CADEIA_DECLARACAO() { return getToken(PortugolParser.CADEIA_DECLARACAO, 0); }
		public TerminalNode LOGICO_DECLARACAO() { return getToken(PortugolParser.LOGICO_DECLARACAO, 0); }
		public TerminalNode CARACTER_DECLARACAO() { return getToken(PortugolParser.CARACTER_DECLARACAO, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL_DECLARACAO) | (1L << LOGICO_DECLARACAO) | (1L << CADEIA_DECLARACAO) | (1L << INTEIRO_DECLARACAO) | (1L << CARACTER_DECLARACAO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_id);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237); match(ID);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(238); match(ABRE_COLCHETE);
					setState(239); expressao(0);
					setState(240); match(FECHA_COLCHETE);
					}
					} 
				}
				setState(246);
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

	public static class ValorContext extends ParserRuleContext {
		public Chamada_funcaoContext chamada_funcao() {
			return getRuleContext(Chamada_funcaoContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode VALOR_CONSTANTE() { return getToken(PortugolParser.VALOR_CONSTANTE, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_valor);
		try {
			setState(250);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247); match(VALOR_CONSTANTE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248); chamada_funcao();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249); id();
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

	public static class SeContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public TerminalNode SENAO() { return getToken(PortugolParser.SENAO, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public TerminalNode SE() { return getToken(PortugolParser.SE, 0); }
		public SeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitSe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitSe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); match(SE);
			setState(253); match(ABRE_PARENTESES);
			setState(254); expressao(0);
			setState(255); match(FECHA_PARENTESES);
			setState(256); bloco();
			setState(259);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(257); match(SENAO);
				setState(258); bloco();
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

	public static class FacaContext extends ParserRuleContext {
		public TerminalNode FACA() { return getToken(PortugolParser.FACA, 0); }
		public TerminalNode ENQUANTO() { return getToken(PortugolParser.ENQUANTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public FacaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterFaca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitFaca(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitFaca(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FacaContext faca() throws RecognitionException {
		FacaContext _localctx = new FacaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_faca);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261); match(FACA);
			setState(262); bloco();
			setState(263); match(ENQUANTO);
			setState(264); match(ABRE_PARENTESES);
			setState(265); expressao(0);
			setState(266); match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(PortugolParser.ENQUANTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public EnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitEnquanto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); match(ENQUANTO);
			setState(269); match(ABRE_PARENTESES);
			setState(270); expressao(0);
			setState(271); match(FECHA_PARENTESES);
			setState(272); bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParaContext extends ParserRuleContext {
		public List<Contador_paraContext> contador_para() {
			return getRuleContexts(Contador_paraContext.class);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARA() { return getToken(PortugolParser.PARA, 0); }
		public Contador_paraContext contador_para(int i) {
			return getRuleContext(Contador_paraContext.class,i);
		}
		public List<AtribuicaoContext> atribuicao() {
			return getRuleContexts(AtribuicaoContext.class);
		}
		public AtribuicaoContext atribuicao(int i) {
			return getRuleContext(AtribuicaoContext.class,i);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); match(PARA);
			setState(275); match(ABRE_PARENTESES);
			setState(277);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL_DECLARACAO) | (1L << LOGICO_DECLARACAO) | (1L << CADEIA_DECLARACAO) | (1L << INTEIRO_DECLARACAO) | (1L << CARACTER_DECLARACAO))) != 0)) {
				{
				setState(276); contador_para();
				}
			}

			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(279); match(VIRGULA);
				setState(280); contador_para();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286); match(PONTO_VIRGULA);
			setState(288);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VALOR_CONSTANTE) | (1L << ABRE_PARENTESES) | (1L << NAO) | (1L << NAO_BINARIO))) != 0) || _la==ID) {
				{
				setState(287); expressao(0);
				}
			}

			setState(290); match(PONTO_VIRGULA);
			setState(292);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(291); atribuicao();
				}
			}

			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(294); match(VIRGULA);
				setState(295); atribuicao();
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301); match(FECHA_PARENTESES);
			setState(302); bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Contador_paraContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Contador_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contador_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterContador_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitContador_para(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitContador_para(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Contador_paraContext contador_para() throws RecognitionException {
		Contador_paraContext _localctx = new Contador_paraContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_contador_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304); tipo();
			setState(305); match(ID);
			setState(306); match(ATRIBUICAO);
			setState(307); expressao(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EscolhaContext extends ParserRuleContext {
		public CasoContext caso(int i) {
			return getRuleContext(CasoContext.class,i);
		}
		public TerminalNode CONTRARIO() { return getToken(PortugolParser.CONTRARIO, 0); }
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public TerminalNode ESCOLHA() { return getToken(PortugolParser.ESCOLHA, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CasoContext> caso() {
			return getRuleContexts(CasoContext.class);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public TerminalNode CASO() { return getToken(PortugolParser.CASO, 0); }
		public EscolhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escolha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterEscolha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitEscolha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitEscolha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscolhaContext escolha() throws RecognitionException {
		EscolhaContext _localctx = new EscolhaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_escolha);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(309); match(ESCOLHA);
			setState(310); match(ABRE_PARENTESES);
			setState(311); expressao(0);
			setState(312); match(FECHA_PARENTESES);
			setState(313); match(ABRE_CHAVE);
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(314); caso();
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(329);
			_la = _input.LA(1);
			if (_la==CASO) {
				{
				setState(320); match(CASO);
				setState(321); match(CONTRARIO);
				setState(322); match(DOIS_PONTOS);
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SE) | (1L << REAL_DECLARACAO) | (1L << LOGICO_DECLARACAO) | (1L << CADEIA_DECLARACAO) | (1L << INTEIRO_DECLARACAO) | (1L << CARACTER_DECLARACAO) | (1L << ESCOLHA) | (1L << RETORNE) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << LEIA) | (1L << ESCREVA) | (1L << LIMPA))) != 0) || _la==ID) {
					{
					{
					setState(323); comando();
					}
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(331); match(FECHA_CHAVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasoContext extends ParserRuleContext {
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public TerminalNode PARE() { return getToken(PortugolParser.PARE, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public TerminalNode CASO() { return getToken(PortugolParser.CASO, 0); }
		public TerminalNode VALOR_CONSTANTE() { return getToken(PortugolParser.VALOR_CONSTANTE, 0); }
		public CasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoContext caso() throws RecognitionException {
		CasoContext _localctx = new CasoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_caso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333); match(CASO);
			setState(334); match(VALOR_CONSTANTE);
			setState(335); match(DOIS_PONTOS);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SE) | (1L << REAL_DECLARACAO) | (1L << LOGICO_DECLARACAO) | (1L << CADEIA_DECLARACAO) | (1L << INTEIRO_DECLARACAO) | (1L << CARACTER_DECLARACAO) | (1L << ESCOLHA) | (1L << RETORNE) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << LEIA) | (1L << ESCREVA) | (1L << LIMPA))) != 0) || _la==ID) {
				{
				{
				setState(336); comando();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
			_la = _input.LA(1);
			if (_la==PARE) {
				{
				setState(342); match(PARE);
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

	public static class BlocoContext extends ParserRuleContext {
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bloco);
		int _la;
		try {
			setState(354);
			switch (_input.LA(1)) {
			case ABRE_CHAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(345); match(ABRE_CHAVE);
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SE) | (1L << REAL_DECLARACAO) | (1L << LOGICO_DECLARACAO) | (1L << CADEIA_DECLARACAO) | (1L << INTEIRO_DECLARACAO) | (1L << CARACTER_DECLARACAO) | (1L << ESCOLHA) | (1L << RETORNE) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << LEIA) | (1L << ESCREVA) | (1L << LIMPA))) != 0) || _la==ID) {
					{
					{
					setState(346); comando();
					}
					}
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(352); match(FECHA_CHAVE);
				}
				break;
			case SE:
			case REAL_DECLARACAO:
			case LOGICO_DECLARACAO:
			case CADEIA_DECLARACAO:
			case INTEIRO_DECLARACAO:
			case CARACTER_DECLARACAO:
			case ESCOLHA:
			case RETORNE:
			case PARA:
			case FACA:
			case ENQUANTO:
			case LEIA:
			case ESCREVA:
			case LIMPA:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(353); comando();
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

	public static class ComandoContext extends ParserRuleContext {
		public Dec_varContext dec_var() {
			return getRuleContext(Dec_varContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public LeiaContext leia() {
			return getRuleContext(LeiaContext.class,0);
		}
		public TerminalNode LIMPA() { return getToken(PortugolParser.LIMPA, 0); }
		public FacaContext faca() {
			return getRuleContext(FacaContext.class,0);
		}
		public SeContext se() {
			return getRuleContext(SeContext.class,0);
		}
		public EscolhaContext escolha() {
			return getRuleContext(EscolhaContext.class,0);
		}
		public Chamada_funcaoContext chamada_funcao() {
			return getRuleContext(Chamada_funcaoContext.class,0);
		}
		public EnquantoContext enquanto() {
			return getRuleContext(EnquantoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public EscrevaContext escreva() {
			return getRuleContext(EscrevaContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_comando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(356); dec_var();
				}
				break;

			case 2:
				{
				setState(357); enquanto();
				}
				break;

			case 3:
				{
				setState(358); atribuicao();
				}
				break;

			case 4:
				{
				setState(359); se();
				}
				break;

			case 5:
				{
				setState(360); chamada_funcao();
				}
				break;

			case 6:
				{
				setState(361); faca();
				}
				break;

			case 7:
				{
				setState(362); escolha();
				}
				break;

			case 8:
				{
				setState(363); retorno();
				}
				break;

			case 9:
				{
				setState(364); para();
				}
				break;

			case 10:
				{
				setState(365); leia();
				}
				break;

			case 11:
				{
				setState(366); escreva();
				}
				break;

			case 12:
				{
				setState(367); match(LIMPA);
				setState(368); match(ABRE_PARENTESES);
				setState(369); match(FECHA_PARENTESES);
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

	public static class Chamada_funcaoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PortugolParser.ID); }
		public Lista_paramContext lista_param() {
			return getRuleContext(Lista_paramContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(PortugolParser.ID, i);
		}
		public Chamada_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterChamada_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitChamada_funcao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitChamada_funcao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Chamada_funcaoContext chamada_funcao() throws RecognitionException {
		Chamada_funcaoContext _localctx = new Chamada_funcaoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_chamada_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(372); match(ID);
				}
				break;

			case 2:
				{
				setState(373); match(ID);
				setState(374); match(PONTO);
				setState(375); match(ID);
				}
				break;
			}
			setState(378); match(ABRE_PARENTESES);
			setState(380);
			_la = _input.LA(1);
			if (_la==VALOR_CONSTANTE || _la==ID) {
				{
				setState(379); lista_param();
				}
			}

			setState(382); match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_paramContext extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public Lista_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterLista_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitLista_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitLista_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_paramContext lista_param() throws RecognitionException {
		Lista_paramContext _localctx = new Lista_paramContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_lista_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384); valor();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(385); match(VIRGULA);
				setState(386); valor();
				}
				}
				setState(391);
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

	public static class RetornoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RETORNE() { return getToken(PortugolParser.RETORNE, 0); }
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392); match(RETORNE);
			setState(393); expressao(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtribuicaoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_atribuicao);
		int _la;
		try {
			setState(405);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395); id();
				setState(396);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATRIBUICAO) | (1L << ATRIBUICAO_INCREMENTO) | (1L << ATRIBUICAO_DECREMENTO) | (1L << ATRIBUICAO_DIVISAO) | (1L << ATRIBUICAO_MULTIPLICAO) | (1L << ATRIBUICAO_MODULO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(397); expressao(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399); id();
				setState(400); match(INCREMENTO);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(402); id();
				setState(403); match(DECREMENTO);
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

	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode DIVISAO() { return getToken(PortugolParser.DIVISAO, 0); }
		public TerminalNode SOMA() { return getToken(PortugolParser.SOMA, 0); }
		public TerminalNode MULTIPLICACAO() { return getToken(PortugolParser.MULTIPLICACAO, 0); }
		public TerminalNode MAIOR_IGUAL() { return getToken(PortugolParser.MAIOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(PortugolParser.MENOR_IGUAL, 0); }
		public TerminalNode MENOR() { return getToken(PortugolParser.MENOR, 0); }
		public TerminalNode SUBTRACAO() { return getToken(PortugolParser.SUBTRACAO, 0); }
		public TerminalNode DIFERENTE() { return getToken(PortugolParser.DIFERENTE, 0); }
		public TerminalNode MAIOR() { return getToken(PortugolParser.MAIOR, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOperador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOMA) | (1L << SUBTRACAO) | (1L << MULTIPLICACAO) | (1L << DIVISAO) | (1L << MAIOR) | (1L << MENOR) | (1L << MAIOR_IGUAL) | (1L << MENOR_IGUAL) | (1L << DIFERENTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeiaContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PortugolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PortugolParser.ID, i);
		}
		public TerminalNode LEIA() { return getToken(PortugolParser.LEIA, 0); }
		public LeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitLeia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitLeia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeiaContext leia() throws RecognitionException {
		LeiaContext _localctx = new LeiaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_leia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409); match(LEIA);
			setState(410); match(ABRE_PARENTESES);
			setState(411); match(ID);
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(412); match(VIRGULA);
				setState(413); match(ID);
				}
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(419); match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EscrevaContext extends ParserRuleContext {
		public TerminalNode ESCREVA() { return getToken(PortugolParser.ESCREVA, 0); }
		public Lista_paramContext lista_param() {
			return getRuleContext(Lista_paramContext.class,0);
		}
		public EscrevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escreva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitEscreva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitEscreva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscrevaContext escreva() throws RecognitionException {
		EscrevaContext _localctx = new EscrevaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_escreva);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421); match(ESCREVA);
			setState(422); match(ABRE_PARENTESES);
			setState(423); lista_param();
			setState(424); match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
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
		case 14: return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 11);

		case 1: return precpred(_ctx, 10);

		case 2: return precpred(_ctx, 9);

		case 3: return precpred(_ctx, 8);

		case 4: return precpred(_ctx, 7);

		case 5: return precpred(_ctx, 6);

		case 6: return precpred(_ctx, 5);

		case 7: return precpred(_ctx, 4);

		case 8: return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3L\u01ad\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\7\4P\n\4\f\4\16"+
		"\4S\13\4\3\5\3\5\3\5\3\5\3\5\5\5Z\n\5\3\6\3\6\3\6\7\6_\n\6\f\6\16\6b\13"+
		"\6\3\7\3\7\3\7\5\7g\n\7\3\7\3\7\3\7\5\7l\n\7\3\7\6\7o\n\7\r\7\16\7p\3"+
		"\7\3\7\5\7u\n\7\5\7w\n\7\3\b\3\b\3\b\7\b|\n\b\f\b\16\b\177\13\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\7\n\u0088\n\n\f\n\16\n\u008b\13\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\7\n\u0093\n\n\f\n\16\n\u0096\13\n\3\n\5\n\u0099\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00a4\n\f\f\f\16\f\u00a7\13\f"+
		"\3\r\3\r\5\r\u00ab\n\r\3\r\3\r\3\16\3\16\3\16\5\16\u00b2\n\16\3\16\3\16"+
		"\3\16\5\16\u00b7\n\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u00bf\n\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00cc\n\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u00e9\n\20\f\20\16\20\u00ec\13\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u00f5\n\22\f\22\16\22\u00f8\13\22\3\23\3\23\3\23\5\23\u00fd\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0106\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u0118"+
		"\n\27\3\27\3\27\7\27\u011c\n\27\f\27\16\27\u011f\13\27\3\27\3\27\5\27"+
		"\u0123\n\27\3\27\3\27\5\27\u0127\n\27\3\27\3\27\7\27\u012b\n\27\f\27\16"+
		"\27\u012e\13\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\7\31\u013e\n\31\f\31\16\31\u0141\13\31\3\31\3\31\3\31"+
		"\3\31\7\31\u0147\n\31\f\31\16\31\u014a\13\31\5\31\u014c\n\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\7\32\u0154\n\32\f\32\16\32\u0157\13\32\3\32\5\32"+
		"\u015a\n\32\3\33\3\33\7\33\u015e\n\33\f\33\16\33\u0161\13\33\3\33\3\33"+
		"\5\33\u0165\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u0175\n\34\3\35\3\35\3\35\3\35\5\35\u017b\n\35\3"+
		"\35\3\35\5\35\u017f\n\35\3\35\3\35\3\36\3\36\3\36\7\36\u0186\n\36\f\36"+
		"\16\36\u0189\13\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0198"+
		"\n \3!\3!\3\"\3\"\3\"\3\"\3\"\7\"\u01a1\n\"\f\"\16\"\u01a4\13\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\2\3\36$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BD\2\f\4\2AAHH\4\2;;>>\3\2)+\3\2\'(\3\2?@\3\2\63"+
		"\66\3\2\678\3\2\22\26\4\2\17\17.\62\5\2\'*\63\6688\u01cb\2F\3\2\2\2\4"+
		"K\3\2\2\2\6Q\3\2\2\2\bT\3\2\2\2\n`\3\2\2\2\fv\3\2\2\2\16x\3\2\2\2\20\u0080"+
		"\3\2\2\2\22\u0098\3\2\2\2\24\u009a\3\2\2\2\26\u00a0\3\2\2\2\30\u00a8\3"+
		"\2\2\2\32\u00ae\3\2\2\2\34\u00be\3\2\2\2\36\u00cb\3\2\2\2 \u00ed\3\2\2"+
		"\2\"\u00ef\3\2\2\2$\u00fc\3\2\2\2&\u00fe\3\2\2\2(\u0107\3\2\2\2*\u010e"+
		"\3\2\2\2,\u0114\3\2\2\2.\u0132\3\2\2\2\60\u0137\3\2\2\2\62\u014f\3\2\2"+
		"\2\64\u0164\3\2\2\2\66\u0174\3\2\2\28\u017a\3\2\2\2:\u0182\3\2\2\2<\u018a"+
		"\3\2\2\2>\u0197\3\2\2\2@\u0199\3\2\2\2B\u019b\3\2\2\2D\u01a7\3\2\2\2F"+
		"G\7\20\2\2GH\7\b\2\2HI\5\4\3\2IJ\7\t\2\2J\3\3\2\2\2KL\5\6\4\2LM\5\n\6"+
		"\2M\5\3\2\2\2NP\5\b\5\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\7\3\2"+
		"\2\2SQ\3\2\2\2TU\7\"\2\2UV\7#\2\2VY\7H\2\2WX\7I\2\2XZ\7H\2\2YW\3\2\2\2"+
		"YZ\3\2\2\2Z\t\3\2\2\2[_\5\32\16\2\\_\5\20\t\2]_\5\24\13\2^[\3\2\2\2^\\"+
		"\3\2\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\13\3\2\2\2b`\3\2\2\2"+
		"cf\7H\2\2de\7\17\2\2eg\5\36\20\2fd\3\2\2\2fg\3\2\2\2gw\3\2\2\2hn\7H\2"+
		"\2ik\7\n\2\2jl\t\2\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mo\7\13\2\2ni\3\2"+
		"\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qt\3\2\2\2rs\7\17\2\2su\5\22\n\2tr\3"+
		"\2\2\2tu\3\2\2\2uw\3\2\2\2vc\3\2\2\2vh\3\2\2\2w\r\3\2\2\2x}\5\f\7\2yz"+
		"\7\7\2\2z|\5\f\7\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\17\3\2"+
		"\2\2\177}\3\2\2\2\u0080\u0081\5 \21\2\u0081\u0082\5\16\b\2\u0082\21\3"+
		"\2\2\2\u0083\u0084\7\b\2\2\u0084\u0089\5\22\n\2\u0085\u0086\7\7\2\2\u0086"+
		"\u0088\5\22\n\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3"+
		"\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008d\7\t\2\2\u008d\u0099\3\2\2\2\u008e\u008f\7\b\2\2\u008f\u0094\7\3"+
		"\2\2\u0090\u0091\7\7\2\2\u0091\u0093\7\3\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0097\u0099\7\t\2\2\u0098\u0083\3\2\2\2\u0098"+
		"\u008e\3\2\2\2\u0099\23\3\2\2\2\u009a\u009b\7\32\2\2\u009b\u009c\5 \21"+
		"\2\u009c\u009d\7H\2\2\u009d\u009e\7\17\2\2\u009e\u009f\7\3\2\2\u009f\25"+
		"\3\2\2\2\u00a0\u00a5\5\30\r\2\u00a1\u00a2\7\7\2\2\u00a2\u00a4\5\30\r\2"+
		"\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\27\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\5 \21\2\u00a9"+
		"\u00ab\7<\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ad\7H\2\2\u00ad\31\3\2\2\2\u00ae\u00b1\7\33\2\2\u00af\u00b2"+
		"\5 \21\2\u00b0\u00b2\7\21\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2"+
		"\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7H\2\2\u00b4\u00b6"+
		"\7\r\2\2\u00b5\u00b7\5\26\f\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2"+
		"\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\16\2\2\u00b9\u00ba\5\64\33\2\u00ba"+
		"\33\3\2\2\2\u00bb\u00bf\5\"\22\2\u00bc\u00bf\5$\23\2\u00bd\u00bf\58\35"+
		"\2\u00be\u00bb\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\35"+
		"\3\2\2\2\u00c0\u00c1\b\20\1\2\u00c1\u00c2\t\3\2\2\u00c2\u00c3\7\r\2\2"+
		"\u00c3\u00c4\5\36\20\2\u00c4\u00c5\7\16\2\2\u00c5\u00cc\3\2\2\2\u00c6"+
		"\u00cc\5\34\17\2\u00c7\u00c8\7\r\2\2\u00c8\u00c9\5\36\20\2\u00c9\u00ca"+
		"\7\16\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c0\3\2\2\2\u00cb\u00c6\3\2\2\2"+
		"\u00cb\u00c7\3\2\2\2\u00cc\u00ea\3\2\2\2\u00cd\u00ce\f\r\2\2\u00ce\u00cf"+
		"\t\4\2\2\u00cf\u00e9\5\36\20\16\u00d0\u00d1\f\f\2\2\u00d1\u00d2\t\5\2"+
		"\2\u00d2\u00e9\5\36\20\r\u00d3\u00d4\f\13\2\2\u00d4\u00d5\t\6\2\2\u00d5"+
		"\u00e9\5\36\20\f\u00d6\u00d7\f\n\2\2\u00d7\u00d8\t\7\2\2\u00d8\u00e9\5"+
		"\36\20\13\u00d9\u00da\f\t\2\2\u00da\u00db\t\b\2\2\u00db\u00e9\5\36\20"+
		"\n\u00dc\u00dd\f\b\2\2\u00dd\u00de\7<\2\2\u00de\u00e9\5\36\20\t\u00df"+
		"\u00e0\f\7\2\2\u00e0\u00e1\7=\2\2\u00e1\u00e9\5\36\20\b\u00e2\u00e3\f"+
		"\6\2\2\u00e3\u00e4\79\2\2\u00e4\u00e9\5\36\20\7\u00e5\u00e6\f\5\2\2\u00e6"+
		"\u00e7\7:\2\2\u00e7\u00e9\5\36\20\6\u00e8\u00cd\3\2\2\2\u00e8\u00d0\3"+
		"\2\2\2\u00e8\u00d3\3\2\2\2\u00e8\u00d6\3\2\2\2\u00e8\u00d9\3\2\2\2\u00e8"+
		"\u00dc\3\2\2\2\u00e8\u00df\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e8\u00e5\3\2"+
		"\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\37\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\t\t\2\2\u00ee!\3\2\2\2\u00ef"+
		"\u00f6\7H\2\2\u00f0\u00f1\7\n\2\2\u00f1\u00f2\5\36\20\2\u00f2\u00f3\7"+
		"\13\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7#\3\2\2\2\u00f8\u00f6\3\2\2\2"+
		"\u00f9\u00fd\7\3\2\2\u00fa\u00fd\58\35\2\u00fb\u00fd\5\"\22\2\u00fc\u00f9"+
		"\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd%\3\2\2\2\u00fe"+
		"\u00ff\7\4\2\2\u00ff\u0100\7\r\2\2\u0100\u0101\5\36\20\2\u0101\u0102\7"+
		"\16\2\2\u0102\u0105\5\64\33\2\u0103\u0104\7!\2\2\u0104\u0106\5\64\33\2"+
		"\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\'\3\2\2\2\u0107\u0108\7"+
		"\37\2\2\u0108\u0109\5\64\33\2\u0109\u010a\7 \2\2\u010a\u010b\7\r\2\2\u010b"+
		"\u010c\5\36\20\2\u010c\u010d\7\16\2\2\u010d)\3\2\2\2\u010e\u010f\7 \2"+
		"\2\u010f\u0110\7\r\2\2\u0110\u0111\5\36\20\2\u0111\u0112\7\16\2\2\u0112"+
		"\u0113\5\64\33\2\u0113+\3\2\2\2\u0114\u0115\7\35\2\2\u0115\u0117\7\r\2"+
		"\2\u0116\u0118\5.\30\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011d"+
		"\3\2\2\2\u0119\u011a\7\7\2\2\u011a\u011c\5.\30\2\u011b\u0119\3\2\2\2\u011c"+
		"\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2"+
		"\2\2\u011f\u011d\3\2\2\2\u0120\u0122\7\5\2\2\u0121\u0123\5\36\20\2\u0122"+
		"\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\7\5"+
		"\2\2\u0125\u0127\5> \2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012c"+
		"\3\2\2\2\u0128\u0129\7\7\2\2\u0129\u012b\5> \2\u012a\u0128\3\2\2\2\u012b"+
		"\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7\16\2\2\u0130\u0131\5\64\33\2\u0131"+
		"-\3\2\2\2\u0132\u0133\5 \21\2\u0133\u0134\7H\2\2\u0134\u0135\7\17\2\2"+
		"\u0135\u0136\5\36\20\2\u0136/\3\2\2\2\u0137\u0138\7\27\2\2\u0138\u0139"+
		"\7\r\2\2\u0139\u013a\5\36\20\2\u013a\u013b\7\16\2\2\u013b\u013f\7\b\2"+
		"\2\u013c\u013e\5\62\32\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u014b\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0142\u0143\7\30\2\2\u0143\u0144\7\31\2\2\u0144\u0148\7\f\2\2\u0145"+
		"\u0147\5\66\34\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3"+
		"\2\2\2\u0148\u0149\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014b"+
		"\u0142\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\7\t"+
		"\2\2\u014e\61\3\2\2\2\u014f\u0150\7\30\2\2\u0150\u0151\7\3\2\2\u0151\u0155"+
		"\7\f\2\2\u0152\u0154\5\66\34\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2"+
		"\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155"+
		"\3\2\2\2\u0158\u015a\7\36\2\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2"+
		"\u015a\63\3\2\2\2\u015b\u015f\7\b\2\2\u015c\u015e\5\66\34\2\u015d\u015c"+
		"\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0165\7\t\2\2\u0163\u0165\5\66"+
		"\34\2\u0164\u015b\3\2\2\2\u0164\u0163\3\2\2\2\u0165\65\3\2\2\2\u0166\u0175"+
		"\5\20\t\2\u0167\u0175\5*\26\2\u0168\u0175\5> \2\u0169\u0175\5&\24\2\u016a"+
		"\u0175\58\35\2\u016b\u0175\5(\25\2\u016c\u0175\5\60\31\2\u016d\u0175\5"+
		"<\37\2\u016e\u0175\5,\27\2\u016f\u0175\5B\"\2\u0170\u0175\5D#\2\u0171"+
		"\u0172\7&\2\2\u0172\u0173\7\r\2\2\u0173\u0175\7\16\2\2\u0174\u0166\3\2"+
		"\2\2\u0174\u0167\3\2\2\2\u0174\u0168\3\2\2\2\u0174\u0169\3\2\2\2\u0174"+
		"\u016a\3\2\2\2\u0174\u016b\3\2\2\2\u0174\u016c\3\2\2\2\u0174\u016d\3\2"+
		"\2\2\u0174\u016e\3\2\2\2\u0174\u016f\3\2\2\2\u0174\u0170\3\2\2\2\u0174"+
		"\u0171\3\2\2\2\u0175\67\3\2\2\2\u0176\u017b\7H\2\2\u0177\u0178\7H\2\2"+
		"\u0178\u0179\7\6\2\2\u0179\u017b\7H\2\2\u017a\u0176\3\2\2\2\u017a\u0177"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\7\r\2\2\u017d\u017f\5:\36\2\u017e"+
		"\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\7\16"+
		"\2\2\u01819\3\2\2\2\u0182\u0187\5$\23\2\u0183\u0184\7\7\2\2\u0184\u0186"+
		"\5$\23\2\u0185\u0183\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188;\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018b\7\34\2\2"+
		"\u018b\u018c\5\36\20\2\u018c=\3\2\2\2\u018d\u018e\5\"\22\2\u018e\u018f"+
		"\t\n\2\2\u018f\u0190\5\36\20\2\u0190\u0198\3\2\2\2\u0191\u0192\5\"\22"+
		"\2\u0192\u0193\7,\2\2\u0193\u0198\3\2\2\2\u0194\u0195\5\"\22\2\u0195\u0196"+
		"\7-\2\2\u0196\u0198\3\2\2\2\u0197\u018d\3\2\2\2\u0197\u0191\3\2\2\2\u0197"+
		"\u0194\3\2\2\2\u0198?\3\2\2\2\u0199\u019a\t\13\2\2\u019aA\3\2\2\2\u019b"+
		"\u019c\7$\2\2\u019c\u019d\7\r\2\2\u019d\u01a2\7H\2\2\u019e\u019f\7\7\2"+
		"\2\u019f\u01a1\7H\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0"+
		"\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5"+
		"\u01a6\7\16\2\2\u01a6C\3\2\2\2\u01a7\u01a8\7%\2\2\u01a8\u01a9\7\r\2\2"+
		"\u01a9\u01aa\5:\36\2\u01aa\u01ab\7\16\2\2\u01abE\3\2\2\2,QY^`fkptv}\u0089"+
		"\u0094\u0098\u00a5\u00aa\u00b1\u00b6\u00be\u00cb\u00e8\u00ea\u00f6\u00fc"+
		"\u0105\u0117\u011d\u0122\u0126\u012c\u013f\u0148\u014b\u0155\u0159\u015f"+
		"\u0164\u0174\u017a\u017e\u0187\u0197\u01a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}