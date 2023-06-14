package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrList = new ArrayList<>();
		
		arrList.add(67);
		arrList.add(47);
		arrList.add(98);
		arrList.add(49);
		arrList.add(6);
		
		for(Integer i:arrList) {
			System.out.print(i + " ");
		}
		System.out.println();
		Iterator<Integer> iterator = arrList.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		
//		Now Let's Sort the collection
		System.out.println();
		Collections.sort(arrList);
		System.out.println(arrList);
		
	}
}
