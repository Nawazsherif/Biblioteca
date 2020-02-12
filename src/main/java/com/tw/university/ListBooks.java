package com.tw.university;

//Check the list of books
public class ListBooks implements MenuItem {

    private final Library library;

    public ListBooks(Library library) {
        this.library = library;
    }

    @Override
    public String option() {
        return "List Books";
    }

    @Override
    public void select(BibliotecaUI bibliotecaUI) {
        bibliotecaUI.listBooks(library.books());
    }
}
