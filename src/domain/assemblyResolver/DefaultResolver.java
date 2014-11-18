/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain.assemblyResolver;

/**
 *
 * @author Felipe
 */
public abstract class DefaultResolver implements IResolver {
    
    
    private IResolver next;
    
    @Override
    public IResolver getNext() {
        return next;
    }
    
    
    @Override
    public void setNext(IResolver next) {
        if (this.next == null) {
            this.next = next;
        } else {
            this.next.setNext(next);
        }
    }
}
