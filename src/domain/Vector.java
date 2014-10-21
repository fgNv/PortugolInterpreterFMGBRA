/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

/**
 *
 * @author Felipe
 */
public class Vector extends Variable {

    private int dimensions;

    public Vector(int dimensions, String name, int scope, String type, String function) {
        super(name, scope, type, function);
        this.dimensions = dimensions;
    }

    public int getDimensions() {
        return dimensions;
    }

    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }
}
