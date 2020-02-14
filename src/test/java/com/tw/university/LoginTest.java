package com.tw.university;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class LoginTest {

    LoginItem loginItem;
    private Library library;
    private Login login;

    @BeforeEach
    public void setUp() {
        library = mock(Library.class);
        login = new Login(library);
        loginItem = mock(LoginItem.class);
    }

    @Test
    public void shouldReturnValidLoginOption() {
        assertEquals(login.option(), "Login");
    }

    @Test
    public void shouldLoginTheUserToApp() {
        login.select(loginItem);

        verify(loginItem, times(1)).login();
    }
}
