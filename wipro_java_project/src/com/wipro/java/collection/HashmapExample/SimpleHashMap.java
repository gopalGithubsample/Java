package com.wipro.java.collection.HashmapExample;

public class SimpleHashMap<K, V> {

    private Entry<K, V>[] table;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;

    public SimpleHashMap() {
        table = new Entry[DEFAULT_CAPACITY];
        size = 0;
    }

    public void put(K key, V value) {
        int index = getIndex(key);

        if (table[index] == null) {
            table[index] = new Entry<>(key, value);
            size++;
        } else {
            Entry<K, V> current = table[index];
            while (current != null) {
                if (current.key.equals(key)) {
                    current.value = value; // Update existing value
                    return; // Key already exists, update and return
                }
                if (current.next == null) { // Reached the end of the chain
                    current.next = new Entry<>(key, value);
                    size++;
                    return;
                }
                current = current.next;
            }
        }
    }

    public V get(K key) {
        int index = getIndex(key);
        Entry<K, V> current = table[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null; // Key not found
    }

    public V remove(K key) {
        int index = getIndex(key);
        Entry<K, V> current = table[index];
        Entry<K, V> previous = null;

        while (current != null) {
            if (current.key.equals(key)) {
                V removedValue = current.value;
                if (previous == null) { // Removing head of the list
                    table[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return removedValue;
            }
            previous = current;
            current = current.next;
        }
        return null;
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int getIndex(K key) {
        if (key == null) {
            return 0; // Or handle null keys differently if needed
        }
        return Math.abs(key.hashCode() % table.length);
    }



    private static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }


    public static void main(String[] args) {
        SimpleHashMap<String, Integer> map = new SimpleHashMap<>();

        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        System.out.println("Value of apple: " + map.get("apple")); // Output: 1
        System.out.println("Value of banana: " + map.get("banana")); // Output: 2
        System.out.println("Value of orange: " + map.get("orange")); // Output: 3
        System.out.println("Value of grape: " + map.get("grape"));  // Output: null

        map.put("apple", 10); // Update value
        System.out.println("Updated value of apple: " + map.get("apple")); // Output: 10

        map.remove("banana");
        System.out.println("Value of banana after removal: " + map.get("banana")); // Output: null

        System.out.println("Size of map: " + map.size()); // Output: 2
        System.out.println("Is map empty? " + map.isEmpty()); // Output: false


        SimpleHashMap<Integer, String> intMap = new SimpleHashMap<>();
        intMap.put(1, "One");
        intMap.put(2, "Two");
        System.out.println("Value of 1: " + intMap.get(1)); // Output: One

        //Demonstrating collision
        map.put("kiwi",4); //same index as apple
        System.out.println("Value of kiwi: " + map.get("kiwi")); // Output: 4
        System.out.println("Value of apple: " + map.get("apple")); // Output: 10 (still there)

    }
}
