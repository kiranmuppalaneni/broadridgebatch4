package com.broadridge.corejava.oop;

public class EmployeeMain {
	// [A.M] [N.A.M] rtype name [argument]
	public static void main(String[] args) {
		// While creating an object for a class
		// new k.w must invoke the constructor which must present in the class

		// variable created inside methods are called local
		// local variables never have default values
//		int employeeId = 10;
//		System.out.println(employeeId);
//
//		Address addr1 = new Address();
//		addr1.hno = "1-2-3";
//		addr1.city = "city1";
//		addr1.pincode = 12345;
//
//		Address addr2 = new Address("1-2-3", "city1", 12345);
//		addr2.hno = "4-5-6";
//		addr2.city = "city2";
//		addr2.pincode = 12121;
		//
		// // creating an object - at the same time i want initialize the object
//		Employee employee1 = new Employee(1001, "emp1", 5, "Manual Tetsing", 20000, addr1); // create an employee with
//		employee1.getEmployeeDetails();
//
//		Employee employee2 = new Employee(1002, "emp2", 15, "Automation Tetsing", 40000, addr2);
//		employee2.getEmployeeDetails();

		// Employee employee3 = new Employee();
		// employee3.getEmployeeDetails();

		//
		// employee1.initializeEmployee(1001, "emp1", 5, "Manual Tetsing", 20000,
		// addr1);// overwrite the initial values
		// employee2.initializeEmployee(1002, "emp2", 15, "Automation Tetsing", 40000,
		// addr2);// initial default values
		// double sal = employee1.getSalary();
		// System.out.println("before increament " + sal);
		// if (sal >= 20000 && sal < 40000) {
		// employee1.increamentSalary(30);
		// }
		// else {
		// employee1.increamentSalary(10);
		// }
		// System.out.println("After increament " + employee1.getSalary());

		// employee1.increamentSalary(30);
		// employee1.getSalary();
		//
		// employee2.getSalary();
		// employee2.increamentSalary(15);
		// employee2.getSalary();
		//
		// employee2.getSkill();
		// employee2.updateSkill("Java");
		// employee2.getSkill();

		// Account account = new Account();
		// account.withdraw(20000);

//		Developer d = new Developer();
//		d.setSalary(10000.00);
//		System.out.println(d.getSalary());
//		d.setAddress(null);
//		d.writeCode();
//		

		Tester t = new Tester(1001,"test1",4,"Testing",10000,null,10,2);
		t.getEmployeeDetails();
//		t.setSalary(10000.00);
//		System.out.println(t.getSalary());
//		t.testCode();
//		
//		Employee e = new Employee();
//		e.setAddress(null);

	}
}

// int a = 10;
// int[] b = {10,20,30,40,50};
// Employee emp = new Employee();
// employee2.employeeId = 1002;
// employee2.employeeName ="emp2";
// employee2.exp = 15;
// employee2.skill = "Automation Testing";
// System.out.println("********Emplyoee2*************");
// System.out.println(employee2.employeeId);
// System.out.println(employee2.employeeName);
// System.out.println(employee2.exp);
// System.out.println(employee2.skill);
//
// System.out.println(employee1);
// System.out.println(employee2);
//
//
// employee1.markAttendance();
// employee2.markAttendance();
