
package com.wipro.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

		List<Integer> sortedNumbers = numbers.stream()

		    .sorted()

		    .collect(Collectors.toList()); 
		System.out.println(sortedNumbers);
		
		List<Integer> Numbers = Arrays.asList(10, 20, 5, 25, 30);
		int min = Numbers.stream().min(Integer::compare).get();
		int max = Numbers.stream().max(Integer::compare).get();
		System.out.println(Numbers);
		System.out.println(min);
		System.out.println(max);

	}

}
