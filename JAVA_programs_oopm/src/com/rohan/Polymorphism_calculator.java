package com.rohan;



class cal{
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
}
public class Polymorphism_calculator {
  
	public static void main(String[] args) {
		cal obj = new cal();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(20, 30, 69));
	}
	

}
