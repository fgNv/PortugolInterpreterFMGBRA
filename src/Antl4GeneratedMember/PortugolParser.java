// Generated from C:\Users\Felipe\Desktop\Trash\MiniPseudoCompiladorPortugol\src\Portugol.g4 by ANTLR 4.2.2
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
	public static final String[] tokenNames = {
		"<INVALID>", "'se'", "';'", "'.'", "','", "'{'", "'}'", "'['", "']'", 
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
	public static final int
		RULE_programa = 0, RULE_corpo = 1, RULE_bibliotecas = 2, RULE_biblioteca = 3, 
		RULE_declaracoes = 4, RULE_item_var = 5, RULE_lista_var = 6, RULE_dec_var = 7, 
		RULE_inicializacao_vetor = 8, RULE_dec_constante = 9, RULE_dec_lista_param = 10, 
		RULE_dec_item_param = 11, RULE_dec_funcao = 12, RULE_operando = 13, RULE_item_expressao = 14, 
		RULE_expressao = 15, RULE_tipo = 16, RULE_id = 17, RULE_valor = 18, RULE_valor_constante = 19, 
		RULE_se = 20, RULE_faca = 21, RULE_enquanto = 22, RULE_para = 23, RULE_contador_para = 24, 
		RULE_escolha = 25, RULE_caso = 26, RULE_bloco = 27, RULE_comando = 28, 
		RULE_chamada_funcao = 29, RULE_lista_param = 30, RULE_retorno = 31, RULE_atribuicao = 32, 
		RULE_operador = 33, RULE_leia = 34, RULE_escreva = 35;
	public static final String[] ruleNames = {
		"programa", "corpo", "bibliotecas", "biblioteca", "declaracoes", "item_var", 
		"lista_var", "dec_var", "inicializacao_vetor", "dec_constante", "dec_lista_param", 
		"dec_item_param", "dec_funcao", "operando", "item_expressao", "expressao", 
		"tipo", "id", "valor", "valor_constante", "se", "faca", "enquanto", "para", 
		"contador_para", "escolha", "caso", "bloco", "comando", "chamada_funcao", 
		"lista_param", "retorno", "atribuicao", "operador", "leia", "escreva"
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
			setState(72); match(PROGRAMA);
			setState(73); match(ABRE_CHAVE);
			setState(74); corpo();
			setState(75); match(FECHA_CHAVE);
			}
		}
		catch (RecognitionException re) {
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
			setState(77); bibliotecas();
			setState(78); declaracoes();
			}
		}
		catch (RecognitionException re) {
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
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INCLUA) {
				{
				{
				setState(80); biblioteca();
				}
				}
				setState(85);
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
			setState(86); match(INCLUA);
			setState(87); match(BIBLIOTECA);
			setState(88); match(ID);
			setState(91);
			_la = _input.LA(1);
			if (_la==ALIAS_BIBLIOTECA) {
				{
				setState(89); match(ALIAS_BIBLIOTECA);
				setState(90); match(ID);
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
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL_DECLARACAO) | (1L << LOGICO_DECLARACAO) | (1L << CADEIA_DECLARACAO) | (1L << INTEIRO_DECLARACAO) | (1L << CARACTER_DECLARACAO) | (1L << CONST) | (1L << FUNCAO))) != 0)) {
				{
				setState(96);
				switch (_input.LA(1)) {
				case FUNCAO:
					{
					setState(93); dec_funcao();
					}
					break;
				case REAL_DECLARACAO:
				case LOGICO_DECLARACAO:
				case CADEIA_DECLARACAO:
				case INTEIRO_DECLARACAO:
				case CARACTER_DECLARACAO:
					{
					setState(94); dec_var();
					}
					break;
				case CONST:
					{
					setState(95); dec_constante();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(100);
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
			setState(120);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101); match(ID);
				setState(104);
				_la = _input.LA(1);
				if (_la==ATRIBUICAO) {
					{
					setState(102); match(ATRIBUICAO);
					setState(103); expressao();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106); match(ID);
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(107); match(ABRE_COLCHETE);
					setState(109);
					_la = _input.LA(1);
					if (_la==INTEIRO || _la==ID) {
						{
						setState(108);
						_la = _input.LA(1);
						if ( !(_la==INTEIRO || _la==ID) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
					}

					setState(111); match(FECHA_COLCHETE);
					}
					}
					setState(114); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ABRE_COLCHETE );
				setState(118);
				_la = _input.LA(1);
				if (_la==ATRIBUICAO) {
					{
					setState(116); match(ATRIBUICAO);
					setState(117); inicializacao_vetor();
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
			setState(122); item_var();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(123); match(VIRGULA);
				setState(124); item_var();
				}
				}
				setState(129);
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
			setState(130); tipo();
			setState(131); lista_var();
			}
		}
		catch (RecognitionException re) {
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
		public Valor_constanteContext valor_constante(int i) {
			return getRuleContext(Valor_constanteContext.class,i);
		}
		public List<Valor_constanteContext> valor_constante() {
			return getRuleContexts(Valor_constanteContext.class);
		}
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
			setState(155);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133); match(ABRE_CHAVE);
				setState(134); inicializacao_vetor();
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(135); match(VIRGULA);
					setState(136); inicializacao_vetor();
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142); match(FECHA_CHAVE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144); match(ABRE_CHAVE);
				setState(145); valor_constante();
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(146); match(VIRGULA);
					setState(147); valor_constante();
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153); match(FECHA_CHAVE);
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
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
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
			setState(157); match(CONST);
			setState(158); tipo();
			setState(159); match(ID);
			setState(160); match(ATRIBUICAO);
			setState(161); valor_constante();
			}
		}
		catch (RecognitionException re) {
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
			setState(163); dec_item_param();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(164); match(VIRGULA);
				setState(165); dec_item_param();
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
			setState(171); tipo();
			setState(173);
			_la = _input.LA(1);
			if (_la==E_BINARIO) {
				{
				setState(172); match(E_BINARIO);
				}
			}

			setState(175); match(ID);
			}
		}
		catch (RecognitionException re) {
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
			setState(177); match(FUNCAO);
			setState(180);
			switch (_input.LA(1)) {
			case REAL_DECLARACAO:
			case LOGICO_DECLARACAO:
			case CADEIA_DECLARACAO:
			case INTEIRO_DECLARACAO:
			case CARACTER_DECLARACAO:
				{
				setState(178); tipo();
				}
				break;
			case VAZIO:
				{
				setState(179); match(VAZIO);
				}
				break;
			case ID:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(182); match(ID);
			setState(183); match(ABRE_PARENTESES);
			setState(185);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL_DECLARACAO) | (1L << LOGICO_DECLARACAO) | (1L << CADEIA_DECLARACAO) | (1L << INTEIRO_DECLARACAO) | (1L << CARACTER_DECLARACAO))) != 0)) {
				{
				setState(184); dec_lista_param();
				}
			}

			setState(187); match(FECHA_PARENTESES);
			setState(188); bloco();
			}
		}
		catch (RecognitionException re) {
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
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190); id();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191); valor();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192); chamada_funcao();
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

	public static class Item_expressaoContext extends ParserRuleContext {
		public List<Item_expressaoContext> item_expressao() {
			return getRuleContexts(Item_expressaoContext.class);
		}
		public TerminalNode NAO_BINARIO() { return getToken(PortugolParser.NAO_BINARIO, 0); }
		public Item_expressaoContext item_expressao(int i) {
			return getRuleContext(Item_expressaoContext.class,i);
		}
		public TerminalNode NAO() { return getToken(PortugolParser.NAO, 0); }
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public Item_expressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterItem_expressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitItem_expressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitItem_expressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Item_expressaoContext item_expressao() throws RecognitionException {
		return item_expressao(0);
	}

	private Item_expressaoContext item_expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Item_expressaoContext _localctx = new Item_expressaoContext(_ctx, _parentState);
		Item_expressaoContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_item_expressao, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			switch (_input.LA(1)) {
			case ABRE_PARENTESES:
				{
				setState(196); match(ABRE_PARENTESES);
				setState(197); item_expressao(0);
				setState(198); match(FECHA_PARENTESES);
				}
				break;
			case NAO:
			case NAO_BINARIO:
				{
				setState(200);
				_la = _input.LA(1);
				if ( !(_la==NAO || _la==NAO_BINARIO) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(201); match(ABRE_PARENTESES);
				setState(202); item_expressao(0);
				setState(203); match(FECHA_PARENTESES);
				}
				break;
			case INTEIRO:
			case REAL:
			case CADEIA:
			case CARACTER:
			case LOGICO:
			case ID:
				{
				setState(205); operando();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(235);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new Item_expressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_item_expressao);
						setState(208);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(209);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICACAO) | (1L << DIVISAO) | (1L << MODULO))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(210); item_expressao(11);
						}
						break;

					case 2:
						{
						_localctx = new Item_expressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_item_expressao);
						setState(211);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(212);
						_la = _input.LA(1);
						if ( !(_la==SOMA || _la==SUBTRACAO) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(213); item_expressao(10);
						}
						break;

					case 3:
						{
						_localctx = new Item_expressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_item_expressao);
						setState(214);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(215);
						_la = _input.LA(1);
						if ( !(_la==SHIFT_DIREITA || _la==SHIFT_ESQUERDA) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(216); item_expressao(9);
						}
						break;

					case 4:
						{
						_localctx = new Item_expressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_item_expressao);
						setState(217);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(218);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIOR) | (1L << MENOR) | (1L << MAIOR_IGUAL) | (1L << MENOR_IGUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(219); item_expressao(8);
						}
						break;

					case 5:
						{
						_localctx = new Item_expressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_item_expressao);
						setState(220);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(221);
						_la = _input.LA(1);
						if ( !(_la==IGUAL || _la==DIFERENTE) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(222); item_expressao(7);
						}
						break;

					case 6:
						{
						_localctx = new Item_expressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_item_expressao);
						setState(223);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(224); match(E_BINARIO);
						setState(225); item_expressao(6);
						}
						break;

					case 7:
						{
						_localctx = new Item_expressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_item_expressao);
						setState(226);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(227); match(OU_BINARIO);
						setState(228); item_expressao(5);
						}
						break;

					case 8:
						{
						_localctx = new Item_expressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_item_expressao);
						setState(229);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(230); match(E);
						setState(231); item_expressao(4);
						}
						break;

					case 9:
						{
						_localctx = new Item_expressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_item_expressao);
						setState(232);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(233); match(OU);
						setState(234); item_expressao(3);
						}
						break;
					}
					} 
				}
				setState(239);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public List<Item_expressaoContext> item_expressao() {
			return getRuleContexts(Item_expressaoContext.class);
		}
		public Item_expressaoContext item_expressao(int i) {
			return getRuleContext(Item_expressaoContext.class,i);
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
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressao);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(240); item_expressao(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(243); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
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
		enterRule(_localctx, 32, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
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
		enterRule(_localctx, 34, RULE_id);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247); match(ID);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(248); match(ABRE_COLCHETE);
					setState(249); expressao();
					setState(250); match(FECHA_COLCHETE);
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public Chamada_funcaoContext chamada_funcao() {
			return getRuleContext(Chamada_funcaoContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
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
		enterRule(_localctx, 36, RULE_valor);
		try {
			setState(260);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257); valor_constante();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258); chamada_funcao();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259); id();
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

	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(PortugolParser.REAL, 0); }
		public TerminalNode CARACTER() { return getToken(PortugolParser.CARACTER, 0); }
		public TerminalNode INTEIRO() { return getToken(PortugolParser.INTEIRO, 0); }
		public TerminalNode LOGICO() { return getToken(PortugolParser.LOGICO, 0); }
		public TerminalNode CADEIA() { return getToken(PortugolParser.CADEIA, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitValor_constante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitValor_constante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (INTEIRO - 62)) | (1L << (REAL - 62)) | (1L << (CADEIA - 62)) | (1L << (CARACTER - 62)) | (1L << (LOGICO - 62)))) != 0)) ) {
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
		enterRule(_localctx, 40, RULE_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); match(SE);
			setState(265); match(ABRE_PARENTESES);
			setState(266); expressao();
			setState(267); match(FECHA_PARENTESES);
			setState(268); bloco();
			setState(271);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(269); match(SENAO);
				setState(270); bloco();
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
		enterRule(_localctx, 42, RULE_faca);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); match(FACA);
			setState(274); bloco();
			setState(275); match(ENQUANTO);
			setState(276); match(ABRE_PARENTESES);
			setState(277); expressao();
			setState(278); match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 44, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280); match(ENQUANTO);
			setState(281); match(ABRE_PARENTESES);
			setState(282); expressao();
			setState(283); match(FECHA_PARENTESES);
			setState(284); bloco();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 46, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286); match(PARA);
			setState(287); match(ABRE_PARENTESES);
			setState(289);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL_DECLARACAO) | (1L << LOGICO_DECLARACAO) | (1L << CADEIA_DECLARACAO) | (1L << INTEIRO_DECLARACAO) | (1L << CARACTER_DECLARACAO))) != 0)) {
				{
				setState(288); contador_para();
				}
			}

			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(291); match(VIRGULA);
				setState(292); contador_para();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298); match(PONTO_VIRGULA);
			setState(300);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ABRE_PARENTESES - 10)) | (1L << (NAO - 10)) | (1L << (NAO_BINARIO - 10)) | (1L << (INTEIRO - 10)) | (1L << (REAL - 10)) | (1L << (CADEIA - 10)) | (1L << (CARACTER - 10)) | (1L << (LOGICO - 10)) | (1L << (ID - 10)))) != 0)) {
				{
				setState(299); expressao();
				}
			}

			setState(302); match(PONTO_VIRGULA);
			setState(304);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(303); atribuicao();
				}
			}

			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(306); match(VIRGULA);
				setState(307); atribuicao();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313); match(FECHA_PARENTESES);
			setState(314); bloco();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 48, RULE_contador_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316); tipo();
			setState(317); match(ID);
			setState(318); match(ATRIBUICAO);
			setState(319); expressao();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 50, RULE_escolha);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(321); match(ESCOLHA);
			setState(322); match(ABRE_PARENTESES);
			setState(323); expressao();
			setState(324); match(FECHA_PARENTESES);
			setState(325); match(ABRE_CHAVE);
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(326); caso();
					}
					} 
				}
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(341);
			_la = _input.LA(1);
			if (_la==CASO) {
				{
				setState(332); match(CASO);
				setState(333); match(CONTRARIO);
				setState(334); match(DOIS_PONTOS);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SE) | (1L << REAL_DECLARACAO) | (1L << LOGICO_DECLARACAO) | (1L << CADEIA_DECLARACAO) | (1L << INTEIRO_DECLARACAO) | (1L << CARACTER_DECLARACAO) | (1L << ESCOLHA) | (1L << RETORNE) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << LEIA) | (1L << ESCREVA) | (1L << LIMPA))) != 0) || _la==ID) {
					{
					{
					setState(335); comando();
					}
					}
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(343); match(FECHA_CHAVE);
			}
		}
		catch (RecognitionException re) {
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
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public TerminalNode CASO() { return getToken(PortugolParser.CASO, 0); }
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
		enterRule(_localctx, 52, RULE_caso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345); match(CASO);
			setState(346); valor_constante();
			setState(347); match(DOIS_PONTOS);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SE) | (1L << REAL_DECLARACAO) | (1L << LOGICO_DECLARACAO) | (1L << CADEIA_DECLARACAO) | (1L << INTEIRO_DECLARACAO) | (1L << CARACTER_DECLARACAO) | (1L << ESCOLHA) | (1L << RETORNE) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << LEIA) | (1L << ESCREVA) | (1L << LIMPA))) != 0) || _la==ID) {
				{
				{
				setState(348); comando();
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355);
			_la = _input.LA(1);
			if (_la==PARE) {
				{
				setState(354); match(PARE);
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
		enterRule(_localctx, 54, RULE_bloco);
		int _la;
		try {
			setState(366);
			switch (_input.LA(1)) {
			case ABRE_CHAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(357); match(ABRE_CHAVE);
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SE) | (1L << REAL_DECLARACAO) | (1L << LOGICO_DECLARACAO) | (1L << CADEIA_DECLARACAO) | (1L << INTEIRO_DECLARACAO) | (1L << CARACTER_DECLARACAO) | (1L << ESCOLHA) | (1L << RETORNE) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << LEIA) | (1L << ESCREVA) | (1L << LIMPA))) != 0) || _la==ID) {
					{
					{
					setState(358); comando();
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(364); match(FECHA_CHAVE);
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
				setState(365); comando();
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
		enterRule(_localctx, 56, RULE_comando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(368); dec_var();
				}
				break;

			case 2:
				{
				setState(369); enquanto();
				}
				break;

			case 3:
				{
				setState(370); atribuicao();
				}
				break;

			case 4:
				{
				setState(371); se();
				}
				break;

			case 5:
				{
				setState(372); chamada_funcao();
				}
				break;

			case 6:
				{
				setState(373); faca();
				}
				break;

			case 7:
				{
				setState(374); escolha();
				}
				break;

			case 8:
				{
				setState(375); retorno();
				}
				break;

			case 9:
				{
				setState(376); para();
				}
				break;

			case 10:
				{
				setState(377); leia();
				}
				break;

			case 11:
				{
				setState(378); escreva();
				}
				break;

			case 12:
				{
				setState(379); match(LIMPA);
				setState(380); match(ABRE_PARENTESES);
				setState(381); match(FECHA_PARENTESES);
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
		enterRule(_localctx, 58, RULE_chamada_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(384); match(ID);
				}
				break;

			case 2:
				{
				setState(385); match(ID);
				setState(386); match(PONTO);
				setState(387); match(ID);
				}
				break;
			}
			setState(390); match(ABRE_PARENTESES);
			setState(392);
			_la = _input.LA(1);
			if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (INTEIRO - 62)) | (1L << (REAL - 62)) | (1L << (CADEIA - 62)) | (1L << (CARACTER - 62)) | (1L << (LOGICO - 62)) | (1L << (ID - 62)))) != 0)) {
				{
				setState(391); lista_param();
				}
			}

			setState(394); match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 60, RULE_lista_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396); valor();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(397); match(VIRGULA);
				setState(398); valor();
				}
				}
				setState(403);
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
		enterRule(_localctx, 62, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404); match(RETORNE);
			setState(405); expressao();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 64, RULE_atribuicao);
		int _la;
		try {
			setState(417);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(407); id();
				setState(408);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATRIBUICAO) | (1L << ATRIBUICAO_INCREMENTO) | (1L << ATRIBUICAO_DECREMENTO) | (1L << ATRIBUICAO_DIVISAO) | (1L << ATRIBUICAO_MULTIPLICAO) | (1L << ATRIBUICAO_MODULO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(409); expressao();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411); id();
				setState(412); match(INCREMENTO);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(414); id();
				setState(415); match(DECREMENTO);
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
		enterRule(_localctx, 66, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
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
		enterRule(_localctx, 68, RULE_leia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421); match(LEIA);
			setState(422); match(ABRE_PARENTESES);
			setState(423); match(ID);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(424); match(VIRGULA);
				setState(425); match(ID);
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(431); match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 70, RULE_escreva);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433); match(ESCREVA);
			setState(434); match(ABRE_PARENTESES);
			setState(435); lista_param();
			setState(436); match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
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
		case 14: return item_expressao_sempred((Item_expressaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean item_expressao_sempred(Item_expressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 10);

		case 1: return precpred(_ctx, 9);

		case 2: return precpred(_ctx, 8);

		case 3: return precpred(_ctx, 7);

		case 4: return precpred(_ctx, 6);

		case 5: return precpred(_ctx, 5);

		case 6: return precpred(_ctx, 4);

		case 7: return precpred(_ctx, 3);

		case 8: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3K\u01b9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\7\4"+
		"T\n\4\f\4\16\4W\13\4\3\5\3\5\3\5\3\5\3\5\5\5^\n\5\3\6\3\6\3\6\7\6c\n\6"+
		"\f\6\16\6f\13\6\3\7\3\7\3\7\5\7k\n\7\3\7\3\7\3\7\5\7p\n\7\3\7\6\7s\n\7"+
		"\r\7\16\7t\3\7\3\7\5\7y\n\7\5\7{\n\7\3\b\3\b\3\b\7\b\u0080\n\b\f\b\16"+
		"\b\u0083\13\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u008c\n\n\f\n\16\n\u008f"+
		"\13\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0097\n\n\f\n\16\n\u009a\13\n\3\n\3"+
		"\n\5\n\u009e\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00a9\n"+
		"\f\f\f\16\f\u00ac\13\f\3\r\3\r\5\r\u00b0\n\r\3\r\3\r\3\16\3\16\3\16\5"+
		"\16\u00b7\n\16\3\16\3\16\3\16\5\16\u00bc\n\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\5\17\u00c4\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00d1\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u00ee\n\20\f\20\16\20\u00f1\13\20\3\21\6\21\u00f4"+
		"\n\21\r\21\16\21\u00f5\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u00ff\n"+
		"\23\f\23\16\23\u0102\13\23\3\24\3\24\3\24\5\24\u0107\n\24\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0112\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\5\31\u0124"+
		"\n\31\3\31\3\31\7\31\u0128\n\31\f\31\16\31\u012b\13\31\3\31\3\31\5\31"+
		"\u012f\n\31\3\31\3\31\5\31\u0133\n\31\3\31\3\31\7\31\u0137\n\31\f\31\16"+
		"\31\u013a\13\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u014a\n\33\f\33\16\33\u014d\13\33\3\33\3\33\3\33"+
		"\3\33\7\33\u0153\n\33\f\33\16\33\u0156\13\33\5\33\u0158\n\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\7\34\u0160\n\34\f\34\16\34\u0163\13\34\3\34\5\34"+
		"\u0166\n\34\3\35\3\35\7\35\u016a\n\35\f\35\16\35\u016d\13\35\3\35\3\35"+
		"\5\35\u0171\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u0181\n\36\3\37\3\37\3\37\3\37\5\37\u0187\n\37\3"+
		"\37\3\37\5\37\u018b\n\37\3\37\3\37\3 \3 \3 \7 \u0192\n \f \16 \u0195\13"+
		" \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01a4\n\"\3#\3"+
		"#\3$\3$\3$\3$\3$\7$\u01ad\n$\f$\16$\u01b0\13$\3$\3$\3%\3%\3%\3%\3%\3%"+
		"\2\3\36&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFH\2\r\4\2@@GG\4\2::==\3\2(*\3\2&\'\3\2>?\3\2\62\65\3\2\66\67\3"+
		"\2\21\25\4\2@@CF\4\2\16\16-\61\5\2&)\62\65\67\67\u01d6\2J\3\2\2\2\4O\3"+
		"\2\2\2\6U\3\2\2\2\bX\3\2\2\2\nd\3\2\2\2\fz\3\2\2\2\16|\3\2\2\2\20\u0084"+
		"\3\2\2\2\22\u009d\3\2\2\2\24\u009f\3\2\2\2\26\u00a5\3\2\2\2\30\u00ad\3"+
		"\2\2\2\32\u00b3\3\2\2\2\34\u00c3\3\2\2\2\36\u00d0\3\2\2\2 \u00f3\3\2\2"+
		"\2\"\u00f7\3\2\2\2$\u00f9\3\2\2\2&\u0106\3\2\2\2(\u0108\3\2\2\2*\u010a"+
		"\3\2\2\2,\u0113\3\2\2\2.\u011a\3\2\2\2\60\u0120\3\2\2\2\62\u013e\3\2\2"+
		"\2\64\u0143\3\2\2\2\66\u015b\3\2\2\28\u0170\3\2\2\2:\u0180\3\2\2\2<\u0186"+
		"\3\2\2\2>\u018e\3\2\2\2@\u0196\3\2\2\2B\u01a3\3\2\2\2D\u01a5\3\2\2\2F"+
		"\u01a7\3\2\2\2H\u01b3\3\2\2\2JK\7\17\2\2KL\7\7\2\2LM\5\4\3\2MN\7\b\2\2"+
		"N\3\3\2\2\2OP\5\6\4\2PQ\5\n\6\2Q\5\3\2\2\2RT\5\b\5\2SR\3\2\2\2TW\3\2\2"+
		"\2US\3\2\2\2UV\3\2\2\2V\7\3\2\2\2WU\3\2\2\2XY\7!\2\2YZ\7\"\2\2Z]\7G\2"+
		"\2[\\\7H\2\2\\^\7G\2\2][\3\2\2\2]^\3\2\2\2^\t\3\2\2\2_c\5\32\16\2`c\5"+
		"\20\t\2ac\5\24\13\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2"+
		"de\3\2\2\2e\13\3\2\2\2fd\3\2\2\2gj\7G\2\2hi\7\16\2\2ik\5 \21\2jh\3\2\2"+
		"\2jk\3\2\2\2k{\3\2\2\2lr\7G\2\2mo\7\t\2\2np\t\2\2\2on\3\2\2\2op\3\2\2"+
		"\2pq\3\2\2\2qs\7\n\2\2rm\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2"+
		"\2vw\7\16\2\2wy\5\22\n\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zg\3\2\2\2zl\3\2"+
		"\2\2{\r\3\2\2\2|\u0081\5\f\7\2}~\7\6\2\2~\u0080\5\f\7\2\177}\3\2\2\2\u0080"+
		"\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\17\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0084\u0085\5\"\22\2\u0085\u0086\5\16\b\2\u0086\21"+
		"\3\2\2\2\u0087\u0088\7\7\2\2\u0088\u008d\5\22\n\2\u0089\u008a\7\6\2\2"+
		"\u008a\u008c\5\22\n\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0091\7\b\2\2\u0091\u009e\3\2\2\2\u0092\u0093\7\7\2\2\u0093\u0098\5("+
		"\25\2\u0094\u0095\7\6\2\2\u0095\u0097\5(\25\2\u0096\u0094\3\2\2\2\u0097"+
		"\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7\b\2\2\u009c\u009e\3\2\2\2\u009d"+
		"\u0087\3\2\2\2\u009d\u0092\3\2\2\2\u009e\23\3\2\2\2\u009f\u00a0\7\31\2"+
		"\2\u00a0\u00a1\5\"\22\2\u00a1\u00a2\7G\2\2\u00a2\u00a3\7\16\2\2\u00a3"+
		"\u00a4\5(\25\2\u00a4\25\3\2\2\2\u00a5\u00aa\5\30\r\2\u00a6\u00a7\7\6\2"+
		"\2\u00a7\u00a9\5\30\r\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\27\3\2\2\2\u00ac\u00aa\3\2\2"+
		"\2\u00ad\u00af\5\"\22\2\u00ae\u00b0\7;\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7G\2\2\u00b2\31\3\2\2\2\u00b3"+
		"\u00b6\7\32\2\2\u00b4\u00b7\5\"\22\2\u00b5\u00b7\7\20\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00b9\7G\2\2\u00b9\u00bb\7\f\2\2\u00ba\u00bc\5\26\f\2\u00bb\u00ba\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\r\2\2\u00be"+
		"\u00bf\58\35\2\u00bf\33\3\2\2\2\u00c0\u00c4\5$\23\2\u00c1\u00c4\5&\24"+
		"\2\u00c2\u00c4\5<\37\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2"+
		"\3\2\2\2\u00c4\35\3\2\2\2\u00c5\u00c6\b\20\1\2\u00c6\u00c7\7\f\2\2\u00c7"+
		"\u00c8\5\36\20\2\u00c8\u00c9\7\r\2\2\u00c9\u00d1\3\2\2\2\u00ca\u00cb\t"+
		"\3\2\2\u00cb\u00cc\7\f\2\2\u00cc\u00cd\5\36\20\2\u00cd\u00ce\7\r\2\2\u00ce"+
		"\u00d1\3\2\2\2\u00cf\u00d1\5\34\17\2\u00d0\u00c5\3\2\2\2\u00d0\u00ca\3"+
		"\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00ef\3\2\2\2\u00d2\u00d3\f\f\2\2\u00d3"+
		"\u00d4\t\4\2\2\u00d4\u00ee\5\36\20\r\u00d5\u00d6\f\13\2\2\u00d6\u00d7"+
		"\t\5\2\2\u00d7\u00ee\5\36\20\f\u00d8\u00d9\f\n\2\2\u00d9\u00da\t\6\2\2"+
		"\u00da\u00ee\5\36\20\13\u00db\u00dc\f\t\2\2\u00dc\u00dd\t\7\2\2\u00dd"+
		"\u00ee\5\36\20\n\u00de\u00df\f\b\2\2\u00df\u00e0\t\b\2\2\u00e0\u00ee\5"+
		"\36\20\t\u00e1\u00e2\f\7\2\2\u00e2\u00e3\7;\2\2\u00e3\u00ee\5\36\20\b"+
		"\u00e4\u00e5\f\6\2\2\u00e5\u00e6\7<\2\2\u00e6\u00ee\5\36\20\7\u00e7\u00e8"+
		"\f\5\2\2\u00e8\u00e9\78\2\2\u00e9\u00ee\5\36\20\6\u00ea\u00eb\f\4\2\2"+
		"\u00eb\u00ec\79\2\2\u00ec\u00ee\5\36\20\5\u00ed\u00d2\3\2\2\2\u00ed\u00d5"+
		"\3\2\2\2\u00ed\u00d8\3\2\2\2\u00ed\u00db\3\2\2\2\u00ed\u00de\3\2\2\2\u00ed"+
		"\u00e1\3\2\2\2\u00ed\u00e4\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ed\u00ea\3\2"+
		"\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\37\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f4\5\36\20\2\u00f3\u00f2\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"!\3\2\2\2\u00f7\u00f8\t\t\2\2\u00f8#\3\2\2\2\u00f9\u0100\7G\2\2\u00fa"+
		"\u00fb\7\t\2\2\u00fb\u00fc\5 \21\2\u00fc\u00fd\7\n\2\2\u00fd\u00ff\3\2"+
		"\2\2\u00fe\u00fa\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101%\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0107\5(\25\2"+
		"\u0104\u0107\5<\37\2\u0105\u0107\5$\23\2\u0106\u0103\3\2\2\2\u0106\u0104"+
		"\3\2\2\2\u0106\u0105\3\2\2\2\u0107\'\3\2\2\2\u0108\u0109\t\n\2\2\u0109"+
		")\3\2\2\2\u010a\u010b\7\3\2\2\u010b\u010c\7\f\2\2\u010c\u010d\5 \21\2"+
		"\u010d\u010e\7\r\2\2\u010e\u0111\58\35\2\u010f\u0110\7 \2\2\u0110\u0112"+
		"\58\35\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112+\3\2\2\2\u0113"+
		"\u0114\7\36\2\2\u0114\u0115\58\35\2\u0115\u0116\7\37\2\2\u0116\u0117\7"+
		"\f\2\2\u0117\u0118\5 \21\2\u0118\u0119\7\r\2\2\u0119-\3\2\2\2\u011a\u011b"+
		"\7\37\2\2\u011b\u011c\7\f\2\2\u011c\u011d\5 \21\2\u011d\u011e\7\r\2\2"+
		"\u011e\u011f\58\35\2\u011f/\3\2\2\2\u0120\u0121\7\34\2\2\u0121\u0123\7"+
		"\f\2\2\u0122\u0124\5\62\32\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0129\3\2\2\2\u0125\u0126\7\6\2\2\u0126\u0128\5\62\32\2\u0127\u0125\3"+
		"\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012e\7\4\2\2\u012d\u012f\5 "+
		"\21\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0132\7\4\2\2\u0131\u0133\5B\"\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u0138\3\2\2\2\u0134\u0135\7\6\2\2\u0135\u0137\5B\"\2\u0136"+
		"\u0134\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7\r\2\2\u013c"+
		"\u013d\58\35\2\u013d\61\3\2\2\2\u013e\u013f\5\"\22\2\u013f\u0140\7G\2"+
		"\2\u0140\u0141\7\16\2\2\u0141\u0142\5 \21\2\u0142\63\3\2\2\2\u0143\u0144"+
		"\7\26\2\2\u0144\u0145\7\f\2\2\u0145\u0146\5 \21\2\u0146\u0147\7\r\2\2"+
		"\u0147\u014b\7\7\2\2\u0148\u014a\5\66\34\2\u0149\u0148\3\2\2\2\u014a\u014d"+
		"\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u0157\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u014f\7\27\2\2\u014f\u0150\7\30\2\2\u0150\u0154\7"+
		"\13\2\2\u0151\u0153\5:\36\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2"+
		"\2\2\u0157\u014e\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015a\7\b\2\2\u015a\65\3\2\2\2\u015b\u015c\7\27\2\2\u015c\u015d\5(\25"+
		"\2\u015d\u0161\7\13\2\2\u015e\u0160\5:\36\2\u015f\u015e\3\2\2\2\u0160"+
		"\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0165\3\2"+
		"\2\2\u0163\u0161\3\2\2\2\u0164\u0166\7\35\2\2\u0165\u0164\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\67\3\2\2\2\u0167\u016b\7\7\2\2\u0168\u016a\5:\36"+
		"\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c"+
		"\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0171\7\b\2\2\u016f"+
		"\u0171\5:\36\2\u0170\u0167\3\2\2\2\u0170\u016f\3\2\2\2\u01719\3\2\2\2"+
		"\u0172\u0181\5\20\t\2\u0173\u0181\5.\30\2\u0174\u0181\5B\"\2\u0175\u0181"+
		"\5*\26\2\u0176\u0181\5<\37\2\u0177\u0181\5,\27\2\u0178\u0181\5\64\33\2"+
		"\u0179\u0181\5@!\2\u017a\u0181\5\60\31\2\u017b\u0181\5F$\2\u017c\u0181"+
		"\5H%\2\u017d\u017e\7%\2\2\u017e\u017f\7\f\2\2\u017f\u0181\7\r\2\2\u0180"+
		"\u0172\3\2\2\2\u0180\u0173\3\2\2\2\u0180\u0174\3\2\2\2\u0180\u0175\3\2"+
		"\2\2\u0180\u0176\3\2\2\2\u0180\u0177\3\2\2\2\u0180\u0178\3\2\2\2\u0180"+
		"\u0179\3\2\2\2\u0180\u017a\3\2\2\2\u0180\u017b\3\2\2\2\u0180\u017c\3\2"+
		"\2\2\u0180\u017d\3\2\2\2\u0181;\3\2\2\2\u0182\u0187\7G\2\2\u0183\u0184"+
		"\7G\2\2\u0184\u0185\7\5\2\2\u0185\u0187\7G\2\2\u0186\u0182\3\2\2\2\u0186"+
		"\u0183\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\7\f\2\2\u0189\u018b\5>"+
		" \2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018d\7\r\2\2\u018d=\3\2\2\2\u018e\u0193\5&\24\2\u018f\u0190\7\6\2\2"+
		"\u0190\u0192\5&\24\2\u0191\u018f\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191"+
		"\3\2\2\2\u0193\u0194\3\2\2\2\u0194?\3\2\2\2\u0195\u0193\3\2\2\2\u0196"+
		"\u0197\7\33\2\2\u0197\u0198\5 \21\2\u0198A\3\2\2\2\u0199\u019a\5$\23\2"+
		"\u019a\u019b\t\13\2\2\u019b\u019c\5 \21\2\u019c\u01a4\3\2\2\2\u019d\u019e"+
		"\5$\23\2\u019e\u019f\7+\2\2\u019f\u01a4\3\2\2\2\u01a0\u01a1\5$\23\2\u01a1"+
		"\u01a2\7,\2\2\u01a2\u01a4\3\2\2\2\u01a3\u0199\3\2\2\2\u01a3\u019d\3\2"+
		"\2\2\u01a3\u01a0\3\2\2\2\u01a4C\3\2\2\2\u01a5\u01a6\t\f\2\2\u01a6E\3\2"+
		"\2\2\u01a7\u01a8\7#\2\2\u01a8\u01a9\7\f\2\2\u01a9\u01ae\7G\2\2\u01aa\u01ab"+
		"\7\6\2\2\u01ab\u01ad\7G\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae"+
		"\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01ae\3\2"+
		"\2\2\u01b1\u01b2\7\r\2\2\u01b2G\3\2\2\2\u01b3\u01b4\7$\2\2\u01b4\u01b5"+
		"\7\f\2\2\u01b5\u01b6\5> \2\u01b6\u01b7\7\r\2\2\u01b7I\3\2\2\2-U]bdjot"+
		"xz\u0081\u008d\u0098\u009d\u00aa\u00af\u00b6\u00bb\u00c3\u00d0\u00ed\u00ef"+
		"\u00f5\u0100\u0106\u0111\u0123\u0129\u012e\u0132\u0138\u014b\u0154\u0157"+
		"\u0161\u0165\u016b\u0170\u0180\u0186\u018a\u0193\u01a3\u01ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}