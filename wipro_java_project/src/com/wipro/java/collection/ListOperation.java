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
		
		
		
		//will add list l2 from 1 index
		l1.addAll(1,l2);//size or memory is not fixed

		System.out.println(l1);

		//removes element from index1
		l1.remove(1);

		//printing the updated list 1
		System.out.println(l1);

		// Sets index 0 value to 5
		l1.set(0,5);
		System.out.println(l1);
	}

}
