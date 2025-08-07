package org.example.interfaces.b;

import org.example.interfaces.c.House;

public class HomeOffice implements House, Office{
    @Override
    public String getAddress() {
        return "HomeOffice - R No 1, Home";
    }
}
