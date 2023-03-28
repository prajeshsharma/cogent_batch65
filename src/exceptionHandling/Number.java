package exceptionHandling;

public class Number {
    private final int firstNumber;
    private final int secondNumber;
    private double result;

    public double getResult() {
        return result;
    }

    public Number(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void add() {
        result = firstNumber + secondNumber;
    }

    public void sub() {
        result = firstNumber - secondNumber;
    }

    public void mul() {
        result = firstNumber * secondNumber;
    }

    public void div() throws ArithmeticException {
        result = (double) firstNumber / secondNumber;
    }

}
