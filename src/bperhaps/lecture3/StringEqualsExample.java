package bperhaps.lecture3;

public class StringEqualsExample {
    public static void main(String args[]) {
        String strVar1 = "손민성";
        String strVar2 = "손민성";
        String strVar3 = new String("손민성");

        System.out.println( strVar1 == strVar2 );
        System.out.println( strVar1 == strVar3 );
        System.out.println();
        System.out.println( strVar1.equals(strVar2) );
        System.out.println( strVar1.equals(strVar2) );


    }
}
