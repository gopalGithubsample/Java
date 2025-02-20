package com.wipro.java.collection;

public class MyLinkedList<T> {

    private Node<T> head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void add(int index, T data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node<T> newNode = new Node<>(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void set(int index, T data) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = data;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        T removedData;
        if (index == 0) {
            removedData = head.data;
            head = head.next;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            removedData = current.next.data;
            current.next = current.next.next;
        }
        size--;
        return removedData;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        Node<T> current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }


    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }


    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("List: " + list); // Output: [Apple, Banana, Orange]
        System.out.println("Size: " + list.size()); // Output: 3

        list.add(1, "Grape"); // Insert at index 1
        System.out.println("List: " + list); // Output: [Apple, Grape, Banana, Orange]

        System.out.println("Get element at index 2: " + list.get(2)); // Output: Banana

        list.set(0, "Mango"); // Set element at index 0
        System.out.println("List: " + list); // Output: [Mango, Grape, Banana, Orange]

        list.remove(2); // Remove element at index 2
        System.out.println("List: " + list); // Output: [Mango, Grape, Orange]

        list.clear();
        System.out.println("List: " + list); // Output: []
        System.out.println("Is list empty? " + list.isEmpty()); // Output: true


        MyLinkedList<Integer> intList = new MyLinkedList<>();
        intList.add(10);
        intList.add(20);
        System.out.println("Integer List: " + intList); // Output: [10, 20]

    }
}
