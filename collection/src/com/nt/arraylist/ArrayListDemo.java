package com.nt.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Apple");
		al.add("Orange");
		al.add("Grapes");
		al.add("Mango");
		al.add("Guava");
		al.add("Mango");
		System.out.println("Contains" + al);
		al.remove(2);
		al.remove("Guava");
		System.out.println("Contains after removing::" + al);
		System.out.println("Size of the arrayList:" + al.size());
		Collections.sort(al);
		for (String x : al) {
			System.out.println(x);

		}
	}

}
