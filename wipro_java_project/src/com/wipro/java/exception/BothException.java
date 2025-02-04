package com.wipro.java.exception;

public class BothException {

    @SuppressWarnings("null")
	public static void main(String args) {

        int number = 0;

        try {
        	
            number = 5;
            

            int result = 10 / number; // This might throw ArithmeticException or NumberFormatException
            System.out.println("10 divided by " + number + " is: " + result);

            String name = null; //Assigning null to name variable
            System.out.println("Name length: " + name.length()); //This will throw NullPointerException because name is pointing to null.

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a whole number.");
        } catch (NullPointerException e){
            System.out.println("Error: Name cannot be null");
        } finally {
            System.out.println("This always runs.");
        }

        System.out.println("Program continues...");
    }
}