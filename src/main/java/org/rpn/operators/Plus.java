package org.rpn.operators;

public class Plus extends BinaryOperator {

    @Override
    public void setPriority(int priority) {
        super.setPriority(2);
    }

    @Override
    public double calculate(double firstValue, double secondValue) {
        return 0;
    }
}
