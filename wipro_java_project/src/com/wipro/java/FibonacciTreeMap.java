package com.wipro.java;

import java.util.Map;
import java.util.TreeMap;

public class FibonacciTreeMap {
	public static void main(String[] args) {
		int limit = 20;
		TreeMap<Integer, Long> fibonacciMap = generateFibonacciTreeMap(limit);
		
		for(Map.Entry<Integer, Long> entry : fibonacciMap.entrySet()) {
			System.out.println("Fibonacci(" + entry.getKey() + ") = " + entry.getValue());
		}
		
	}
	
	public static TreeMap<Integer, Long> generateFibonacciTreeMap(int limit){
		TreeMap<Integer, Long> fibonacciMap = new TreeMap<>();
        long a = 0;
        long b = 1;

        if (limit >= 0) {
            fibonacciMap.put(0, a);
        }
        if (limit >= 1) {
            fibonacciMap.put(1, b);
        }

        for (int i = 2; i <= limit; i++) {
            long next = a + b;
            fibonacciMap.put(i, next);
            a = b;
            b = next;
        }

        return fibonacciMap;
	}

}
