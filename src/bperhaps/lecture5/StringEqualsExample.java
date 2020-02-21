package bperhaps.lecture5;

public class StringEqualsExample {
    public static void main(String args[]) {
        String strVar1 = "손민성";
        String strVar2 = "손민성";

        if(strVar1 == strVar2) {
            System.out.println("strVar1과 strVar2는 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }

        if (strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }

        String strVar3 = new String("손민성");
        String strVar4 = new String("손민성");

        if(strVar3 == strVar4) {
            System.out.println("strVar1과 strVar2는 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }

        if (strVar1.equals(strVar4)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }

    }
}