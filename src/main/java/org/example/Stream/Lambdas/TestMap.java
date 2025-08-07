package org.example.Stream.Lambdas;


import java.util.List;
import java.util.stream.Stream;

public class TestMap {

    public static void main(String[] args) {
        var books = List.of(new Book("The Outsider", "Stephen King"),
                new Book("The Shining", "Stephen King" ),
                new Book("Uri", "India"));

        System.out.println("Lista Original: " + books);
        Stream<Book> bookStream = books.stream();
        System.out.println("bookStream: " + bookStream);

        long count = bookStream.map(b -> b.getAutor()).distinct().count();
        System.out.println(count);

    }
}
