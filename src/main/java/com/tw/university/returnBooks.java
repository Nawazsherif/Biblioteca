package com.tw.university;

public class returnBooks implements MenuItem {
    private final Library library;
    private final BibliotecaUI bibliotecaUI;

    public returnBooks(Library library, BibliotecaUI bibliotecaUI) {
        this.library = library;
        this.bibliotecaUI = bibliotecaUI;
    }

    @Override
    public String option() {
        return "Return a book";
    }

    @Override
    public void select() {
        bibliotecaUI.listBooks(library.checkedOutBooks());
        Book book = bibliotecaUI.returnBooks(library.checkedOutBooks());
        bibliotecaUI.displayMessage(library.returnBook(book));
    }
}
