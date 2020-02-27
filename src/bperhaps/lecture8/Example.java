package bperhaps.lecture8;

public class Example {
    public static void main(String[] args) {
        ImplementationC imp1 = new ImplementationC();

        InterfaceA ia = imp1;
        ia.methosA();
        System.out.println();

        InterfaceB ib = imp1;
        ib.methodB();
        System.out.println();

        InterfaceC ic = imp1;
        ic.methosA();
        ic.methodB();
        ic.methodC();
    }
}
