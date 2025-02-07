package com.wipro.java.junit;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int result = calculator.add(3, 2);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testAddWithNegativeNumbers() {
        int result = calculator.add(-3, -2);
        assertEquals(-5, result);
    }

    @Test
    public void testSubtractWithNegativeNumbers() {
        int result = calculator.subtract(-3, -2);
        assertEquals(-1, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.Multiply(3, 2);
        assertEquals(6, result);
    }

    @Test
    public void testMultiplyWithNegativeNumbers() {
        int result = calculator.Multiply(-3, 2);
        assertEquals(-6, result);
    }

    @Test
    public void testDivide() {
        int result = calculator.divide(6, 2);
        assertEquals(3, result);
    }

    @Test(expected = ArithmeticException.class) // Expecting an exception
    public void testDivideByZero() {
        calculator.divide(6, 0); // Should throw ArithmeticException
    }

    @Test
    public void testDivideWithNegativeNumbers() {
        int result = calculator.divide(-6, 2);
        assertEquals(-3, result);
    }
}
