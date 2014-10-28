// Generated from C:\Projects\PortugolInterpreterFMGBRA\src\Portugol.g4 by ANTLR 4.2.2
package Antl4GeneratedMember;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PortugolParser}.
 */
public interface PortugolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PortugolParser#dec_var}.
	 * @param ctx the parse tree
	 */
	void enterDec_var(@NotNull PortugolParser.Dec_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#dec_var}.
	 * @param ctx the parse tree
	 */
	void exitDec_var(@NotNull PortugolParser.Dec_varContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull PortugolParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull PortugolParser.TipoContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(@NotNull PortugolParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(@NotNull PortugolParser.BlocoContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull PortugolParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull PortugolParser.ProgramaContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(@NotNull PortugolParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(@NotNull PortugolParser.ExpressaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(@NotNull PortugolParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(@NotNull PortugolParser.DeclaracoesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#dec_constante}.
	 * @param ctx the parse tree
	 */
	void enterDec_constante(@NotNull PortugolParser.Dec_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#dec_constante}.
	 * @param ctx the parse tree
	 */
	void exitDec_constante(@NotNull PortugolParser.Dec_constanteContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#caso}.
	 * @param ctx the parse tree
	 */
	void enterCaso(@NotNull PortugolParser.CasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#caso}.
	 * @param ctx the parse tree
	 */
	void exitCaso(@NotNull PortugolParser.CasoContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#operador_ou_logico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_ou_logico(@NotNull PortugolParser.Operador_ou_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#operador_ou_logico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_ou_logico(@NotNull PortugolParser.Operador_ou_logicoContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#alteracaoValorVariavel}.
	 * @param ctx the parse tree
	 */
	void enterAlteracaoValorVariavel(@NotNull PortugolParser.AlteracaoValorVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#alteracaoValorVariavel}.
	 * @param ctx the parse tree
	 */
	void exitAlteracaoValorVariavel(@NotNull PortugolParser.AlteracaoValorVariavelContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#operador_e_binario}.
	 * @param ctx the parse tree
	 */
	void enterOperador_e_binario(@NotNull PortugolParser.Operador_e_binarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#operador_e_binario}.
	 * @param ctx the parse tree
	 */
	void exitOperador_e_binario(@NotNull PortugolParser.Operador_e_binarioContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#operador_aritmetico_prioritario}.
	 * @param ctx the parse tree
	 */
	void enterOperador_aritmetico_prioritario(@NotNull PortugolParser.Operador_aritmetico_prioritarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#operador_aritmetico_prioritario}.
	 * @param ctx the parse tree
	 */
	void exitOperador_aritmetico_prioritario(@NotNull PortugolParser.Operador_aritmetico_prioritarioContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(@NotNull PortugolParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(@NotNull PortugolParser.CorpoContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(@NotNull PortugolParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(@NotNull PortugolParser.AtribuicaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#operador_ou_binario}.
	 * @param ctx the parse tree
	 */
	void enterOperador_ou_binario(@NotNull PortugolParser.Operador_ou_binarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#operador_ou_binario}.
	 * @param ctx the parse tree
	 */
	void exitOperador_ou_binario(@NotNull PortugolParser.Operador_ou_binarioContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#escreva}.
	 * @param ctx the parse tree
	 */
	void enterEscreva(@NotNull PortugolParser.EscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#escreva}.
	 * @param ctx the parse tree
	 */
	void exitEscreva(@NotNull PortugolParser.EscrevaContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#dec_funcao}.
	 * @param ctx the parse tree
	 */
	void enterDec_funcao(@NotNull PortugolParser.Dec_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#dec_funcao}.
	 * @param ctx the parse tree
	 */
	void exitDec_funcao(@NotNull PortugolParser.Dec_funcaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#bibliotecas}.
	 * @param ctx the parse tree
	 */
	void enterBibliotecas(@NotNull PortugolParser.BibliotecasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#bibliotecas}.
	 * @param ctx the parse tree
	 */
	void exitBibliotecas(@NotNull PortugolParser.BibliotecasContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#contador_para}.
	 * @param ctx the parse tree
	 */
	void enterContador_para(@NotNull PortugolParser.Contador_paraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#contador_para}.
	 * @param ctx the parse tree
	 */
	void exitContador_para(@NotNull PortugolParser.Contador_paraContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#operador_aritmetico_secundario_concatenacao}.
	 * @param ctx the parse tree
	 */
	void enterOperador_aritmetico_secundario_concatenacao(@NotNull PortugolParser.Operador_aritmetico_secundario_concatenacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#operador_aritmetico_secundario_concatenacao}.
	 * @param ctx the parse tree
	 */
	void exitOperador_aritmetico_secundario_concatenacao(@NotNull PortugolParser.Operador_aritmetico_secundario_concatenacaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#itemParamVetor}.
	 * @param ctx the parse tree
	 */
	void enterItemParamVetor(@NotNull PortugolParser.ItemParamVetorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#itemParamVetor}.
	 * @param ctx the parse tree
	 */
	void exitItemParamVetor(@NotNull PortugolParser.ItemParamVetorContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#escolha}.
	 * @param ctx the parse tree
	 */
	void enterEscolha(@NotNull PortugolParser.EscolhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#escolha}.
	 * @param ctx the parse tree
	 */
	void exitEscolha(@NotNull PortugolParser.EscolhaContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(@NotNull PortugolParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(@NotNull PortugolParser.DimensaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(@NotNull PortugolParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(@NotNull PortugolParser.OperadorContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#decSingleVar}.
	 * @param ctx the parse tree
	 */
	void enterDecSingleVar(@NotNull PortugolParser.DecSingleVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#decSingleVar}.
	 * @param ctx the parse tree
	 */
	void exitDecSingleVar(@NotNull PortugolParser.DecSingleVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#decVetor}.
	 * @param ctx the parse tree
	 */
	void enterDecVetor(@NotNull PortugolParser.DecVetorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#decVetor}.
	 * @param ctx the parse tree
	 */
	void exitDecVetor(@NotNull PortugolParser.DecVetorContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#lista_param}.
	 * @param ctx the parse tree
	 */
	void enterLista_param(@NotNull PortugolParser.Lista_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#lista_param}.
	 * @param ctx the parse tree
	 */
	void exitLista_param(@NotNull PortugolParser.Lista_paramContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#id_consumo}.
	 * @param ctx the parse tree
	 */
	void enterId_consumo(@NotNull PortugolParser.Id_consumoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#id_consumo}.
	 * @param ctx the parse tree
	 */
	void exitId_consumo(@NotNull PortugolParser.Id_consumoContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto(@NotNull PortugolParser.EnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto(@NotNull PortugolParser.EnquantoContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#biblioteca}.
	 * @param ctx the parse tree
	 */
	void enterBiblioteca(@NotNull PortugolParser.BibliotecaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#biblioteca}.
	 * @param ctx the parse tree
	 */
	void exitBiblioteca(@NotNull PortugolParser.BibliotecaContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#operador_bit}.
	 * @param ctx the parse tree
	 */
	void enterOperador_bit(@NotNull PortugolParser.Operador_bitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#operador_bit}.
	 * @param ctx the parse tree
	 */
	void exitOperador_bit(@NotNull PortugolParser.Operador_bitContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#itemParamVar}.
	 * @param ctx the parse tree
	 */
	void enterItemParamVar(@NotNull PortugolParser.ItemParamVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#itemParamVar}.
	 * @param ctx the parse tree
	 */
	void exitItemParamVar(@NotNull PortugolParser.ItemParamVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#dec_lista_param}.
	 * @param ctx the parse tree
	 */
	void enterDec_lista_param(@NotNull PortugolParser.Dec_lista_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#dec_lista_param}.
	 * @param ctx the parse tree
	 */
	void exitDec_lista_param(@NotNull PortugolParser.Dec_lista_paramContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#operador_e_logico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_e_logico(@NotNull PortugolParser.Operador_e_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#operador_e_logico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_e_logico(@NotNull PortugolParser.Operador_e_logicoContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#se}.
	 * @param ctx the parse tree
	 */
	void enterSe(@NotNull PortugolParser.SeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#se}.
	 * @param ctx the parse tree
	 */
	void exitSe(@NotNull PortugolParser.SeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#operador_aritmetico_secundario}.
	 * @param ctx the parse tree
	 */
	void enterOperador_aritmetico_secundario(@NotNull PortugolParser.Operador_aritmetico_secundarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#operador_aritmetico_secundario}.
	 * @param ctx the parse tree
	 */
	void exitOperador_aritmetico_secundario(@NotNull PortugolParser.Operador_aritmetico_secundarioContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(@NotNull PortugolParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(@NotNull PortugolParser.ParaContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#operador_comparacao_secundario}.
	 * @param ctx the parse tree
	 */
	void enterOperador_comparacao_secundario(@NotNull PortugolParser.Operador_comparacao_secundarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#operador_comparacao_secundario}.
	 * @param ctx the parse tree
	 */
	void exitOperador_comparacao_secundario(@NotNull PortugolParser.Operador_comparacao_secundarioContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(@NotNull PortugolParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(@NotNull PortugolParser.ComandoContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(@NotNull PortugolParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(@NotNull PortugolParser.Valor_constanteContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#param_funcao}.
	 * @param ctx the parse tree
	 */
	void enterParam_funcao(@NotNull PortugolParser.Param_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#param_funcao}.
	 * @param ctx the parse tree
	 */
	void exitParam_funcao(@NotNull PortugolParser.Param_funcaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#leia}.
	 * @param ctx the parse tree
	 */
	void enterLeia(@NotNull PortugolParser.LeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#leia}.
	 * @param ctx the parse tree
	 */
	void exitLeia(@NotNull PortugolParser.LeiaContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#operador_comparacao_prioritario}.
	 * @param ctx the parse tree
	 */
	void enterOperador_comparacao_prioritario(@NotNull PortugolParser.Operador_comparacao_prioritarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#operador_comparacao_prioritario}.
	 * @param ctx the parse tree
	 */
	void exitOperador_comparacao_prioritario(@NotNull PortugolParser.Operador_comparacao_prioritarioContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#operando}.
	 * @param ctx the parse tree
	 */
	void enterOperando(@NotNull PortugolParser.OperandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#operando}.
	 * @param ctx the parse tree
	 */
	void exitOperando(@NotNull PortugolParser.OperandoContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(@NotNull PortugolParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(@NotNull PortugolParser.RetornoContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#inicializacao_vetor}.
	 * @param ctx the parse tree
	 */
	void enterInicializacao_vetor(@NotNull PortugolParser.Inicializacao_vetorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#inicializacao_vetor}.
	 * @param ctx the parse tree
	 */
	void exitInicializacao_vetor(@NotNull PortugolParser.Inicializacao_vetorContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#faca}.
	 * @param ctx the parse tree
	 */
	void enterFaca(@NotNull PortugolParser.FacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#faca}.
	 * @param ctx the parse tree
	 */
	void exitFaca(@NotNull PortugolParser.FacaContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#lista_var}.
	 * @param ctx the parse tree
	 */
	void enterLista_var(@NotNull PortugolParser.Lista_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#lista_var}.
	 * @param ctx the parse tree
	 */
	void exitLista_var(@NotNull PortugolParser.Lista_varContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#chamada_funcao}.
	 * @param ctx the parse tree
	 */
	void enterChamada_funcao(@NotNull PortugolParser.Chamada_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#chamada_funcao}.
	 * @param ctx the parse tree
	 */
	void exitChamada_funcao(@NotNull PortugolParser.Chamada_funcaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link PortugolParser#chamada_funcao_biblioteca}.
	 * @param ctx the parse tree
	 */
	void enterChamada_funcao_biblioteca(@NotNull PortugolParser.Chamada_funcao_bibliotecaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortugolParser#chamada_funcao_biblioteca}.
	 * @param ctx the parse tree
	 */
	void exitChamada_funcao_biblioteca(@NotNull PortugolParser.Chamada_funcao_bibliotecaContext ctx);
}