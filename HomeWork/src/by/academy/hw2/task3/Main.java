package by.academy.hw2.task3;

public class Main {

    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        float result;  //4.1 + 15 * 7 + (28 / 5) ^2  сначала возводив в степень (28 / 5)  затем умножение 15 * 7 затем складываем
        result = (float)calculator.divide(calculator.plus((calculator.plus(calculator.square(calculator.divide(28, 5),2),
                calculator.multpl(15, 7))),4.1),0.0d); // if divide 0 result same "Infinity" and if divide 0.0d same "Infinity"
        System.out.println("result with operator:");
        System.out.println(result);

        System.out.println();

        CalculatorWithMath calculator1 = new CalculatorWithMath();
        float resultWM;
        resultWM = (float)calculator1.plus((calculator1.plus(calculator1.square(calculator1.divide(28, 5),2),
                calculator1.multpl(15, 7))),4.1);
        System.out.println("result with Math");
        System.out.println(resultWM);
    }
}