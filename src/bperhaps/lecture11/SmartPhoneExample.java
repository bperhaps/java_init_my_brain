package bperhaps.lecture11;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("google", "andriod");

        String strObject = smartPhone.toString();
        System.out.println(strObject);
    }
}
