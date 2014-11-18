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
public interface IResolver {
    IResolver getNext();
    String resolve();
    void setNext(IResolver next);
}
