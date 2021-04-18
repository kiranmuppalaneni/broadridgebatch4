package com.broadridge.corejava;

public class ArrayEx {

	public static void main(String[] args) {
		// [0]...............[9]
		// int[] i = {10,20,30,40,50,60,70,80,90,100}; // Array is indexed group of
		// similar type values refereed by single variable
		// int j = i[4];
		//
		// System.out.println(j);

		int[] i = new int[10]; // size is compulsory  it can be modified.
//		i[0] = 2;
//		i[1] = 4;
//		i[2] = 6;
//		i[3] = 8;
//		i[4] = 10;
//		i[5] = 124;
//		i[6] = 132;
//		i[7] = 223;
//		i[8] = 344;
//		i[9] = 125;
		
		int value = 2;
		int result = 0;
		for (int index = 0; index < 10; index++) {
			i[index] = value;
			value += 2;
			result = result + value;
		}

		for (int index = 0; index < 10; index++) {
			System.out.println(i[index]);
		}
		
		System.out.println("Reult = "+ result);
		
		
		int[][] j = new int[2][2]; // 2*2
		j[0][0] = 1;
		j[0][1] = 2;
		j[1][0] = 3;
		j[1][1] = 4;
		
		for (int row =0 ; row < 2; row ++ ) {    // row 0                  1
			for(int col =0 ;col < 2 ; col++) {   // col 0                  col 0
				System.out.println(j[row][col]) ;                     //   j[0][0]  j[0][1]    j[1][0] j[1]1[1]
			}
		}
		
	}

}
