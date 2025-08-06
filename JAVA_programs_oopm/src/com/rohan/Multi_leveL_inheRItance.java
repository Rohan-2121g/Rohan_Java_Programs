package com.rohan;


class Animal{
	public void Eat() {
		System.out.println("Animal bhi Eat");
	}
}

class Cat extends Animal{
	public void Meow() {
		System.out.println("AwwMeowwwwwww");
	}
}

class Kitten extends Cat{
	public void Jump() {
		System.out.println("Jump jaise Rabbit");
	}
}


public class Multi_leveL_inheRItance {

	
	public static void main(String[] args) {
		Kitten k = new Kitten();
		k.Eat();
		k.Meow();
		k.Jump();
	}
}
