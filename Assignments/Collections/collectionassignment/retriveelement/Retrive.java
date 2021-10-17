package com.te.collectionassignment.retriveelement;

import java.util.LinkedList;

public class Retrive {

	public void ret() {
		
		LinkedList<Integer> ref = new LinkedList();

		ref.add(11);
		ref.add(12);
		ref.add(10);
		ref.add(12);
		ref.add(57);
		
		Integer s1=ref.peekFirst();//only wrapper class supports,only LinkedList should be used since this comes from Deque
		
		System.out.println(ref);
		System.out.println("==========after retrieving============");
		System.out.println(s1);
	}
}
