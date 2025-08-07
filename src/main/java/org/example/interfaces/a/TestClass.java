package org.example.interfaces.a;

public class TestClass implements I1, I2{
    @Override
    public void m1() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        TestClass tc = new TestClass();
        System.out.println("I1.VALUE: " + I1.VALUE);
        System.out.println("I2.VALUE: " + I2.VALUE);

        tc.m1();
    }
}
