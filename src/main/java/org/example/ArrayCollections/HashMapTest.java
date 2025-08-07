package org.example.ArrayCollections;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapTest {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put(null, null);
        System.out.println(map);

        System.out.println();
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("null", 0);
        System.out.println(table);

    }
}
