package com.tw.university;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

class returnBooksTest {
    private Library library;
    private BibliotecaUI bibliotecaUI;

    @BeforeEach
    public void Setup() {
        library = mock(Library.class);
        bibliotecaUI = mock(BibliotecaUI.class);
    }

    @Test
    public void shouldReturnOptionListBooks() {
        MenuItem menuItem = new returnBooks(library, bibliotecaUI);

        assertThat(menuItem.option(), is(equalTo("Return a book")));
    }

    @Test
    public void shouldInvokeReturnBookMethod() {
        MenuItem menuItem = new returnBooks(library, bibliotecaUI);
        Book mockBookOne = mock(Book.class);
        Book mockBookTwo = mock(Book.class);
        Book mockBookThree = mock(Book.class);
        ArrayList<Book> books = new ArrayList<>() {{
            add(mockBookOne);
            add(mockBookTwo);
            add(mockBookThree);
        }};
        when(library.checkedOutBooks()).thenReturn(books);
        when(bibliotecaUI.returnBooks(books)).thenReturn(mockBookOne);
        when(library.returnBook(mockBookOne)).thenReturn("Test return");
        menuItem.select();

        verify(bibliotecaUI, times(1)).displayMessage("Test return");
    }

}

