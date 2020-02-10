package com.tw.university;

import java.util.ArrayList;

//
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

    public final String checkOut(int bookNumber) {
        String returnMsg = "Sorry, that book is not available";
        if (bookNumber <= books.size() && bookNumber > 0) {
            checkedOutBooks.add(books.get(bookNumber - 1));
            books.remove(bookNumber - 1);
            returnMsg = "Thank you! Enjoy the book";
        }
        return returnMsg;
    }

    public final ArrayList<Book> books() {
        return books;
    }

    public final ArrayList<Book> checkedOutBooks() {
        return checkedOutBooks;
    }

    public void returnBook(int bookNumber) {
        books.add(checkedOutBooks.get(bookNumber - 1));
        checkedOutBooks.remove(bookNumber - 1);
    }
}
