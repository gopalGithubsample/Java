package com.java.wipro.java8.usecase2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class OOPsWithCollections {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 1200.0, "Electronics"));
        products.add(new Product(2, "Mouse", 25.0, "Electronics"));
        products.add(new Product(3, "Keyboard", 75.0, "Electronics"));
        // ... add more products

        // 1. Array (Basic Array):
        Product[] productArray = new Product[products.size()];
        productArray = products.toArray(productArray); // Efficiently copy the ArrayList to an Array

        System.out.println("Array of Products:");
        for (Product product : productArray) {
            System.out.println(product);
        }

        // 2. LinkedList:
        List<Product> productLinkedList = new LinkedList<>(products);
        System.out.println("\nLinkedList of Products:");
        productLinkedList.forEach(System.out::println);


        // 3. ArrayList:
        System.out.println("\nArrayList of Products:");
        products.forEach(System.out::println); // products is already an ArrayList


        // 4. HashMap:
        Map<Integer, Product> productMap = new HashMap<>();
        products.forEach(product -> productMap.put(product.getId(), product));

        System.out.println("\nHashMap of Products (ID -> Product):");
        productMap.forEach((id, product) -> System.out.println("ID: " + id + ", " + product));

    }
}