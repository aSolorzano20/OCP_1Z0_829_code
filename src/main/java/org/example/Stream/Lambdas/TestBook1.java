package org.example.Stream.Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class Book1 {

    private int id;
    private String title;
    private String genre;
    private String author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book1(String title, String genre, String author){
        this.title = title; this.genre = genre; this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book1 book1 = (Book1) o;
        return id == book1.id
                && Objects.equals(title, book1.title)
                && Objects.equals(genre, book1.genre)
                && Objects.equals(author, book1.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, genre, author);
    }

    @Override
    public String toString() {
        return "Book1{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public static class BookFilter {
        public static boolean isFiction(Book1 b){
            return b.getGenre().equals("fiction");
        }

        public boolean hacerAlgo(){
            return true;
        }

    }

    public boolean hacerAlgo(){
        return true;
    }
}

public class TestBook1 {

    public static void main(String[] args) {

        List<Book1> books = Arrays.asList(new Book1("30 Days", "fiction", "K Larsen"),
                new Book1("Fast Food Nation", "non-fiction", "Eric Schlosser"),
                new Book1("Wired", "fiction", "D Richards"));


        System.out.println(books);



    }

    public void test1(List<Book1> books){
        books.stream()
                .filter(Book1.BookFilter::isFiction) //LINE 10
                .forEach((Book1 b) -> System.out.print(b.getTitle()+", "));
    }
}
