package com.wipro.java.java8;

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String getDescription() {
        return "This is a rectangle with length " + length + " and width " + width + ".";
    }

    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(4, 6);
        System.out.println(myRectangle.getArea());
        System.out.println(myRectangle.getDescription());
        myRectangle.displayColor("blue");
        System.out.println("Number of sides: " + Shape.getNumberOfSides());
        System.out.println("Shape Type: " + Shape.shapeType());
    }
}
