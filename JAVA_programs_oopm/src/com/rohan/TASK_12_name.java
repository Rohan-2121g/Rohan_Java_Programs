package com.rohan;

import java.util.Scanner;

public class TASK_12_name {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String name = sc.nextLine();
		
		System.out.println("enter your number");
		long number = sc.nextLong();
		
		System.out.println("Your name is :" + name + "  " + "Your number is :" + " " + number);
		sc.close();

	}
}