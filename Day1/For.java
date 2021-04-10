package com.broadridge.corejava;

public class For {

	public static void main(String[] args) {

		// for (int i = 1; i <= 10; i++) {
		// System.out.println(i);
		// }

		// int j = 3;
		// int result ;
		// for (int i=1 ; i <= 10; i++ ) {
		// result = j * i; // 1*1
		// System.out.println( j +" * "+ i + " = " + result);
		// }

		int j = 0; 
		for (int i = 1; i <= 10; i++) {
			j = j + i;            
		}
		
		System.out.println(j);
		System.out.println("Main End ");
	}

}
