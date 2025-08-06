package com.rohan;

public class TASK_18_this {

    private String name;
    private int age;

    // Constructor using 'this' to refer to instance variables
    public TASK_18_this(String name, int age) {
        this.name = name; // 'this.name' refers to the instance variable
        this.age = age;
    }

    // Method that uses 'this' to call another method
    public void show() {
        this.display(); // Calls display() on the current object
    }

    // Method to display object info
    public void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

    // Method that accepts current object as a parameter
    public void greet(TASK_18_this obj) {
        System.out.println("Hello, " + obj.name + "!");
    }

    // Main method to test
    public static void main(String[] args) {
        TASK_18_this person = new TASK_18_this("Rohan", 25);
        person.show();         // Uses 'this' to call display()
        person.greet(person);  // Passes current object as argument
    }
}