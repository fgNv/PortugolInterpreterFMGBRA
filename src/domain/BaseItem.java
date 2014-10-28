/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import domain.enums.EnumHelper;
import domain.enums.Operator;
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
    private final BooleanProperty isUsed = new SimpleBooleanProperty();
    private final TypeData typeData;

    public BaseItem(TypeData typeData) {
        this.typeData = typeData;
    }
    
    public String getName() {
        return name.get();
    }

    public void setName(String fName) {
        name.set(fName);
    }
    
    public TypeData getTypeData(){
        return this.typeData;
    }
    
    public String getType() {
        return EnumHelper.asString(typeData.getType());
    }
    
    public void setIsUsed(boolean isUsed){
        this.isUsed.set(isUsed);
    }
    
    public boolean getIsUsed(){
        return this.isUsed.get();
    }
}
