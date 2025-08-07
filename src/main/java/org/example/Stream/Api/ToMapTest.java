package org.example.Stream.Api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class ToMapTest {

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Atlas Shrugged", 10.0),
                new Book("Freedom at Midnight", 5.0),
                new Book("Gone with the wind", 5.0)
        );

        Map<String, Double> bookMap = books.stream().collect(Collectors.toMap(Book::getTitle, Book::getProce));
        //System.out.println(bookMap);

        BiConsumer<String, Double> func = (a, b)->{
            if(a.startsWith("A")){
                System.out.println(b);
            }
        };

        bookMap.forEach(func);

    }
}
