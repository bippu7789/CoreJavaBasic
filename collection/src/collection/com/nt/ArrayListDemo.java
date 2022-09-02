package collection.com.nt;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> arl = new ArrayList<String>();
		// Add elements in the arrayList
		arl.add("Apple");
		arl.add("Orange");
		arl.add("Guava");
		arl.add("Grapes");
		arl.add("Mango");
		arl.add("Guava");
		arl.add("Mango");

		System.out.println("Contains::" + arl);

		// Remove the elements in the arrayList
		arl.remove("Guava");
		arl.remove(3);
		System.out.println("Containing after removing ::" + arl);
		System.out.println("Size of the arrayList is::" + arl.size());
		Collections.sort(arl);// for shorting the elements
		for (String x : arl) {
			System.out.print(x+" ");
		}

	}

}
