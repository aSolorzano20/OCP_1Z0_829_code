package org.example.nio;

import java.nio.file.Paths;

public class PathTest {

    public static void main(String[] args) {
        var p1 = Paths.get("//code//java//PathTest.java");
        System.out.println("Root: " + p1.getRoot());

        for(int i=0; 1<p1.getNameCount(); i++){
            System.out.println("Name: " + p1.getName(i));
        }

        System.out.println(p1.getName(3).toString());
    }
}
