package com.tw.university;

import java.util.Objects;

public class Movie {
    private final String movieName;
    private final int year;
    private final String director;
    private final int rating;

    public Movie(String movieName, int year, String Director, int rating) {

        this.movieName = movieName;
        this.year = year;
        director = Director;
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return year == movie.year &&
                rating == movie.rating &&
                movieName.equals(movie.movieName) &&
                director.equals(movie.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieName, year, director, rating);
    }
}
