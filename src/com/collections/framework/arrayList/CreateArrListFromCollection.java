package com.collections.framework.arrayList;

import java.util.ArrayList;
import java.util.List;

// 1. Creating an ArrList from another collection using arrList(Collection c) constructor..

// 2. How to add all elements from an existing ArrList to another using addAll.. 

public class CreateArrListFromCollection {

	public static void main(String[] args) {

		List<Integer> primeNums = new ArrayList<>();
		
		primeNums.add(2);
		primeNums.add(3);
		primeNums.add(5);
		primeNums.add(7);
		primeNums.add(11);
		
//		Adding the above list to other list..
		
		List<Integer> primeNums2 = new ArrayList<>(primeNums); // passing a collection type parameter..
		
		List<Integer> primeNums3 = new ArrayList<>();
		
		primeNums3.add(13);
		primeNums3.add(17);
		primeNums3.add(19);
		primeNums3.add(23);
		primeNums3.add(29);
		
		primeNums2.addAll(primeNums3); // this obj accepts a collection class & now will have 2 lists inside of it..
		
		System.out.println(primeNums2);
	}

}
