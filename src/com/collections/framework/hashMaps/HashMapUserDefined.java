package com.collections.framework.hashMaps;

import java.util.*;

public class HashMapUserDefined {

	public static void main(String[] args) {
		
//		Create Hashmap 
		
		Map<Integer, Student> student = new HashMap<>();
		
		student.put(1, new Student("Rahul", "Gandhi"));
		student.put(2, new Student("Sonia", "Gandhi"));
		student.put(3, new Student("Priyanka", "Gandhi"));
		
		System.out.println(student.values());
	}
	
}
