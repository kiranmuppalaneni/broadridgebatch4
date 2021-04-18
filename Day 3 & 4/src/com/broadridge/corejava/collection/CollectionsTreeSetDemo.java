package com.broadridge.corejava.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

import com.broadridge.corejava.oop.Account;
import com.broadridge.corejava.oop.Employee;

public class CollectionsTreeSetDemo {

	public static void main(String[] args) {


		Collection collection = new TreeSet();  // Sorting logic - similar type 
		collection.add("Hello");
		collection.add("Java");
		collection.add("Broadridge");
		collection.add("Testing");
		collection.add("hello");
		collection.add("World");
		collection.add("Computer");
//		collection.add(null);
		
		System.out.println(collection); // prints the objects inside a collection
		//
//		boolean b = collection.contains("Hello");
//		System.out.println(b);
//		////
//		collection.remove("World");
//		System.out.println(collection);
//		// interface variable  sub class object     // by calling iterator method sub class object is created
//		Iterator iterator = collection.iterator(); // iterator methods
//		while (iterator.hasNext()) {
//			Object obj1 = iterator.next();
//			System.out.println(obj1);
//		}
//		//
//		// collection.clear();

	}
}
