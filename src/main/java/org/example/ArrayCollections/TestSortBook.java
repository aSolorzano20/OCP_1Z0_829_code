package org.example.ArrayCollections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestSortBook {

    public static void main(String[] args) {
        var books = new ArrayList<Book>(List.of(
                new Book("The Outsider", "fiction"),
                new Book("Becoming", "non-fiction"),
                new Book("Uri", "non-fiction")));

        System.out.println("Lista Original: " + books);

        books.sort(Comparator.comparing(Book::getGenre).
                thenComparing(Book::getTitle).reversed());

        System.out.println("Lista Ordenada: " + books);
    }
}
