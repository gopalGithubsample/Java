package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int releaseYear;

    public Movie(String name, double rating, int releaseYear) {
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }


    @Override
    public int compareTo(Movie m) {
        if (this.rating < m.rating) {
            return 1; 
        } else if (this.rating > m.rating) {
            return -1; 
        } else {
            return 0; 
        }
    }
}

