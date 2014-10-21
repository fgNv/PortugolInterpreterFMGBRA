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
		RULE_operador_aritmetico_secundario = 17, RULE_operador_bit = 18, RULE_operador_comparacao_prioritario = 19, 
		RULE_operador_comparacao_secundario = 20, RULE_operador_e_binario = 21, 
		RULE_operador_ou_binario = 22, RULE_operador_e_logico = 23, RULE_operador_ou_logico = 24, 
		RULE_tipo = 25, RULE_id_consumo = 26, RULE_valor_constante = 27, RULE_se = 28, 
		RULE_faca = 29, RULE_enquanto = 30, RULE_para = 31, RULE_contador_para = 32, 
		RULE_escolha = 33, RULE_caso = 34, RULE_bloco = 35, RULE_comando = 36, 
		RULE_chamada_funcao = 37, RULE_chamada_funcao_biblioteca = 38, RULE_param_funcao = 39, 
		RULE_retorno = 40, RULE_alteracaoValorVariavel = 41, RULE_atribuicao = 42, 
		RULE_operador = 43, RULE_leia = 44, RULE_escreva = 45, RULE_lista_param = 46;
	public static final String[] ruleNames = {
		"programa", "corpo", "bibliotecas", "biblioteca", "declaracoes", "dimensao", 
		"item_var", "lista_var", "dec_var", "inicializacao_vetor", "dec_constante", 
		"dec_lista_param", "dec_item_param", "dec_funcao", "operando", "expressao", 
		"operador_aritmetico_prioritario", "operador_aritmetico_secundario", "operador_bit", 
		"operador_comparacao_prioritario", "operador_comparacao_secundario", "operador_e_binario", 
		"operador_ou_binario", "operador_e_logico", "operador_ou_logico", "tipo", 
		"id_consumo", "valor_constante", "se", "faca", "enquanto", "para", "contador_para", 
		"escolha", "caso", "bloco", "comando", "chamada_funcao", "chamada_funcao_biblioteca", 
		"param_funcao", "retorno", "alteracaoValorVariavel", "atribuicao", "operador", 
		"leia", "escreva", "lista_param"
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
			setState(94); match(PROGRAMA);
			setState(95); match(ABRE_CHAVE);
			setState(96); corpo();
			setState(97); match(FECHA_CHAVE);
			}
		}
		catch (RecognitionException re) {
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
			setState(99); bibliotecas();
			setState(100); declaracoes();
			}
		}
		catch (RecognitionException re) {
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
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INCLUA) {
				{
				{
				setState(102); biblioteca();
				}
				}
				setState(107);
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
			setState(108); match(INCLUA);
			setState(109); match(BIBLIOTECA);
			setState(110); match(ID);
			setState(113);
			_la = _input.LA(1);
			if (_la==ALIAS_BIBLIOTECA) {
				{
				setState(111); match(ALIAS_BIBLIOTECA);
				setState(112); match(ID);
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
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL_DECLARACAO) | (1L << LOGICO_DECLARACAO) | (1L << CADEIA_DECLARACAO) | (1L << INTEIRO_DECLARACAO) | (1L << CARACTER_DECLARACAO) | (1L << CONST) | (1L << FUNCAO))) != 0)) {
				{
				setState(118);
				switch (_input.LA(1)) {
				case FUNCAO:
					{
					setState(115); dec_funcao();
					}
					break;
				case REAL_DECLARACAO:
				case LOGICO_DECLARACAO:
				case CADEIA_DECLARACAO:
				case INTEIRO_DECLARACAO:
				case CARACTER_DECLARACAO:
					{
					setState(116); dec_var();
					}
					break;
				case CONST:
					{
					setState(117); dec_constante();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(122);
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
			setState(123); match(ABRE_COLCHETE);
			setState(126);
			switch (_input.LA(1)) {
			case INTEIRO:
				{
				setState(124); match(INTEIRO);
				}
				break;
			case ID:
				{
				setState(125); id_consumo();
				}
				break;
			case FECHA_COLCHETE:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(128); match(FECHA_COLCHETE);
			}
		}
		catch (RecognitionException re) {
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
	public static class DecVarContext extends Item_varContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DecVarContext(Item_varContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterDecVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitDecVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitDecVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Item_varContext item_var() throws RecognitionException {
		Item_varContext _localctx = new Item_varContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_item_var);
		int _la;
		try {
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new DecVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130); match(ID);
				setState(133);
				_la = _input.LA(1);
				if (_la==ATRIBUICAO) {
					{
					setState(131); match(ATRIBUICAO);
					setState(132); expressao(0);
					}
				}

				}
				break;

			case 2:
				_localctx = new DecVetorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135); match(ID);
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(136); dimensao();
					}
					}
					setState(139); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ABRE_COLCHETE );
				setState(143);
				_la = _input.LA(1);
				if (_la==ATRIBUICAO) {
					{
					setState(141); match(ATRIBUICAO);
					setState(142); inicializacao_vetor();
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
			setState(147); item_var();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(148); match(VIRGULA);
				setState(149); item_var();
				}
				}
				setState(154);
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
			setState(155); tipo();
			setState(156); lista_var();
			}
		}
		catch (RecognitionException re) {
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
			setState(180);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158); match(ABRE_CHAVE);
				setState(159); inicializacao_vetor();
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(160); match(VIRGULA);
					setState(161); inicializacao_vetor();
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(167); match(FECHA_CHAVE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169); match(ABRE_CHAVE);
				setState(170); valor_constante();
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(171); match(VIRGULA);
					setState(172); valor_constante();
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178); match(FECHA_CHAVE);
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
			setState(182); match(CONST);
			setState(183); tipo();
			setState(184); match(ID);
			setState(185); match(ATRIBUICAO);
			setState(186); valor_constante();
			}
		}
		catch (RecognitionException re) {
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
			setState(188); dec_item_param();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(189); match(VIRGULA);
				setState(190); dec_item_param();
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
		enterRule(_localctx, 24, RULE_dec_item_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); tipo();
			setState(198);
			_la = _input.LA(1);
			if (_la==E_BINARIO) {
				{
				setState(197); match(E_BINARIO);
				}
			}

			setState(200); match(ID);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 26, RULE_dec_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); match(FUNCAO);
			setState(205);
			switch (_input.LA(1)) {
			case REAL_DECLARACAO:
			case LOGICO_DECLARACAO:
			case CADEIA_DECLARACAO:
			case INTEIRO_DECLARACAO:
			case CARACTER_DECLARACAO:
				{
				setState(203); tipo();
				}
				break;
			case VAZIO:
				{
				setState(204); match(VAZIO);
				}
				break;
			case ID:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(207); match(ID);
			setState(208); match(ABRE_PARENTESES);
			setState(210);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL_DECLARACAO) | (1L << LOGICO_DECLARACAO) | (1L << CADEIA_DECLARACAO) | (1L << INTEIRO_DECLARACAO) | (1L << CARACTER_DECLARACAO))) != 0)) {
				{
				setState(209); dec_lista_param();
				}
			}

			setState(212); match(FECHA_PARENTESES);
			setState(213); bloco();
			}
		}
		catch (RecognitionException re) {
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
			setState(218);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215); id_consumo();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216); valor_constante();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217); chamada_funcao();
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
			setState(231);
			switch (_input.LA(1)) {
			case NAO:
			case NAO_BINARIO:
				{
				setState(221);
				_la = _input.LA(1);
				if ( !(_la==NAO || _la==NAO_BINARIO) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(222); match(ABRE_PARENTESES);
				setState(223); expressao(0);
				setState(224); match(FECHA_PARENTESES);
				}
				break;
			case INTEIRO:
			case REAL:
			case CADEIA:
			case CARACTER:
			case LOGICO:
			case ID:
				{
				setState(226); operando();
				}
				break;
			case ABRE_PARENTESES:
				{
				setState(227); match(ABRE_PARENTESES);
				setState(228); expressao(0);
				setState(229); match(FECHA_PARENTESES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(269);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(233);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(234); operador_aritmetico_prioritario();
						setState(235); expressao(12);
						}
						break;

					case 2:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(237);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(238); operador_aritmetico_secundario();
						setState(239); expressao(11);
						}
						break;

					case 3:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(241);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(242); operador_bit();
						setState(243); expressao(10);
						}
						break;

					case 4:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(245);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(246); operador_comparacao_prioritario();
						setState(247); expressao(9);
						}
						break;

					case 5:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(249);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(250); operador_comparacao_secundario();
						setState(251); expressao(8);
						}
						break;

					case 6:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(253);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(254); operador_e_binario();
						setState(255); expressao(7);
						}
						break;

					case 7:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(257);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(258); operador_ou_binario();
						setState(259); expressao(6);
						}
						break;

					case 8:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(261);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(262); operador_e_logico();
						setState(263); expressao(5);
						}
						break;

					case 9:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(265);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(266); operador_ou_logico();
						setState(267); expressao(4);
						}
						break;
					}
					} 
				}
				setState(273);
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
			setState(274);
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
		enterRule(_localctx, 34, RULE_operador_aritmetico_secundario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_la = _input.LA(1);
			if ( !(_la==SOMA || _la==SUBTRACAO) ) {
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
		enterRule(_localctx, 36, RULE_operador_bit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
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
		enterRule(_localctx, 38, RULE_operador_comparacao_prioritario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
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
		enterRule(_localctx, 40, RULE_operador_comparacao_secundario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
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
		enterRule(_localctx, 42, RULE_operador_e_binario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(284); match(E_BINARIO);
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
		enterRule(_localctx, 44, RULE_operador_ou_binario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(286); match(OU_BINARIO);
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
		enterRule(_localctx, 46, RULE_operador_e_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(288); match(E);
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
		enterRule(_localctx, 48, RULE_operador_ou_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(290); match(OU);
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
		enterRule(_localctx, 50, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
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
		enterRule(_localctx, 52, RULE_id_consumo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294); match(ID);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(295); match(ABRE_COLCHETE);
					setState(296); expressao(0);
					setState(297); match(FECHA_COLCHETE);
					}
					} 
				}
				setState(303);
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
		enterRule(_localctx, 54, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
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
		enterRule(_localctx, 56, RULE_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306); match(SE);
			setState(307); match(ABRE_PARENTESES);
			setState(308); expressao(0);
			setState(309); match(FECHA_PARENTESES);
			setState(310); bloco();
			setState(313);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(311); match(SENAO);
				setState(312); bloco();
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
		enterRule(_localctx, 58, RULE_faca);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315); match(FACA);
			setState(316); bloco();
			setState(317); match(ENQUANTO);
			setState(318); match(ABRE_PARENTESES);
			setState(319); expressao(0);
			setState(320); match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 60, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322); match(ENQUANTO);
			setState(323); match(ABRE_PARENTESES);
			setState(324); expressao(0);
			setState(325); match(FECHA_PARENTESES);
			setState(326); bloco();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 62, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328); match(PARA);
			setState(329); match(ABRE_PARENTESES);
			setState(331);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL_DECLARACAO) | (1L << LOGICO_DECLARACAO) | (1L << CADEIA_DECLARACAO) | (1L << INTEIRO_DECLARACAO) | (1L << CARACTER_DECLARACAO))) != 0)) {
				{
				setState(330); contador_para();
				}
			}

			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(333); match(VIRGULA);
				setState(334); contador_para();
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(340); match(PONTO_VIRGULA);
			setState(342);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ABRE_PARENTESES - 10)) | (1L << (NAO - 10)) | (1L << (NAO_BINARIO - 10)) | (1L << (INTEIRO - 10)) | (1L << (REAL - 10)) | (1L << (CADEIA - 10)) | (1L << (CARACTER - 10)) | (1L << (LOGICO - 10)) | (1L << (ID - 10)))) != 0)) {
				{
				setState(341); expressao(0);
				}
			}

			setState(344); match(PONTO_VIRGULA);
			setState(346);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(345); alteracaoValorVariavel();
				}
			}

			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(348); match(VIRGULA);
				setState(349); alteracaoValorVariavel();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355); match(FECHA_PARENTESES);
			setState(356); bloco();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 64, RULE_contador_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358); tipo();
			setState(359); match(ID);
			setState(360); match(ATRIBUICAO);
			setState(361); expressao(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 66, RULE_escolha);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(363); match(ESCOLHA);
			setState(364); match(ABRE_PARENTESES);
			setState(365); expressao(0);
			setState(366); match(FECHA_PARENTESES);
			setState(367); match(ABRE_CHAVE);
			setState(371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(368); caso();
					}
					} 
				}
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(383);
			_la = _input.LA(1);
			if (_la==CASO) {
				{
				setState(374); match(CASO);
				setState(375); match(CONTRARIO);
				setState(376); match(DOIS_PONTOS);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SE) | (1L << REAL_DECLARACAO) | (1L << LOGICO_DECLARACAO) | (1L << CADEIA_DECLARACAO) | (1L << INTEIRO_DECLARACAO) | (1L << CARACTER_DECLARACAO) | (1L << ESCOLHA) | (1L << RETORNE) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << LEIA) | (1L << ESCREVA) | (1L << LIMPA))) != 0) || _la==ID) {
					{
					{
					setState(377); comando();
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(385); match(FECHA_CHAVE);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 68, RULE_caso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387); match(CASO);
			setState(388); valor_constante();
			setState(389); match(DOIS_PONTOS);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SE) | (1L << REAL_DECLARACAO) | (1L << LOGICO_DECLARACAO) | (1L << CADEIA_DECLARACAO) | (1L << INTEIRO_DECLARACAO) | (1L << CARACTER_DECLARACAO) | (1L << ESCOLHA) | (1L << RETORNE) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << LEIA) | (1L << ESCREVA) | (1L << LIMPA))) != 0) || _la==ID) {
				{
				{
				setState(390); comando();
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(397);
			_la = _input.LA(1);
			if (_la==PARE) {
				{
				setState(396); match(PARE);
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
		enterRule(_localctx, 70, RULE_bloco);
		int _la;
		try {
			setState(408);
			switch (_input.LA(1)) {
			case ABRE_CHAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(399); match(ABRE_CHAVE);
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SE) | (1L << REAL_DECLARACAO) | (1L << LOGICO_DECLARACAO) | (1L << CADEIA_DECLARACAO) | (1L << INTEIRO_DECLARACAO) | (1L << CARACTER_DECLARACAO) | (1L << ESCOLHA) | (1L << RETORNE) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << LEIA) | (1L << ESCREVA) | (1L << LIMPA))) != 0) || _la==ID) {
					{
					{
					setState(400); comando();
					}
					}
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(406); match(FECHA_CHAVE);
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
				setState(407); comando();
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
		enterRule(_localctx, 72, RULE_comando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(410); dec_var();
				}
				break;

			case 2:
				{
				setState(411); enquanto();
				}
				break;

			case 3:
				{
				setState(412); alteracaoValorVariavel();
				}
				break;

			case 4:
				{
				setState(413); se();
				}
				break;

			case 5:
				{
				setState(414); chamada_funcao();
				}
				break;

			case 6:
				{
				setState(415); faca();
				}
				break;

			case 7:
				{
				setState(416); escolha();
				}
				break;

			case 8:
				{
				setState(417); retorno();
				}
				break;

			case 9:
				{
				setState(418); para();
				}
				break;

			case 10:
				{
				setState(419); leia();
				}
				break;

			case 11:
				{
				setState(420); escreva();
				}
				break;

			case 12:
				{
				setState(421); match(LIMPA);
				setState(422); match(ABRE_PARENTESES);
				setState(423); match(FECHA_PARENTESES);
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
		enterRule(_localctx, 74, RULE_chamada_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(426); id_consumo();
				}
				break;

			case 2:
				{
				setState(427); chamada_funcao_biblioteca();
				}
				break;
			}
			setState(430); param_funcao();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 76, RULE_chamada_funcao_biblioteca);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432); id_consumo();
			setState(433); match(PONTO);
			setState(434); match(ID);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 78, RULE_param_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436); match(ABRE_PARENTESES);
			setState(437); expressao(0);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(438); match(VIRGULA);
				setState(439); expressao(0);
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(445); match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 80, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447); match(RETORNE);
			setState(448); expressao(0);
			}
		}
		catch (RecognitionException re) {
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
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public Id_consumoContext id_consumo() {
			return getRuleContext(Id_consumoContext.class,0);
		}
		public AlteracaoValorVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alteracaoValorVariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterAlteracaoValorVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitAlteracaoValorVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PortugolVisitor ) return ((PortugolVisitor<? extends T>)visitor).visitAlteracaoValorVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlteracaoValorVariavelContext alteracaoValorVariavel() throws RecognitionException {
		AlteracaoValorVariavelContext _localctx = new AlteracaoValorVariavelContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_alteracaoValorVariavel);
		try {
			setState(457);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450); atribuicao();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451); id_consumo();
				setState(452); match(INCREMENTO);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(454); id_consumo();
				setState(455); match(DECREMENTO);
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
		enterRule(_localctx, 84, RULE_atribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459); id_consumo();
			setState(460);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATRIBUICAO) | (1L << ATRIBUICAO_INCREMENTO) | (1L << ATRIBUICAO_DECREMENTO) | (1L << ATRIBUICAO_DIVISAO) | (1L << ATRIBUICAO_MULTIPLICAO) | (1L << ATRIBUICAO_MODULO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(461); expressao(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 86, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
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
		enterRule(_localctx, 88, RULE_leia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465); match(LEIA);
			setState(466); match(ABRE_PARENTESES);
			setState(467); match(ID);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(468); match(VIRGULA);
				setState(469); match(ID);
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(475); match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 90, RULE_escreva);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477); match(ESCREVA);
			setState(478); match(ABRE_PARENTESES);
			setState(479); lista_param();
			setState(480); match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
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
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
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
		enterRule(_localctx, 92, RULE_lista_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482); expressao(0);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(483); match(VIRGULA);
				setState(484); expressao(0);
				}
				}
				setState(489);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3K\u01ed\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\7"+
		"\4j\n\4\f\4\16\4m\13\4\3\5\3\5\3\5\3\5\3\5\5\5t\n\5\3\6\3\6\3\6\7\6y\n"+
		"\6\f\6\16\6|\13\6\3\7\3\7\3\7\5\7\u0081\n\7\3\7\3\7\3\b\3\b\3\b\5\b\u0088"+
		"\n\b\3\b\3\b\6\b\u008c\n\b\r\b\16\b\u008d\3\b\3\b\5\b\u0092\n\b\5\b\u0094"+
		"\n\b\3\t\3\t\3\t\7\t\u0099\n\t\f\t\16\t\u009c\13\t\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\7\13\u00a5\n\13\f\13\16\13\u00a8\13\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\7\13\u00b0\n\13\f\13\16\13\u00b3\13\13\3\13\3\13\5\13\u00b7"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u00c2\n\r\f\r\16\r\u00c5"+
		"\13\r\3\16\3\16\5\16\u00c9\n\16\3\16\3\16\3\17\3\17\3\17\5\17\u00d0\n"+
		"\17\3\17\3\17\3\17\5\17\u00d5\n\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20"+
		"\u00dd\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00ea\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0110\n\21\f\21"+
		"\16\21\u0113\13\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\7\34\u012e\n\34\f\34\16\34\u0131\13\34\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\5\36\u013c\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3!\3!\3!\5!\u014e\n!\3!\3!\7!\u0152\n!\f!\16!\u0155"+
		"\13!\3!\3!\5!\u0159\n!\3!\3!\5!\u015d\n!\3!\3!\7!\u0161\n!\f!\16!\u0164"+
		"\13!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\7#\u0174\n#\f#\16"+
		"#\u0177\13#\3#\3#\3#\3#\7#\u017d\n#\f#\16#\u0180\13#\5#\u0182\n#\3#\3"+
		"#\3$\3$\3$\3$\7$\u018a\n$\f$\16$\u018d\13$\3$\5$\u0190\n$\3%\3%\7%\u0194"+
		"\n%\f%\16%\u0197\13%\3%\3%\5%\u019b\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\5&\u01ab\n&\3\'\3\'\5\'\u01af\n\'\3\'\3\'\3(\3(\3(\3(\3)\3"+
		")\3)\3)\7)\u01bb\n)\f)\16)\u01be\13)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3+"+
		"\3+\5+\u01cc\n+\3,\3,\3,\3,\3-\3-\3.\3.\3.\3.\3.\7.\u01d9\n.\f.\16.\u01dc"+
		"\13.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\7\60\u01e8\n\60\f\60\16\60\u01eb"+
		"\13\60\3\60\2\3 \61\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^\2\f\4\2::==\3\2(*\3\2&\'\3\2>?\3\2\62\65"+
		"\3\2\66\67\3\2\21\25\4\2@@CF\4\2\16\16-\61\5\2&)\62\65\67\67\u01fd\2`"+
		"\3\2\2\2\4e\3\2\2\2\6k\3\2\2\2\bn\3\2\2\2\nz\3\2\2\2\f}\3\2\2\2\16\u0093"+
		"\3\2\2\2\20\u0095\3\2\2\2\22\u009d\3\2\2\2\24\u00b6\3\2\2\2\26\u00b8\3"+
		"\2\2\2\30\u00be\3\2\2\2\32\u00c6\3\2\2\2\34\u00cc\3\2\2\2\36\u00dc\3\2"+
		"\2\2 \u00e9\3\2\2\2\"\u0114\3\2\2\2$\u0116\3\2\2\2&\u0118\3\2\2\2(\u011a"+
		"\3\2\2\2*\u011c\3\2\2\2,\u011e\3\2\2\2.\u0120\3\2\2\2\60\u0122\3\2\2\2"+
		"\62\u0124\3\2\2\2\64\u0126\3\2\2\2\66\u0128\3\2\2\28\u0132\3\2\2\2:\u0134"+
		"\3\2\2\2<\u013d\3\2\2\2>\u0144\3\2\2\2@\u014a\3\2\2\2B\u0168\3\2\2\2D"+
		"\u016d\3\2\2\2F\u0185\3\2\2\2H\u019a\3\2\2\2J\u01aa\3\2\2\2L\u01ae\3\2"+
		"\2\2N\u01b2\3\2\2\2P\u01b6\3\2\2\2R\u01c1\3\2\2\2T\u01cb\3\2\2\2V\u01cd"+
		"\3\2\2\2X\u01d1\3\2\2\2Z\u01d3\3\2\2\2\\\u01df\3\2\2\2^\u01e4\3\2\2\2"+
		"`a\7\17\2\2ab\7\7\2\2bc\5\4\3\2cd\7\b\2\2d\3\3\2\2\2ef\5\6\4\2fg\5\n\6"+
		"\2g\5\3\2\2\2hj\5\b\5\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\7\3\2"+
		"\2\2mk\3\2\2\2no\7!\2\2op\7\"\2\2ps\7G\2\2qr\7H\2\2rt\7G\2\2sq\3\2\2\2"+
		"st\3\2\2\2t\t\3\2\2\2uy\5\34\17\2vy\5\22\n\2wy\5\26\f\2xu\3\2\2\2xv\3"+
		"\2\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\13\3\2\2\2|z\3\2\2\2}"+
		"\u0080\7\t\2\2~\u0081\7@\2\2\177\u0081\5\66\34\2\u0080~\3\2\2\2\u0080"+
		"\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7\n\2"+
		"\2\u0083\r\3\2\2\2\u0084\u0087\7G\2\2\u0085\u0086\7\16\2\2\u0086\u0088"+
		"\5 \21\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0094\3\2\2\2\u0089"+
		"\u008b\7G\2\2\u008a\u008c\5\f\7\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u0090\7\16\2\2\u0090\u0092\5\24\13\2\u0091\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0084\3\2\2\2\u0093\u0089\3\2\2\2\u0094"+
		"\17\3\2\2\2\u0095\u009a\5\16\b\2\u0096\u0097\7\6\2\2\u0097\u0099\5\16"+
		"\b\2\u0098\u0096\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\21\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\5\64\33"+
		"\2\u009e\u009f\5\20\t\2\u009f\23\3\2\2\2\u00a0\u00a1\7\7\2\2\u00a1\u00a6"+
		"\5\24\13\2\u00a2\u00a3\7\6\2\2\u00a3\u00a5\5\24\13\2\u00a4\u00a2\3\2\2"+
		"\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\b\2\2\u00aa\u00b7\3\2\2\2\u00ab"+
		"\u00ac\7\7\2\2\u00ac\u00b1\58\35\2\u00ad\u00ae\7\6\2\2\u00ae\u00b0\58"+
		"\35\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\b"+
		"\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00a0\3\2\2\2\u00b6\u00ab\3\2\2\2\u00b7"+
		"\25\3\2\2\2\u00b8\u00b9\7\31\2\2\u00b9\u00ba\5\64\33\2\u00ba\u00bb\7G"+
		"\2\2\u00bb\u00bc\7\16\2\2\u00bc\u00bd\58\35\2\u00bd\27\3\2\2\2\u00be\u00c3"+
		"\5\32\16\2\u00bf\u00c0\7\6\2\2\u00c0\u00c2\5\32\16\2\u00c1\u00bf\3\2\2"+
		"\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\31"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c8\5\64\33\2\u00c7\u00c9\7;\2\2"+
		"\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb"+
		"\7G\2\2\u00cb\33\3\2\2\2\u00cc\u00cf\7\32\2\2\u00cd\u00d0\5\64\33\2\u00ce"+
		"\u00d0\7\20\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3"+
		"\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7G\2\2\u00d2\u00d4\7\f\2\2\u00d3"+
		"\u00d5\5\30\r\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3"+
		"\2\2\2\u00d6\u00d7\7\r\2\2\u00d7\u00d8\5H%\2\u00d8\35\3\2\2\2\u00d9\u00dd"+
		"\5\66\34\2\u00da\u00dd\58\35\2\u00db\u00dd\5L\'\2\u00dc\u00d9\3\2\2\2"+
		"\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\37\3\2\2\2\u00de\u00df"+
		"\b\21\1\2\u00df\u00e0\t\2\2\2\u00e0\u00e1\7\f\2\2\u00e1\u00e2\5 \21\2"+
		"\u00e2\u00e3\7\r\2\2\u00e3\u00ea\3\2\2\2\u00e4\u00ea\5\36\20\2\u00e5\u00e6"+
		"\7\f\2\2\u00e6\u00e7\5 \21\2\u00e7\u00e8\7\r\2\2\u00e8\u00ea\3\2\2\2\u00e9"+
		"\u00de\3\2\2\2\u00e9\u00e4\3\2\2\2\u00e9\u00e5\3\2\2\2\u00ea\u0111\3\2"+
		"\2\2\u00eb\u00ec\f\r\2\2\u00ec\u00ed\5\"\22\2\u00ed\u00ee\5 \21\16\u00ee"+
		"\u0110\3\2\2\2\u00ef\u00f0\f\f\2\2\u00f0\u00f1\5$\23\2\u00f1\u00f2\5 "+
		"\21\r\u00f2\u0110\3\2\2\2\u00f3\u00f4\f\13\2\2\u00f4\u00f5\5&\24\2\u00f5"+
		"\u00f6\5 \21\f\u00f6\u0110\3\2\2\2\u00f7\u00f8\f\n\2\2\u00f8\u00f9\5("+
		"\25\2\u00f9\u00fa\5 \21\13\u00fa\u0110\3\2\2\2\u00fb\u00fc\f\t\2\2\u00fc"+
		"\u00fd\5*\26\2\u00fd\u00fe\5 \21\n\u00fe\u0110\3\2\2\2\u00ff\u0100\f\b"+
		"\2\2\u0100\u0101\5,\27\2\u0101\u0102\5 \21\t\u0102\u0110\3\2\2\2\u0103"+
		"\u0104\f\7\2\2\u0104\u0105\5.\30\2\u0105\u0106\5 \21\b\u0106\u0110\3\2"+
		"\2\2\u0107\u0108\f\6\2\2\u0108\u0109\5\60\31\2\u0109\u010a\5 \21\7\u010a"+
		"\u0110\3\2\2\2\u010b\u010c\f\5\2\2\u010c\u010d\5\62\32\2\u010d\u010e\5"+
		" \21\6\u010e\u0110\3\2\2\2\u010f\u00eb\3\2\2\2\u010f\u00ef\3\2\2\2\u010f"+
		"\u00f3\3\2\2\2\u010f\u00f7\3\2\2\2\u010f\u00fb\3\2\2\2\u010f\u00ff\3\2"+
		"\2\2\u010f\u0103\3\2\2\2\u010f\u0107\3\2\2\2\u010f\u010b\3\2\2\2\u0110"+
		"\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112!\3\2\2\2"+
		"\u0113\u0111\3\2\2\2\u0114\u0115\t\3\2\2\u0115#\3\2\2\2\u0116\u0117\t"+
		"\4\2\2\u0117%\3\2\2\2\u0118\u0119\t\5\2\2\u0119\'\3\2\2\2\u011a\u011b"+
		"\t\6\2\2\u011b)\3\2\2\2\u011c\u011d\t\7\2\2\u011d+\3\2\2\2\u011e\u011f"+
		"\7;\2\2\u011f-\3\2\2\2\u0120\u0121\7<\2\2\u0121/\3\2\2\2\u0122\u0123\7"+
		"8\2\2\u0123\61\3\2\2\2\u0124\u0125\79\2\2\u0125\63\3\2\2\2\u0126\u0127"+
		"\t\b\2\2\u0127\65\3\2\2\2\u0128\u012f\7G\2\2\u0129\u012a\7\t\2\2\u012a"+
		"\u012b\5 \21\2\u012b\u012c\7\n\2\2\u012c\u012e\3\2\2\2\u012d\u0129\3\2"+
		"\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\67\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\t\t\2\2\u01339\3\2\2\2\u0134"+
		"\u0135\7\3\2\2\u0135\u0136\7\f\2\2\u0136\u0137\5 \21\2\u0137\u0138\7\r"+
		"\2\2\u0138\u013b\5H%\2\u0139\u013a\7 \2\2\u013a\u013c\5H%\2\u013b\u0139"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c;\3\2\2\2\u013d\u013e\7\36\2\2\u013e"+
		"\u013f\5H%\2\u013f\u0140\7\37\2\2\u0140\u0141\7\f\2\2\u0141\u0142\5 \21"+
		"\2\u0142\u0143\7\r\2\2\u0143=\3\2\2\2\u0144\u0145\7\37\2\2\u0145\u0146"+
		"\7\f\2\2\u0146\u0147\5 \21\2\u0147\u0148\7\r\2\2\u0148\u0149\5H%\2\u0149"+
		"?\3\2\2\2\u014a\u014b\7\34\2\2\u014b\u014d\7\f\2\2\u014c\u014e\5B\"\2"+
		"\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0153\3\2\2\2\u014f\u0150"+
		"\7\6\2\2\u0150\u0152\5B\"\2\u0151\u014f\3\2\2\2\u0152\u0155\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2"+
		"\2\2\u0156\u0158\7\4\2\2\u0157\u0159\5 \21\2\u0158\u0157\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\7\4\2\2\u015b\u015d\5T"+
		"+\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0162\3\2\2\2\u015e"+
		"\u015f\7\6\2\2\u015f\u0161\5T+\2\u0160\u015e\3\2\2\2\u0161\u0164\3\2\2"+
		"\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162"+
		"\3\2\2\2\u0165\u0166\7\r\2\2\u0166\u0167\5H%\2\u0167A\3\2\2\2\u0168\u0169"+
		"\5\64\33\2\u0169\u016a\7G\2\2\u016a\u016b\7\16\2\2\u016b\u016c\5 \21\2"+
		"\u016cC\3\2\2\2\u016d\u016e\7\26\2\2\u016e\u016f\7\f\2\2\u016f\u0170\5"+
		" \21\2\u0170\u0171\7\r\2\2\u0171\u0175\7\7\2\2\u0172\u0174\5F$\2\u0173"+
		"\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176\u0181\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\7\27\2\2\u0179"+
		"\u017a\7\30\2\2\u017a\u017e\7\13\2\2\u017b\u017d\5J&\2\u017c\u017b\3\2"+
		"\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0178\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182\u0183\3\2\2\2\u0183\u0184\7\b\2\2\u0184E\3\2\2\2\u0185\u0186"+
		"\7\27\2\2\u0186\u0187\58\35\2\u0187\u018b\7\13\2\2\u0188\u018a\5J&\2\u0189"+
		"\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u0190\7\35\2\2\u018f"+
		"\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190G\3\2\2\2\u0191\u0195\7\7\2\2"+
		"\u0192\u0194\5J&\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193"+
		"\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198"+
		"\u019b\7\b\2\2\u0199\u019b\5J&\2\u019a\u0191\3\2\2\2\u019a\u0199\3\2\2"+
		"\2\u019bI\3\2\2\2\u019c\u01ab\5\22\n\2\u019d\u01ab\5> \2\u019e\u01ab\5"+
		"T+\2\u019f\u01ab\5:\36\2\u01a0\u01ab\5L\'\2\u01a1\u01ab\5<\37\2\u01a2"+
		"\u01ab\5D#\2\u01a3\u01ab\5R*\2\u01a4\u01ab\5@!\2\u01a5\u01ab\5Z.\2\u01a6"+
		"\u01ab\5\\/\2\u01a7\u01a8\7%\2\2\u01a8\u01a9\7\f\2\2\u01a9\u01ab\7\r\2"+
		"\2\u01aa\u019c\3\2\2\2\u01aa\u019d\3\2\2\2\u01aa\u019e\3\2\2\2\u01aa\u019f"+
		"\3\2\2\2\u01aa\u01a0\3\2\2\2\u01aa\u01a1\3\2\2\2\u01aa\u01a2\3\2\2\2\u01aa"+
		"\u01a3\3\2\2\2\u01aa\u01a4\3\2\2\2\u01aa\u01a5\3\2\2\2\u01aa\u01a6\3\2"+
		"\2\2\u01aa\u01a7\3\2\2\2\u01abK\3\2\2\2\u01ac\u01af\5\66\34\2\u01ad\u01af"+
		"\5N(\2\u01ae\u01ac\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u01b1\5P)\2\u01b1M\3\2\2\2\u01b2\u01b3\5\66\34\2\u01b3\u01b4\7\5\2\2"+
		"\u01b4\u01b5\7G\2\2\u01b5O\3\2\2\2\u01b6\u01b7\7\f\2\2\u01b7\u01bc\5 "+
		"\21\2\u01b8\u01b9\7\6\2\2\u01b9\u01bb\5 \21\2\u01ba\u01b8\3\2\2\2\u01bb"+
		"\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\3\2"+
		"\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\7\r\2\2\u01c0Q\3\2\2\2\u01c1\u01c2"+
		"\7\33\2\2\u01c2\u01c3\5 \21\2\u01c3S\3\2\2\2\u01c4\u01cc\5V,\2\u01c5\u01c6"+
		"\5\66\34\2\u01c6\u01c7\7+\2\2\u01c7\u01cc\3\2\2\2\u01c8\u01c9\5\66\34"+
		"\2\u01c9\u01ca\7,\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01c4\3\2\2\2\u01cb\u01c5"+
		"\3\2\2\2\u01cb\u01c8\3\2\2\2\u01ccU\3\2\2\2\u01cd\u01ce\5\66\34\2\u01ce"+
		"\u01cf\t\n\2\2\u01cf\u01d0\5 \21\2\u01d0W\3\2\2\2\u01d1\u01d2\t\13\2\2"+
		"\u01d2Y\3\2\2\2\u01d3\u01d4\7#\2\2\u01d4\u01d5\7\f\2\2\u01d5\u01da\7G"+
		"\2\2\u01d6\u01d7\7\6\2\2\u01d7\u01d9\7G\2\2\u01d8\u01d6\3\2\2\2\u01d9"+
		"\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd\3\2"+
		"\2\2\u01dc\u01da\3\2\2\2\u01dd\u01de\7\r\2\2\u01de[\3\2\2\2\u01df\u01e0"+
		"\7$\2\2\u01e0\u01e1\7\f\2\2\u01e1\u01e2\5^\60\2\u01e2\u01e3\7\r\2\2\u01e3"+
		"]\3\2\2\2\u01e4\u01e9\5 \21\2\u01e5\u01e6\7\6\2\2\u01e6\u01e8\5 \21\2"+
		"\u01e7\u01e5\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea"+
		"\3\2\2\2\u01ea_\3\2\2\2\u01eb\u01e9\3\2\2\2+ksxz\u0080\u0087\u008d\u0091"+
		"\u0093\u009a\u00a6\u00b1\u00b6\u00c3\u00c8\u00cf\u00d4\u00dc\u00e9\u010f"+
		"\u0111\u012f\u013b\u014d\u0153\u0158\u015c\u0162\u0175\u017e\u0181\u018b"+
		"\u018f\u0195\u019a\u01aa\u01ae\u01bc\u01cb\u01da\u01e9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}