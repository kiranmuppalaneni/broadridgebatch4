package com.broadridge.corejava.oop;

public class SavingsAccount extends Account {
	@Override
	public double getInterest() {
		return getBalance() + getBalance() * 0.2;
	}

	public static void test() {
	}
}