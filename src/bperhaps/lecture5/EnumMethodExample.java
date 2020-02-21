package bperhaps.lecture5;

public class EnumMethodExample {
    public static void main(String args[]) {
        Week today = Week.SUMDAY;
        String name = today.name();
        System.out.println(name);

        //ordinal() 메소드
        int ordinal = today.ordinal();
        System.out.println(ordinal);

        //compareTo() 메소드
        Week day1 = Week.MONDAY;
        Week day2 = Week.WEDNESDAY;

        int result1 = day1.compareTo(day2);
        int result2 = day2.compareTo(day1);

        System.out.println(result1);
        System.out.println(result2);

        //valueOf()  메소드
        if(args.length == 1) {
            String strDay = args[0];
            Week weekDay = Week.valueOf(strDay);
            if(weekDay == Week.SATURDAY || weekDay == Week.SUMDAY) {
                System.out.println("주말이군요");
            } else {
                System.out.println("평일이군요");
            }
        }

        //values() 메소드
        Week[] weeks = Week.values();
        for(Week day : weeks) {
            System.out.println(day);
        }
    }
}
