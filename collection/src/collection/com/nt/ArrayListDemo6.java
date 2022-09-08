// Program on ArrayList which contains null value that we can pass the elements on position basis
package collection.com.nt;

import java.util.ArrayList;

public class ArrayListDemo6 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();// Unsafe operation
		al.add("Bippu");
		al.add(12);
		al.add("Nitin");
		al.add(null);
		al.add(0, "nitin");
		al.add(15);
		System.out.println(al);

	}

}
