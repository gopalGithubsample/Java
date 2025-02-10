package com.java.wipro.java8.usecase;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Optional;

// EmployeeService class manages employee operations like adding, searching, sorting, etc.
public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();  // List to store employee data

    // Method to add an employee
    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee added: " + emp);
    }

    // Method to remove an employee by ID
    public void removeEmployee(int id) {
        employees.removeIf(emp -> emp.getId() == id);
        System.out.println("Employee with ID " + id + " removed.");
    }

    // Method to search for an employee by ID
    public Optional<Employee> searchEmployee(int id) {
        return employees.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst();
    }

    // Method to update an employee's salary
    public void updateSalary(int id, double newSalary) {
        employees.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .ifPresent(emp -> emp.setSalary(newSalary));
    }

    // Method to display all employees
    public void displayEmployees() {
        employees.forEach(System.out::println);
    }

    // Method to filter employees based on department
    public List<Employee> filterByDepartment(String department) {
        return employees.stream()
                .filter(emp -> emp.getDepartment().equalsIgnoreCase(department))
                .collect(Collectors.toList());
    }

    // Method to sort employees by name
    public List<Employee> sortByName() {
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
    }

    // Method to calculate the average salary of all employees
    public double getAverageSalary() {
        return employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);  // Return 0 if no employees exist
    }
}