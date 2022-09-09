package collection.com.nt;

import java.util.Collections;
import java.util.Vector;

public class VectorExampleDemo3 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		int x[] = { 22, 20, 10, 40, 15, 58 };
		for (int i = 0; i < x.length; i++) {
			v.add(x[i]);
		}
		Collections.sort(v);
		System.out.println("Maximum elements is::" + Collections.max(v));
		System.out.println("Minimum elements is::" + Collections.min(v));
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}

	}

}
