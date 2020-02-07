package com.tw.university;

import java.util.Objects;

public class Book {
    public final String name;
    public final String author;
    public final int publishedYear;

    public Book(String name, String Author, int publishedYear){
        this.name = name;
        author = Author;
        this.publishedYear = publishedYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishedYear == book.publishedYear &&
                Objects.equals(name, book.name) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publishedYear);
    }
}
