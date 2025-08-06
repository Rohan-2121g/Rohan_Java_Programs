package com.rohan;

class Student21 {
    private String name;
    private int age;

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

   
    public int getAge() {
        return age;
    }

    
    public void setAge(int age) {
        this.age = age;
    }
}

public class SimpleEncapsulation {
    public static void main(String[] args) {
        Student21 student = new Student21();

        student.setName("Rohan");
        student.setAge(21);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}