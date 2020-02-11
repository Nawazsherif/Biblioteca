package com.tw.university;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;

class checkOutBooksTest {

    private Library library;
    private BibliotecaUI bibliotecaUI;

    @BeforeEach
    public void Setup() {
        library = mock(Library.class);
        bibliotecaUI = mock(BibliotecaUI.class);
    }

    @Test
    public void shouldReturnOptionListBooks() {
        MenuItem menuItem = new checkOutBooks(library, bibliotecaUI);

        assertThat(menuItem.option(), is(equalTo("Checkout a book")));
    }
}