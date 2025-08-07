package org.example.lambdas;

import java.util.Arrays;
import java.util.List;

public class StreamTest {

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(3,4,6,9,2,5,7);
        System.out.println("1: " + ls.stream().reduce(Integer.MIN_VALUE, (a, b)->a>b?a:b)); //1
        System.out.println("2: " + ls.stream().max(Integer::max).get()); //2
        System.out.println("3: " + ls.stream().max(Integer::compare).get()); //3
        System.out.println("4: " + ls.stream().max((a, b)->a>b?a:b)); //4
    }
}
