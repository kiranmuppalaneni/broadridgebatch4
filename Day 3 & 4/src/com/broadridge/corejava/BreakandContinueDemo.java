package com.broadridge.corejava;

public class BreakandContinueDemo {

	public static void main(String[] args) {
		// break - to break the continuous of the program we use break. switch , loops

//		for (int i = 1; i <= 10; i++) {
//
//			if (i == 5) {
//				continue;
//			}
//			System.out.println(i);
//
//		}
		
		int[] i = {12,34,454,1232,3,45,21,54,212,343,2323,121,434,3,232,343};
		int searchValue = 3;
		for(int index = 0 ; index < i.length ; index++) {
			  if(i[index] == searchValue) {
				  System.out.println(" value " + searchValue + " found at " + index);
				  continue;
			  }
		}
		
	}

}
