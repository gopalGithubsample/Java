package com.wipro.java.exception;


public class ExceptionHandling {

    static int l = 2; // It has class-level declaration.

    public static void main(String args[]) {
        int i = 50, j = 0;

        try {

            int a[] = new int[5]; // Array is a collection of the same type of object.
            a[5] = 30 / j; // This will cause both an ArrayIndexOutOfBoundsException AND ArithmeticException.  The ArrayIndexOutOfBoundsException will be thrown first.
           
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception occurred: " + e.toString());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception (Division by zero) occurred: " + e.toString());
        } catch (Exception e) { // Generic exception handler (good practice to include).
            System.out.println("Some other exception occurred: " + e.toString());
           
        } finally {
            System.out.println("Finally block: I am always executed.");
        }

        System.out.println("Rest of the code.."); // This will execute even if an exception is caught.

    }
}
