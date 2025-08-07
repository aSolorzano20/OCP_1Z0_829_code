package org.example.Stream.Lambdas;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class Book2{

    private String title;
    private double price;

    public Book2(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book2: {" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}

public class FlatMapTest {

    public static void main(String[] args) {

        List<List<Book2>> books = Arrays.asList(
                Arrays.asList(
                        new Book2("Windmills of the Gods", 7.0),
                        new Book2("Tell me your dreams",9.0) ),
                Arrays.asList(
                        new Book2("There is a hippy on the highway", 5.0),
                        new Book2("Easy come easy go", 5.0)) );


        double d = books.stream()
                .flatMap(bs -> bs.stream())
                .peek(b -> System.out.println(b))
                .mapToDouble(book -> book.getPrice())
                .sum();

        System.out.println("d: " + d);
    }
}
