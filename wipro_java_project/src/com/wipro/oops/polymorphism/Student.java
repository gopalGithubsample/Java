package com.wipro.oops.polymorphism;

public class Student extends Person {
    private String studentId;
    private String major;

    public Student() {} //No-argument constructor

    public Student(String name, int age, String address, String studentId, String major) {
        super(name, age, address); // Call the superclass constructor
        this.studentId = studentId;
        this.major = major;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student - " + super.toString() + ", Student ID: " + studentId + ", Major: " + major;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Harry", 20, "123 Main St", "S12345", "Computer Science");
        System.out.println(student1);

        Student student2 = new Student();
        student2.setName("Pratik");
        student2.setAge(22);
        student2.setAddress("456 Oak Ave");
        student2.setStudentId("S67890");
        student2.setMajor("Biology");
        System.out.println(student2);

    }
}
