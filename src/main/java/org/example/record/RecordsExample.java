package org.example.record;

public class RecordsExample {

    public static void main(String[] args) {

        Persona p = new Persona("alfredo", "asa", 20);
        Persona p2 = new Persona("alfredo", "asa");

        //Persona p3 = p.clone();
        p.imprimirNombre();
        p2.imprimirNombre();

    }
}
