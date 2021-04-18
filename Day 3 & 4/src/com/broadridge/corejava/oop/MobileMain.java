package com.broadridge.corejava.oop;

public class MobileMain {
	public static void main(String[] args) {
//		mob1 - variable referencing the object
		Mobile mob1 = new Mobile();
		mob1.companyName = "IPhone";
		
		Mobile mob2 = new Mobile();
		mob2.companyName ="Samsung";
		
		System.out.println(mob1.companyName);
		System.out.println(mob2.companyName);
		
     // two variables referring to same object
		Mobile mob3 = mob1;   // ***************
		mob3.companyName="MI";
		
		System.out.println(mob1.companyName);
		System.out.println(mob3.companyName);
		
		mob1 = new Mobile();
		mob1.companyName = "Vivo";
		
		System.out.println(mob1.companyName);
		System.out.println(mob3.companyName);
		
		Address addr = new Address();
		
	}
}
