package org.example.ArrayCollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDequePush {

    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.push(1); // [1]
        d.push(2); // [2, 1]
        d.push(3); // [3, 2, 1]

        System.out.println("Lista: " + d); // [3, 2, 1]

        System.out.println(d.pollFirst()); // [3]
        System.out.println(d.poll()); //[2]
        System.out.println(d.pollLast()); // [1]
    }

}
