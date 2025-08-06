package com.rohan;

import java.util.Scanner;

public class NameInput {
 
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your name");
	
	String name =sc.nextLine();
	System.out.println("enter your phone number");
	long ph = sc.nextLong();
	
	System.out.println("your name is" + "=" + name);
	System.out.println("your phone number is" + "=" + ph);
	sc.close();
	
	
	}
}
