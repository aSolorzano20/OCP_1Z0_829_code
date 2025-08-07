package org.example.interfaces.c;

public interface House {
    public default String getAddress() {
        return "I House - 101 Main Str";
    }
}
