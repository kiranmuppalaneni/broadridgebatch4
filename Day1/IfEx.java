package com.broadridge.corejava;

public class IfEx {

	public static void main(String[] args) {

		 // IF covid  - WFH
//		              - WFO
//		int age = 33;
////		 either true or false
//		
//		if(age >  45){
//			System.out.println("Eligible for Covid Vaccine"); // true
//		}
//		else{
//			System.out.println("Wait for your turn");   // false
//		}
//		
		double money = 15000.00;
		
		if( money >= 50000.00) { 
			int a = 20;
			System.out.println("Buy I Phone  " + money);
		}
		else if ( money > 20000 && money < 50000){
			System.out.println("Samsung  " + money);
		}
		else {
			System.out.println("Other  " + money);
		}
		
		
		System.out.println("Main End");
		

	}

}
