package collection.com.nt;

import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst("Ravi");
		list.add("Rahul");
		list.addLast("Anand");
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.removeFirst();
		list.removeLast();
		System.out.println(list);

	}

}
