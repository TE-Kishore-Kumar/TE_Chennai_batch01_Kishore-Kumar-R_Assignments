package com.te.collectionassignment.occurance;

import java.util.LinkedList;

public class Occurances {

	public void occ() {
		
		LinkedList<Integer> ref = new LinkedList();

		ref.add(1);
		ref.add(2);
		ref.add(1);
		ref.add(4);
		ref.add(7);
		ref.add(10);
		ref.add(7);
		ref.add(8);
		ref.add(6);

		
		System.out.println("=========List Values==========");
		System.out.println(ref);
		
		System.out.println("=====First and Last Occurences");
		Object s1=ref.getFirst();
		Object s2=ref.getLast();
        
		System.out.println("First element "+" "+s1);
		System.out.println("Last element "+" "+s2);

	}
}
