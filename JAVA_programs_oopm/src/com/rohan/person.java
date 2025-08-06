package com.rohan;

class Persun { 
    String name;
    int age;

    public void displayDetails() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }
}

class Student1 extends Persun { 
    String studentID;

    public void displayStudentop() {
        displayDetails();
        System.out.println("Student ID = " + studentID);
    }
}

public class person { 
    public static void main(String[] args) {
        Student1 obj = new Student1();
        obj.name = "Op";
        obj.age = 19;
        obj.studentID = "optjisoppp38";
        obj.displayStudentop();
    }
}