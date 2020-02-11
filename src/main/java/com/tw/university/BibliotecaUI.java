package com.tw.university;

import java.util.ArrayList;

public interface BibliotecaUI {

    void listBooks(ArrayList<Book> books);

    Book checkOutBooks(ArrayList<Book> books);

    void displayMessage(String message);
}
