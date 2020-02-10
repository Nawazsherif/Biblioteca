package com.tw.university;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BookTest {

    @Test
    public void shouldEquateTwoBooksWithSameDetails() {
        Book book1 = new Book("Harry Potter", "Rowling", 1999);
        Book book2 = new Book("Harry Potter", "Rowling", 1999);

        assertThat(book1, is(equalTo(book2)));
    }

}