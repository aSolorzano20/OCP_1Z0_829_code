package org.example.ArrayCollections;

public class ArrayExample1 {

    public static void main(String[] args) {

        int[] array1D = {0, 1, 2, 3, 4, 5};
        for (int i = 0; i < array1D.length; i++){
            System.out.println("array1D["+i+"]: " + array1D[i]);
        }

        System.out.println();
        int[][] array2D = {{0, 1}, {2, 3}, {4, 5}};
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.println("array2D["+i+"]["+j+"]: " + array2D[i][j]);
            }
        }

        System.out.println();
        int[][][] array3D = {{{0, 1}, {2, 3}, {4, 5}}};

        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    System.out.println("array3D["+i+"]["+j+"]["+k+"]: " + array3D[i][j][k]);
                }

            }
        }

        System.out.println();
        System.out.println("Tamaño array3D: " + array3D.length);
    }
}
