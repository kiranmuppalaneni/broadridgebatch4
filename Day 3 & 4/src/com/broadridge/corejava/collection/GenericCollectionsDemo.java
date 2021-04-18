package com.broadridge.corejava.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.broadridge.corejava.oop.Employee;

public class GenericCollectionsDemo {

	public static void main(String[] args) {

		// Collection<String> collection = new ArrayList();
		// 10 size
		Collection<Employee> collection = new ArrayList<>(); // Sorting logic - similar type
		collection.add(new Employee(1001, "emp1", 3, "testing", 10000, null));
		collection.add(new Employee(1002, "emp2", 6, "testing", 20000, null));
		collection.add(new Employee(1003, "emp3", 5, "testing", 50000, null));
		collection.add(new Employee(1004, "emp4", 9, "testing", 150000, null));
		collection.add(new Employee(1005, "emp5", 10, "testing", 200000, null));

		System.out.println(collection); // prints the objects inside a collection
		//
		boolean b = collection.contains("Hello");
		System.out.println(b);
		////
		collection.remove("World");
		System.out.println(collection);
		// interface variable sub class object // by calling iterator method sub class
		// object is created
		Iterator<Employee> iterator = collection.iterator(); // iterator methods
		while (iterator.hasNext()) {
			Employee emp = iterator.next();
			System.out.println(emp);
		}
		//
		// collection.clear();

		for (Employee emp : collection) {
			System.out.println(emp);
		}

	}
}
