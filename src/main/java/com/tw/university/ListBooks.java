package com.tw.university;

//Check the list of books
public class ListBooks implements MenuItem {

    private final Library library;
    private final BibliotecaUI bibliotecaUI;

    public ListBooks(Library library, BibliotecaUI bibliotecaUI) {
        this.library = library;
        this.bibliotecaUI = bibliotecaUI;
    }

    @Override
    public String option() {
        return "List Books";
    }

    @Override
    public void select() {
        bibliotecaUI.listBooks(library.books());
    }
}
