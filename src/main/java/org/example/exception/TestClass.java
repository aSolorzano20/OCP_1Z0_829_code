package org.example.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

class Great {
    public void doStuff() throws FileNotFoundException {
    }
}

class Amazing extends Great {
    public void doStuff() { // throws Exception {
    }
}

public class TestClass {
    public static void main(String[] args) throws IOException{
        Great g = new Amazing();
        g.doStuff();
    }
}
