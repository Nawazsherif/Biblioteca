package com.tw.university;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class BibliotecaAppTest {

    @Test
    public void shouldBindBibliotecaUIToBibliotecaApp() {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        BibliotecaUI ui = mock(BibliotecaUI.class);
        bibliotecaApp.bind(ui);

        assertEquals(bibliotecaApp.bibliotecaUI,ui);
    }
}