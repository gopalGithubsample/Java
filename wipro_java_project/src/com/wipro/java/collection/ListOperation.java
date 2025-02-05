package com.wipro.java.collection;

import java.util.*;

public class ListOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an Object of List interface
		//implemented by the ArrayList class 
		
		List<Integer> l1 = new ArrayList<Integer>();
		
		//Adding elements to object of List interface
		//Custom inputs
		//Addition is different from replacement
		
		l1.add(0,1); //Position , Value
		l1.add(1,2);
		l1.add(2,3);
		
		//Print the elements inside object
		System.out.println(l1);
		
		
		List<Integer> l2 = new ArrayList<Integer>();
		
		
		
		l2.add(1); 
		l2.add(2);
		l2.add(3);
		
		l1.addAll(1,l2);
		
		System.out.println(l1);
		
		l1.remove(1);
		
		System.out.println(l1);
		
		System.out.println(l1.set(2, 5));
		System.out.println(l1);
		System.out.println(l1.get(2));

	}

}
