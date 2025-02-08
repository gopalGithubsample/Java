package com.java.wipro.java8.usecase;

import java.time.LocalDate;

//Employee class represents an employee entity with basic details.
public class Employee {
 private int id;
 private String name;
 private String department;
 private double salary;
 private LocalDate joiningDate;

 // Constructor to initialize an employee object
 public Employee(int id, String name, String department, double salary, LocalDate joiningDate) {
     this.id = id;
     this.name = name;
     this.department = department;
     this.salary = salary;
     this.joiningDate = joiningDate;
 }

 // Getter methods to retrieve employee information
 public int getId() { return id; }
 public String getName() { return name; }
 public String getDepartment() { return department; }
 public double getSalary() { return salary; }
 public LocalDate getJoiningDate() { return joiningDate; }

 // Setter methods to update employee details
 public void setName(String name) { this.name = name; }
 public void setDepartment(String department) { this.department = department; }
 public void setSalary(double salary) { this.salary = salary; }

 // toString method to print employee details
 @Override
 public String toString() {
     return "Employee { ID=" + id + ", Name='" + name + "', Dept='" + department +
             "', Salary=" + salary + ", JoiningDate=" + joiningDate + " }";
 }
}