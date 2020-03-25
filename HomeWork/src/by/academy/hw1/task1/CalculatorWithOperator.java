package by.academy.task1;

import static java.lang.Math.pow;

public class CalculatorWithOperator {

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

//    public double square(double base, double exponent) {
//        result = Math.pow(base, exponent);
//        return result;
//    }

    public double square(double base, double exponent) {

        for (int i = 2; i <= exponent ; i++) {
            result = result*base;
        }
        return result;
    }

//    public double moduls(double a) {
//        result = Math.abs(a);
//        return result;
//    }

    public double moduls(double a) {
        if (a < 0) {
            result = a * -1;
        } else {
            result = a;
        }
        return result;
    }


    public double sqrt(double base) { //долго искал так и не понл как с помощью выданых оргументов получить корень
        result = Math.sqrt(base);
        return result;
    }

}