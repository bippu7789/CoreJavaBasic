package collection.com.nt;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Teja");
		hs.add("Srikanth");
		hs.add("Bishal");
		hs.add("Amjath");
		hs.add(null);
		hs.add(null);
		// Collections.sort(hs);// Invalid not possible
		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
