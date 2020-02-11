package com.tw.university;

public class ListBooks implements Menu {

    private final Library library;

    public ListBooks(Library library) {
        this.library = library;
    }

    @Override
    public String option() {
        return "List Books";
    }

    @Override
    public void onSelect() {
        library.books();
    }
}
