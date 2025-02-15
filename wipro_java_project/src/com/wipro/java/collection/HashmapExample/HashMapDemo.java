package com.wipro.java.collection.HashmapExample;
import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

    public static void main(String[] args) {

        // 1. Create a HashMap:
        HashMap<String, Integer> studentScores = new HashMap<>();

        // 2. Add elements (put):
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 88);
        studentScores.put("Charlie", 92);
        studentScores.put("David", 85);  // Adding another student

        System.out.println("Initial HashMap: " + studentScores);


        // 3. Access elements (get):
        int aliceScore = studentScores.get("Alice");
        System.out.println("Alice's score: " + aliceScore);

        //Handle a key that might not exist.
        Integer eveScore = studentScores.get("Eve"); //Returns null if the key is not present.
        if (eveScore != null) {
            System.out.println("Eve's score: " + eveScore);
        } else {
            System.out.println("Eve's score not found.");
        }

        // 4. Change elements (replace):
        studentScores.replace("Bob", 90);  // Update Bob's score
        System.out.println("HashMap after update: " + studentScores);


        // 5. Remove elements (remove):
        studentScores.remove("Charlie");
        System.out.println("HashMap after removal: " + studentScores);


        // 6. Iterate through the HashMap: (Important!)

        // a) Using keySet(): (For iterating through keys)
        System.out.println("\nIterating through keys:");
        for (String key : studentScores.keySet()) {
            System.out.println("Student: " + key);
        }

        // b) Using values(): (For iterating through values)
        System.out.println("\nIterating through values:");
        for (Integer score : studentScores.values()) {
            System.out.println("Score: " + score);
        }

        // c) Using entrySet(): (For iterating through both keys and values)
        System.out.println("\nIterating through entries (key-value pairs):");
        for (Entry<String, Integer> entry : studentScores.entrySet()) {
            String student = entry.getKey();
            int score = entry.getValue();
            System.out.println("Student: " + student + ", Score: " + score);
        }


        // 7. Other useful methods:
        System.out.println("\nHashMap size: " + studentScores.size());
        System.out.println("Is HashMap empty? " + studentScores.isEmpty());
        System.out.println("Contains key 'Alice'? " + studentScores.containsKey("Alice"));
        System.out.println("Contains value 90? " + studentScores.containsValue(90));

        studentScores.clear(); //Removes all the entries.
        System.out.println("\nHashMap after clear(): " + studentScores);
    }
}