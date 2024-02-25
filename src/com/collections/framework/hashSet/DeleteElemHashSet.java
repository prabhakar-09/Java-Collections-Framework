package com.collections.framework.hashSet;
import java.util.*;
// Implementing remove() on a hashset 
// removeAll() removing all elements from the collection of a hashset 
// clear() - clear hashset completely by removing all

/*The clear() method removes all the elements of a single ArrayList. 
It's a fast operation, as it just sets the array elements to null.

The removeAll(Collection) method, which is inherited from AbstractCollection, 
removes all the elements that are in the argument collection from the collection 
you call the method on. It's a relatively slow operation, as it has to search through 
one of the collections involved.

The time complexity of ArrayList.clear() is O(n) and of removeAll is O(n^2).
*/

public class DeleteElemHashSet {

	public static void main(String[] args) {

		Set<Integer> nums = new HashSet<>();
		
		for(int i=0;i<11;i++) {
			nums.add(i);
		}
		
		System.out.println(nums); // [1 to 10]
		
//		using remove() method..
		System.out.println(nums.remove(1)); // returns true when deleted
		
		nums.clear();
		System.out.println(nums);
	}

}
