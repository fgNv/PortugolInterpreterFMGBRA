/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Felipe
 */
public final class Variable {
    private final StringProperty name = new SimpleStringProperty();
    private final IntegerProperty scope = new SimpleIntegerProperty();
    private final StringProperty type= new SimpleStringProperty();
    private final StringProperty function= new SimpleStringProperty();

    public Variable(String name, int scope, String type, String function) {
        setName(name);
        setScope(scope);
        setType(type);
        setFunction(function);
    }
    
     public String getName() {
        return name.get();
    }
 
    public void setName(String fName) {
        name.set(fName);
    }
    
     public int getScope() {
        return scope.get();
    }
 
    public void setScope(int fName) {
        scope.set(fName);
    }
    
     public String getType() {
        return type.get();
    }
 
    public void setType(String fName) {
        type.set(fName);
    }
    
     public String getFunction() {
        return function.get();
    }
 
    public void setFunction(String fName) {
        function.set(fName);
    }
}
