package com.tw.university;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

class ListMoviesTest {
    @Test
    public void shouldReturnListMoviesOption() {
        Library library = mock(Library.class);
        MenuItem listMovies = new ListMovies(library);

        assertThat(listMovies.option(), is(equalTo("List Movies")));
    }

    @Test
    public void shouldGetTheListOfMoviesFromLibrary() {
        IBibliotecaApp iBibliotecaApp = mock(IBibliotecaApp.class);
        Library library = mock(Library.class);
        MenuItem listMovies = new ListMovies(library);
        listMovies.select(iBibliotecaApp);

        verify(iBibliotecaApp ,times(1)).listMovies(library.movies());
    }
}