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
    public void select(IBibliotecaApp IBibliotecaApp) {
        IBibliotecaApp.listBooks(library.books());
        Book book = IBibliotecaApp.checkOutBooks(library.books());
        IBibliotecaApp.displayMessage(library.checkOut(book));
    }
}
