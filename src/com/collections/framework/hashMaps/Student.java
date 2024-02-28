package com.collections.framework.hashMaps;

// Student is user defined class & we are going to store user defined objects in the hashmap
public class Student {

	private String firstName;
	private String lastName;
	
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
