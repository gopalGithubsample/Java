package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class RatingComparator implements Comparator<Movie1> {

    @Override
    public int compare(Movie1 m1, Movie1 m2) {
        // For descending order of rating (highest rating first):
        return Double.compare(m2.getRating(), m1.getRating());  // m2 compared to m1
        // For ascending order of rating (lowest rating first):
        // return Double.compare(m1.getRating(), m2.getRating()); // m1 compared to m2
    }

    public static void main(String[] args) {

        ArrayList<Movie1> m1 = new ArrayList<>();

        m1.add(new Movie1("Force Awakens", 8.3, 2015));
        m1.add(new Movie1("Star Wars", 8.7, 1977));
        m1.add(new Movie1("Empire Strikes Back", 8.8, 1980));

        Collections.sort(m1, new RatingComparator()); // Sort by rating

        System.out.println("\nMovies sorted by rating:");
        for (Movie1 m : m1) {
            System.out.println(m.getName() + " " + m.getRating() + " " + m.getReleaseYear());
        }
    }
}
