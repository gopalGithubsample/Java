package com.wipro.java.interface1;

public class Document implements Showable ,Printable {
	
	@Override
	public void Print() {
		// TODO Auto-generated method stub
		System.out.println("Print");
		
	}

	@Override
	public void Show() {
		// TODO Auto-generated method stub
		System.out.println("Show");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document doc1 = new Document();
		doc1.Print();
		doc1.Show();

	}

	

}
