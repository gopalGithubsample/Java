package com.java.wipro.java8;


interface TestInterface1
{
	//default method
	default void show()
	{
		System.out.println("Default interface 1");
	}
}

interface TestInterface2
{
	//default method
	default void show()
	{
		System.out.println("Default Interface 2");
	}
}
//Implementation class code
 class DefaultUseCase implements TestInterface1,TestInterface2
{
	 public void show()
	 {
	 //use super keyword to call the show
	 //method of testInterface1 Interface
	 TestInterface1.super.show();
	//use super keyword to call the show
    //method of testInterface2 Interface
     TestInterface2.super.show();
	 }
	 public static void main(String[] args) 
	 {
		 DefaultUseCase d=new DefaultUseCase();
		 d.show();
	 }
}