package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieSorting {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The Shawshank Redemption", 9.3, 1994));
        movies.add(new Movie("The Godfather", 9.2, 1972));
        movies.add(new Movie("The Dark Knight", 9.0, 2008));
        movies.add(new Movie("12 Angry Men", 8.9, 1957));
        movies.add(new Movie("Schindler's List", 8.9, 1993));

        System.out.println("Before sorting:");
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " - " + movie.getRating() + " - " + movie.getReleaseYear()); // Accessing fields directly
        }

        Collections.sort(movies);

        System.out.println("\nAfter sorting by rating (descending):");
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " - " + movie.getRating() + " - " + movie.getReleaseYear()); // Accessing fields directly
        }
    }
}