package com.wipro.java.interface1;

class Cow implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Moo!");
    }

    

    public static void main(String[] args) {
        Cow myCow = new Cow();
        myCow.makeSound();
    }
}
