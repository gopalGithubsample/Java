package com.java.wipro.java8.usecase.test;

import com.java.wipro.java8.usecase.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {
    private EmployeeService service;

    @BeforeEach
    void setUp() {
        service = new EmployeeService();
        service.addEmployee(new Employee(1, "Alice", "IT", 50000, LocalDate.of(2020, 5, 10)));
        service.addEmployee(new Employee(2, "Bob", "HR", 45000, LocalDate.of(2019, 3, 15)));
        service.addEmployee(new Employee(3, "Charlie", "Finance", 60000, LocalDate.of(2021, 8, 22)));
    }

    @Test
    void testAddEmployee() {
        service.addEmployee(new Employee(4, "David", "Marketing", 55000, LocalDate.of(2022, 6, 1)));
        Optional<Employee> employee = service.searchEmployee(4);
        assertTrue(employee.isPresent());
        assertEquals("David", employee.get().getName());
    }

    @Test
    void testRemoveEmployee() {
        service.removeEmployee(2);
        Optional<Employee> employee = service.searchEmployee(2);
        assertFalse(employee.isPresent());
    }

    @Test
    void testSearchEmployee() {
        Optional<Employee> employee = service.searchEmployee(1);
        assertTrue(employee.isPresent());
        assertEquals("Alice", employee.get().getName());
    }

    @Test
    void testUpdateSalary() {
        service.updateSalary(1, 60000);
        Optional<Employee> employee = service.searchEmployee(1);
        assertTrue(employee.isPresent());
        assertEquals(60000, employee.get().getSalary());
    }

    @Test
    void testFilterByDepartment() {
        List<Employee> itEmployees = service.filterByDepartment("IT");
        assertEquals(1, itEmployees.size());
        assertEquals("Alice", itEmployees.get(0).getName());
    }

    @Test
    void testSortByName() {
        List<Employee> sortedEmployees = service.sortByName();
        assertEquals("Alice", sortedEmployees.get(0).getName());
        assertEquals("Bob", sortedEmployees.get(1).getName());
        assertEquals("Charlie", sortedEmployees.get(2).getName());
    }

    @Test
    void testGetAverageSalary() {
        double avgSalary = service.getAverageSalary();
        assertEquals((50000 + 45000 + 60000) / 3.0, avgSalary, 0.01);
    }
}
