package com.broadridge.corejava.collection;

import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;

import com.broadridge.corejava.oop.Account;
import com.broadridge.corejava.oop.Employee;

public class Utitlityclasses {
	public static void main(String[] args) {
		// collections frame is introduced in java 1.2
		// 1.0 - vector, stack Dictionary,HashTable - legacy collections .

		Date d = new Date();
		System.out.println(d);

		LinkedList<String> collection = new LinkedList<>();
		collection.add("Hello");
		collection.add("Java");
		collection.add("World");
		collection.add("Broadgeridge");
		collection.add("Computer");
		collection.add("India");
		System.out.println(collection);
		
		Collections.sort(collection);
		System.out.println(collection);
		
		Collections.shuffle(collection);
		System.out.println(collection);
	}
}
