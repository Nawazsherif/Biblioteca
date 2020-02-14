package com.tw.university;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class LogoutTest {

    Logout logout;
    LoginItem loginItem;

    @BeforeEach
    public void setUp()
    {
        logout = new Logout();
        loginItem = mock(LoginItem.class);
    }

    @Test
    void shouldReturnValidLogoutOption() {
        assertEquals(logout.option(),"Logout");
    }

    @Test
    void shouldLogoutTheUser() {
        logout.select(loginItem);

        verify(loginItem,times(1)).logout();
    }
}