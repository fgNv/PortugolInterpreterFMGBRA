/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import Antl4GeneratedMember.PortugolParser;
import domain.enums.EnumHelper;
import domain.enums.Operador;
import domain.enums.Tipo;
import domain.listeners.GatherSymbolsListener;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Felipe
 */
public class ExpressionTypeResolver {

    private GatherSymbolsListener listener;

    private String getValorConstanteType(PortugolParser.Valor_constanteContext ctx) {
        if (ctx.CADEIA() != null) {
            return "cadeia";
        }
        if (ctx.CARACTER() != null) {
            return "caracter";
        }
        if (ctx.INTEIRO() != null) {
            return "inteiro";
        }
        if (ctx.LOGICO() != null) {
            return "logico";
        }
        if (ctx.REAL() != null) {
            return "real";
        }

        return null;
    }

    private Tipo getOperandoType(PortugolParser.OperandoContext ctx) {
        if (ctx.chamada_funcao() != null) {

            if (ctx.chamada_funcao().chamada_funcao_biblioteca() != null) {
                throw new RuntimeException("Ainda não é possível avaliar tipo de retorno de funções de bibliotecas");
            } else {
                String funcName = ctx.chamada_funcao().id_consumo().getText();
                return listener.getFunctionType(funcName);
            }
        }

        if (ctx.id_consumo() != null) {
            String idName = ctx.id_consumo().getText();

            if (listener.isThereAParamInCurrentFunctionCalled(idName)) {
                return EnumHelper.TipoFromString(listener.getParamType(idName));
            }

            if (listener.isThereAVariableCurrentScopeCalled(idName)) {
                return EnumHelper.TipoFromString(listener.getVariableType(idName));
            }

            return null;
        }

        return EnumHelper.TipoFromString(getValorConstanteType(ctx.valor_constante()));
    }

    private Operador getTipoOperador(PortugolParser.ExpressaoContext ctx) {
        if (ctx.operador_aritmetico_prioritario() != null || ctx.operador_aritmetico_secundario() != null) {
            return Operador.aritmetico;
        } else if (ctx.operador_bit() != null) {
            return Operador.bit;
        } else if (ctx.operador_comparacao_prioritario() != null || ctx.operador_comparacao_secundario() != null) {
            return Operador.comparacao;
        } else if (ctx.operador_e_binario() != null || ctx.operador_ou_binario() != null) {
            return Operador.binario;
        } else if (ctx.operador_e_logico() != null || ctx.operador_ou_logico() != null) {
            return Operador.logico;
        }

        return null;
    }

    private Tipo getTypeResult(Tipo tipoOperando, Operador operador) {
        if (tipoOperando == null || operador == null) {
            return tipoOperando;
        }
        if ((operador == Operador.aritmetico || operador == Operador.aritmeticoConcatenacao)
                && (tipoOperando == Tipo.inteiro || tipoOperando == Tipo.real)) {
            return tipoOperando;
        } else if (operador == Operador.comparacao && (tipoOperando == Tipo.inteiro || tipoOperando == Tipo.real)) {
            return Tipo.logico;
        } else if (operador == Operador.aritmeticoConcatenacao && (tipoOperando == Tipo.caracter || tipoOperando == Tipo.cadeia)) {
            return Tipo.caracter;
        } else if (operador == Operador.logico && tipoOperando == Tipo.logico) {
            return Tipo.logico;
        }

        listener.errors.add("Operando \"" + tipoOperando + "\" com operador \"" + operador + "\" é uma expressão inválida");
        return null;
    }

    private Tipo getExpressionType(PortugolParser.ExpressaoContext ctx, Operador tipoOperadorArg) {
        if (ctx.operando() != null) {
            Tipo operandoType = getOperandoType(ctx.operando());
            return getTypeResult(operandoType, tipoOperadorArg);
        }
        Operador tipoOperador = getTipoOperador(ctx);

        List<Tipo> types = ctx.expressao().stream().map(e -> getExpressionType(e, tipoOperador)).collect(Collectors.toList());

        if (types.isEmpty() || types.stream().anyMatch(i -> i == null)) {
            return null;
        }

        Tipo firstType = types.get(0);
        if (types.stream().allMatch(i -> firstType.equals(i))) {
            return firstType;
        }

        if (types.stream().allMatch(i -> i == Tipo.cadeia || i == Tipo.caracter)) {
            return Tipo.cadeia;
        }

        if (types.stream().allMatch(i -> i == Tipo.real || i == Tipo.inteiro)) {
            return Tipo.real;
        }

        listener.errors.add("Expressão com tipos incompatíveis");
        return null;
    }

    public Tipo getExpressionType(PortugolParser.ExpressaoContext ctx, GatherSymbolsListener listener) {
        this.listener = listener;

        if (ctx.operando() != null) {
            Tipo operandoType = getOperandoType(ctx.operando());
            return getTypeResult(operandoType, null);
        }

        Operador tipoOperador = getTipoOperador(ctx);
        List<Tipo> types = ctx.expressao().stream().map(e -> getExpressionType(e, tipoOperador)).collect(Collectors.toList());

        if (types.isEmpty() || types.stream().anyMatch(i -> i == null)) {
            return null;
        }

        Tipo firstType = types.get(0);
        if (types.stream().allMatch(i -> firstType.equals(i))) {
            return firstType;
        }

        if (types.stream().allMatch(i -> i == Tipo.cadeia || i == Tipo.caracter)) {
            return Tipo.cadeia;
        }

        if (types.stream().allMatch(i -> i == Tipo.real || i == Tipo.inteiro)) {
            return Tipo.real;
        }

        listener.errors.add("Expressão com tipos incompatíveis");
        return null;
    }
}
