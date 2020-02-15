package com.tw.university;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private Book book1;
    private Book book2;
    private Library library;
    Movie movie1;
    Movie movie2;

    @BeforeEach
    public void setUp() {

        book1 = new Book("Adventure Time", "Crusoe", 1999);
        book2 = new Book("Sorcerer's stone", "Rowling", 1987);
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        movie1 = new Movie("Ninja storms", 1990, "Cameron", 8);
        movie2 = new Movie("Dino Thunder", 1990, "Cameron", 8);
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        library = new Library(books,movies);
    }

    @Test
    public void shouldReturnValidWelcomeMessage() {
        assertThat(library.welcomeMsg(), is(equalTo("Welcome to Library. Your one-stop-shop for " +
                "great book titles in Bangalore!")));
    }

    @Test
    public void shouldReturnValidBookDetails() {
        Book book1 = new Book("Adventure Time", "Crusoe", 1999);
        Book book2 = new Book("Sorcerer's stone", "Rowling", 1987);
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        assertEquals(library.books(), books);
    }

    @Test
    public void shouldCheckoutABookSuccessfullyWillRemoveTheBookFromLibrary() {
        library.checkOut(book2);
        assertFalse(library.books().contains(book2));
    }

    @Test
    public void shouldCheckoutABookSuccessfullyWillAddTheBookToTheCheckedOutBooks() {
        library.checkOut(book2);
        assertTrue(library.checkedOutBooks().contains(book2));
    }

    @Test
    public void shouldReturnSuccessMsgOnCheckingOutABook() {
        assertThat(library.checkOut(book2), is(equalTo("Thank you! Enjoy the book")));
    }

    @Test
    public void shouldReturnUnSuccessMsgOnCheckingOutABook() {
        Book book3 = new Book("Curse of the Wild", "Toriyama", 1986);
        assertThat(library.checkOut(book3), is(equalTo("Sorry, that book is not available")));
    }

    @Test
    public void shouldReturnBookBackToTheLibrary() {
        library.checkOut(book1);
        library.returnBook(book1);
        assertTrue(library.books().contains(book1));
    }

    @Test
    public void shouldReturnSuccessMsgOnReturningABook() {
        library.checkOut(book2);
        assertThat(library.returnBook(book2), is(equalTo("Thank you for returning the book.")));
    }

    @Test
    public void shouldReturnUnSuccessMsgOnReturningABook() {
        Book book3 = new Book("Curse of the Wild", "Toriyama", 1986);
        assertThat(library.returnBook(book3), is(equalTo("That is not a valid book to return")));
    }

    @Test
    public void shouldReturnValidMovies() {
        Movie movie1 = new Movie("Ninja storms", 1990, "Cameron", 8);
        Movie movie2 = new Movie("Dino Thunder", 1990, "Cameron", 8);
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);

        assertThat(library.movies(),is(equalTo(movies)));
    }

    @Test
    public void shouldCheckoutMovie() {
        library.checkOut(movie1);

        assertFalse(library.movies().contains(movie1));
    }

    @Test
    public void shouldCheckWhetherTheUserIsValid()
    {
        User user1 = new User("0123-23456", "password", "9876543210", "usermail@gmail.com", "user1", UserType.MEMBER);

        assertEquals( library.findUser("0123-23456","password"),user1);
    }

    @Test
    public void shouldCheckWhetherTheUserIsInValid()
    {
        User user1 = new User("0124-23456", "password", "9876543210", "usermail@gmail.com", "user1", UserType.MEMBER);

        assertFalse(library.findUser("0123-23456","password").equals(user1));
    }

}