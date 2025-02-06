package com.wipro.java.collection;

import java.util.*;

public class Collection {

    public static void main(String[] args) {

        // 1. Array (Basic Array) - with for loop printing:
        int[] myArray = new int[5];
        myArray[0] = 100;
        myArray[1] = 200;
        myArray[2] = 300;
        myArray[3] = 400;
        myArray[4] = 500;

        System.out.println("Array elements (using for loop):");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element at index " + i + ": " + myArray[i]);
        }

        // 2. LinkedList:
        List<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Alpha");
        myLinkedList.add("Beta");
        myLinkedList.add("Gamma");

        System.out.println("\nLinkedList: " + myLinkedList);
        myLinkedList.remove(1); // Remove element at index 1
        System.out.println("LinkedList after removal: " + myLinkedList);
        System.out.println("First element of LinkedList: " + myLinkedList.get(0)); // Accessing element


        // 3. ArrayList:
        List<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);

        System.out.println("\nArrayList: " + myArrayList);

        List<Integer> anotherList = new ArrayList<>();
        anotherList.add(40);
        anotherList.add(50);

        myArrayList.addAll(1, anotherList); // Add anotherList to myArrayList at index 1
        System.out.println("ArrayList after addAll(): " + myArrayList);

        myArrayList.remove(2); // Remove element at index 2
        System.out.println("ArrayList after remove(): " + myArrayList);

        myArrayList.set(0, 1000); // Set element at index 0 to 1000
        System.out.println("ArrayList after set(): " + myArrayList);



        // 4. HashMap:
        Map<String, String> myHashMap = new HashMap<>();
        myHashMap.put("Name", "Alice");
        myHashMap.put("Age", "30");
        myHashMap.put("City", "New York");

        System.out.println("\nHashMap: " + myHashMap);
        System.out.println("Name from HashMap: " + myHashMap.get("Name"));

        if (myHashMap.containsKey("Age")) {
            System.out.println("Age exists in HashMap with value: " + myHashMap.get("Age"));
        }

        System.out.println("\nIterating through HashMap:");
        for (Map.Entry<String, String> entry : myHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        myHashMap.remove("City");
        System.out.println("\nHashMap after removing City: " + myHashMap);

    }
}
