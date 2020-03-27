package bperhaps.lecture9;

public class Anonymous2Example {
    public static void main(String[] args) {
        Anonymous2 anonymous2 = new Anonymous2();

        anonymous2.field.turnOn();

        anonymous2.method1();

        anonymous2.method2(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("SmartTV를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("SmartTV를 끕니다.");
            }
        });
    }
}
