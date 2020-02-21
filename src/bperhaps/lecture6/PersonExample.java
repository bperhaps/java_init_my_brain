package bperhaps.lecture6;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("12356-12356", "민성");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        //p1.nation = 1;
        p1.name = "을지문덕";


    }


}
