package com.tw.university;

public class returnBooks implements MenuItem {
    private final Library library;

    public returnBooks(Library library) {
        this.library = library;
    }

    @Override
    public String option() {
        return "Return a book";
    }

    @Override
    public void select(IBibliotecaApp IBibliotecaApp) {
        IBibliotecaApp.listBooks(library.checkedOutBooks());
        Book book = IBibliotecaApp.returnBooks(library.checkedOutBooks());
        IBibliotecaApp.displayMessage(library.returnBook(book));
    }
}
