package org.example.enumexample.b;

import org.example.enumexample.a.Switch;

public class TestEnum1 {

    public static void main(String[] args) {
        var s = Switch.OFF.valueOf("OFF");
        System.out.println("S: " + s);
        switch(s) {
            case OFF : System.out.println("It is off!"); break;
        }
    }
}
