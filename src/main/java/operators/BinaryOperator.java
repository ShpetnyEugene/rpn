package main.java.operators;

public abstract class BinaryOperator {
    private int priority;
    private char operands_count;

    public abstract double calculate(double firstValue, double secondValue);

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public char getOperands_count() {
        return operands_count;
    }

    public void setOperands_count(char operands_count) {
        this.operands_count = operands_count;
    }
}
