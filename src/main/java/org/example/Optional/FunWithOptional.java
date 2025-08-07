package org.example.Optional;

import java.util.Optional;

public class FunWithOptional {

    public static String getValue(){
        return null;
    }
    public static void main(String[] args) {
        Optional<String> stro = Optional.of(getValue());//1
        System.out.println(stro.isPresent());//2
        System.out.println(stro.get());//3
        System.out.println(stro.orElse(null));//4
    }

}
