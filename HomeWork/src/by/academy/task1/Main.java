package by.academy.task1;

public class Main {

    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        float result;  //4.1 + 15 * 7 + (28 / 5) ^2  сначала возводив в степень (28 / 5)  затем умножение 15 * 7 затем складываем
        result = (float)calculator.plus((calculator.plus(calculator.square(calculator.divide(28, 5),2),calculator.multpl(15, 7))),4.1);
        System.out.println(result);
    }
}