package com.wipro.java.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("wrong path");
			FileReader reader = new FileReader(file);
		}
		catch(IOException e) {
			System.out.println(e.getStackTrace());
		}

	}

}
