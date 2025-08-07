package org.example.io;


public class ConsoleTest {

    public static void main(String[] args) {
        var c = System.console(); //1
        char[] line = c.readPassword("Please enter your pwd:"); //2
        System.out.println("Pwd is "+new String(line));
    }
}
