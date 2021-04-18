package com.broadridge.corejava.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowDemo {

	public static void main(String[] args) {

		// ArithmeticException ae = new ArithmeticException(); // JVM
		// throw ae;

		// read the age
		// and check the age
		// InvalidAgeException ie = new InvalidAgeException();
		// throw ie; // throw is a kw used to throw exception programmatically

		// String str = new String("Hello World");
		// char c = str.charAt(6);
		// System.out.println(c);

		// Maths m = new Maths();
		// try {
		// int result = m.square(-12);
		// System.out.println(result);
		// }
		// catch (InvalidNumberException e) {
		//
		// }
		// int i = 10/0;

		try {
			FileInputStream fIn = new FileInputStream("abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
