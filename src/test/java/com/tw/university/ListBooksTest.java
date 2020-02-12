package com.tw.university;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;


class ListBooksTest {

    private Library library;
    private IBibliotecaApp IBibliotecaApp;

    @BeforeEach
    public void Setup() {
        library = mock(Library.class);
        IBibliotecaApp = mock(IBibliotecaApp.class);
    }

    @Test
    public void shouldReturnOptionListBooks() {
        MenuItem menuItem = new ListBooks(library);

        assertThat(menuItem.option(), is(equalTo("List Books")));
    }

    @Test
    public void shouldReturnListOfBooks() {
        MenuItem menuItem = new ListBooks(library);
        menuItem.select(IBibliotecaApp);

        verify(library, times(1)).books();
    }
}