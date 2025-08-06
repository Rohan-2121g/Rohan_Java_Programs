package com.rohan;

class student_3 {
	 String name;
	 int age;

	 student_3(String name, int age) {
	     this.name = name;
	     this.age = age;
	 }

	 void displayDetails() {
	     System.out.println("Name: " + name);
	     System.out.println("Age: " + age);
	 }
	}



public class TASK_14_studentinfo {

	
	public static void main(String[] args) {
	     student_3 student1 = new student_3("ROONEY", 19);
	     student_3 student2 = new student_3("VTY", 191920);

	     System.out.println("Student 1 Details:");
	     student1.displayDetails();

	     System.out.println("\nStudent 2 Details:");
	     student2.displayDetails();
	}

	
}
