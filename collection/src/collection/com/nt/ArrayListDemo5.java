package collection.com.nt;

import java.util.ArrayList;

public class ArrayListDemo5 {

	public static void main(String[] args) {
		ArrayList<String> city = new ArrayList<>();// Default capacity is 10
		city.ensureCapacity(3);// resize the arrayList to store 3 elements
		city.add("Hydrabad");
		city.add("Mumbai");
		city.add("Delhi");
		city.add("Kolkata");
		city.add("Lucknow");

		System.out.println(" " + city);
		System.out.println(city.size());
	}

}
