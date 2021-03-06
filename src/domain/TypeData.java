/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import domain.enums.EnumHelper;
import domain.enums.Operator;
import domain.enums.Type;

/**
 *
 * @author Felipe
 */
public class TypeData {

    private final Type type;
    private final boolean array;
    private final Integer dimensions;

    public TypeData(Type type, int dimensions) {
        this.type = type;
        this.array = true;
        this.dimensions = dimensions;
    }

    public TypeData(Type type) {
        this.type = type;
        this.array = false;
        this.dimensions = null;
    }

    public TypeData(String type, int dimensions) {
        this(EnumHelper.TipoFromString(type), dimensions);
    }

    public TypeData(String type) {
        this(EnumHelper.TipoFromString(type));
    }

    public int getDimensions() {
        return dimensions;
    }

    public Type getType() {
        return type;
    }

    public boolean isArray() {
        return array;
    }

    public String getDescription() {
        return EnumHelper.asString(this.getType()) + (this.isArray() ? "(vetor)" : "");
    }

    @Override
    public boolean equals(Object another) {
        if (!(another instanceof TypeData)) {
            return false;
        }

        TypeData casted = (TypeData) another;

        return this.type == casted.type && this.isArray() == casted.isArray();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

}
