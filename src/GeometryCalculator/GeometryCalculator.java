package GeometryCalculator;

import java.util.ArrayList;


class Shape {
    // Parent class to represent a generic geometric shape
    public void displayArea() {
        System.out.println("Area calculation not implemented.");
    }
}

class Circle extends Shape {
    // Child class representing a Circle
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    // Child class representing a Rectangle
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void displayArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}


public class GeometryCalculator {
	
	public static void main(String[] args) {
        try {
            // Create an ArrayList to store objects of different geometric shapes
            ArrayList<Shape> shapes = new ArrayList<>();

            // Create objects for different geometric shapes
            shapes.add(new Circle(5.0));
            shapes.add(new Rectangle(3.0, 4.0));
            // Add objects for other shapes as well

            // Display areas using loop
            for (Shape shape : shapes) {
                shape.displayArea();
            }
        } catch (Exception e) {
            // Handle exceptions
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            // Any cleanup code goes here
            System.out.println("Program execution completed.");
        }
    }
}



	
	

