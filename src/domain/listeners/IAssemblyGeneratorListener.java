/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain.listeners;

import Antl4GeneratedMember.PortugolBaseListener;
import domain.Symbols;

/**
 *
 * @author Felipe
 */
public interface IAssemblyGeneratorListener {
    void SetSymbolTable(Symbols symbols);
    String getText();
    PortugolBaseListener getListener();
}
