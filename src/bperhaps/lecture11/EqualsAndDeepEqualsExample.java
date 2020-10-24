package bperhaps.lecture11;

import bperhaps.lecture7.Student;

import java.util.Objects;

public class EqualsAndDeepEqualsExample {
    public static void main(String args[]) {
        Integer[] arr1 = new Integer[] {1, 2};
        Integer[] arr2 = new Integer[] {1, 2};
        System.out.println(Objects.deepEquals(arr1, arr2));

   }
}
