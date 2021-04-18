package com.broadridge.corejava.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import com.broadridge.corejava.oop.Account;
import com.broadridge.corejava.oop.Employee;

public class CollectionsSetDemo {

	public static void main(String[] args) {

		// Collection collection = new HashSet();// We can call only the methods of
		// collection

		// Set collection = new HashSet(); // We can call only the methods of Set &
		// collection

		// HashSet collection = new HashSet();// We can call only the methods of HashSet
		// & Set & collection
		Collection collection = new HashSet();
		
		collection.add(1);
		collection.add("Hello");
		collection.add(new Employee(1001, "emp1", 3, "testing", 20000, null));
		collection.add(1);
		collection.add("Hello");
		collection.add(null);
		collection.add(null);
		collection.add("World");
		collection.add("Hello");
		collection.add(null);
		collection.add(null);
		collection.add("World");
		collection.add("Hello");
		collection.add(null);
		collection.add(null);
		collection.add("World");

		System.out.println(collection); // prints the objects inside a collection
		//
		boolean b = collection.contains("Hello");
		System.out.println(b);
		////
		collection.remove("World");
		System.out.println(collection);
		// interface variable  sub class object     // by calling iterator method sub class object is created
		Iterator iterator = collection.iterator(); // iterator methods
		while (iterator.hasNext()) {
			Object obj1 = iterator.next();
			System.out.println(obj1);
		}
		//
		// collection.clear();

	}
}
