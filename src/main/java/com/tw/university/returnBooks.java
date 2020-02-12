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
    public void select(BibliotecaUI bibliotecaUI) {
        bibliotecaUI.listBooks(library.checkedOutBooks());
        Book book = bibliotecaUI.returnBooks(library.checkedOutBooks());
        bibliotecaUI.displayMessage(library.returnBook(book));
    }
}
