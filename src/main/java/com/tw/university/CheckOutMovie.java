package com.tw.university;

public class CheckOutMovie implements MenuItem {
    private final Library library;

    public CheckOutMovie(Library library) {

        this.library = library;
    }

    @Override
    public String option() {
        return "Checkout a movie";
    }

    @Override
    public void select(IBibliotecaApp iBibliotecaApp) {
        iBibliotecaApp.listMovies(library.movies());
        Movie movie = iBibliotecaApp.selectMovie(library.movies());
        library.checkOut(movie);
    }
}
