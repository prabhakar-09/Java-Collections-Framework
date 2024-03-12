package com.collections.framework.z_practice;

import java.util.ArrayList;
import java.util.*;

// Iterating over an array list 
public class ArrListP1 {

	public static void main(String[] args) {
		
		List<String> wildAnimals = new ArrayList<>();
		
		String[] allAnimals = {"Tiger", "Lion", "Fox", "Bear", "Gorilla", "Cheetah", "Puma", "Leopard"};
		
		for(String animals : allAnimals) {
			wildAnimals.add(animals);
		}
		
		System.out.println("Wild Animals : " + wildAnimals);
		
		System.out.println();
		
//		Iterating using iterator
		Iterator<String> iam = wildAnimals.iterator();
		
		System.out.println("Iterating using Iterator ");
		System.out.println();
		
		iam.forEachRemaining(iter ->{
			System.out.println("I AM " + iter);
		});
		
		System.out.println();
		System.out.println("Iterating using while loop ");
		System.out.println();
		
//		while(iam.hasNext()) {
//			System.out.println(iam);
//		}
		
//		searching an element in the list
		for(String arr : wildAnimals) {
			if(arr.contains("Lion")) {
				
				System.out.println("Contains LION");
			}
		}
	}
}
