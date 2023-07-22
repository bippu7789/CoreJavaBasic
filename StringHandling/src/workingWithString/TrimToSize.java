package workingWithString;

public class TrimToSize {

	public static void main(String[] args) {
		// It reduce string builder capacity to its size,The prototype is public void
		// trimToSize()
		StringBuffer sb1 = new StringBuffer("abc");
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		sb1.trimToSize();
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		// public void setLength(int new length)
		System.out.println("==========================");
		// Case-1
		StringBuffer sb2 = new StringBuffer("abcdefg");
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		System.out.println(sb2);
		sb2.setLength(12);
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		System.out.println(sb2);

		// Case#2
		sb2.setLength(4);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		System.out.println(sb2);
		// Case#3
		sb2.setLength(25);
		System.out.println(sb2.capacity());
		// sb2.setLength(-35);
		// What is the difference between string buffer and string builder
		// Def#1:: 1.String is a immutable sequence of character
		// #2.String buffer is a thread safe mutable sequence of character
		// #3.String builder is also mutable sequence of character but not threadsafe
		// Difference::
		// StringBuffer object is threadsafe it means ITS OBJECT is not modified by
		// multiple thread concurently because all its methods
		// decleare as schenchronised
		String s1 = new String("a");
		String s2 = s1.concat("b");
		System.out.println(s2);
		System.out.println(s1);
		System.out.println(s1 == s2);
		String s3 = s2.concat("c");
		System.out.println(s3);
		// StringBuffer
		StringBuffer sb3=new StringBuffer("a");
		StringBuffer sb4=sb3.append("b");
		System.out.println(sb4);
		System.out.println(sb3);
		System.out.println(sb3==sb4);
		sb4.append("c");
		System.out.println(sb4);
		

	}

}
