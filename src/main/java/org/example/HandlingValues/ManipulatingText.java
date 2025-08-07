package org.example.HandlingValues;

public class ManipulatingText {

    public static void main(String[] args) {

        String a = new StringBuilder("556-251-7086").substring(0, 8)+"xxxx";
        System.out.println("A: " + a);

        String b = new StringBuilder("556-251-7086").replace(8, 12, "xxxx").toString();
        System.out.println("B: " + b);

        String c = new StringBuilder("xxxx").insert(0, "556-251-7086", 0, 8).toString();
        System.out.println("C: " + c);
    }
}
