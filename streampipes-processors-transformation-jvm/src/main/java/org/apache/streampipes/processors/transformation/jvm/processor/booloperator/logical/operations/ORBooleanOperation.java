package org.apache.streampipes.processors.transformation.jvm.processor.booloperator.logical.operations;

public class ORBooleanOperation implements IBoolOperation<Boolean> {
    @Override
    public Boolean evaluate(Boolean operand, Boolean otherOperand) {
        return operand || otherOperand;
    }
}
