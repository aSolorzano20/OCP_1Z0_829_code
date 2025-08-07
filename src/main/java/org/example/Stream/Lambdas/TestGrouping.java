package org.example.Stream.Lambdas;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestGrouping {

    public static void main(String[] args) {

        IntStream is1 = IntStream.range(1, 3);
        //is1.forEach(i -> System.out.println("is1: " + i));

        IntStream is2 = IntStream.rangeClosed(1, 3);
        //is2.forEach(i -> System.out.println("is2: " + i));

        IntStream is3 = IntStream.concat(is1, is2);
        //is3.forEach(i -> System.out.println("is3: " + i));
        //System.out.println();

        Object val = is3.boxed().collect(Collectors.groupingBy(k->k)).get(3);
        System.out.println("Val: " + val);
    }
}
