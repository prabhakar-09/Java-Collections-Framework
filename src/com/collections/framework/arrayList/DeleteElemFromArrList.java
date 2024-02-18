package com.collections.framework.arrayList;

import java.util.*;

public class DeleteElemFromArrList {

	public static void main(String[] args) {

		List<String> demo = new ArrayList<>();
		
		demo.add("Tractor");
		demo.add("Tray");
		demo.add("Television");
		demo.add("Radio");
		demo.add("Deepak Kalal");
		
//		removing an element from a list using remove()..
		demo.remove(demo.size()-1); // size = 5
		
		System.out.println(demo);
		
//		removing with object name..
		demo.remove("Radio");
		
		System.out.println(demo);
		
//		remove all the elements in the collection list...
		
		List<String> demo2 = new ArrayList<>();
		
		demo2.add("Tractor");
		demo2.add("Tray");
		
		demo.removeAll(demo2); // it'll remove all the elemns in the demo2 list which present in demo list
		
		System.out.println(demo);
		
		demo.clear(); // clears the entire list
		
		System.out.println(demo);
	}

}
