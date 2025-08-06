package com.rohan;

public class TASK_15_METHODoverloading {

    // Method with int parameter
    public void display(int number) {
        System.out.println("Integer value: " + number);
    }

    // Method with double parameter
    public void display(double number) {
        System.out.println("Double value: " + number);
    }

    // Method with String parameter
    public void display(String text) {
        System.out.println("String value: " + text);
    }

    // Method with boolean parameter
    public void display(boolean flag) {
        System.out.println("Boolean value: " + flag);
    }

    // Main method to test overloading
    public static void main(String[] args) {
        TASK_15_METHODoverloading obj = new TASK_15_METHODoverloading();

        obj.display(100);           // int
        obj.display(99.99);         // double
        obj.display("Method Overloading"); // String
        obj.display(false);         // boolean
    }
}