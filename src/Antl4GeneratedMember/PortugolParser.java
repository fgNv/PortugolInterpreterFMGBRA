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
		RULE_declaracoes = 4, RULE_dimensao = 5, RULE_item_var = 6, RULE_lista_var = 7, 
		RULE_dec_var = 8, RULE_inicializacao_vetor = 9, RULE_dec_constante = 10, 
		RULE_dec_lista_param = 11, RULE_dec_item_param = 12, RULE_dec_funcao = 13, 
		RULE_operando = 14, RULE_expressao = 15, RULE_operador_aritmetico_prioritario = 16, 
		RULE_operador_aritmetico_secundario_concatenacao = 17, RULE_operador_aritmetico_secundario = 18, 
		RULE_operador_bit = 19, RULE_operador_comparacao_prioritario = 20, RULE_operador_comparacao_secundario = 21, 
		RULE_operador_e_binario = 22, RULE_operador_ou_binario = 23, RULE_operador_e_logico = 24, 
		RULE_operador_ou_logico = 25, RULE_tipo = 26, RULE_id_consumo = 27, RULE_valor_constante = 28, 
		RULE_se = 29, RULE_faca = 30, RULE_enquanto = 31, RULE_para = 32, RULE_contador_para = 33, 
		RULE_escolha = 34, RULE_caso = 35, RULE_bloco = 36, RULE_comando = 37, 
		RULE_chamada_funcao = 38, RULE_chamada_funcao_biblioteca = 39, RULE_param_funcao = 40, 
		RULE_retorno = 41, RULE_alteracaoValorVariavel = 42, RULE_atribuicao = 43, 
		RULE_operador = 44, RULE_leia = 45, RULE_escreva = 46, RULE_lista_param = 47, 
		RULE_item_param = 48;
	public static final String[] ruleNames = {
		"programa", "corpo", "bibliotecas", "biblioteca", "declaracoes", "dimensao", 
		"item_var", "lista_var", "dec_var", "inicializacao_vetor", "dec_constante", 
		"dec_lista_param", "dec_item_param", "dec_funcao", "operando", "expressao", 
		"operador_aritmetico_prioritario", "operador_aritmetico_secundario_concatenacao", 
		"operador_aritmetico_secundario", "operador_bit", "operador_comparacao_prioritario", 
		"operador_comparacao_secundario", "operador_e_binario", "operador_ou_binario", 
		"operador_e_logico", "operador_ou_logico", "tipo", "id_consumo", "valor_constante", 
		"se", "faca", "enquanto", "para", "contador_para", "escolha", "caso", 
		"bloco", "comando", "chamada_funcao", "chamada_funcao_biblioteca", "param_funcao", 
		"retorno", "alteracaoValorVariavel", "atribuicao", "operador", "leia", 
		"escreva", "lista_param", "item_param"
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
			setState(98); match(PROGRAMA);
			setState(99); match(ABRE_CHAVE);
			setState(100); corpo();
			setState(101); match(FECHA_CHAVE);
			}
		}
		catch (RecognitionException re) {
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
			setState(103); bibliotecas();
			setState(104); declaracoes();
			}
		}
		catch (RecognitionException re) {
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
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INCLUA) {
				{
				{
				setState(106); biblioteca();
				}
				}
				setState(111);
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
			setState(112); match(INCLUA);
			setState(113); match(BIBLIOTECA);
			setState(114); match(ID);
			setState(117);
			_la = _input.LA(1);
			if (_la==ALIAS_BIBLIOTECA) {
				{
				setState(115); match(ALIAS_BIBLIOTECA);
				setState(116); match(ID);
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
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL_DECLARACAO) | (1L << LOGICO_DECLARACAO) | (1L << CADEIA_DECLARACAO) | (1L << INTEIRO_DECLARACAO) | (1L << CARACTER_DECLARACAO) | (1L << CONST) | (1L << FUNCAO))) != 0)) {
				{
				setState(122);
				switch (_input.LA(1)) {
				case FUNCAO:
					{
					setState(119); dec_funcao();
					}
					break;
				case REAL_DECLARACAO:
				case LOGICO_DECLARACAO:
				case CADEIA_DECLARACAO:
				case INTEIRO_DECLARACAO:
				case CARACTER_DECLARACAO:
					{
					setState(120); dec_var();
					}
					break;
				case CONST:
					{
					setState(121); dec_constante();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(126);
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

	public static class DimensaoContext extends ParserRuleContext {
		public TerminalNode INTEIRO() { return getToken(PortugolParser.INTEIRO, 0); }
		public Id_consumoContext id_consumo() {
			return getRuleContext(Id_consumoContext.class,0);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitDimensao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDimensao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dimensao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(ABRE_COLCHETE);
			setState(130);
			switch (_input.LA(1)) {
			case INTEIRO:
				{
				setState(128); match(INTEIRO);
				}
				break;
			case ID:
				{
				setState(129); id_consumo();
				}
				break;
			case FECHA_COLCHETE:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(132); match(FECHA_COLCHETE);
			}
		}
		catch (RecognitionException re) {
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
		public Item_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_var; }
	 
		public Item_varContext() { }
		public void copyFrom(Item_varContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecVetorContext extends Item_varContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public DimensaoContext dimensao(int i) {
			return getRuleContext(DimensaoContext.class,i);
		}
		public Inicializacao_vetorContext inicializacao_vetor() {
			return getRuleContext(Inicializacao_vetorContext.class,0);
		}
		public List<DimensaoContext> dimensao() {
			return getRuleContexts(DimensaoContext.class);
		}
		public DecVetorContext(Item_varContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterDecVetor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitDecVetor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDecVetor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecSingleVarContext extends Item_varContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DecSingleVarContext(Item_varContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterDecSingleVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitDecSingleVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDecSingleVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Item_varContext item_var() throws RecognitionException {
		Item_varContext _localctx = new Item_varContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_item_var);
		int _la;
		try {
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new DecSingleVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(134); match(ID);
				setState(137);
				_la = _input.LA(1);
				if (_la==ATRIBUICAO) {
					{
					setState(135); match(ATRIBUICAO);
					setState(136); expressao(0);
					}
				}

				}
				break;

			case 2:
				_localctx = new DecVetorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139); match(ID);
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(140); dimensao();
					}
					}
					setState(143); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ABRE_COLCHETE );
				setState(147);
				_la = _input.LA(1);
				if (_la==ATRIBUICAO) {
					{
					setState(145); match(ATRIBUICAO);
					setState(146); inicializacao_vetor();
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
		enterRule(_localctx, 14, RULE_lista_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); item_var();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(152); match(VIRGULA);
				setState(153); item_var();
				}
				}
				setState(158);
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
		enterRule(_localctx, 16, RULE_dec_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); tipo();
			setState(160); lista_var();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 18, RULE_inicializacao_vetor);
		int _la;
		try {
			setState(184);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162); match(ABRE_CHAVE);
				setState(163); inicializacao_vetor();
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(164); match(VIRGULA);
					setState(165); inicializacao_vetor();
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(171); match(FECHA_CHAVE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173); match(ABRE_CHAVE);
				setState(174); valor_constante();
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(175); match(VIRGULA);
					setState(176); valor_constante();
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(182); match(FECHA_CHAVE);
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
		enterRule(_localctx, 20, RULE_dec_constante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); match(CONST);
			setState(187); tipo();
			setState(188); match(ID);
			setState(189); match(ATRIBUICAO);
			setState(190); valor_constante();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 22, RULE_dec_lista_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); dec_item_param();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(193); match(VIRGULA);
				setState(194); dec_item_param();
				}
				}
				setState(199);
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
		public Dec_item_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_item_param; }
	 
		public Dec_item_paramContext() { }
		public void copyFrom(Dec_item_paramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ItemParamVetorContext extends Dec_item_paramContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public DimensaoContext dimensao(int i) {
			return getRuleContext(DimensaoContext.class,i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<DimensaoContext> dimensao() {
			return getRuleContexts(DimensaoContext.class);
		}
		public ItemParamVetorContext(Dec_item_paramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterItemParamVetor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitItemParamVetor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitItemParamVetor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ItemParamVarContext extends Dec_item_paramContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ItemParamVarContext(Dec_item_paramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterItemParamVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitItemParamVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitItemParamVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_item_paramContext dec_item_param() throws RecognitionException {
		Dec_item_paramContext _localctx = new Dec_item_paramContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dec_item_param);
		int _la;
		try {
			setState(214);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ItemParamVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(200); tipo();
				setState(202);
				_la = _input.LA(1);
				if (_la==E_BINARIO) {
					{
					setState(201); match(E_BINARIO);
					}
				}

				setState(204); match(ID);
				}
				break;

			case 2:
				_localctx = new ItemParamVetorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206); tipo();
				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(207); dimensao();
					}
					}
					setState(210); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ABRE_COLCHETE );
				setState(212); match(ID);
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

	public static class Dec_funcaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public DimensaoContext dimensao(int i) {
			return getRuleContext(DimensaoContext.class,i);
		}
		public Dec_lista_paramContext dec_lista_param() {
			return getRuleContext(Dec_lista_paramContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<DimensaoContext> dimensao() {
			return getRuleContexts(DimensaoContext.class);
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
		enterRule(_localctx, 26, RULE_dec_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); match(FUNCAO);
			setState(225);
			switch (_input.LA(1)) {
			case REAL_DECLARACAO:
			case LOGICO_DECLARACAO:
			case CADEIA_DECLARACAO:
			case INTEIRO_DECLARACAO:
			case CARACTER_DECLARACAO:
				{
				setState(217); tipo();
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ABRE_COLCHETE) {
					{
					{
					setState(218); dimensao();
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case VAZIO:
				{
				setState(224); match(VAZIO);
				}
				break;
			case ID:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(227); match(ID);
			setState(228); match(ABRE_PARENTESES);
			setState(230);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL_DECLARACAO) | (1L << LOGICO_DECLARACAO) | (1L << CADEIA_DECLARACAO) | (1L << INTEIRO_DECLARACAO) | (1L << CARACTER_DECLARACAO))) != 0)) {
				{
				setState(229); dec_lista_param();
				}
			}

			setState(232); match(FECHA_PARENTESES);
			setState(233); bloco();
			}
		}
		catch (RecognitionException re) {
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
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public Chamada_funcaoContext chamada_funcao() {
			return getRuleContext(Chamada_funcaoContext.class,0);
		}
		public Id_consumoContext id_consumo() {
			return getRuleContext(Id_consumoContext.class,0);
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
		enterRule(_localctx, 28, RULE_operando);
		try {
			setState(238);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235); id_consumo();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236); valor_constante();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(237); chamada_funcao();
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
		public Operador_bitContext operador_bit() {
			return getRuleContext(Operador_bitContext.class,0);
		}
		public Operador_e_binarioContext operador_e_binario() {
			return getRuleContext(Operador_e_binarioContext.class,0);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode NAO_BINARIO() { return getToken(PortugolParser.NAO_BINARIO, 0); }
		public TerminalNode NAO() { return getToken(PortugolParser.NAO, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public Operador_ou_binarioContext operador_ou_binario() {
			return getRuleContext(Operador_ou_binarioContext.class,0);
		}
		public Operador_ou_logicoContext operador_ou_logico() {
			return getRuleContext(Operador_ou_logicoContext.class,0);
		}
		public Operador_comparacao_secundarioContext operador_comparacao_secundario() {
			return getRuleContext(Operador_comparacao_secundarioContext.class,0);
		}
		public Operador_aritmetico_prioritarioContext operador_aritmetico_prioritario() {
			return getRuleContext(Operador_aritmetico_prioritarioContext.class,0);
		}
		public Operador_aritmetico_secundario_concatenacaoContext operador_aritmetico_secundario_concatenacao() {
			return getRuleContext(Operador_aritmetico_secundario_concatenacaoContext.class,0);
		}
		public Operador_comparacao_prioritarioContext operador_comparacao_prioritario() {
			return getRuleContext(Operador_comparacao_prioritarioContext.class,0);
		}
		public Operador_aritmetico_secundarioContext operador_aritmetico_secundario() {
			return getRuleContext(Operador_aritmetico_secundarioContext.class,0);
		}
		public Operador_e_logicoContext operador_e_logico() {
			return getRuleContext(Operador_e_logicoContext.class,0);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expressao, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			switch (_input.LA(1)) {
			case NAO:
			case NAO_BINARIO:
				{
				setState(241);
				_la = _input.LA(1);
				if ( !(_la==NAO || _la==NAO_BINARIO) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(242); match(ABRE_PARENTESES);
				setState(243); expressao(0);
				setState(244); match(FECHA_PARENTESES);
				}
				break;
			case INTEIRO:
			case REAL:
			case CADEIA:
			case CARACTER:
			case LOGICO:
			case ID:
				{
				setState(246); operando();
				}
				break;
			case ABRE_PARENTESES:
				{
				setState(247); match(ABRE_PARENTESES);
				setState(248); expressao(0);
				setState(249); match(FECHA_PARENTESES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(292);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(253);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(254); operador_aritmetico_prioritario();
						setState(255); expressao(12);
						}
						break;

					case 2:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(257);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(260);
						switch (_input.LA(1)) {
						case SOMA:
							{
							setState(258); operador_aritmetico_secundario_concatenacao();
							}
							break;
						case SUBTRACAO:
							{
							setState(259); operador_aritmetico_secundario();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(262); expressao(11);
						}
						break;

					case 3:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(264);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(265); operador_bit();
						setState(266); expressao(10);
						}
						break;

					case 4:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(268);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(269); operador_comparacao_prioritario();
						setState(270); expressao(9);
						}
						break;

					case 5:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(272);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(273); operador_comparacao_secundario();
						setState(274); expressao(8);
						}
						break;

					case 6:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(276);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(277); operador_e_binario();
						setState(278); expressao(7);
						}
						break;

					case 7:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(280);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(281); operador_ou_binario();
						setState(282); expressao(6);
						}
						break;

					case 8:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(284);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(285); operador_e_logico();
						setState(286); expressao(5);
						}
						break;

					case 9:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(288);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(289); operador_ou_logico();
						setState(290); expressao(4);
						}
						break;
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class Operador_aritmetico_prioritarioContext extends ParserRuleContext {
		public Operador_aritmetico_prioritarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_aritmetico_prioritario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOperador_aritmetico_prioritario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOperador_aritmetico_prioritario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperador_aritmetico_prioritario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_aritmetico_prioritarioContext operador_aritmetico_prioritario() throws RecognitionException {
		Operador_aritmetico_prioritarioContext _localctx = new Operador_aritmetico_prioritarioContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operador_aritmetico_prioritario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICACAO) | (1L << DIVISAO) | (1L << MODULO))) != 0)) ) {
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

	public static class Operador_aritmetico_secundario_concatenacaoContext extends ParserRuleContext {
		public Operador_aritmetico_secundario_concatenacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_aritmetico_secundario_concatenacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOperador_aritmetico_secundario_concatenacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOperador_aritmetico_secundario_concatenacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperador_aritmetico_secundario_concatenacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_aritmetico_secundario_concatenacaoContext operador_aritmetico_secundario_concatenacao() throws RecognitionException {
		Operador_aritmetico_secundario_concatenacaoContext _localctx = new Operador_aritmetico_secundario_concatenacaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operador_aritmetico_secundario_concatenacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299); match(SOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operador_aritmetico_secundarioContext extends ParserRuleContext {
		public Operador_aritmetico_secundarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_aritmetico_secundario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOperador_aritmetico_secundario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOperador_aritmetico_secundario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperador_aritmetico_secundario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_aritmetico_secundarioContext operador_aritmetico_secundario() throws RecognitionException {
		Operador_aritmetico_secundarioContext _localctx = new Operador_aritmetico_secundarioContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operador_aritmetico_secundario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301); match(SUBTRACAO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operador_bitContext extends ParserRuleContext {
		public Operador_bitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_bit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOperador_bit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOperador_bit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperador_bit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_bitContext operador_bit() throws RecognitionException {
		Operador_bitContext _localctx = new Operador_bitContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_operador_bit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_la = _input.LA(1);
			if ( !(_la==SHIFT_DIREITA || _la==SHIFT_ESQUERDA) ) {
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

	public static class Operador_comparacao_prioritarioContext extends ParserRuleContext {
		public Operador_comparacao_prioritarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_comparacao_prioritario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOperador_comparacao_prioritario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOperador_comparacao_prioritario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperador_comparacao_prioritario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_comparacao_prioritarioContext operador_comparacao_prioritario() throws RecognitionException {
		Operador_comparacao_prioritarioContext _localctx = new Operador_comparacao_prioritarioContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_operador_comparacao_prioritario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIOR) | (1L << MENOR) | (1L << MAIOR_IGUAL) | (1L << MENOR_IGUAL))) != 0)) ) {
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

	public static class Operador_comparacao_secundarioContext extends ParserRuleContext {
		public Operador_comparacao_secundarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_comparacao_secundario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOperador_comparacao_secundario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOperador_comparacao_secundario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperador_comparacao_secundario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_comparacao_secundarioContext operador_comparacao_secundario() throws RecognitionException {
		Operador_comparacao_secundarioContext _localctx = new Operador_comparacao_secundarioContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operador_comparacao_secundario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_la = _input.LA(1);
			if ( !(_la==IGUAL || _la==DIFERENTE) ) {
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

	public static class Operador_e_binarioContext extends ParserRuleContext {
		public Operador_e_binarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_e_binario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOperador_e_binario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOperador_e_binario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperador_e_binario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_e_binarioContext operador_e_binario() throws RecognitionException {
		Operador_e_binarioContext _localctx = new Operador_e_binarioContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_operador_e_binario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(309); match(E_BINARIO);
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

	public static class Operador_ou_binarioContext extends ParserRuleContext {
		public Operador_ou_binarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_ou_binario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOperador_ou_binario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOperador_ou_binario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperador_ou_binario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_ou_binarioContext operador_ou_binario() throws RecognitionException {
		Operador_ou_binarioContext _localctx = new Operador_ou_binarioContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_operador_ou_binario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(311); match(OU_BINARIO);
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

	public static class Operador_e_logicoContext extends ParserRuleContext {
		public Operador_e_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_e_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOperador_e_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOperador_e_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperador_e_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_e_logicoContext operador_e_logico() throws RecognitionException {
		Operador_e_logicoContext _localctx = new Operador_e_logicoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_operador_e_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(313); match(E);
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

	public static class Operador_ou_logicoContext extends ParserRuleContext {
		public Operador_ou_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_ou_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOperador_ou_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOperador_ou_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitOperador_ou_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_ou_logicoContext operador_ou_logico() throws RecognitionException {
		Operador_ou_logicoContext _localctx = new Operador_ou_logicoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_operador_ou_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(315); match(OU);
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
		enterRule(_localctx, 52, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
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

	public static class Id_consumoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public Id_consumoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_consumo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterId_consumo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitId_consumo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitId_consumo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_consumoContext id_consumo() throws RecognitionException {
		Id_consumoContext _localctx = new Id_consumoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_id_consumo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(319); match(ID);
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(320); match(ABRE_COLCHETE);
					setState(321); expressao(0);
					setState(322); match(FECHA_COLCHETE);
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		enterRule(_localctx, 56, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
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
		enterRule(_localctx, 58, RULE_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331); match(SE);
			setState(332); match(ABRE_PARENTESES);
			setState(333); expressao(0);
			setState(334); match(FECHA_PARENTESES);
			setState(335); bloco();
			setState(338);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(336); match(SENAO);
				setState(337); bloco();
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
		enterRule(_localctx, 60, RULE_faca);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340); match(FACA);
			setState(341); bloco();
			setState(342); match(ENQUANTO);
			setState(343); match(ABRE_PARENTESES);
			setState(344); expressao(0);
			setState(345); match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 62, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347); match(ENQUANTO);
			setState(348); match(ABRE_PARENTESES);
			setState(349); expressao(0);
			setState(350); match(FECHA_PARENTESES);
			setState(351); bloco();
			}
		}
		catch (RecognitionException re) {
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
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public List<AlteracaoValorVariavelContext> alteracaoValorVariavel() {
			return getRuleContexts(AlteracaoValorVariavelContext.class);
		}
		public AlteracaoValorVariavelContext alteracaoValorVariavel(int i) {
			return getRuleContext(AlteracaoValorVariavelContext.class,i);
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
		enterRule(_localctx, 64, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353); match(PARA);
			setState(354); match(ABRE_PARENTESES);
			setState(356);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (REAL_DECLARACAO - 15)) | (1L << (LOGICO_DECLARACAO - 15)) | (1L << (CADEIA_DECLARACAO - 15)) | (1L << (INTEIRO_DECLARACAO - 15)) | (1L << (CARACTER_DECLARACAO - 15)) | (1L << (ID - 15)))) != 0)) {
				{
				setState(355); contador_para();
				}
			}

			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(358); match(VIRGULA);
				setState(359); contador_para();
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365); match(PONTO_VIRGULA);
			setState(367);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ABRE_PARENTESES - 10)) | (1L << (NAO - 10)) | (1L << (NAO_BINARIO - 10)) | (1L << (INTEIRO - 10)) | (1L << (REAL - 10)) | (1L << (CADEIA - 10)) | (1L << (CARACTER - 10)) | (1L << (LOGICO - 10)) | (1L << (ID - 10)))) != 0)) {
				{
				setState(366); expressao(0);
				}
			}

			setState(369); match(PONTO_VIRGULA);
			setState(371);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(370); alteracaoValorVariavel();
				}
			}

			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(373); match(VIRGULA);
				setState(374); alteracaoValorVariavel();
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380); match(FECHA_PARENTESES);
			setState(381); bloco();
			}
		}
		catch (RecognitionException re) {
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
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
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
		enterRule(_localctx, 66, RULE_contador_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL_DECLARACAO) | (1L << LOGICO_DECLARACAO) | (1L << CADEIA_DECLARACAO) | (1L << INTEIRO_DECLARACAO) | (1L << CARACTER_DECLARACAO))) != 0)) {
				{
				setState(383); tipo();
				}
			}

			setState(386); match(ID);
			setState(387); match(ATRIBUICAO);
			setState(388); expressao(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 68, RULE_escolha);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(390); match(ESCOLHA);
			setState(391); match(ABRE_PARENTESES);
			setState(392); expressao(0);
			setState(393); match(FECHA_PARENTESES);
			setState(394); match(ABRE_CHAVE);
			setState(398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(395); caso();
					}
					} 
				}
				setState(400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(410);
			_la = _input.LA(1);
			if (_la==CASO) {
				{
				setState(401); match(CASO);
				setState(402); match(CONTRARIO);
				setState(403); match(DOIS_PONTOS);
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SE) | (1L << REAL_DECLARACAO) | (1L << LOGICO_DECLARACAO) | (1L << CADEIA_DECLARACAO) | (1L << INTEIRO_DECLARACAO) | (1L << CARACTER_DECLARACAO) | (1L << ESCOLHA) | (1L << RETORNE) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << LEIA) | (1L << ESCREVA) | (1L << LIMPA))) != 0) || _la==ID) {
					{
					{
					setState(404); comando();
					}
					}
					setState(409);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(412); match(FECHA_CHAVE);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 70, RULE_caso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414); match(CASO);
			setState(415); valor_constante();
			setState(416); match(DOIS_PONTOS);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SE) | (1L << REAL_DECLARACAO) | (1L << LOGICO_DECLARACAO) | (1L << CADEIA_DECLARACAO) | (1L << INTEIRO_DECLARACAO) | (1L << CARACTER_DECLARACAO) | (1L << ESCOLHA) | (1L << RETORNE) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << LEIA) | (1L << ESCREVA) | (1L << LIMPA))) != 0) || _la==ID) {
				{
				{
				setState(417); comando();
				}
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(424);
			_la = _input.LA(1);
			if (_la==PARE) {
				{
				setState(423); match(PARE);
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
		enterRule(_localctx, 72, RULE_bloco);
		int _la;
		try {
			setState(435);
			switch (_input.LA(1)) {
			case ABRE_CHAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(426); match(ABRE_CHAVE);
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SE) | (1L << REAL_DECLARACAO) | (1L << LOGICO_DECLARACAO) | (1L << CADEIA_DECLARACAO) | (1L << INTEIRO_DECLARACAO) | (1L << CARACTER_DECLARACAO) | (1L << ESCOLHA) | (1L << RETORNE) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << LEIA) | (1L << ESCREVA) | (1L << LIMPA))) != 0) || _la==ID) {
					{
					{
					setState(427); comando();
					}
					}
					setState(432);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(433); match(FECHA_CHAVE);
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
				setState(434); comando();
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
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public AlteracaoValorVariavelContext alteracaoValorVariavel() {
			return getRuleContext(AlteracaoValorVariavelContext.class,0);
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
		enterRule(_localctx, 74, RULE_comando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(437); dec_var();
				}
				break;

			case 2:
				{
				setState(438); enquanto();
				}
				break;

			case 3:
				{
				setState(439); alteracaoValorVariavel();
				}
				break;

			case 4:
				{
				setState(440); se();
				}
				break;

			case 5:
				{
				setState(441); chamada_funcao();
				}
				break;

			case 6:
				{
				setState(442); faca();
				}
				break;

			case 7:
				{
				setState(443); escolha();
				}
				break;

			case 8:
				{
				setState(444); retorno();
				}
				break;

			case 9:
				{
				setState(445); para();
				}
				break;

			case 10:
				{
				setState(446); leia();
				}
				break;

			case 11:
				{
				setState(447); escreva();
				}
				break;

			case 12:
				{
				setState(448); match(LIMPA);
				setState(449); match(ABRE_PARENTESES);
				setState(450); match(FECHA_PARENTESES);
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
		public Param_funcaoContext param_funcao() {
			return getRuleContext(Param_funcaoContext.class,0);
		}
		public Id_consumoContext id_consumo() {
			return getRuleContext(Id_consumoContext.class,0);
		}
		public Chamada_funcao_bibliotecaContext chamada_funcao_biblioteca() {
			return getRuleContext(Chamada_funcao_bibliotecaContext.class,0);
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
		enterRule(_localctx, 76, RULE_chamada_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(453); id_consumo();
				}
				break;

			case 2:
				{
				setState(454); chamada_funcao_biblioteca();
				}
				break;
			}
			setState(457); param_funcao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Chamada_funcao_bibliotecaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public Id_consumoContext id_consumo() {
			return getRuleContext(Id_consumoContext.class,0);
		}
		public Chamada_funcao_bibliotecaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_funcao_biblioteca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterChamada_funcao_biblioteca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitChamada_funcao_biblioteca(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitChamada_funcao_biblioteca(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Chamada_funcao_bibliotecaContext chamada_funcao_biblioteca() throws RecognitionException {
		Chamada_funcao_bibliotecaContext _localctx = new Chamada_funcao_bibliotecaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_chamada_funcao_biblioteca);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459); id_consumo();
			setState(460); match(PONTO);
			setState(461); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_funcaoContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public Param_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterParam_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitParam_funcao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitParam_funcao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_funcaoContext param_funcao() throws RecognitionException {
		Param_funcaoContext _localctx = new Param_funcaoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_param_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463); match(ABRE_PARENTESES);
			setState(472);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ABRE_PARENTESES - 10)) | (1L << (NAO - 10)) | (1L << (NAO_BINARIO - 10)) | (1L << (INTEIRO - 10)) | (1L << (REAL - 10)) | (1L << (CADEIA - 10)) | (1L << (CARACTER - 10)) | (1L << (LOGICO - 10)) | (1L << (ID - 10)))) != 0)) {
				{
				setState(464); expressao(0);
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(465); match(VIRGULA);
					setState(466); expressao(0);
					}
					}
					setState(471);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(474); match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 82, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476); match(RETORNE);
			setState(477); expressao(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlteracaoValorVariavelContext extends ParserRuleContext {
		public AlteracaoValorVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alteracaoValorVariavel; }
	 
		public AlteracaoValorVariavelContext() { }
		public void copyFrom(AlteracaoValorVariavelContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AlteracaoAtribuicaoContext extends AlteracaoValorVariavelContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public AlteracaoAtribuicaoContext(AlteracaoValorVariavelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterAlteracaoAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitAlteracaoAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitAlteracaoAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlteracaoIncrementoContext extends AlteracaoValorVariavelContext {
		public Id_consumoContext id_consumo() {
			return getRuleContext(Id_consumoContext.class,0);
		}
		public AlteracaoIncrementoContext(AlteracaoValorVariavelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterAlteracaoIncremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitAlteracaoIncremento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitAlteracaoIncremento(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlteracaoDecrementoContext extends AlteracaoValorVariavelContext {
		public Id_consumoContext id_consumo() {
			return getRuleContext(Id_consumoContext.class,0);
		}
		public AlteracaoDecrementoContext(AlteracaoValorVariavelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterAlteracaoDecremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitAlteracaoDecremento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitAlteracaoDecremento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlteracaoValorVariavelContext alteracaoValorVariavel() throws RecognitionException {
		AlteracaoValorVariavelContext _localctx = new AlteracaoValorVariavelContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_alteracaoValorVariavel);
		try {
			setState(486);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				_localctx = new AlteracaoAtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(479); atribuicao();
				}
				break;

			case 2:
				_localctx = new AlteracaoIncrementoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(480); id_consumo();
				setState(481); match(INCREMENTO);
				}
				break;

			case 3:
				_localctx = new AlteracaoDecrementoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(483); id_consumo();
				setState(484); match(DECREMENTO);
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Id_consumoContext id_consumo() {
			return getRuleContext(Id_consumoContext.class,0);
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
		enterRule(_localctx, 86, RULE_atribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488); id_consumo();
			setState(489);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATRIBUICAO) | (1L << ATRIBUICAO_INCREMENTO) | (1L << ATRIBUICAO_DECREMENTO) | (1L << ATRIBUICAO_DIVISAO) | (1L << ATRIBUICAO_MULTIPLICAO) | (1L << ATRIBUICAO_MODULO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(490); expressao(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 88, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
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
		enterRule(_localctx, 90, RULE_leia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494); match(LEIA);
			setState(495); match(ABRE_PARENTESES);
			setState(496); match(ID);
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(497); match(VIRGULA);
				setState(498); match(ID);
				}
				}
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(504); match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 92, RULE_escreva);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506); match(ESCREVA);
			setState(507); match(ABRE_PARENTESES);
			setState(508); lista_param();
			setState(509); match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
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
		public List<Item_paramContext> item_param() {
			return getRuleContexts(Item_paramContext.class);
		}
		public Item_paramContext item_param(int i) {
			return getRuleContext(Item_paramContext.class,i);
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
		enterRule(_localctx, 94, RULE_lista_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511); item_param();
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(512); match(VIRGULA);
				setState(513); item_param();
				}
				}
				setState(518);
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

	public static class Item_paramContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Item_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterItem_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitItem_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitItem_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Item_paramContext item_param() throws RecognitionException {
		Item_paramContext _localctx = new Item_paramContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_item_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519); expressao(0);
			}
		}
		catch (RecognitionException re) {
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
		case 15: return expressao_sempred((ExpressaoContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3K\u020c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\4\7\4n\n\4\f\4\16\4q\13\4\3\5\3\5\3\5\3\5\3\5\5\5x\n"+
		"\5\3\6\3\6\3\6\7\6}\n\6\f\6\16\6\u0080\13\6\3\7\3\7\3\7\5\7\u0085\n\7"+
		"\3\7\3\7\3\b\3\b\3\b\5\b\u008c\n\b\3\b\3\b\6\b\u0090\n\b\r\b\16\b\u0091"+
		"\3\b\3\b\5\b\u0096\n\b\5\b\u0098\n\b\3\t\3\t\3\t\7\t\u009d\n\t\f\t\16"+
		"\t\u00a0\13\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u00a9\n\13\f\13\16"+
		"\13\u00ac\13\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b4\n\13\f\13\16"+
		"\13\u00b7\13\13\3\13\3\13\5\13\u00bb\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\7\r\u00c6\n\r\f\r\16\r\u00c9\13\r\3\16\3\16\5\16\u00cd\n\16\3"+
		"\16\3\16\3\16\3\16\6\16\u00d3\n\16\r\16\16\16\u00d4\3\16\3\16\5\16\u00d9"+
		"\n\16\3\17\3\17\3\17\7\17\u00de\n\17\f\17\16\17\u00e1\13\17\3\17\5\17"+
		"\u00e4\n\17\3\17\3\17\3\17\5\17\u00e9\n\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\5\20\u00f1\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00fe\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0107\n"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\7\21\u0127\n\21\f\21\16\21\u012a\13\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\7\35\u0147\n\35\f\35"+
		"\16\35\u014a\13\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0155"+
		"\n\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\5\"\u0167\n\""+
		"\3\"\3\"\7\"\u016b\n\"\f\"\16\"\u016e\13\"\3\"\3\"\5\"\u0172\n\"\3\"\3"+
		"\"\5\"\u0176\n\"\3\"\3\"\7\"\u017a\n\"\f\"\16\"\u017d\13\"\3\"\3\"\3\""+
		"\3#\5#\u0183\n#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\7$\u018f\n$\f$\16$\u0192"+
		"\13$\3$\3$\3$\3$\7$\u0198\n$\f$\16$\u019b\13$\5$\u019d\n$\3$\3$\3%\3%"+
		"\3%\3%\7%\u01a5\n%\f%\16%\u01a8\13%\3%\5%\u01ab\n%\3&\3&\7&\u01af\n&\f"+
		"&\16&\u01b2\13&\3&\3&\5&\u01b6\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\5\'\u01c6\n\'\3(\3(\5(\u01ca\n(\3(\3(\3)\3)\3)\3"+
		")\3*\3*\3*\3*\7*\u01d6\n*\f*\16*\u01d9\13*\5*\u01db\n*\3*\3*\3+\3+\3+"+
		"\3,\3,\3,\3,\3,\3,\3,\5,\u01e9\n,\3-\3-\3-\3-\3.\3.\3/\3/\3/\3/\3/\7/"+
		"\u01f6\n/\f/\16/\u01f9\13/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\7\61\u0205\n\61\f\61\16\61\u0208\13\61\3\62\3\62\3\62\2\3 \63\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`b\2\13\4\2::==\3\2(*\3\2>?\3\2\62\65\3\2\66\67\3\2\21\25\4\2"+
		"@@CF\4\2\16\16-\61\5\2&)\62\65\67\67\u0220\2d\3\2\2\2\4i\3\2\2\2\6o\3"+
		"\2\2\2\br\3\2\2\2\n~\3\2\2\2\f\u0081\3\2\2\2\16\u0097\3\2\2\2\20\u0099"+
		"\3\2\2\2\22\u00a1\3\2\2\2\24\u00ba\3\2\2\2\26\u00bc\3\2\2\2\30\u00c2\3"+
		"\2\2\2\32\u00d8\3\2\2\2\34\u00da\3\2\2\2\36\u00f0\3\2\2\2 \u00fd\3\2\2"+
		"\2\"\u012b\3\2\2\2$\u012d\3\2\2\2&\u012f\3\2\2\2(\u0131\3\2\2\2*\u0133"+
		"\3\2\2\2,\u0135\3\2\2\2.\u0137\3\2\2\2\60\u0139\3\2\2\2\62\u013b\3\2\2"+
		"\2\64\u013d\3\2\2\2\66\u013f\3\2\2\28\u0141\3\2\2\2:\u014b\3\2\2\2<\u014d"+
		"\3\2\2\2>\u0156\3\2\2\2@\u015d\3\2\2\2B\u0163\3\2\2\2D\u0182\3\2\2\2F"+
		"\u0188\3\2\2\2H\u01a0\3\2\2\2J\u01b5\3\2\2\2L\u01c5\3\2\2\2N\u01c9\3\2"+
		"\2\2P\u01cd\3\2\2\2R\u01d1\3\2\2\2T\u01de\3\2\2\2V\u01e8\3\2\2\2X\u01ea"+
		"\3\2\2\2Z\u01ee\3\2\2\2\\\u01f0\3\2\2\2^\u01fc\3\2\2\2`\u0201\3\2\2\2"+
		"b\u0209\3\2\2\2de\7\17\2\2ef\7\7\2\2fg\5\4\3\2gh\7\b\2\2h\3\3\2\2\2ij"+
		"\5\6\4\2jk\5\n\6\2k\5\3\2\2\2ln\5\b\5\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2"+
		"op\3\2\2\2p\7\3\2\2\2qo\3\2\2\2rs\7!\2\2st\7\"\2\2tw\7G\2\2uv\7H\2\2v"+
		"x\7G\2\2wu\3\2\2\2wx\3\2\2\2x\t\3\2\2\2y}\5\34\17\2z}\5\22\n\2{}\5\26"+
		"\f\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2"+
		"\2\177\13\3\2\2\2\u0080~\3\2\2\2\u0081\u0084\7\t\2\2\u0082\u0085\7@\2"+
		"\2\u0083\u0085\58\35\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\n\2\2\u0087\r\3\2\2\2\u0088"+
		"\u008b\7G\2\2\u0089\u008a\7\16\2\2\u008a\u008c\5 \21\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u0098\3\2\2\2\u008d\u008f\7G\2\2\u008e"+
		"\u0090\5\f\7\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0094\7\16\2\2\u0094"+
		"\u0096\5\24\13\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3"+
		"\2\2\2\u0097\u0088\3\2\2\2\u0097\u008d\3\2\2\2\u0098\17\3\2\2\2\u0099"+
		"\u009e\5\16\b\2\u009a\u009b\7\6\2\2\u009b\u009d\5\16\b\2\u009c\u009a\3"+
		"\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\21\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\5\66\34\2\u00a2\u00a3\5\20"+
		"\t\2\u00a3\23\3\2\2\2\u00a4\u00a5\7\7\2\2\u00a5\u00aa\5\24\13\2\u00a6"+
		"\u00a7\7\6\2\2\u00a7\u00a9\5\24\13\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3"+
		"\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00ae\7\b\2\2\u00ae\u00bb\3\2\2\2\u00af\u00b0\7\7"+
		"\2\2\u00b0\u00b5\5:\36\2\u00b1\u00b2\7\6\2\2\u00b2\u00b4\5:\36\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7\b\2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00a4\3\2\2\2\u00ba\u00af\3\2\2\2\u00bb\25\3\2\2"+
		"\2\u00bc\u00bd\7\31\2\2\u00bd\u00be\5\66\34\2\u00be\u00bf\7G\2\2\u00bf"+
		"\u00c0\7\16\2\2\u00c0\u00c1\5:\36\2\u00c1\27\3\2\2\2\u00c2\u00c7\5\32"+
		"\16\2\u00c3\u00c4\7\6\2\2\u00c4\u00c6\5\32\16\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\31\3\2\2"+
		"\2\u00c9\u00c7\3\2\2\2\u00ca\u00cc\5\66\34\2\u00cb\u00cd\7;\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7G"+
		"\2\2\u00cf\u00d9\3\2\2\2\u00d0\u00d2\5\66\34\2\u00d1\u00d3\5\f\7\2\u00d2"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7G\2\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00ca\3\2\2\2\u00d8\u00d0\3\2\2\2\u00d9\33\3\2\2\2\u00da\u00e3\7\32\2"+
		"\2\u00db\u00df\5\66\34\2\u00dc\u00de\5\f\7\2\u00dd\u00dc\3\2\2\2\u00de"+
		"\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e4\3\2"+
		"\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e4\7\20\2\2\u00e3\u00db\3\2\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7G"+
		"\2\2\u00e6\u00e8\7\f\2\2\u00e7\u00e9\5\30\r\2\u00e8\u00e7\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\7\r\2\2\u00eb\u00ec\5J"+
		"&\2\u00ec\35\3\2\2\2\u00ed\u00f1\58\35\2\u00ee\u00f1\5:\36\2\u00ef\u00f1"+
		"\5N(\2\u00f0\u00ed\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1"+
		"\37\3\2\2\2\u00f2\u00f3\b\21\1\2\u00f3\u00f4\t\2\2\2\u00f4\u00f5\7\f\2"+
		"\2\u00f5\u00f6\5 \21\2\u00f6\u00f7\7\r\2\2\u00f7\u00fe\3\2\2\2\u00f8\u00fe"+
		"\5\36\20\2\u00f9\u00fa\7\f\2\2\u00fa\u00fb\5 \21\2\u00fb\u00fc\7\r\2\2"+
		"\u00fc\u00fe\3\2\2\2\u00fd\u00f2\3\2\2\2\u00fd\u00f8\3\2\2\2\u00fd\u00f9"+
		"\3\2\2\2\u00fe\u0128\3\2\2\2\u00ff\u0100\f\r\2\2\u0100\u0101\5\"\22\2"+
		"\u0101\u0102\5 \21\16\u0102\u0127\3\2\2\2\u0103\u0106\f\f\2\2\u0104\u0107"+
		"\5$\23\2\u0105\u0107\5&\24\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u0109\5 \21\r\u0109\u0127\3\2\2\2\u010a\u010b\f\13"+
		"\2\2\u010b\u010c\5(\25\2\u010c\u010d\5 \21\f\u010d\u0127\3\2\2\2\u010e"+
		"\u010f\f\n\2\2\u010f\u0110\5*\26\2\u0110\u0111\5 \21\13\u0111\u0127\3"+
		"\2\2\2\u0112\u0113\f\t\2\2\u0113\u0114\5,\27\2\u0114\u0115\5 \21\n\u0115"+
		"\u0127\3\2\2\2\u0116\u0117\f\b\2\2\u0117\u0118\5.\30\2\u0118\u0119\5 "+
		"\21\t\u0119\u0127\3\2\2\2\u011a\u011b\f\7\2\2\u011b\u011c\5\60\31\2\u011c"+
		"\u011d\5 \21\b\u011d\u0127\3\2\2\2\u011e\u011f\f\6\2\2\u011f\u0120\5\62"+
		"\32\2\u0120\u0121\5 \21\7\u0121\u0127\3\2\2\2\u0122\u0123\f\5\2\2\u0123"+
		"\u0124\5\64\33\2\u0124\u0125\5 \21\6\u0125\u0127\3\2\2\2\u0126\u00ff\3"+
		"\2\2\2\u0126\u0103\3\2\2\2\u0126\u010a\3\2\2\2\u0126\u010e\3\2\2\2\u0126"+
		"\u0112\3\2\2\2\u0126\u0116\3\2\2\2\u0126\u011a\3\2\2\2\u0126\u011e\3\2"+
		"\2\2\u0126\u0122\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129!\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\t\3\2\2"+
		"\u012c#\3\2\2\2\u012d\u012e\7&\2\2\u012e%\3\2\2\2\u012f\u0130\7\'\2\2"+
		"\u0130\'\3\2\2\2\u0131\u0132\t\4\2\2\u0132)\3\2\2\2\u0133\u0134\t\5\2"+
		"\2\u0134+\3\2\2\2\u0135\u0136\t\6\2\2\u0136-\3\2\2\2\u0137\u0138\7;\2"+
		"\2\u0138/\3\2\2\2\u0139\u013a\7<\2\2\u013a\61\3\2\2\2\u013b\u013c\78\2"+
		"\2\u013c\63\3\2\2\2\u013d\u013e\79\2\2\u013e\65\3\2\2\2\u013f\u0140\t"+
		"\7\2\2\u0140\67\3\2\2\2\u0141\u0148\7G\2\2\u0142\u0143\7\t\2\2\u0143\u0144"+
		"\5 \21\2\u0144\u0145\7\n\2\2\u0145\u0147\3\2\2\2\u0146\u0142\3\2\2\2\u0147"+
		"\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u01499\3\2\2\2"+
		"\u014a\u0148\3\2\2\2\u014b\u014c\t\b\2\2\u014c;\3\2\2\2\u014d\u014e\7"+
		"\3\2\2\u014e\u014f\7\f\2\2\u014f\u0150\5 \21\2\u0150\u0151\7\r\2\2\u0151"+
		"\u0154\5J&\2\u0152\u0153\7 \2\2\u0153\u0155\5J&\2\u0154\u0152\3\2\2\2"+
		"\u0154\u0155\3\2\2\2\u0155=\3\2\2\2\u0156\u0157\7\36\2\2\u0157\u0158\5"+
		"J&\2\u0158\u0159\7\37\2\2\u0159\u015a\7\f\2\2\u015a\u015b\5 \21\2\u015b"+
		"\u015c\7\r\2\2\u015c?\3\2\2\2\u015d\u015e\7\37\2\2\u015e\u015f\7\f\2\2"+
		"\u015f\u0160\5 \21\2\u0160\u0161\7\r\2\2\u0161\u0162\5J&\2\u0162A\3\2"+
		"\2\2\u0163\u0164\7\34\2\2\u0164\u0166\7\f\2\2\u0165\u0167\5D#\2\u0166"+
		"\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u016c\3\2\2\2\u0168\u0169\7\6"+
		"\2\2\u0169\u016b\5D#\2\u016a\u0168\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a"+
		"\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u016c\3\2\2\2\u016f"+
		"\u0171\7\4\2\2\u0170\u0172\5 \21\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2"+
		"\2\2\u0172\u0173\3\2\2\2\u0173\u0175\7\4\2\2\u0174\u0176\5V,\2\u0175\u0174"+
		"\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u017b\3\2\2\2\u0177\u0178\7\6\2\2\u0178"+
		"\u017a\5V,\2\u0179\u0177\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2"+
		"\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f"+
		"\7\r\2\2\u017f\u0180\5J&\2\u0180C\3\2\2\2\u0181\u0183\5\66\34\2\u0182"+
		"\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\7G"+
		"\2\2\u0185\u0186\7\16\2\2\u0186\u0187\5 \21\2\u0187E\3\2\2\2\u0188\u0189"+
		"\7\26\2\2\u0189\u018a\7\f\2\2\u018a\u018b\5 \21\2\u018b\u018c\7\r\2\2"+
		"\u018c\u0190\7\7\2\2\u018d\u018f\5H%\2\u018e\u018d\3\2\2\2\u018f\u0192"+
		"\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u019c\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0193\u0194\7\27\2\2\u0194\u0195\7\30\2\2\u0195\u0199\7"+
		"\13\2\2\u0196\u0198\5L\'\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2"+
		"\2\2\u019c\u0193\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u019f\7\b\2\2\u019fG\3\2\2\2\u01a0\u01a1\7\27\2\2\u01a1\u01a2\5:\36\2"+
		"\u01a2\u01a6\7\13\2\2\u01a3\u01a5\5L\'\2\u01a4\u01a3\3\2\2\2\u01a5\u01a8"+
		"\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8"+
		"\u01a6\3\2\2\2\u01a9\u01ab\7\35\2\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3"+
		"\2\2\2\u01abI\3\2\2\2\u01ac\u01b0\7\7\2\2\u01ad\u01af\5L\'\2\u01ae\u01ad"+
		"\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b3\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b6\7\b\2\2\u01b4\u01b6\5L"+
		"\'\2\u01b5\u01ac\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6K\3\2\2\2\u01b7\u01c6"+
		"\5\22\n\2\u01b8\u01c6\5@!\2\u01b9\u01c6\5V,\2\u01ba\u01c6\5<\37\2\u01bb"+
		"\u01c6\5N(\2\u01bc\u01c6\5> \2\u01bd\u01c6\5F$\2\u01be\u01c6\5T+\2\u01bf"+
		"\u01c6\5B\"\2\u01c0\u01c6\5\\/\2\u01c1\u01c6\5^\60\2\u01c2\u01c3\7%\2"+
		"\2\u01c3\u01c4\7\f\2\2\u01c4\u01c6\7\r\2\2\u01c5\u01b7\3\2\2\2\u01c5\u01b8"+
		"\3\2\2\2\u01c5\u01b9\3\2\2\2\u01c5\u01ba\3\2\2\2\u01c5\u01bb\3\2\2\2\u01c5"+
		"\u01bc\3\2\2\2\u01c5\u01bd\3\2\2\2\u01c5\u01be\3\2\2\2\u01c5\u01bf\3\2"+
		"\2\2\u01c5\u01c0\3\2\2\2\u01c5\u01c1\3\2\2\2\u01c5\u01c2\3\2\2\2\u01c6"+
		"M\3\2\2\2\u01c7\u01ca\58\35\2\u01c8\u01ca\5P)\2\u01c9\u01c7\3\2\2\2\u01c9"+
		"\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\5R*\2\u01ccO\3\2\2\2\u01cd"+
		"\u01ce\58\35\2\u01ce\u01cf\7\5\2\2\u01cf\u01d0\7G\2\2\u01d0Q\3\2\2\2\u01d1"+
		"\u01da\7\f\2\2\u01d2\u01d7\5 \21\2\u01d3\u01d4\7\6\2\2\u01d4\u01d6\5 "+
		"\21\2\u01d5\u01d3\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01d2\3\2"+
		"\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\7\r\2\2\u01dd"+
		"S\3\2\2\2\u01de\u01df\7\33\2\2\u01df\u01e0\5 \21\2\u01e0U\3\2\2\2\u01e1"+
		"\u01e9\5X-\2\u01e2\u01e3\58\35\2\u01e3\u01e4\7+\2\2\u01e4\u01e9\3\2\2"+
		"\2\u01e5\u01e6\58\35\2\u01e6\u01e7\7,\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01e1"+
		"\3\2\2\2\u01e8\u01e2\3\2\2\2\u01e8\u01e5\3\2\2\2\u01e9W\3\2\2\2\u01ea"+
		"\u01eb\58\35\2\u01eb\u01ec\t\t\2\2\u01ec\u01ed\5 \21\2\u01edY\3\2\2\2"+
		"\u01ee\u01ef\t\n\2\2\u01ef[\3\2\2\2\u01f0\u01f1\7#\2\2\u01f1\u01f2\7\f"+
		"\2\2\u01f2\u01f7\7G\2\2\u01f3\u01f4\7\6\2\2\u01f4\u01f6\7G\2\2\u01f5\u01f3"+
		"\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u01fa\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fb\7\r\2\2\u01fb]\3\2\2\2"+
		"\u01fc\u01fd\7$\2\2\u01fd\u01fe\7\f\2\2\u01fe\u01ff\5`\61\2\u01ff\u0200"+
		"\7\r\2\2\u0200_\3\2\2\2\u0201\u0206\5b\62\2\u0202\u0203\7\6\2\2\u0203"+
		"\u0205\5b\62\2\u0204\u0202\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2"+
		"\2\2\u0206\u0207\3\2\2\2\u0207a\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020a"+
		"\5 \21\2\u020ac\3\2\2\2\61ow|~\u0084\u008b\u0091\u0095\u0097\u009e\u00aa"+
		"\u00b5\u00ba\u00c7\u00cc\u00d4\u00d8\u00df\u00e3\u00e8\u00f0\u00fd\u0106"+
		"\u0126\u0128\u0148\u0154\u0166\u016c\u0171\u0175\u017b\u0182\u0190\u0199"+
		"\u019c\u01a6\u01aa\u01b0\u01b5\u01c5\u01c9\u01d7\u01da\u01e8\u01f7\u0206";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}