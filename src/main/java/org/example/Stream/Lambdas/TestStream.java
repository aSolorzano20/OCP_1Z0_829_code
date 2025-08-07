package org.example.Stream.Lambdas;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TestStream {

    public static void main(String[] args) {

        var books = new ArrayList<Book>(List.of(
                new Book("The Outsider", "Stephen King"),
                new Book("Becoming", "Michelle Obama" ),
                new Book("Uri", "India")));

        var bkStrm = books.stream();

        System.out.println("Stream of Books : " + books);
        System.out.println("Stream of bkStrm : " + bkStrm);

        long count = bkStrm.peek(x->x.getTitle()).count(); //2


        System.out.println("count : " + count);

        LocalDateTime dt = LocalDateTime.parse("2022-01-02T17:13:50");
        System.out.println("Date1 : " + dt.toString());
        System.out.println("Date1 : " + dt.format(java.time.format.DateTimeFormatter.ISO_DATE_TIME));
    }

}
