package com.tw.university;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieTest {

    Movie movie1;
    Movie movie2;

    @BeforeEach
    public void setUp()
    {
       movie1 = new Movie("Ninja storms", 1990, "Cameron", 8);
       movie2 = new Movie("Ninja storms", 1990, "Cameron", 8);
    }

    @Test
    public void shouldEquateMoviesWithSameDetails() {
        movie1 = new Movie("Ninja storms", 1990, "Cameron", 8);
        movie2 = new Movie("Ninja storms", 1990, "Cameron", 8);

        assertEquals(movie1, movie2);
    }

    @Test
    public void shouldEquateHashCodesOfMoviesWithSameDetails() {
        movie1 = new Movie("Ninja storms", 1990, "Cameron", 8);
        movie2 = new Movie("Ninja storms", 1990, "Cameron", 8);

        assertEquals(movie1.hashCode(), movie2.hashCode());
    }

    @Test
    public void shouldReturnValidMovieName() {
        assertEquals(movie1.name(),"Ninja storms");
    }

    @Test
    public void shouldReturnValidMovieDirector() {
        assertEquals(movie1.director(),"Cameron");
    }

    @Test
    public void shouldReturnValidMovieYear() {
        assertEquals(movie1.year(),1990);
    }

    @Test
    public void shouldReturnValidMovieRating() {
        assertEquals(movie1.rating(),8);
    }
}
