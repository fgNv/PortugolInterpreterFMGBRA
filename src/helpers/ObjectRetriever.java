/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helpers;

import domain.BaseItem;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Felipe
 * @param <T>
 */
public class ObjectRetriever<T extends BaseItem> {
    
    public T getItemByName(String name, List<T> items){
        Optional<T> item = items.stream().filter(i -> i.getName().equals(name))
                      .findFirst();
        
        if(item.isPresent())
            return item.get();
        
        throw new RuntimeException("Item \"" + name + "\" not found at \"ObjectRetriever\" ");        
    }    
}
