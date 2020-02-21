package bperhaps.lecture6;

public class CarExample {
    public static void main(String[] args) {
        /*Car myCar = new Car();

        System.out.println("제작회사: " + myCar.company);
        System.out.println("모델명: " + myCar.model);
        System.out.println("색깔: " + myCar.color);
        System.out.println("최고속도: " + myCar.maxSpeed);
        System.out.println("현재속도: " + myCar.speed);


        myCar.speed = 60;
        System.out.println("현재속도: " + myCar.speed);*/

        /*Car myCar = new Car();

        myCar.setGas(5);

        boolean gasState = myCar.isLeftGas();
        if(gasState) {
            System.out.println("출발합니다.");
            myCar.run();
        }

        if(myCar.isLeftGas()) {
            System.out.println("gas를 주입할 필요가 있습니다.");
        } else {
            System.out.println("gas를 주입하세요");
        }*/

       /* Car car = new Car();
        car.keyTurnOn();
        car.run();
        int speed = car.getSpped();
        System.out.println("현재 속도: " + speed + "km/h");*/

       /*Car myCar = new Car("포르쉐");
       Car yourCar = new Car("벤츠");

       myCar.run();
       yourCar.run();*/

       Car myCar = new Car();
       myCar.setSpeed(-50);

       System.out.println("현재 속도: " + myCar.getSpped());

       myCar.setSpeed(60);

       if(!myCar.isStop()) {
           myCar.setStop(true);
       }

       System.out.println("현재 속도: "+ myCar.getSpped());
    }
}
