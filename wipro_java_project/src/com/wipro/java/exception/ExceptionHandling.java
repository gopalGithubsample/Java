package com.wipro.java.exception;


public class ExceptionHandling {

    static int l = 2; // It has class-level declaration.

    @SuppressWarnings("unused")
	public static void main(String args[]) {
        int i = 50, j = 0;

        try {

            int a[] = new int[5]; // Array is a collection of the same type of object.
            a[5] = 30 / j; // This will cause both an ArrayIndexOutOfBoundsException AND ArithmeticException.  The ArrayIndexOutOfBoundsException will be thrown first.
           
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.toString());
        } finally {
            System.out.println("Finally block: I am always executed.");
        }

        System.out.println("Rest of the code.."); // This will execute even if an exception is caught.

    }
}
