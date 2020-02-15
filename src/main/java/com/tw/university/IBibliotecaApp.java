package com.tw.university;

import java.util.ArrayList;

//Represents the Biblioteca UI
public interface IBibliotecaApp {

    void listBooks(ArrayList<Book> books);

    void displayAppMessages(String message);

    Book selectBook(ArrayList<Book> books);

    Movie selectMovie(ArrayList<Movie> movies);

    void listMovies(ArrayList<Movie> movies);

    void showProfile();
}
