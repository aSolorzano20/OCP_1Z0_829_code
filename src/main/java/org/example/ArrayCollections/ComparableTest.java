package org.example.ArrayCollections;

public class ComparableTest {

    public static void main(String[] args) {

        var cin = new Comparable<Integer>() {
            public int compareTo(Integer i1) {
                return "100".compareTo(""+i1);
            }
        };

        System.out.println("Cin: " + cin.compareTo(99));
    }
}
