package org.example.ArrayCollections;

public class VarTest {

    public static void main(String[] args) {
        // var cA[][] = new char[3][]; Invalid
        var cA1 = new char[3][]; //would be valid.


        var cA2 = new String[]{"a", "b"};
        String[] cA3 = {"a", "b"};
    }
}
