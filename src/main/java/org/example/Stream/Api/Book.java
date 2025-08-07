package org.example.Stream.Api;

import java.util.Objects;

public class Book {

    private String title;
    private Double proce;

    public Book(String title, Double proce) {
        this.title = title;
        this.proce = proce;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getProce() {
        return proce;
    }

    public void setProce(Double proce) {
        this.proce = proce;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(proce, book.proce);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, proce);
    }
}
