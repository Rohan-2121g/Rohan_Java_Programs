package com.rohan;

public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			int x = 2/0; // Exception (Problem).
		} catch (Exception e) { // if the exception  is not known by us, just write exception in the ().
			System.out.println("You cannot / by zero"); //Providing alternative
		}
	}
}
