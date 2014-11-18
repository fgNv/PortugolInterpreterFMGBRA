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
public class AttributionResolver extends DefaultResolver {

    private final String cmd;
    
    public AttributionResolver(String cmd) {
        this.cmd = cmd;
    }
    
    @Override
    public String resolve() {
        return getNext().resolve() + " " + cmd;
    }
    
}