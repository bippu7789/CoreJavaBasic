package collection.com.nt;

import java.util.Vector;

public class VectorExampleDemo1 {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("Bipin");
		v.add(12);
		v.add(null);
		v.add(3);
		System.out.println(v);
		System.out.println();
		System.out.println("Its capacity is::" + v.capacity());

	}

}
