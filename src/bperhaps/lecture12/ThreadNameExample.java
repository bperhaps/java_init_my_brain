package bperhaps.lecture12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ThreadNameExample {

    static class A {
        static ArrayList<Integer> a = new ArrayList();
        static Map<Integer, Integer> b = new HashMap();
        public static void test() {
         //   synchronized (a) {
                b.put(1, 1);
         //   }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for(int i=0; i<1000000000; i++)
                A.test();
        });
        Thread thread2 = new Thread(() -> {
            for(int i=0; i<1000000000; i++)
                A.test();
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();


    }
}
