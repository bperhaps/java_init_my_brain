package bperhaps.lecture5;

public class ArrayCreateByValueListExample2 {
    public static void main(String args[]) {
        int[] scores;
        scores = new int[] { 83, 90, 97};
        int sum1 = 0;
        for(int i=0; i<3; i++){
            sum1 += scores[i];
        }

        System.out.println("총합 : " + sum1);

        int sum2 = add(new int[] {93, 90, 97});
        //int sum3 = add2(93, 90, 97);
        System.out.println("총합 : " + sum2);
        System.out.println();
    }

    public static int add(int[] scores) {
        int sum = 0;
        for(int i=0; i<scores.length; i++){
            sum += scores[i];
        }
        return sum;
    }

    public static int add2(int ...scores) {
        int sum=0;
        for(int i=0; i<scores.length; i++) {
            sum += i;
        }
        return sum;
    }

}
