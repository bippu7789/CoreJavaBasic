package workingWithString;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String::");
		String str = scn.nextLine();
		String result = ReverseWorld.reverseString(str);
		System.out.println("Original String" + str);
		System.out.println("reverse String" + result);

	}

}
