package org.example.Polimorfismo;

class A1 {
    public void mA(){ };
}

class B1 extends A1 {
    public void mA(){ }
    public void mB() { }
}

class C1 extends B1 {
    public void mC(){ }
}

public class TestPolimorfismo {

    public static void main(String[] args) {
        A1 x = new B1();
        B1 y = new B1();
        B1 z = new C1();
        C1 c = new C1();

        x.mA();

        y.mA();
        y.mB();

        z.mA();
        z.mB();

        c.mC();
        c.mA();
        c.mB();
    }
}
