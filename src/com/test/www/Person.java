package com.test.www;

public class Person {
    // Field declarations:
	private String name;  //name of dude
	private int maxBooks; //max books dude can rent
	
	// Constructors:
	// Like parameters
	public Person() {
		name = "lo-rider";
		maxBooks = 20;
	}
	
	// Methods:
	// List of procedures, perhaps this is a
	// a bit like a service program?
	public String getName() {
		return name;
	}
	
	public void setName(String anyName) {
		name = anyName;
	}
	
	public int getMaxBooks() {
		return maxBooks;
	}
	// Note that this is this object in this class
	public void setMaxBooks(int maxBooks) {
		this.maxBooks = maxBooks;
	}


	
	
	
	
}
