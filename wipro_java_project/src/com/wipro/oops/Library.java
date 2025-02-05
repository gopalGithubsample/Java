package com.wipro.oops;

//3. Polymorphism (Demonstrated in the main method)

public class Library {
    public static void main(String[] args) {
        LibraryItem item1 = new Books("The Lord of the Rings", "J.R.R. Tolkien", 101, "978-0547928227", 1178);
        LibraryItem item2 = new DVD("The Shawshank Redemption", "Frank Darabont", 201, 142);
        LibraryItem item3 = new Books("Pride and Prejudice", "Jane Austen", 102, "978-0141439518", 432);

        item1.displayDetails();
        System.out.println("---");
        item2.displayDetails(); 
        System.out.println("---");
        item3.displayDetails();
        System.out.println("---");

    }
}

