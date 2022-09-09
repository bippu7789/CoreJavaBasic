package collection.com.nt;

import java.util.Vector;

public class VectorExampleDemo2 {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(1);
		v.add(2);
		v.add(34.92f);
		System.out.println(v);
		System.out.println("Getting elements of vector");
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		System.out.println(v.get(2));
	}

}
