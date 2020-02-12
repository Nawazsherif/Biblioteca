package com.tw.university;

//Checkout books
public class checkOutBooks implements MenuItem {

    private final Library library;

    public checkOutBooks(Library library) {
        this.library = library;
    }

    @Override
    public String option() {
        return "Checkout a book";
    }

    @Override
    public void select(BibliotecaUI bibliotecaUI) {
        bibliotecaUI.listBooks(library.books());
        Book book = bibliotecaUI.checkOutBooks(library.books());
        bibliotecaUI.displayMessage(library.checkOut(book));
    }
}
