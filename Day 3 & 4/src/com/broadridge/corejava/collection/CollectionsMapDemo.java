package com.broadridge.corejava.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionsMapDemo {

	public static void main(String[] args) {

//		Map  map = new HashMap();
		Map<Integer,String>  map = new TreeMap<>(); // Keys will be sorted
		map.put(1, "One");
		map.put(2, "Two");
		map.put(4, "Four");
		map.put(3, "Three");
		map.put(5, "Five");
		
		System.out.println(map);
		
		map.put(5, "Fve");
		System.out.println(map);
		
		Object obj = map.get(4);
		System.out.println(obj);
		
		map.remove(3);
		System.out.println(map);
		
		System.out.println(map.containsKey(6));
		
		
		Set keys = map.keySet(); //retrieve all keys
		System.out.println(keys);
		
		Collection values = map.values(); //retrieve all keys
		System.out.println(values);
		
		Set entry = map.entrySet(); //retrieve all keys
		Iterator iterator = entry.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
//		System.out.println(entry);
	}
}
