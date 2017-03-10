package operators;


public class Subtract extends BinaryOperator {

    @Override
    public double calculate(double firstValue, double secondValue) {
        return firstValue - secondValue;
    }
}
