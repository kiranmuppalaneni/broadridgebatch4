package com.broadridge.corejava.oop;

public class AccountMain {
	// JVM - AccountMain.main()
	public static void main(String[] args) {
		Account a = new SavingsAccount();
		SavingsAccount sa = new SavingsAccount();
		a.getInterest();
		a.getBalance();
		SavingsAccount.test();
		sa.getInterest();
		SavingsAccount.callMe();
	}
}