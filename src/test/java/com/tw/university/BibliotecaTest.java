package com.tw.university;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BibliotecaTest {
    ArrayList<Book> books;
    private Biblioteca biblioteca;

    @BeforeEach
    public void setUp() {
        biblioteca = new Biblioteca();
        Book book1 = new Book("Adventure Time", "Crusoe", 1999);
        Book book2 = new Book("Sorcerer's stone", "Rowling", 1987);
        books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        biblioteca.add(books);
    }

    @Test
    public void shouldReturnValidWelcomeMessage() {
        assertThat(biblioteca.welcomeMsg(), is(equalTo("Welcome to Biblioteca. Your one-stop-shop for " +
                "great book titles in Bangalore!")));
    }

    @Test
    public void shouldReturnValidBookDetails() {
        Book book1 = new Book("Adventure Time", "Crusoe", 1999);
        Book book2 = new Book("Sorcerer's stone", "Rowling", 1987);
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        assertEquals(biblioteca.books(), books);
    }
}