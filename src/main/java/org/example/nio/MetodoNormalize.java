package org.example.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class MetodoNormalize {

    public static void main(String[] args) {
        Path p1 = Paths.get("/personal/./photos/../readme.txt");
        Path p2 = p1.normalize();
        System.out.println("p2:" + p2);
    }
}
