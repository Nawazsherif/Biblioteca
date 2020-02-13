package com.tw.university;

public class ListMovies implements MenuItem {

    private final Library library;

    public ListMovies(Library library) {

        this.library = library;
    }

    @Override
    public String option() {
        return "List Movies";
    }

    @Override
    public void select(IBibliotecaApp iBibliotecaApp) {
        iBibliotecaApp.listMovies(library.movies());
    }
}
