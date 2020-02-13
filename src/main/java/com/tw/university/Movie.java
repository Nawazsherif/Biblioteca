package com.tw.university;

import java.util.Objects;

public class Movie {
    private final String name;
    private final int year;
    private final String director;
    private final int rating;

    public String name() {
        return name;
    }

    public int year() {
        return year;
    }

    public String director() {
        return director;
    }

    public int rating() {
        return rating;
    }

    public Movie(String name, int year, String Director, int rating) {

        this.name = name;
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
                name.equals(movie.name) &&
                director.equals(movie.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, director, rating);
    }
}
