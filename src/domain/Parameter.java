/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 *
 * @author Felipe
 */
public class Parameter extends Variable {

    private final BooleanProperty isReference = new SimpleBooleanProperty();
    
    private final IntegerProperty parameterPosition = new SimpleIntegerProperty();
    
    public Parameter(String name, int scope, TypeData type, String function, int parameterPosition) {
        super(name, scope, type, function);
        setParameterPosition(parameterPosition);
    }
    
    public void setIsReference(boolean isReference){
        this.isReference.set(isReference);
    }
        
    public boolean getIsReference(){
        return this.isReference.get();
    }  
        
    public final void setParameterPosition(int parameterPosition){
        this.parameterPosition.set(parameterPosition);
    }
        
    public int getParameterPosition(){
        return this.parameterPosition.get();
    }
}
