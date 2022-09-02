package collection.com.nt;

import java.util.ArrayList;
import java.util.Iterator;

class Employee {
	int eNo;
	String eName;
	int eAge;

	public Employee(int eNo, String eName, int eAge) {
		this.eNo = eNo;
		this.eName = eName;
		this.eAge = eAge;
	}
}

public class ArrayListDemo1 {

	public static void main(String[] args) {
		Employee e1 = new Employee(111, "Bishal", 21);
		Employee e2 = new Employee(112, "Ranveer", 34);
		Employee e3 = new Employee(113, "Raja", 43);

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);

		Iterator itr = al.iterator();

		while (itr.hasNext()) {
			Employee obj = (Employee) itr.next();
			System.out.println("Employee id is::" + obj.eNo);
			System.out.println("Employee name is::" + obj.eName);
			System.out.println("Employee age is::" + obj.eAge);
			System.out.println("-------------------------------");
		}

	}

}
