package collection.com.nt;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		LinkedList city = new LinkedList();
		city.add("Kolkata");
		city.add("Banglore");
		city.add("Hydrabad");
		city.add("Pune");
		System.out.println(city);

		ListIterator it = city.listIterator();
		while (it.hasNext()) {
			String x = (String) it.next();
			if (x.equals("Kolkata")) {
				it.remove();
			} else if (x.equals("Hydrabad")) {
				it.add("Ameerpet");
			} else if (x.equals("Pune")) {
				it.add("Mumbai");
			}
		}
       for(Object o:city) {
    	   System.out.println(o);
       }
	}

}
