package com.wipro.oops;
public class projectLead extends Employee {

	public projectLead() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//Child object is instantiated from child constructor
		//Parent class consumes the properties and behaviors of child class
		Employee emp=new projectLead();
		emp.setId(1,2,3,4);
		emp.setName("rohan");
		emp.Salary(20000f);
		
		System.out.println(emp.getId();
		System.out.println(emp.getName();
		System.out.println(emp.getSalary();
		
	}

}
