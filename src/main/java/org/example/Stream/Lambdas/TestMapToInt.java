package org.example.Stream.Lambdas;

import java.util.Arrays;
import java.util.List;

public class TestMapToInt {

    public static void main(String[] args) {

        List<Person> friends = Arrays.asList(new Person("Bob", 31),
                new Person("Paul", 32),
                new Person("John", 33));

        double averageAge = friends.stream().filter(f->f.getAge()<35)
                .mapToInt(f -> f.getAge())
                .peek(p -> System.out.println("p:" + p))
                .average().getAsDouble();

        System.out.println(averageAge);

    }
}
