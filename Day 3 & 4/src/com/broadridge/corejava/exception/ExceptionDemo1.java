package com.broadridge.corejava.exception;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("Main Start ");

		ExceptionDemo1 ed1 = null;
		ed1.method1(); // NullPointerException

		System.out.println("Main End ");
	}

	public void method1() {
		System.out.println("Method1 Start ");

		method2();

		System.out.println("Method1 End ");
	}

	public void method2() {
		System.out.println("Method2 Start ");

		int i = 10 / 0; // ArithmeticException

		System.out.println("Method2 End ");
	}

}
