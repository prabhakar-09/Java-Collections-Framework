package com.collections.framework.arrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArrList {

	public static void main(String[] args) {

		List<Integer> marks = Arrays.asList(88,66,81,39,45,30,72);
		
		System.out.println("Marks before sort : " + marks);
		
//		Sorting list in the ascending order.
		Collections.sort(marks); // In place sort TC : O(n*log(n))
		
		System.out.println("Marks after sort : " + marks);
		
		Collections.reverse(marks);
		System.out.println("Sorted list in descending order : " + marks);
	}

}
