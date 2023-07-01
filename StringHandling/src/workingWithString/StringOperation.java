package workingWithString;

import java.util.Arrays;

import javax.print.attribute.standard.Finishings;

public class StringOperation {

	public static void main(String[] args) {
		String s = "Java programming Language";
		// finding string is empty or not
		System.out.println(s.isEmpty());
		// Finding length of the string
		System.out.println(s.length());
		// String s1="";
		// String s2="";
		// String s3= new String("");
		// System.out.println(s1.isEmpty());
		// System.out.println(s2.isEmpty());
		// System.out.println(s2.isEmpty());

		// System.out.println(s1.length());
		// System.out.println(s2.length());
		// System.out.println(s3.length());
		// printing string object
		System.out.println(s);
		// Comparing two string
		String s1 = new String("abc");
		String s2 = new String("abc");
		String s3 = new String("Abc");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

		// Comparing string without case
		// public boolean equalsIgnoreCase(String s);
		String s4 = new String("a");
		String s5 = new String("A");
		System.out.println(s4.equals(s5));
		System.out.println(s4.equalsIgnoreCase(s5));
		// Comparing string lexicographlly, means after comparison method should return
		// difference between string contents
		String s6 = new String("a");
		String s7 = new String("A");
		System.out.println(s6.compareTo(s7));
		System.out.println(s6.compareToIgnoreCase(s7));
		String s8 = "abcdefg";
		String s9 = "abc";
		System.out.println(s8.compareTo(s9));
		// Start with end with
		String ss = "Java programming language";
		System.out.println(ss.startsWith("Java"));
		System.out.println(ss.startsWith("java"));
		System.out.println(ss.startsWith("hari"));
		System.out.println(ss.endsWith("hari"));
		System.out.println(ss.endsWith("language"));
		// print character of the given, String index start from because its internal
		// object is char array should use belo methods
		// public char charAt(int index);
		String ss1 = new String("Java programming language");
		System.out.println("charactor at 10th index in s1 string::" + ss1.charAt(9));
		// print all character in given string with index, we should write our own logic
		// with charAt() and length() methods
		// for(int i=0;i<19;i++) {
		// System.out.println("charactor at index"+i+"is:"+ss1.charAt(i));
		// Finding index of given character of string in the given string
		// public int indexOf(char ch);
		// public int indexOf(String str)
		// Below method return last ocurances of charecrer of string
		// public int lastIndexOf(char ch);
		// public int lastIndexOf(String str);
		System.out.println(ss1.indexOf("a"));
		System.out.println(ss1.lastIndexOf("a"));
		System.out.println(ss1.indexOf('a', 8));

		String sss1 = "Java programming language";
		System.out.println(sss1.substring(8));
		System.out.println(sss1.substring(5, 16));
		// System.out.println(s1.substring(-6));
		// System.out.println(sss1.substring(5,28));
		System.out.println(sss1.substring(24, 25));
		System.out.println(sss1.substring(5, 16));
		System.out.println(sss1.substring(sss1.indexOf("p"), sss1.indexOf("n")));
		// System.out.println(sss1.substring(16,5));
		// System.out.println(sss1.substring(-1,5));
		// Concatnating new String
		String ss2 = "a";
		String ss3 = ss2 + "a";
		System.out.println(ss3);
		System.out.println(ss2 == ss3);
		System.out.println(ss2.equals(ss3));
		System.out.println(ss3.concat("c"));
		// Deleting tailing and leading space of a string
		String ss5 = new String("  Bipin Kumar Yadav   ");
		System.out.println(ss5.toUpperCase().trim());
		String ss6 = ss5.toUpperCase().trim();
		System.out.println(ss6);
		System.out.println(ss5.equals(ss6));
		System.out.println(ss5.length());
		System.out.println(ss6.length());
		// Split
		String[] array = s.split(" ");
		int size = array.length;
		// for(int i=0;i<size;i++) {
		// System.out.println(i+"token is"+array[i]);
		String ssss = findWithIndexOf(ss5);
		System.out.println(ssss);
		String ssss1=findWithContains(ss5);
		System.out.println(ssss1);
		

	}

	public static String findWithIndexOf(String originalString) {
		if (originalString.indexOf("Yadav") != -1) {
			return "The String hari is available";
		} else {
			return "The String hari is not available";
		}

	}
	public static String findWithContains(String originalString) {
		if(originalString.contains("Bipin")) {
			return "The string bipin is available";
		}
		else {
			return "The string bipin is not available";
		}
	}

}
