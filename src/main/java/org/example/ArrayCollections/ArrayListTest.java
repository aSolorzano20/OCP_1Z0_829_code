package org.example.ArrayCollections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {

        List s1 = new ArrayList( );
        s1.add("a");
        s1.add("b");
        s1.add(1, "c");
        List s2 = new ArrayList(  s1.subList(1, 1) );
        System.out.println("s2: " + s2.isEmpty());
        s1.addAll(s2);
        System.out.println(s1);
    }
}
