package com.tw.university;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


class QuitApplicationTest {

    @Test
    public void shouldReturnValidQuitMessage() {
        MenuItem quitApplication = new QuitApplication();
        assertThat(quitApplication.option(), is(equalTo("Quit application")));
    }
}