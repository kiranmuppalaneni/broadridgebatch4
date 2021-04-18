package com.broadridge.corejava.exception;

public class Maths {

	public int square(int n) throws InvalidNumberException {
		if (n > 0) {
			return n * n;
		} else {
			throw new InvalidNumberException();
		}
	}
}
