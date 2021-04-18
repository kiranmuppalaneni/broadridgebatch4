package com.broadridge.corejava.collection;

import java.util.Iterator;
import java.util.LinkedList;

import com.broadridge.corejava.oop.Account;
import com.broadridge.corejava.oop.Employee;

public class CollectionsListDemo {

	public static void main(String[] args) {

		// Collection collection = new ArrayList();// We can call only the methods of
		// collection

		// List collection = new ArrayList(); // We can call only the methods of list &
		// collection

//		ArrayList collection = new ArrayList();// We can call only the methods of ArrayList & List & collection
		LinkedList collection = new LinkedList();
		collection.add(1);
		collection.add("Hello");
		collection.add(new Employee(1001, "emp1", 3, "testing", 20000, null));
		collection.add(1);
		collection.add("Hello");
		collection.add(null);
		collection.add(null);
		collection.add("World");

		System.out.println(collection); // prints the objects inside a collection

		boolean b = collection.contains("Hello");
		System.out.println(b);

		collection.remove("World");
		System.out.println(collection);

		collection.add(5, "Java");
		System.out.println(collection);

		Object obj = collection.get(4);
		System.out.println(obj);

		// int i = collection.indexOf("Hello");
		int i = collection.lastIndexOf("Hello");
		System.out.println(i);

		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			Object obj1 = iterator.next();
			System.out.println(obj1);
		}

		collection.clear();

	}
}
