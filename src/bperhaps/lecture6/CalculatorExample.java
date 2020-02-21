package bperhaps.lecture6;


import java.util.Calendar;

public class CalculatorExample {
    public static void main(String[] args) {
        /*Calculator myCalc = new Calculator();
        myCalc.powerOn();

        int result1 = myCalc.plus(5, 6);
        System.out.println("result1 : " + result1 );

        byte x = 10;
        byte y = 4;
        double result2  = myCalc.divide(x, y);
        System.out.println("result2 : "+ result2);
        myCalc.powerOff();*/

        /*Calculator calculator = new Calculator();
        calculator.execute();*/

        Calculator calculator = new Calculator();

        /*double result1 = calculator.areaRectangle(10);

        double result2 = calculator.areaRectangle(10, 20);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);*/

        double result1 = 10 * 10 * Calculator.pi;
        int result2 = Calculator.plus(10, 5);
        int result3= Calculator.minus(10, 5);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);


    }
}
