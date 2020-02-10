package com.tw.university;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {
    private Book book1;
    private Book book2;
    private Biblioteca biblioteca;

    @BeforeEach
    public void setUp() {
        biblioteca = new Biblioteca();
        book1 = new Book("Adventure Time", "Crusoe", 1999);
        book2 = new Book("Sorcerer's stone", "Rowling", 1987);
        ArrayList<Book> books = new ArrayList<>();
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

    @Test
    public void shouldCheckoutABookSuccessfullyWillRemoveTheBookFromLibrary() {
        biblioteca.checkOut(book2);
        assertFalse(biblioteca.books().contains(book2));
    }

    @Test
    public void shouldCheckoutABookSuccessfullyWillAddTheBookToTheCheckedOutBooks() {
        biblioteca.checkOut(book2);
        assertTrue(biblioteca.checkedOutBooks().contains(book2));
    }

    @Test
    public void shouldReturnSuccessMsgOnCheckingOutABook() {
        assertThat(biblioteca.checkOut(book2), is(equalTo("Thank you! Enjoy the book")));
    }

    @Test
    public void shouldReturnUnSuccessMsgOnCheckingOutABook() {
        Book book3 = new Book("Curse of the Wild", "Toriyama", 1986);
        assertThat(biblioteca.checkOut(book3), is(equalTo("Sorry, that book is not available")));
    }

    @Test
    public void shouldReturnBookBackToTheLibrary() {
        biblioteca.checkOut(book1);
        biblioteca.returnBook(book1);
        assertTrue(biblioteca.books().contains(book1));
    }

    @Test
    public void shouldReturnSuccessMsgOnReturningABook() {
        biblioteca.checkOut(book2);
        assertThat(biblioteca.returnBook(book2), is(equalTo("Thank you for returning the book.")));
    }

    @Test
    public void shouldReturnUnSuccessMsgOnReturningABook() {
        Book book3 = new Book("Curse of the Wild", "Toriyama", 1986);
        assertThat(biblioteca.returnBook(book3), is(equalTo("That is not a valid book to return")));
    }
}