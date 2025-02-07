package com.wipro.java.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Adjust {
	
	
	// Function to check date and time
	// According to our requirement
	
	public static void checkingAdjusters() {
		
		LocalDate date = LocalDate.now();
		System.out.println("The current date is "+ date);
		
		// to get the first day of next month
		LocalDate dayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("First day of next month : "+ dayOfNextMonth);
		
		// get the next saturday

		LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));

		System.out.println("next saturday from now is "+nextSaturday);

		// first day of current month
		
		LocalDate firstDay = date.with(TemporalAdjusters. firstDayOfMonth());

		System.out.println("firstDayOfMonth : " + firstDay);
		
		// Last day of current month
		
		LocalDate lastDay = date.with(TemporalAdjusters. firstDayOfMonth());

		System.out.println("firstDayOfMonth : " + lastDay);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkingAdjusters();
		

	}

}
