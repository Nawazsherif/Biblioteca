package com.tw.university;

import java.util.ArrayList;

public class Biblioteca {
    private static final String WELCOME_MSG = "Welcome to Biblioteca. Your one-stop-shop " +
            "for great book titles in Bangalore!";
    private ArrayList<Book> books;

    public String welcomeMsg() {
        return WELCOME_MSG;
    }

    public final void add(ArrayList<Book> books) {
        this.books = books;
    }

    public final ArrayList<Book> books() {
        return books;
    }

    public final String checkOut(int bookNumber) {
        String returnMsg = "Sorry, that book is not available";
        if (bookNumber <= books.size() && bookNumber > 0) {
            books.remove(bookNumber - 1);
            returnMsg = "Thank you! Enjoy the book";
        }
        return returnMsg;
    }
}
