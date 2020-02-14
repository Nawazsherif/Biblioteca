package com.tw.university;

import java.util.ArrayList;

//Represents Library
public class Library {
    private static final String WELCOME_MSG = "Welcome to Library. Your one-stop-shop " +
            "for great book titles in Bangalore!";
    private final ArrayList<Book> books;
    private final ArrayList<Movie> movies;
    private final ArrayList<Book> checkedOutBooks = new ArrayList<>();
    private final ArrayList<User> users = new ArrayList<>();

    public Library(ArrayList<Book> books, ArrayList<Movie> movies) {
        this.books = books;
        this.movies = movies;
        initUser();
    }

    private void initUser() {
        User user1 = new User("0123-23456", "password");
        users.add(user1);
    }


    public String welcomeMsg() {
        return WELCOME_MSG;
    }

    public String checkOut(Book book) {
        String checkOutMsg = "Sorry, that book is not available";
        if (books.contains(book)) {
            checkedOutBooks.add(book);
            books.remove(book);
            checkOutMsg = "Thank you! Enjoy the book";
        }
        return checkOutMsg;
    }

    public ArrayList<Book> books() {
        return books;
    }

    public ArrayList<Book> checkedOutBooks() {
        return checkedOutBooks;
    }

    public String returnBook(Book book) {
        String bookReturnMsg = "That is not a valid book to return";
        if (checkedOutBooks.contains(book)) {
            books.add(book);
            checkedOutBooks.remove(book);
            bookReturnMsg = "Thank you for returning the book.";
        }
        return bookReturnMsg;
    }

    public ArrayList<Movie> movies() {
        return movies;
    }

    public void checkOut(Movie movie) {
        movies.remove(movie);
    }

    public User findUser(String id, String password) {
        for (User user : users) {
            if (user.userId().equals(id) && user.password().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
