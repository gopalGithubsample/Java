package com.wipro.java.java8;

public class StringApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Gopal Sharma";
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.substring(1,5));
		System.out.println(str.contains("G"));
		String [] a = str.split(" ");
		for(String str1:a) {
			System.out.println(str1);
		}

	}

}
