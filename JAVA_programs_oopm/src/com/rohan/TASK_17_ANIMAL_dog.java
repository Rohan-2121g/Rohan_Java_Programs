package com.rohan;

// Base class
class ANIMAL_1 {
    String name;
    int age;

    // Constructor
    public ANIMAL_1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display basic info
    public void makeSound() {
        System.out.println(name + " makes a generic animal sound.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Derived class
public class TASK_17_ANIMAL_dog extends ANIMAL_1 {

    // Constructor for Dog
    public TASK_17_ANIMAL_dog(String name, int age) {
        super(name, age); // Call parent constructor
    }

    // Override makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }

    // Additional method specific to Dog
    public void fetch() {
        System.out.println(name + " is fetching the ball!");
    }

    // Main method to test inheritance
    public static void main(String[] args) {
        TASK_17_ANIMAL_dog dog = new TASK_17_ANIMAL_dog("Buddy", 3);
        dog.displayInfo();   // Inherited method
        dog.makeSound();     // Overridden method
        dog.fetch();         // Dog-specific method
    }
}