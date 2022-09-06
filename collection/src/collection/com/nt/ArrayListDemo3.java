// Program to fetcg the elements in forward and backward direction using ListIterator
package collection.com.nt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Bipin");
		al.add("Amjath");
		al.add("Pavan");
		al.add("Pratik");
		al.add("Teja");
		al.add("Sharavan");
		al.add("Chindu");
		al.add("Bishal");
		System.out.println("Elements are in second position" + al.get(2));
		Collections.sort(al);
		Collections.reverse(al);
		ListIterator itr = al.listIterator();
		System.out.println("Traversing elements in forward direction");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Traversing elements in backward directions");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
