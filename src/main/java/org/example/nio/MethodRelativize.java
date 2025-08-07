package org.example.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class MethodRelativize {

    public static void main(String[] args) {

        Path p1 = Paths.get("/personal/readme.txt");
        Path p2 = Paths.get("/index.html");

        Path p3 = p1.relativize(p2);
        System.out.println(p3);

        System.out.println(p2.relativize(p1));


    }
}
