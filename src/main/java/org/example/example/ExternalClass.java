package org.example.example;

public class ExternalClass {

    private int a =5;
    private static String gretting = "Hola";

    private static class InnerClass {

        private void metodoInnerClass(){
            System.out.println("a: " + gretting);
        }

    }



}
