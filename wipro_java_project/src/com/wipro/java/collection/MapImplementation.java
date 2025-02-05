package com.wipro.java.collection;

import java.util.HashMap;
import java.util.Map;


public class MapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Car");
		map.put(2, "Bike");
		map.put(3, "Ship");
		
		System.out.println("Key 1: "+ map.get(1));
		System.out.println("Key 1: "+ map.get(2));
		
		if (map.containsKey (3)) {

			System.out.println("Key 3 exists with value:" + map.get(3));
		}
			// Iterating over the map using for-each loop

		System.out.println("\nIterating through the map:");

		for (Map.Entry<Integer, String> entry: map.entrySet()) { 
			System.out.println(entry.getKey()+":"+ entry.getValue());
		}
			// Removing a key-value pair

		map.remove(2); // Removes the key 2 (and its associated value)

			// Display the map after removal


		System.out.println("\nMap after removal of key 2:");

		for (Map. Entry<Integer, String> entry : map.entrySet()){
			System.out.println(entry.getKey()+":"+ entry.getValue());
		}

	}

}
