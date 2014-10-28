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

    public final List<Variable> variables;
    public final List<Function> functions;
    public final List<Parameter> parameters;
    public final List<String> errors;
    public final List<String> warnings;

    public Symbols(List<Variable> variables, List<Function> functions, List<Parameter> parameters, List<String> errors, List<String> warnings) {
        this.variables = variables;
        this.functions = functions;
        this.parameters = parameters;
        this.errors = errors;
        this.warnings = warnings;
    }
}
