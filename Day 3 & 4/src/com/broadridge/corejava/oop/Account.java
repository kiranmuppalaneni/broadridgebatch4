package com.broadridge.corejava.oop;

// A class with abstract kw. A class becomes an abstract class when it has at
// least one abstract method. but still // a class created as abstract without
// any abstract methods. 
public abstract class Account {
	private int accountNumber; // non- static or instance
	private String customerName;
	private double balance;

	private static final double minimumBalance = 5000; // static or class

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public abstract double getInterest();

	public static final void callMe() {
		System.out.println("Call Me");
	}// //
}
// public
// void
// callMe(int
// i)
// {//
// System.out.println("Call
// Me1212121");//
// }}