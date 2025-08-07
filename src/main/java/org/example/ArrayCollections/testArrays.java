package org.example.ArrayCollections;

import java.util.Arrays;

public class testArrays {

    public static void main(String[] args) {
        int[] ia1 = { 0, 1, 4, 5};
        int[] ia2 = { 0, 1, 1, 5, 6};

        int x = Arrays.compare(ia1, ia2);
        int y = Arrays.mismatch(ia1, ia2);

        System.out.println(x+" "+y);
    }
}
