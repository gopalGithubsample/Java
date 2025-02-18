package com.wipro.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LinkedInSort {

    public static void main(String[] args) {
        List<LinkedInProfile> profiles = new ArrayList<>();
        profiles.add(new LinkedInProfile("Golu", "Software Engineer", 500));
        profiles.add(new LinkedInProfile("Arya", "Data Scientist", 200));
        profiles.add(new LinkedInProfile("Shruti", "Project Manager", 750));
        profiles.add(new LinkedInProfile("Anmol", "Software Engineer", 300));
        profiles.add(new LinkedInProfile("Neelu", "Marketing Manager", 600));


        // Sort by name (ascending)
        Collections.sort(profiles, new Comparator<LinkedInProfile>() {
            @Override
            public int compare(LinkedInProfile p1, LinkedInProfile p2) {
                return p1.name.compareTo(p2.name);
            }
        });
        System.out.println("Sorted by name:");
        printProfiles(profiles);

        // Sort by connections (descending)
        Collections.sort(profiles, new Comparator<LinkedInProfile>() {
            @Override
            public int compare(LinkedInProfile p1, LinkedInProfile p2) {
                return Integer.compare(p2.connections, p1.connections); // Descending order
            }
        });
        System.out.println("\nSorted by connections (descending):");
        printProfiles(profiles);

        // Sort by title, then by connections (if titles are the same)
        Collections.sort(profiles, new Comparator<LinkedInProfile>() {
            @Override
            public int compare(LinkedInProfile p1, LinkedInProfile p2) {
                int titleComparison = p1.title.compareTo(p2.title);
                if (titleComparison != 0) {
                    return titleComparison;
                } else {
                    return Integer.compare(p2.connections, p1.connections); // Descending connections
                }
            }
        });
        System.out.println("\nSorted by title, then connections (descending):");
        printProfiles(profiles);

    }

    private static void printProfiles(List<LinkedInProfile> profiles) {
        for (LinkedInProfile profile : profiles) {
            System.out.println(profile);
        }
    }
}