package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	
	public static void main(String[] args) {
		
		ArrayList<String> carlist = new ArrayList<>();
		carlist.add("Maruti");
		carlist.add("Toyoto");
		carlist.add("Huyndai");
		carlist.add("Tata");
		
		System.out.println(carlist);
		
		
//		iterating arrayList using for each loop
		for(String car:carlist) {
			System.out.println(car);
		}
		
//		iterating list using iterator
		System.out.println("iterating list using iterator");
		Iterator itr = carlist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
//		get() => it returns the element present at particular index , set() => changes the element at particular index
		System.out.println("Returning 1st element in a car list " +  carlist.get(1));
		carlist.set(1, "wols-wegan");
		Iterator<String> iterator = carlist.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
}
