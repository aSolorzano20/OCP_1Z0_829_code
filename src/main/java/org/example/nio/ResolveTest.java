package org.example.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest {

    public static void main(String[] args) {
        Path p1 = Paths.get("//temp//test.txt").toAbsolutePath();
        Path p2 = Paths.get("report.pdf");

        System.out.println("Resolve: " +p1.resolve(p2));
        System.out.println("Resolve: " +p2.resolve(p1));

        System.out.println();
        Path p3 = Paths.get("//temp//test.txt").toAbsolutePath();
        Path p4 = Paths.get("//temp//report.pdf").toAbsolutePath();
        System.out.println("Resolve: " +p3.resolve(p4));
        System.out.println("Resolve: " +p4.resolve(p3));
    }
}
