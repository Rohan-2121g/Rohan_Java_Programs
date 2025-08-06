package com.rohan;

class Calculator{
	Calculator (int a,int b) {
		int sum = a+b;
		System.out.println("Addition" + "=" + sum);
	}
	
	Calculator(int a,int b , boolean multiply) {
		int multiplication = a*b;
		System.out.println("Multiplication" + "=" + multiplication);
	}
	Calculator(double a,double b){
		double subtract = a-b;
		System.out.println("Subtraction" + "=" + subtract);
	}
}
public class FIRST_1_MainCalculator_simple {

	public static void main(String[] args) {
		
		new Calculator(23, 34);
		Calculator obj11 = new Calculator(23, 34,true);
		Calculator obj22 = new Calculator(23.6, 34.9);
		
	}

}
