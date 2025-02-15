package com.wipro.java.prototype.shapes;

public class Circle extends Shape {
    public int radius;

    public Circle() {
    }

    public Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}