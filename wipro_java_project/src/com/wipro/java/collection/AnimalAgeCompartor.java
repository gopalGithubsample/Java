package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AgeComparator implements Comparator<Animall> {
    @Override
    public int compare(Animall a1, Animall a2) {
        return Integer.compare(a1.getAge(), a2.getAge());
    }

    public static void main(String[] args) {
        List<Animall> animals = new ArrayList<>();
        animals.add(new Animall("Simba", "Lion", 5));
        animals.add(new Animall("Nala", "Lion", 4));
        animals.add(new Animall("Dumbo", "Elephant", 2));
        animals.add(new Animall("Remy", "Rat", 1));

        Collections.sort(animals, new AgeComparator());

        System.out.println("\nAnimals sorted by age:");
        for (Animall animal : animals) {
            System.out.println(animal.getName() + " - " + animal.getSpecies() + " - " + animal.getAge());
        }
    }
}
