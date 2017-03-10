package operators;

public class Cos extends UnaryOperator {

    @Override
    public double calculate(double parameters) {
        return Math.cos(parameters);
    }
}
