package com.wipro.java.Singleton;

public class DemoSingleThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");

        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("FOO"); // Same value!

        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);

        //Demonstrating the problem with different initial values:
        Singleton differentSingleton1 = Singleton.getInstance("First");
        Singleton differentSingleton2 = Singleton.getInstance("Second");
        System.out.println("\nDemonstrating the problem with different initial values:");
        System.out.println(differentSingleton1.value);
        System.out.println(differentSingleton2.value);
    }
}