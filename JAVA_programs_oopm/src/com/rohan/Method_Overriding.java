package com.rohan;

class Dog{
	public void Sound() {
		System.out.println("Animals karta sound");
	}
}


class Cats extends Dog{
	public void Sound() {
		System.out.println("Aeeoowww");
	}
}
public class Method_Overriding {
		
	public static void main(String[] args) {
		Dog obj = new Cats();
		obj.Sound();
		
	}
}
