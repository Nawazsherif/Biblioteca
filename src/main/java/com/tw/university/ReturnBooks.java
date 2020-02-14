package com.tw.university;

public class ReturnBooks implements MenuItem {
    private final Library library;

    public ReturnBooks(Library library) {
        this.library = library;
    }

    @Override
    public String option() {
        return "Return a book";
    }

    @Override
    public void select(IBibliotecaApp IBibliotecaApp) {
        Book book = IBibliotecaApp.selectBook(library.checkedOutBooks());
        IBibliotecaApp.displayAppMessages(library.returnBook(book));
    }
}
