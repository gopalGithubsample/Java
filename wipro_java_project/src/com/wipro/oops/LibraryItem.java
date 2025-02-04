package com.wipro.oops;

//1. Abstraction (Abstract class for common properties)

public abstract class LibraryItem {
 private String title;
 private String author; // Or creator, depending on the item
 private int itemId;


 public LibraryItem(String title, String author, int itemId) {
     this.title = title;
     this.author = author;
     this.itemId = itemId;
 }

 // Getters and setters (Encapsulation)
 public String getTitle() {
     return title;
 }

 public void setTitle(String title) {
     this.title = title;
 }

 public String getAuthor() {
     return author;
 }

 public void setAuthor(String author) {
     this.author = author;
 }

 public int getItemId() {
     return itemId;
 }



 public abstract void displayDetails(); // Abstract method (Polymorphism)

 @Override
 public String toString() {
     return "ID: " + itemId + ", Title: " + title + ", Author: " + author; // Borrowed removed
 }
}




