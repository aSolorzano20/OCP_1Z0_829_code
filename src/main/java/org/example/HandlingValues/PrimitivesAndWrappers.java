package org.example.HandlingValues;

public class PrimitivesAndWrappers {

    public static void main(String[] args) {
        char a = 'a', b = 98; //1
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();

        int a1 = a; //2
        int b1 = (int) b; //3
        int z1 = 'z';

        System.out.println("a1 = " + a1);
        System.out.println("b2 = " + b1);
        System.out.println("c1 = " + z1);

        System.out.println();
        System.out.println((char)a1+(char)b1); //4
    }
}
