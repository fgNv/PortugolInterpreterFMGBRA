/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import Antl4GeneratedMember.PortugolParser;
import domain.enums.EnumHelper;
import domain.enums.Operator;
import domain.enums.Type;
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

    private TypeData getOperandoType(PortugolParser.OperandoContext ctx) {
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
                return listener.getParamType(idName) ;
            }

            if (listener.isThereAVariableCurrentScopeCalled(idName)) {
                return listener.getVariableType(idName);
            }

            return null;
        }

        return new TypeData(getValorConstanteType(ctx.valor_constante()));
    }

    private Operator getTipoOperador(PortugolParser.ExpressaoContext ctx) {
        if (ctx.operador_aritmetico_prioritario() != null || ctx.operador_aritmetico_secundario() != null) {
            return Operator.aritmetico;
        } else if (ctx.operador_bit() != null) {
            return Operator.bit;
        } else if (ctx.operador_comparacao_prioritario() != null || ctx.operador_comparacao_secundario() != null) {
            return Operator.comparacao;
        } else if (ctx.operador_e_binario() != null || ctx.operador_ou_binario() != null) {
            return Operator.binario;
        } else if (ctx.operador_e_logico() != null || ctx.operador_ou_logico() != null) {
            return Operator.logico;
        }else if(ctx.operador_aritmetico_secundario_concatenacao() != null){
            return Operator.aritmeticoConcatenacao;
        }

        return null;
    }

    private TypeData getTypeResult(TypeData tipoOperando, Operator operador) {
        if (tipoOperando == null || operador == null) {
            return tipoOperando;
        }
        
        if(tipoOperando.isArray()){
            listener.errors.add("Não se pode fazer operações com matrizes");
            return tipoOperando;
        }            
        
        if ((operador == Operator.aritmetico || operador == Operator.aritmeticoConcatenacao)
                && (tipoOperando.getType() == Type.inteiro || tipoOperando.getType() == Type.real)) {
            return tipoOperando;
        } else if (operador == Operator.comparacao && (tipoOperando.getType() == Type.inteiro || tipoOperando.getType() == Type.real)) {
            return new TypeData(Type.logico);
        } else if (operador == Operator.aritmeticoConcatenacao && (tipoOperando.getType() == Type.caracter || tipoOperando.getType() == Type.cadeia)) {
            return new TypeData(Type.cadeia);
        } else if (operador == Operator.logico && tipoOperando.getType() == Type.logico) {
            return new TypeData(Type.logico);
        }

        listener.errors.add("Operando \"" + tipoOperando + "\" com operador \"" + operador + "\" é uma expressão inválida");
        return null;
    }

    private TypeData getExpressionType(PortugolParser.ExpressaoContext ctx, Operator tipoOperadorArg) {
        if (ctx.operando() != null) {
            TypeData operandoType = getOperandoType(ctx.operando());
            return getTypeResult(operandoType, tipoOperadorArg);
        }
        Operator tipoOperador = getTipoOperador(ctx);

        List<TypeData> types = ctx.expressao().stream().map(e -> getExpressionType(e, tipoOperador)).collect(Collectors.toList());

        if (types.isEmpty() || types.stream().anyMatch(i -> i == null)) {
            return null;
        }

        TypeData firstType = types.get(0);
        if (types.stream().allMatch(i -> firstType.equals(i))) {
            return firstType;
        }

        if (types.stream().allMatch(i -> i.getType() == Type.cadeia || i.getType() == Type.caracter)) {
            return new TypeData(Type.cadeia);
        }

        if (types.stream().allMatch(i -> i.getType() == Type.real || i.getType() == Type.inteiro)) {
            return new TypeData(Type.real);
        }

        listener.errors.add("Expressão com tipos incompatíveis");
        return null;
    }

    public TypeData getExpressionType(PortugolParser.ExpressaoContext ctx, GatherSymbolsListener listener) {
        this.listener = listener;

        if (ctx.operando() != null) {
            TypeData operandoType = getOperandoType(ctx.operando());
            return getTypeResult(operandoType, null);
        }

        Operator tipoOperador = getTipoOperador(ctx);
        List<TypeData> types = ctx.expressao().stream().map(e -> getExpressionType(e, tipoOperador)).collect(Collectors.toList());

        if (types.isEmpty() || types.stream().anyMatch(i -> i == null)) {
            return null;
        }

        TypeData firstType = types.get(0);
        if (types.stream().allMatch(i -> firstType.equals(i))) {
            return firstType;
        }

        if (types.stream().allMatch(i -> i.getType() == Type.cadeia || i.getType() == Type.caracter)) {
            return new TypeData(Type.cadeia);
        }

        if (types.stream().allMatch(i -> i.getType() == Type.real || i.getType() == Type.inteiro)) {
            return new TypeData(Type.real);
        }

        listener.errors.add("Expressão com tipos incompatíveis");
        return null;
    }
}
