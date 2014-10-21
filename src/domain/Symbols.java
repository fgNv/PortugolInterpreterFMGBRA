/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.List;

/**
 *
 * @author Felipe
 */
public class Symbols {

    public List<Variable> variables;
    public List<Function> functions;
    public List<Parameter> parameters;
    public List<String> errors;

    public Symbols(List<Variable> variables, List<Function> functions, List<Parameter> parameters, List<String> errors) {
        this.variables = variables;
        this.functions = functions;
        this.parameters = parameters;
        this.errors = errors;
    }
}
