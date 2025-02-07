package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class NameCompartor implements Comparator<Movie1> {  // Important: Specify the type parameter <Moviel>

    public int compare(Movie1 m1, Movie1 m2) {
        return m1.getName().compareTo(m2.getName());
    }

    public static void main(String[] args) {

        ArrayList<Movie1> ml = new ArrayList<>(); // Important: Specify the type parameter <Moviel>

        ml.add(new Movie1("Force Awakens", 8.3, 2015));
        ml.add(new Movie1("Star Wars", 8.7, 1977));
        ml.add(new Movie1("Empire Strikes Back", 8.8, 1980));

        Collections.sort(ml, new NameCompartor()); // Sort the list

        System.out.println("\nMovies sorted by name:");
        for (Movie1 m : ml) {
            System.out.println(m.getName() + " " + m.getRating() + " " + m.getReleaseYear()); // Added spaces for better output
        }
    }

}
