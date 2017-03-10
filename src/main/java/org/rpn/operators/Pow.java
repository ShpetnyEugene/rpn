package org.rpn.operators;

public class Pow extends BinaryOperator {

    @Override
    public double calculate(double firstValue, double secondValue) {
        return Math.pow(firstValue, secondValue);
    }
}
