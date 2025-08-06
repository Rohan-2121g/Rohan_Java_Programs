package com.rohan;

class Cons{

	// Constructor with no argument
    Cons() {
        System.out.println("No value provided");
    }

    // Constructor with one argument
    Cons(int a) {
        System.out.println(a);
    }

    // Constructor with two arguments
    Cons(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of values: " + sum);
    }

   
}




public class TASK_3_COMSTructor__ARGUMents {

	public static void main(String[] args) {
		new Cons();           
        new Cons(10);        
        new Cons(10, 20);   

	}

}
