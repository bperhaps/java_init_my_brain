package bperhaps.lecture6.package1;

import bperhaps.lecture6.A;

public class C {
    A a1 = new A(true); //public
    //A a2 = new A(1);    //default
    //A a3 = new A("문자열");    //private

    public C() {
        A a = new A();
        a.field1 = 1;
        //a.field2 = 1;//default
        //a.field3 = 1;//private

        a.method1();
        //a.method2();//default
        //a.method3();//private

    }
}
