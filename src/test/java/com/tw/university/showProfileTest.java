package com.tw.university;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class showProfileTest {

    @Test
    void shouldReturnValidProfileOption() {
        assertEquals(new ShowProfile().option(),"My profile");
    }

    @Test
    void select() {
        IBibliotecaApp iBibliotecaApp = mock(IBibliotecaApp.class);
        ShowProfile showProfile = new ShowProfile();
        showProfile.select(iBibliotecaApp);

        verify(iBibliotecaApp,times(1)).showProfile();
    }
}