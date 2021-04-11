package com.broadridge.corejava.oop;

// Data type
public class Address {

	public String hno;
	public String city;
	public long pincode;

	// 1.If there is no Programmer created
	// constructor at compilation time the
	// java compiler provides one constructor
	// that is a no arg constructor

	// 2. If there is a Programmer created
	// constructor compiler will not add any
	// constructors

	public Address() {
		System.out.println("Address class no arg constructor is called");
	}

	public Address(String hn, String ci, long pin) {
		System.out.println("Address class Arg constructor is called");
		hno = hn;
		city = ci;
		pincode = pin;
	}
}
