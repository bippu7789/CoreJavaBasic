package collection.com.nt;

import java.util.Stack;

public class Stack3 {

	public static void main(String[] args) {
		Stack<String> stk = new Stack<String>();
		stk.push("Apple");
		stk.push("Orange");
		stk.push("Grapes");
		stk.push("Mango");
		System.out.println("Stack::" + stk);
		String fruits = stk.peek();
		System.out.println("Elements at top" + fruits);
		System.out.println(stk);

	}

}
