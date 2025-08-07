package org.example.ArrayCollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDequeAdd {

    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.add(1); // [41]
        d.add(2); // [1, 2]
        d.add(3); // [1, 2, 3]
        d.addFirst(4); // [4, 1, 2, 3]

        System.out.println(d); // [4, 1, 2, 3]
        System.out.println(d.pollLast()); // 3
        System.out.println(d.pollLast()); // 2
        System.out.println(d.pollLast()); // 1

    }
}
