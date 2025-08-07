package org.example.example;

import java.util.List;

public class GenericosExample {

    public static void main(String[] args) {


    }


    public static <E extends CharSequence> List<? super E> doIt(List<E> nums) {

        return List.of("a", "b", "c");

    }


}
