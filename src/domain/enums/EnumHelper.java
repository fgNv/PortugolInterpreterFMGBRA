/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.enums;

import domain.Types;

/**
 *
 * @author Felipe
 */
public class EnumHelper {

    public static Type TipoFromString(String tipo) {
        switch (tipo) {
            case Types.CADEIA:
                return Type.cadeia;
            case Types.CARACTER:
                return Type.caracter;
            case Types.INTEIRO:
                return Type.inteiro;
            case Types.LOGICO:
                return Type.logico;
            case Types.REAL:
                return Type.real;
            case Types.VAZIO:
                return Type.vazio;
        }

        throw new RuntimeException("Tipo \"" + tipo + "\" não encontrado em \"TipoFromString\" ");
    }

    public static String asString(Type tipo) {
        if (tipo == null) {
            return null;
        }

        switch (tipo) {
            case cadeia:
                return "cadeia";
            case caracter:
                return "caracter";
            case inteiro:
                return "inteiro";
            case logico:
                return "logico";
            case real:
                return "real";
            case vazio:
                return "vazio";
        }

        return null;
    }

    public static String asString(Operator operador) {

        switch (operador) {
            case aritmetico:
                return "aritmetico";
            case aritmeticoConcatenacao:
                return "aritmeticoConcatenacao";
            case binario:
                return "binario";
            case bit:
                return "bit";
            case comparacao:
                return "comparacao";
            case logico:
                return "logico";
        }

        return null;
    }

}
