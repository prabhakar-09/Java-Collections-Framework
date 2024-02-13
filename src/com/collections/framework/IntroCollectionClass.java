package com.collections.framework;

public class IntroCollectionClass {

	public static void main(String[] args) {

//		storing int values 
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;
		int f = 6;
		int g = 7;
		int h = 8;
		
//		above we are storing too many int values.. let's assume we want to store more int values like 100?
//		for such storages consider arrays as your first choice 
		
		int [] arrInt = new int[100]; // we can store 100 int values in this array now.. size is always fixed.
		
//		What if we wanted to store 200 values again in the same array ?
//		on disadvantage is once we declare the size of an array there's no increasing or decreasing in it's size.
//		also arrays will only hold similar kind of data.

//		consider below example 
		Student[] st = new Student[10]; // this array can only hold data of type Student
		st[0] = new Student();
		st[0] = new Student(); 
//		above two assignments are correct 
		
//		st[1] = new Book(); this would result in a type mismatch error
//		solution to the mismatch err could be like below:
		Object [] obj = new Object[10];
		
		obj[0] = new Student();
		obj[1] = new Student();
		
//		Ready made API support is not available in the array.
		
		
//		Solutions to all others problems or limitations is collection framework.
		
	}

}

class Book{
	
}

class Student{
	
}
