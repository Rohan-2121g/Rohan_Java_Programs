package com.rohan;

public class Simple2DArray {

		public static void main(String[] args) {
			String[][] choclateBox = {
					{"Ball 1","Ball 2","Ball 3"}, //row 0
					{"BAll 4","Ball 5","BAll 6"}, //row 1
					{"Ball 7","Ball 8","Ball 9"}  //row 3
			};
			for(int i = 0;i<3;i++) {
				for(int j =0;j<3;j++) {
					System.out.print(choclateBox[i][j]);
				}
				System.out.println();
			}
			System.out.println(choclateBox[1][2]);
		}
}
