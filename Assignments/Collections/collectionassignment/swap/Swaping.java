package com.te.collectionassignment.swap;

import java.util.ArrayList;
import java.util.Collections;

public class Swaping {

	public void swa() {
		
		ArrayList<Integer> ref = new ArrayList();

		ref.add(11);
		ref.add(12);
		ref.add(10);
		ref.add(12);
		ref.add(57);

		System.out.println("Before Swap the ArrayList ");
		System.out.println(ref);

		Collections.swap(ref, 0,1);
		System.out.println("After Swapping the ArrayList ");
		System.out.println(ref);
	}
}
