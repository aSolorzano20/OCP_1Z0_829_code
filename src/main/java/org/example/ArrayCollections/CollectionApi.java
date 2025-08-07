package org.example.ArrayCollections;

import java.util.ArrayList;
import java.util.List;

public class CollectionApi {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("g");
        lista.add("a");
        lista.add("f");
        lista.add("b");

        System.out.println("Lista Original: " + lista);

        lista.sort((a, b) -> b.compareTo(a));
        System.out.println("Lista Sorted: " + lista);

        
    }


}
