package com.broadridge.corejava.oop;

//class - structure -  user Defined Data type - combination methods, variable
public class Employee {
	// fields
	private int employeeId;
	private String employeeName; // Object
	private int exp;
	private String skill;
	private double salary;
	private Address address; // Object // null
    
	// Constructor - Special method - it is called implicitly by always new operator
	public Employee(){
		System.out.println("Constructor is called");
		employeeId = 1001;
		employeeName= "emp1";
		exp = 5;
		skill = "Manual testing";
		salary =  10000;
		System.out.println("Constructor is end");
	}
	
	//Implicitly called at the time of object creation
//	 One time executable
	public Employee(int id,String name,int expr,String sk , int sal,Address add) {
		// Operate on fields 
//		A instance method of a can access instance variable directly. with out object reference.
		
		employeeId = id;
		employeeName= name;
		exp = expr;
		skill = sk;
		salary =  sal;
		address = add;
	}
	
//	 This method explicitly called after object creation
//	n method
	public void initializeEmployee(int id,String name,int expr,String sk , int sal,Address add) {
		// Operate on fields 
//		A instance method of a can access instance variable directly. with out object reference.
		employeeId = id;
		employeeName= name;
		exp = expr;
		skill = sk;
		salary =  sal;
		address = add;
	}
	// 10 fields - in every object 10 fields will be there

	// 4 - values together - 1 Employee
	
	// methods - 7
//	[A.M] [N.A.M] returntype methodname([arguments])[throws][{// method body}]
// what ever you do(99%) is working with methods. for writing application logic 
	public void markAttendance () {
         //		1..n stmts
		System.out.println("Employee Marked the attendance");
	}
//	                                   1001,"emp1",       5,"Manual Tetsing"
	
	
	public void getEmployeeDetails() {
		// read the values
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(exp);
		System.out.println(skill);
		System.out.println(salary);
//		System.out.println(address.hno +"  " + address.city + "   " +address.pincode);
	}
	
	public void increamentSalary(double percent) {
		salary =  salary + (salary*(percent/100));
	}
//	     void primitive data or reference data type
	public double getSalary() {
		// logic
		return salary; // return must be the last stmt 
	}
	
	public void updateSkill(String sk) {
		skill = skill + "," + sk;
	}
	
	public void getSkill() {
		System.out.println(skill);
	}
}
