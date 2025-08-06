package com.rohan;

public class TASK_2_2D_ARRAY {

	public static void main(String[] args) {
		int [][] chocolateBoxes = {
				{1,2,3},   //row 0
				{4,5,6},   //row 1
				{7,8,9},   //row 2
		};
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(chocolateBoxes[i][j]); //if we remove ln it will print in the same line, if used ln it will print every element in the next line.
			}
			System.out.println();
		}
		System.out.println(chocolateBoxes[1][2]);
	}
}
