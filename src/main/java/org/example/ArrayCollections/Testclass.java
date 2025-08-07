package org.example.ArrayCollections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Testclass {

    public static void main(String[] args) {

        NavigableMap<String, String> mymap = new TreeMap<String, String>();
        mymap.put("a", "apple");
        mymap.put("b", "boy");
        mymap.put("c", "cat");
        mymap.put("aa", "apple1");
        mymap.put("bb", "boy1");
        mymap.put("cc", "cat1");

        System.out.println("My Map: " +  mymap);

        System.out.println(mymap.pollLastEntry()); // cc
        System.out.println(mymap.pollFirstEntry()); // a
        System.out.println("My Map: " +  mymap);

        NavigableMap<String, String> tailmap = mymap.tailMap("bb", false);
        System.out.println("Tail Map: " +  tailmap);

        System.out.println(tailmap.pollFirstEntry()); // bb
    }
}
