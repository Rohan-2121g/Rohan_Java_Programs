package com.rohan;

// Define the Shape interface
interface Shape {
    void draw(); // Abstract method
}

// Implement Shape interface in TASK_16_SHAPE_circle class
public class TASK_16_SHAPE_circle implements Shape {

    private double radius;

    // Constructor
    public TASK_16_SHAPE_circle(double radius) {
        this.radius = radius;
    }

    // Implement the draw() method
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
    }

    // Method to calculate area
    public double area() {
        return Math.PI * radius * radius;
    }

    // Main method to test
    public static void main(String[] args) {
        TASK_16_SHAPE_circle circle = new TASK_16_SHAPE_circle(4.5);
        circle.draw();
        System.out.println("Area: " + circle.area());
    }
}
