/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Felipe
 */
public abstract class BaseItem {
    private final StringProperty name = new SimpleStringProperty();
    private final StringProperty type = new SimpleStringProperty();
    private final BooleanProperty isUsed = new SimpleBooleanProperty();
    private final BooleanProperty isVector = new SimpleBooleanProperty();
    private final BooleanProperty isMatrix = new SimpleBooleanProperty();

    public String getName() {
        return name.get();
    }

    public void setName(String fName) {
        name.set(fName);
    }

    public String getType() {
        return type.get();
    }

    public void setType(String fName) {
        type.set(fName);
    }
    
    public void setIsUsed(boolean isUsed){
        this.isUsed.set(isUsed);
    }
    
    public boolean getIsUsed(){
        return this.isUsed.get();
    }
    
    public void setIsMatrix(boolean isMatrix){
        this.isMatrix.set(isMatrix);
    }
    
    public boolean getIsMatrix(){
        return this.isMatrix.get();
    }
    
    public void setIsVector(boolean isVector){
        this.isVector.set(isVector);
    }
    
    public boolean getIsVector(){
        return this.isVector.get();
    }
}
