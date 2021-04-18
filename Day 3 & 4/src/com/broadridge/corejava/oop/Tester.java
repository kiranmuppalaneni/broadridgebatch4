package com.broadridge.corejava.oop;

public class Tester extends Employee {

	private int noOftestCases;
	private int noOfBugs;

	public Tester() {
		System.out.println(" Tetster Constructor is called");
	}

	public Tester(int id, String name, int expr, String sk, int sal, Address add, int not, int nob) {
		super(id, name, expr, sk, sal, add); // first stmt
		System.out.println(" Tetster Constructor with arg is called");
		noOftestCases = not;
		noOfBugs = nob;
	}

	public void testCode() {
		System.out.println("Tests the code");
	}

	public void reportBugs() {
		System.out.println("report bugs of the code");
	}

}
