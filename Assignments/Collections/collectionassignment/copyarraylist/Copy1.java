package com.te.collectionassignment.copyarraylist;

import java.util.ArrayList;

import java.util.Iterator;

public class Copy1 {

	public void cc() {

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

		ArrayList<Integer> ref1 = ref;// by shallow copy

		ArrayList<Integer> obj = (ArrayList<Integer>) ref.clone();// by clone method

		ArrayList<Integer> ref2 = new ArrayList(ref);// by directly passing to the constructor

		System.out.println(ref2);

		System.out.println(obj);

		Iterator<Integer> itr = ref.iterator();
		Iterator<Integer> itr1 = ref1.iterator();
		Iterator<Integer> itr2 = obj.iterator();

		for (Integer integer : obj) {
			System.out.print(integer + " ");
		}

		System.out.println();

		for (Integer integer1 : ref) {
			System.out.print(integer1 + " ");
		}

		System.out.println();

		for (Integer integer2 : ref1) {
			System.out.print(integer2 + " ");
		}
	}

}
