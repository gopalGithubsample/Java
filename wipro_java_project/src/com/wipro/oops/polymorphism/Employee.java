package com.wipro.oops.polymorphism;

public class Employee extends Person {
    private String employeeId;
    private String department;

    public Employee() {} //No-argument constructor

    public Employee(String name, int age, String address, String employeeId, String department) {
        super(name, age, address);
        this.employeeId = employeeId;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee - " + super.toString() + ", Employee ID: " + employeeId + ", Department: " + department;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Ram", 30, "789 Pine Ln", "E12345", "Sales");
        System.out.println(employee1);

        Employee employee2 = new Employee();
        employee2.setName("Rahul");
        employee2.setAge(35);
        employee2.setAddress("101 Elm St");
        employee2.setEmployeeId("E67890");
        employee2.setDepartment("Marketing");
        System.out.println(employee2);
    }
}