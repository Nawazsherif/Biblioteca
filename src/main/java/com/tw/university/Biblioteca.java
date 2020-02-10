package com.tw.university;

import java.util.ArrayList;

//Represents Biblioteca library
public class Biblioteca {
    private static final String WELCOME_MSG = "Welcome to Biblioteca. Your one-stop-shop " +
            "for great book titles in Bangalore!";
    private ArrayList<Book> books;
    private ArrayList<Book> checkedOutBooks;

    public String welcomeMsg() {
        return WELCOME_MSG;
    }

    public final void add(ArrayList<Book> books) {
        this.books = books;
        checkedOutBooks = new ArrayList<>();
    }

    public final String checkOut(Book book) {
        String checkOutMsg = "Sorry, that book is not available";
        if (books.contains(book)) {
            checkedOutBooks.add(book);
            books.remove(book);
            checkOutMsg = "Thank you! Enjoy the book";
        }
        return checkOutMsg;
    }

    public final ArrayList<Book> books() {
        return books;
    }

    public final ArrayList<Book> checkedOutBooks() {
        return checkedOutBooks;
    }

    public final String returnBook(Book book) {
        String bookReturnMsg = "";
        if (checkedOutBooks.contains(book)) {
            books.add(book);
            checkedOutBooks.remove(book);
            bookReturnMsg = "Thank you for returning the book.";
        }
        return bookReturnMsg;
    }
}
