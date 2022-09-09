package collection.com.nt;

import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("ITOM-2");
		list.add("ITOM-3");
		list.add("ITOM-4");
		list.add("ITOM-5");
		list.add("ITOM-6");
		list.add("ITOM-7");
		list.add("ITOM-9");

		list.add(0, "ITOM-0");
		list.add(1, "ITOM-1");
		list.add(8, "ITOM-8");
		list.add(9, "ITOM-10");
		System.out.println("First print" + list);

		list.remove("ITOM-5");
		System.out.println("Second print" + list);
		list.remove(list);
		System.out.println("Third print" + list);

		// Set will override the existing value
		list.add(0, "Arun");
		list.add(1, "BIPIN");
		list.add(2, "Bishal");
		list.add(2, "Tehja");
		list.add(3, "pavan");
		list.add(4, "Suresh");
		list.add(5, "Harsh");
		list.add(6, "Ganesh");
		list.add(7, "Nikku");
		System.out.println("Fourth print"+list);

		for (String str : list) {
			System.out.println("value of str"+str);
		}

	}

}
