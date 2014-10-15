// Generated from C:\Projects\PortugolInterpreterFMGBRA\src\Portugol.g4 by ANTLR 4.2.2
package Antl4GeneratedMember;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PortugolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PortugolVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PortugolParser#lista_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_param(@NotNull PortugolParser.Lista_paramContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#dec_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_var(@NotNull PortugolParser.Dec_varContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(@NotNull PortugolParser.TipoContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#enquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnquanto(@NotNull PortugolParser.EnquantoContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#biblioteca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBiblioteca(@NotNull PortugolParser.BibliotecaContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(@NotNull PortugolParser.BlocoContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(@NotNull PortugolParser.ProgramaContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(@NotNull PortugolParser.ExpressaoContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#dec_lista_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_lista_param(@NotNull PortugolParser.Dec_lista_paramContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(@NotNull PortugolParser.DeclaracoesContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#item_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_var(@NotNull PortugolParser.Item_varContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#dec_constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_constante(@NotNull PortugolParser.Dec_constanteContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#se}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSe(@NotNull PortugolParser.SeContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(@NotNull PortugolParser.ParaContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#caso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaso(@NotNull PortugolParser.CasoContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#alteracaoValorVariavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlteracaoValorVariavel(@NotNull PortugolParser.AlteracaoValorVariavelContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(@NotNull PortugolParser.ComandoContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull PortugolParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(@NotNull PortugolParser.CorpoContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(@NotNull PortugolParser.AtribuicaoContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#leia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeia(@NotNull PortugolParser.LeiaContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#dec_item_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_item_param(@NotNull PortugolParser.Dec_item_paramContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#escreva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscreva(@NotNull PortugolParser.EscrevaContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#dec_funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_funcao(@NotNull PortugolParser.Dec_funcaoContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#bibliotecas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBibliotecas(@NotNull PortugolParser.BibliotecasContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#contador_para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContador_para(@NotNull PortugolParser.Contador_paraContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#operando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperando(@NotNull PortugolParser.OperandoContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#escolha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscolha(@NotNull PortugolParser.EscolhaContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(@NotNull PortugolParser.RetornoContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#inicializacao_vetor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializacao_vetor(@NotNull PortugolParser.Inicializacao_vetorContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#faca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaca(@NotNull PortugolParser.FacaContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#lista_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_var(@NotNull PortugolParser.Lista_varContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#chamada_funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada_funcao(@NotNull PortugolParser.Chamada_funcaoContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#chamada_funcao_biblioteca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada_funcao_biblioteca(@NotNull PortugolParser.Chamada_funcao_bibliotecaContext ctx);

	/**
	 * Visit a parse tree produced by {@link PortugolParser#operador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador(@NotNull PortugolParser.OperadorContext ctx);
}