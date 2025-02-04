package com.wipro.java.exception;

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String str = null;
			System.out.println(str.length());
		}
		catch(Exception e){
			System.out.println(e.getStackTrace());
		}

	}

}
