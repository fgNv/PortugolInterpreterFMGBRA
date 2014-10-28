/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import domain.enums.EnumHelper;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Felipe
 */
public class Variable extends BaseItem {

    private final IntegerProperty scope = new SimpleIntegerProperty();
    private final StringProperty function = new SimpleStringProperty();
    private final BooleanProperty isInitialized = new SimpleBooleanProperty();


    public Variable(String name, int scope, TypeData type, String function) {
        super(type);
        setName(name);
        setScope(scope);
        setFunction(function);
    }

    public int getScope() {
        return scope.get();
    }

    public final void setScope(int fName) {
        scope.set(fName);
    }

    public String getFunction() {
        return function.get();
    }

    public final void setFunction(String fName) {
        function.set(fName);
    }

    public void setIsInitialized(boolean isInitialized) {
        this.isInitialized.set(isInitialized);
    }

    public boolean getIsInitialized() {
        return this.isInitialized.get();
    }

}
