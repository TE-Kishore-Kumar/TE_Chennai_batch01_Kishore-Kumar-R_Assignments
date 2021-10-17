package com.te.collectionassignment.arraytolinked;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayToLinked {

	public void atl() {
		
		ArrayList<Integer> ref = new ArrayList();

		ref.add(11);
		ref.add(12);
		ref.add(10);
		ref.add(12);
		ref.add(57);
		
		System.out.println(ref);
		
		LinkedList<Integer> li=new LinkedList<Integer>(ref);//converting to Linked List
		
		System.out.println(li);
	}
}
