package bperhaps.lecture11;

import java.util.Arrays;

public class SearchExample {
    public static void main(String args[]) {
        int[] scores = {99,97,98};
        Arrays.sort(scores);
        int index = Arrays.binarySearch(scores, 99);
        System.out.println(index);

        String[] names = {"홍길동", "박동수", "김민수" };
        Arrays.sort(names);
        index = Arrays.binarySearch(names, "홍길동");
        System.out.println(index);

    }

}
