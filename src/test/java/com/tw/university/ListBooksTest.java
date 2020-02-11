package com.tw.university;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;


class ListBooksTest {

    private Library library;
    private BibliotecaUI bibliotecaUI;

    @BeforeEach
    public void Setup() {
        library = mock(Library.class);
        bibliotecaUI = mock(BibliotecaUI.class);
    }

    @Test
    public void shouldReturnOptionListBooks() {
        MenuItem menuItem = new ListBooks(library, bibliotecaUI);

        assertThat(menuItem.option(), is(equalTo("List Books")));
    }

    @Test
    public void shouldReturnListOfBooks() {
        MenuItem menuItem = new ListBooks(library, bibliotecaUI);
        menuItem.onSelect();

        verify(library, times(1)).books();
    }
}