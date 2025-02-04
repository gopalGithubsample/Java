package com.wipro.java.interface1;

class Dog implements Animal {


    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }


    
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
        
    }
}

