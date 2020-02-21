package bperhaps.lecture6;

public class Calculator {

    static double pi = 3.14159;

    void powerOn() {
        System.out.println("전원을 킵니다.");
    }

    static int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    static int minus(int x, int y) {return x-y;}

    double avg(int x, int y) {
        double sum = plus(x, y);
        double result = sum/2;
        return result;
    }

    double divide(int x, int y) {
        double result = x/y;
        return result;
    }

    void execute() {
        double result = avg(7, 10);
        println("실행 결과: " + result);
    }

    void println(String message) {
        System.out.println(message);
    }

    void powerOff() {
        System.out.println("전원을 킵니다.");
    }

    double areaRectangle(double width){
        return width * width;
    }

    double areaRectangle(double width, double height) {
        return width * height;
    }

}
