package org.example.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestBook {

    public static void main(String[] args) {
        var books = new ArrayList<Book>(List.of(new Book("The Outsider", "fiction"),
                new Book("Becoming", "non-fiction"),new Book("Uri", "non-fiction")));

        books.sort(Comparator.comparing(Book::getGenre)
                .thenComparing(Book::getTitle).reversed());
        System.out.println(books);
    }
}
