package com.tw.university;

import java.util.ArrayList;

public class BibliotecaApp {
    public Library library;
    public BibliotecaUI bibliotecaUI;

    public BibliotecaApp() {
        initLibrary();
    }

    public void bind(BibliotecaUI bibliotecaUI)
    {
        this.bibliotecaUI = bibliotecaUI;
    }

    private void initLibrary() {
        library = new Library();
        ArrayList<Book> books = new ArrayList<>();
        Book book1 = new Book("Adventure Time", "Crusoe", 1999);
        Book book2 = new Book("Sorcerer's stone", "Rowling", 1987);
        books.add(book1);
        books.add(book2);
        library.add(books);
    }


}
