package bperhaps.lecture8;

public class RemoteContraolExample {
    public static void main(String[] args) {
        RemoteControl rc = null;
        rc = new Television();
        rc.turnOn();
        rc.setMute(true);

        rc = new Audio();
        rc.turnOn();
        rc.setMute(true);

        RemoteControl.changeBattery();


        /*RemoteControl rc2 = new RemoteControl() {

            @Override
            public void turnOn() {

            }

            @Override
            public void turnOff() {

            }

            @Override
            public void setVolume(int vloume) {

            }
        };*/
    }
}
