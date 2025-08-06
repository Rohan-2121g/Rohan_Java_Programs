package com.rohan;

import java.util.Scanner;

public class Task_5_length {
	public static void main(String[] args) {
		System.out.println("Enter any sentence");
		Scanner sc = new Scanner(System.in);
		String sent = sc.nextLine();
		sc.close();
		System.out.println(sent.length());
	}
}