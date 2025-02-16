package com.wipro.java.prototype.app;


import java.util.ArrayList;
import java.util.List;

import com.wipro.java.prototype.shapes.Circle;
import com.wipro.java.prototype.shapes.Rectangle;
import com.wipro.java.prototype.shapes.Shape;

public class Application {
    private List<Shape> shapes = new ArrayList<>();

    public Application() {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 10;
        circle.radius = 20;
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone(); // Explicit cast is needed
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        shapes.add(rectangle);
    }

    public void businessLogic() {
        List<Shape> shapesCopy = new ArrayList<>();

        for (Shape s : shapes) {
            shapesCopy.add(s.clone());
        }

        // Now shapesCopy contains clones of all shapes in the shapes list.
        for (Shape shape : shapesCopy) {
            System.out.println(shape.getClass().getSimpleName() + ": x=" + shape.x + ", y=" + shape.y);
            if (shape instanceof Circle) {
                System.out.println("Radius: " + ((Circle) shape).radius);
            } else if (shape instanceof Rectangle) {
                System.out.println("Width: " + ((Rectangle) shape).width + ", Height: " + ((Rectangle) shape).height);
            }
        }
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.businessLogic();
    }
}