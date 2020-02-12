package com.tw.university;

//Checkout books
public class checkOutBooks implements MenuItem{

    private final Library library;
    private final BibliotecaUI bibliotecaUI;

    public checkOutBooks(Library library, BibliotecaUI bibliotecaUI) {
        this.library = library;
        this.bibliotecaUI = bibliotecaUI;
    }

    @Override
    public String option() {
        return "Checkout a book";
    }

    @Override
    public void select() {
        bibliotecaUI.listBooks(library.books());
        Book book = bibliotecaUI.checkOutBooks(library.books());
        bibliotecaUI.displayMessage(library.checkOut(book));
    }
}
