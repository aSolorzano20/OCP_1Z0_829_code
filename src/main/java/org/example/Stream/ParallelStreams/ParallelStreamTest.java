package org.example.Stream.ParallelStreams;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamTest {

    public static void main(String[] args) {
        Character[] ca = { 'b', 'c', 'a', 'e', 'd' };
        List<Character> l = Arrays.asList(ca);
        l.parallelStream().peek(System.out::print).forEachOrdered(System.out::print);
    }
}
