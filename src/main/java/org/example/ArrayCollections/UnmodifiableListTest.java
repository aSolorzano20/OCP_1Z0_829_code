package org.example.ArrayCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableListTest {

    public static void main(String[] args) {

        var numA = new Integer[]{1, 2};
        var list1 = new ArrayList<Integer>(List.of(numA));
        list1.add(null);
        System.out.println("List1: " + list1);

        var list2 = Collections.unmodifiableList(list1);
        list1.set(2, 3);
        System.out.println("List2: " + list2);


        List<List<Integer>> list3 = List.of(list1, list2);

        System.out.println("List3: "+ list3);

    }
}
