package com.te.collectionassignment.removeduplicates;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemovingDuplicatesArrayList {

	public void rd() {
		
		ArrayList<Integer> ref = new ArrayList();

		ref.add(1);
		ref.add(2);
		ref.add(1);
		ref.add(4);
		ref.add(7);
		ref.add(10);
		ref.add(7);
		ref.add(8);
		ref.add(6);
		
		//converting to LinkedHashSet using stream API
	    Set<Integer> s1=ref.stream().map(x->x).collect(Collectors.toCollection(LinkedHashSet::new));
	    
	    System.out.println("after removing duplicates ");
	    System.out.println(s1);
	}
}
