package collection.com.nt;

import java.util.Stack;

public class Stack2 {

	public static void main(String[] args) {
		// For integer value
		Stack<Integer> st1 = new Stack<Integer>();
		st1.add(10);
		st1.add(20);
		for (int k : st1) {
			System.out.println(k + " ");
		}
		// For String value
		Stack<String> st2 = new Stack<String>();
		st2.add("Java");
		st2.add("IS");
		st2.add("Programming");
		st2.add("Language");

		for (String k : st2) {
			System.out.println(k + " ");

		}
		// For charactor value
		Stack<Character> st3 = new Stack<Character>();
		st3.add('A');
		st3.add('B');
		st3.add('C');
		for (Character k : st3) {
			System.out.println(k + " ");
		}
		Stack<Double> st4 = new Stack<Double>();
		st4.add(32.0);
		st4.add(23.0);
		st4.add(10.0);

		for (Double k : st4) {
			System.out.println(k + "  ");
		}
	}

}
