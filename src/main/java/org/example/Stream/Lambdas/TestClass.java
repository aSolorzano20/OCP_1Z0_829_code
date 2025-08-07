package org.example.Stream.Lambdas;

interface Doer{
    String doIt(int x, String y);
}
public class TestClass {

    public static void main(String[] args) {

        Doer d = (a, b)->b.substring(0, a);
        Doer d2 = (int a, String b) -> b.substring(0, a);

        System.out.println(d.doIt(2, "12345"));
    }
}
