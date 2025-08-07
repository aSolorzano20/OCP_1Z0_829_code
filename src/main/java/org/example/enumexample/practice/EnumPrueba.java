package org.example.enumexample.practice;

import java.util.Arrays;

public class EnumPrueba {

    public static void main(String[] args) {

        Session winter = Session.valueOf("FALL");
        System.out.println(winter);

        System.out.println();
        Arrays.stream(Session.values()).forEach(System.out::println);

    }
}
