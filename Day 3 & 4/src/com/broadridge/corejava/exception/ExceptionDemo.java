package com.broadridge.corejava.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {

	public static void main(String[] args) {

		System.out.println("Main Start ");

		// java.lang.ArithmeticException . it creates an Object for that class
		// and throws that object into your program. Handling the object which is thrown
		// is call as exception

		// 1. is always object created by a program ? No
		// 2. Are all objects are same? No. each object has it own purpose
		// 3. to represent runtime error.
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]); // ArrayIndexOutOfBoundsException
			int i = a / b; // risky code
			System.out.println(" I = " + i);
		} catch (ArithmeticException ae) {
			System.err.println("Airthmeticexception Caught ");
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.err.println("Provide 2 values ");
		} catch (NumberFormatException ae) {
			System.err.println("Provide 2 integer values ");
		} catch (Exception e) {
			System.err.println("Unknown Exception ");
		} finally {
			System.out.println("finally Complusary stmt");
		}

		System.out.println("Main End ");

	}

}
