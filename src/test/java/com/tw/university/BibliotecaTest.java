package com.tw.university;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BibliotecaTest {

    private Biblioteca biblioteca;
    ArrayList<Book> books;

    @BeforeEach
    public void setUp()
    {
        biblioteca = new Biblioteca();
        Book book1 = new Book("Adventure Time");
        Book book2 = new Book("Sorcerer's stone");
        books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        biblioteca.add(books);
        new ArrayList<>().equals(new ArrayList<>());
    }

    @Test
    public void shouldReturnValidWelcomeMessage() {
        assertThat(biblioteca.welcomeMsg(), is(equalTo("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!")));
    }

    @Test
    public void shouldReturnValidBookDetails() {
        assertEquals(biblioteca.books(), books);
    }

}