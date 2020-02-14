package com.tw.university;

//Checkout books
public class CheckOutBooks implements MenuItem {

    private final Library library;

    public CheckOutBooks(Library library) {
        this.library = library;
    }

    @Override
    public String option() {
        return "Checkout a book";
    }

    @Override
    public void select(IBibliotecaApp IBibliotecaApp) {
        Book book = IBibliotecaApp.selectBook(library.books());
        IBibliotecaApp.displayAppMessages(library.checkOut(book));
    }
}
