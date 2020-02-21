package bperhaps.lecture6;

import java.util.Calendar;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;
    int speed;
    int gas;
    boolean stop;

    Car() {}

    Car(String model) {
        this(model, "은색", 250);
    }

    Car(String model, String color) {
        this(model, color, 250);
    }

    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    int getSpped() {
        return speed;
    }

    void keyTurnOn() {
        System.out.println("키를 돌립니다.");
    }

    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if(gas == 0){
            System.out.println("gas가 없습니다.");
            return false;
        }

        System.out.println("gas가 있습니다.");
        return true;
    }

    public void setSpeed(int speed) {
        if(speed < 0) {
            this.speed = 0;
            return;
        }
        this.speed = speed;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        this.speed = 0;
    }

    void run() {
        /*while(true) {
            if(gas > 0) {
                System.out.println("달립니다. (gas잔량 :" + gas + ")");
                gas--;
            } else {
                System.out.println("멈춥니다. (gas잔량 : "+ gas + ")");
                return;
            }
        }*/

        for(int i=10; i<=50; i+=10) {
            setSpeed(i);
            System.out.println("달립니다.(시속:"+ this.speed +"km/h");        }
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.speed = 60;
        myCar.run();
    }
}
