package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class YearComparator implements Comparator<Movie1> {

    @Override
    public int compare(Movie1 m1, Movie1 m2) {
        return Integer.compare(m1.getReleaseYear(), m2.getReleaseYear()); // Ascending order by year
        // For descending order:
        // return Integer.compare(m2.getReleaseYear(), m1.getReleaseYear());
    }

    public static void main(String[] args) {

        ArrayList<Movie1> m1 = new ArrayList<>();

        m1.add(new Movie1("Force Awakens", 8.3, 2015));
        m1.add(new Movie1("Star Wars", 8.7, 1977));
        m1.add(new Movie1("Empire Strikes Back", 8.8, 1980));

        Collections.sort(m1, new YearComparator()); // Sort by year

        System.out.println("\nMovies sorted by release year:");
        for (Movie1 m : m1) {
            System.out.println(m.getName() + " " + m.getRating() + " " + m.getReleaseYear());
        }
    }
}