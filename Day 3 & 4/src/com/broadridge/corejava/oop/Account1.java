package com.broadridge.corejava.oop;

public class Account1 {
	
	private int accountId;
	private String customerName;
	private double balance;

	// constructor
	public Account1() {
		accountId = 1001;
		customerName = "cust1";
		balance = 10000.00;
	}

	public Account1(int id, String name, double bal) {
		accountId = id;
		customerName = name;
		balance = bal;
	}

	public void withdraw(double amount) {
		balance = balance - amount;
	}
	
	public void withdraw(int amount) {
		balance = balance - amount;
	}

	public void getAccountDetails() {
		System.out.println(accountId + "  " + customerName + " " + balance);
	}

	public static void main(String[] args) {
		
		Account1 acc1 = new Account1(1001,"cust1",10000.00); // default values
		acc1.getAccountDetails();

		Account1 acc2 = new Account1(1002,"cust2",20000.00);
		acc2.getAccountDetails();
		
		
		acc1.withdraw(2000);
		acc1.getAccountDetails();
		acc1.withdraw(5000);
		acc1.getAccountDetails();
		
		System.out.println(10);
		

	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", customerName=" + customerName + ", balance=" + balance + "]";
	}
	
	
}
