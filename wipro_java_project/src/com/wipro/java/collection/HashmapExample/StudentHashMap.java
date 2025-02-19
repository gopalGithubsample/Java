package com.wipro.java.collection.HashmapExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentHashMap {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Aarav", 101));
        students.add(new Student("Diya", 102));
        students.add(new Student("Aarav", 103)); // Duplicate name
        students.add(new Student("Ishaan", 104));
        students.add(new Student("Diya", 102)); // Duplicate name and roll number
        students.add(new Student("Vihaan", 105));
        students.add(new Student("Siya", 106));
        students.add(new Student("Aarav", 107)); // Duplicate name
        students.add(new Student("Reyansh", 108));
        students.add(new Student("Anika", 109));


        Map<Integer, List<Student>> studentMap = new HashMap<>();

        for (Student student : students) {
            if (!studentMap.containsKey(student.getRollNumber())) {
                studentMap.put(student.getRollNumber(), new ArrayList<>());
            }
            studentMap.get(student.getRollNumber()).add(student);
        }


        //Print the HashMap using for loop
        for (Integer rollNumber : studentMap.keySet()) {
            System.out.println("Roll Number: " + rollNumber);
            for (Student student : studentMap.get(rollNumber)) {
                System.out.println("  " + student);
            }
        }
    }
}

