package collection.com.nt;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> al = new LinkedHashSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Pavan");
		al.add("Ravi");
		// Collections.sort(al);// Not possible
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
