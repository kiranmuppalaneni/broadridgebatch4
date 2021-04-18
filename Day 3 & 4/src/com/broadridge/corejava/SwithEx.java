package com.broadridge.corejava;

public class SwithEx {

	public static void main(String[] args) {
         int a = 10;
         int b = 20;
		
		int option = 2;

		switch (option) {
		case 1:
			 System.out.println("Sum ");
			 System.out.println(a+b);
			 break;
		case 2:
			System.out.println("Sub");
			if(a>b) {
			 System.out.println("Sub");
			 System.out.println(a-b);
			}
			 break;
		case 3:
			 System.out.println("Mul ");
			 System.out.println(a*b);
			 break;
		case 4:
			 System.out.println("Div ");
			 System.out.println(a/b);
			 break;
		default:
			System.out.println("Wrong Option");
	    }

		System.out.println("Main End");

	}

}
