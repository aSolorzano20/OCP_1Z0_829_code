package org.example.location;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocationPruebas {

    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("eeeee");
        LocalDate d = LocalDate.of(2000, 1, 1); //assume that it was Saturday on this date
        System.out.println("fecha: " + df.format(d));

    }

}
