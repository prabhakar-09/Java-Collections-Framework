package com.collections.framework.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(); // creating a List interface object 
		
//		Check if lists allows duplicates
		
		list.add("sample one");
		list.add("sample two");
		list.add("sample three");
		list.add("sample one");
		
		System.out.println(list); // it does allow duplicate elements 
//		it does not perform any uniqueness checks by default. 
//		Therefore, you can add duplicate elements to an ArrayList.
		
		list.add(null);
		list.add(null);
		
		System.out.println(list); // it will also allow null values 
		
//		list also maintains insertion order
		
//		accessing the list
		
		System.out.println(list.get(0)); // will fetch first element of the list
	}

}
