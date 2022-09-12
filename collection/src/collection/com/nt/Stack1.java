package collection.com.nt;

import java.util.EmptyStackException;
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		try {
			st.push(0);
			st.push(1);
			st.push(2);
			st.push(3);
			st.push(4);
			st.push(5);
			System.out.println(st.pop());
			System.out.println(st.pop());
			System.out.println(st.pop());
			System.out.println(st.pop());
			System.out.println(st.pop());
			System.out.println(st.pop());
			System.out.println(st);
		} catch (EmptyStackException e) {
			e.printStackTrace();
		}
	}

}
