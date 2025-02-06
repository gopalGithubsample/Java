package com.wipro.java.java8;

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getDescription() {
        return "This is a circle with radius " + radius + ".";
    }

    public static void main(String[] args) {
        Circle myCircle = new Circle(5);
        System.out.println(myCircle.getArea());
        System.out.println(myCircle.getDescription());
        myCircle.displayColor("red");
        System.out.println("Number of sides: " + Shape.getNumberOfSides());
        System.out.println("Shape Type: " + Shape.shapeType());
    }
}