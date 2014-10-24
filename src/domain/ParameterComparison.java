/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author Felipe
 */
public class ParameterComparison {

    private final Parameter expected;
    private final Parameter provided;

    public Parameter getExpected() {
        return expected;
    }

    public Parameter getProvided() {
        return provided;
    }

    private static Parameter getByPosition(List<Parameter> parameters, int position) {
        Optional<Parameter> parameter = parameters.stream().filter(i -> i.getParameterPosition() == position).findFirst();
        return parameter.isPresent() ? parameter.get() : null;
    }

    public static List<ParameterComparison> buildCollecetion(List<Parameter> expected, List<Parameter> provided) {
        return expected
                .stream()
                .map(i -> new ParameterComparison(i, getByPosition(provided, i.getParameterPosition())))
                .collect(Collectors.toList());
    }

    public ParameterComparison(Parameter expected, Parameter provided) {
        if (expected.getParameterPosition() != provided.getParameterPosition()) {
            throw new RuntimeException("Parâmetro de posições diferentes no construtor de ParameterComparison");
        }
        this.expected = expected;
        this.provided = provided;
    }

    public boolean areParametersValid() {
        if(expected == null || provided == null)
            return false;
        
        return expected.getType().equals(provided.getType());
    }
}
