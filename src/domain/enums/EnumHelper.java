/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.enums;

import domain.Tipos;

/**
 *
 * @author Felipe
 */
public class EnumHelper {

    public static Tipo TipoFromString(String tipo) {
        switch (tipo) {
            case Tipos.CADEIA:
                return Tipo.cadeia;
            case Tipos.CARACTER:
                return Tipo.caracter;
            case Tipos.INTEIRO:
                return Tipo.inteiro;
            case Tipos.LOGICO:
                return Tipo.logico;
            case Tipos.REAL:
                return Tipo.real;
        }

        throw new RuntimeException("Tipo \"" + tipo + "\" não encontrado em \"TipoFromString\" ");
    }

    public static String asString(Tipo tipo) {
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
        }

        return null;
    }

    public static String asString(Operador operador) {

        switch (operador) {
            case aritmetico:
                return "aritmetico";
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
