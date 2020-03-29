package by.academy.hw2.task3;

public class CalculatorWithMath {

    private double result;

    public double divide(double a, double b) {
        result = a / b;
        return result;
    }

    public double multpl(double a, double b) {
        result = a * b;
        return result;
    }

    public double minus(double a, double b) {
        result = a - b;
        return result;
    }

    public double plus(double a, double b) {
        result = a + b;
        return result;
    }

    public double square(double base, double exponent) {
        result = Math.pow(base, exponent);
        return result;
    }

    public double moduls(double a) {
        result = Math.abs(a);
        return result;
    }

    public double sqrt(double base) {
        result = Math.sqrt(base);
        return result;
    }
}
