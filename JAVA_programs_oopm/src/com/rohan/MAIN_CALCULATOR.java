package com.rohan;

import java.util.Scanner;

public class MAIN_CALCULATOR {

public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println("Enter a number");
		int b = sc.nextInt();
		
		int sum = a + b;
		System.out.println("The Sum of a and b is: " + sum);
		
		int result = a-b;
		System.out.println("The Substraction of a and b is: " + result);
		
		int product = a*b;
		System.out.println("The Multiplication of a and b is: " + product);
		
		
		sc.close();
		
		              
	}
}
