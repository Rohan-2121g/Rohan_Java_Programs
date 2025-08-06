package com.rohan;

public class ImmutableStrings {

	
	String name = "ROHAN";
	public void print() {
		System.out.println(name);
		System.out.println(name.concat(" " + "GIRE"));
	}
	public static void main(String[] args) {
		
		ImmutableStrings obj = new ImmutableStrings();
		obj.print();
		

	}
}
