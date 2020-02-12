package com.tw.university;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieTest {
    @Test
    public void shouldEquateMoviesWithSameDetails() {
        Movie movie1 = new Movie("Ninja storms", 1990, "Cameron", 8);
        Movie movie2 = new Movie("Ninja storms", 1990, "Cameron", 8);

        assertEquals(movie1, movie2);
    }

    @Test
    public void shouldEquateHashCodesOfMoviesWithSameDetails() {
        Movie movie1 = new Movie("Ninja storms", 1990, "Cameron", 8);
        Movie movie2 = new Movie("Ninja storms", 1990, "Cameron", 8);

        assertEquals(movie1.hashCode(), movie2.hashCode());
    }
}