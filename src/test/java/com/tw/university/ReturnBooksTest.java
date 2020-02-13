package com.tw.university;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

class ReturnBooksTest {
    private Library library;
    private IBibliotecaApp IBibliotecaApp;

    @BeforeEach
    public void Setup() {
        library = mock(Library.class);
        IBibliotecaApp = mock(IBibliotecaApp.class);
    }

    @Test
    public void shouldReturnOptionListBooks() {
        MenuItem menuItem = new ReturnBooks(library);

        assertThat(menuItem.option(), is(equalTo("Return a book")));
    }

    @Test
    public void shouldInvokeReturnBookMethod() {
        MenuItem menuItem = new ReturnBooks(library);
        Book mockBookOne = mock(Book.class);
        Book mockBookTwo = mock(Book.class);
        Book mockBookThree = mock(Book.class);
        ArrayList<Book> books = new ArrayList<>() {{
            add(mockBookOne);
            add(mockBookTwo);
            add(mockBookThree);
        }};
        when(library.checkedOutBooks()).thenReturn(books);
        when(IBibliotecaApp.selectBook(books)).thenReturn(mockBookOne);
        when(library.returnBook(mockBookOne)).thenReturn("Test return");
        menuItem.select(IBibliotecaApp);

        verify(IBibliotecaApp, times(1)).displayAppMessages("Test return");
    }

}

