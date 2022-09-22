package collection.com.nt;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
		boolean[] ba = new boolean[6];
		Set s = new HashSet();
		ba[0] = s.add("a");
		ba[1] = s.add(42);
		ba[2] = s.add("b");
		ba[3] = s.add("a");
		ba[4] = s.add("new Object()");
		ba[5] = s.add(new Object());
		for (int i = 0; i < ba.length; i++) {
			System.out.println(ba[i] + " ");
			System.out.println("\n");
			for (Object o : s) {
				System.out.println(o + " ");
			}
		}

	}

}
