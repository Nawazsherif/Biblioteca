package com.tw.university;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

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
        MenuItem menuItem = new checkOutBooks(library);

        assertThat(menuItem.option(), is(equalTo("Checkout a book")));
    }

    @Test
    public void shouldInvokeCheckoutBookMethod() {
        MenuItem menuItem = new checkOutBooks(library);
        Book mockBookOne = mock(Book.class);
        Book mockBookTwo = mock(Book.class);
        Book mockBookThree = mock(Book.class);
        ArrayList<Book> books = new ArrayList<>() {{
            add(mockBookOne);
            add(mockBookTwo);
            add(mockBookThree);
        }};
        when(library.books()).thenReturn(books);
        when(bibliotecaUI.checkOutBooks(books)).thenReturn(mockBookOne);
        when(library.checkOut(mockBookOne)).thenReturn("Test Checkout");

        menuItem.select(bibliotecaUI);

        verify(bibliotecaUI, times(1)).displayMessage("Test Checkout");
    }
}
