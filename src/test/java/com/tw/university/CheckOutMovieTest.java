package com.tw.university;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

class CheckOutMovieTest {

    CheckOutMovie checkOutMovie;
    IBibliotecaApp iBibliotecaApp;
    Library library;

    @BeforeEach
    public void setUp() {
        iBibliotecaApp = mock(IBibliotecaApp.class);
        library = mock(Library.class);
        checkOutMovie = new CheckOutMovie(library);
    }

    @Test
    void shouldReturnValidCheckOutMovieOption() {
        assertThat(checkOutMovie.option(), is(equalTo("Checkout a movie")));
    }

    @Test
    void shouldCheckOutAMovie() {
        Movie movie1 = mock(Movie.class);
        Movie movie2 = mock(Movie.class);
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        when(library.movies()).thenReturn(movies);
        when(iBibliotecaApp.selectMovie(library.movies())).thenReturn(movie1);
        checkOutMovie.select(iBibliotecaApp);

        verify(library, times(1)).checkOut(movie1);
    }
}