package collection.com.nt;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List list = new LinkedList();
		list.add("Ravi");
		list.add("Vijay");
		list.add("BIPIN");
		list.add(null);
		list.add(43);
		list.add(null);
		list.add("BIPIN");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
