package com.tw.university;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BibliotecaTest {

    @Test
    public void shouldReturnValidWelcomeMessage() {
        Biblioteca biblioteca = new Biblioteca();

        assertThat(biblioteca.welcomeMsg(), is(equalTo("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!")));
    }

}