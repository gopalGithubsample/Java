package com.java.wipro.java8.usecase.test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

import com.java.wipro.java8.usecase.Employee;

class EmployeeTest {
    private Employee employee;

    // Setup before each test case runs
    @BeforeEach
    void setUp() {
        employee = new Employee(1, "John Doe", "IT", 75000, LocalDate.of(2020, 1, 15));
    }

    @Test
    void testEmployeeConstructor() {
        assertEquals(1, employee.getId());
        assertEquals("John Doe", employee.getName());
        assertEquals("IT", employee.getDepartment());
        assertEquals(75000, employee.getSalary());
        assertEquals(LocalDate.of(2020, 1, 15), employee.getJoiningDate());
    }

    @Test
    void testSetName() {
        employee.setName("Jane Doe");
        assertEquals("Jane Doe", employee.getName());
    }

    @Test
    void testSetDepartment() {
        employee.setDepartment("HR");
        assertEquals("HR", employee.getDepartment());
    }

    @Test
    void testSetSalary() {
        employee.setSalary(85000);
        assertEquals(85000, employee.getSalary());
    }

    @Test
    void testToString() {
        String expected = "Employee { ID=1, Name='John Doe', Dept='IT', Salary=75000.0, JoiningDate=2020-01-15 }";
        assertEquals(expected, employee.toString());
    }
}
