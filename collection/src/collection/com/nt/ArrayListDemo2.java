// Programe for merging two arrayList
package collection.com.nt;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Bishal");
		al1.add("Teja");
		al1.add("Sharath");
		al1.add("Srikanth");

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Sharavan");
		al2.add("Amit");
		al2.add("Amjath");
		al2.add("Chindu");
		al1.addAll(al2);
		Iterator itr = al1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
