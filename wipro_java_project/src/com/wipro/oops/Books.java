package com.wipro.oops;

//2. Inheritance (Subclass for Books)

public class Books extends LibraryItem {
private String isbn;
private int numberOfPages;

public Books(String title, String author, int itemId, String isbn, int numberOfPages) {
   super(title, author, itemId);
   this.isbn = isbn;
   this.numberOfPages = numberOfPages;
}

public String getIsbn() {
   return isbn;
}

public int getNumberOfPages() {
   return numberOfPages;
}

@Override
public void displayDetails() {
   System.out.println("Book Details:");
   System.out.println(this); // Uses the toString() method
   System.out.println("ISBN: " + isbn + ", Pages: " + numberOfPages);
}
}

