package com.wipro.oops;

//2. Inheritance (Subclass for DVDs)

public class DVD extends LibraryItem {
private int duration; // In minutes

public DVD(String title, String author, int itemId, int duration) {
   super(title, author, itemId);
   this.duration = duration;
}

public int getDuration() {
   return duration;
}

@Override
public void displayDetails() {
   System.out.println("DVD Details:");
   System.out.println(this);
   System.out.println("Duration: " + duration + " minutes");
}
}