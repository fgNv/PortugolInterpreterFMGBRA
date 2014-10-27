/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import domain.enums.Tipo;

/**
 *
 * @author Felipe
 */
public class OperandoTipoResult {

    private final Tipo tipo;
    private final boolean isArray;

    public Tipo getTipo() {
        return tipo;
    }

    public boolean getIsArray() {
        return isArray;
    }

    public OperandoTipoResult(Tipo tipo, boolean isArray) {
        this.tipo = tipo;
        this.isArray = isArray;
    }
}
