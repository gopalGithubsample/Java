package com.wipro.java.java8;

interface Shape {
    double getArea();
    default String getDescription() {
        return "This is a shape.";
    }
    default void displayColor(String color) {
        System.out.println("The shape is " + color + ".");
    }
    static int getNumberOfSides() {
        return 0;
    }
    static String shapeType() {
        return "Generic Shape";
    }
}
