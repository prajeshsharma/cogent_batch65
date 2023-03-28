package exceptionHandling;

public class CalcAverage {
    public double avgFirstN(int n) {
        if (n <= 0) throw new IllegalArgumentException("Number must be positive");
        return (double) n * (n + 1) / 2 / n;
    }
}
