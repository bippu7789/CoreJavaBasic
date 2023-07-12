package workingWithString;

public class DemoStringBuffer {

	public static void main(String[] args) {
	//1.Constructor	public String StringBuffer()
     StringBuffer sb=new StringBuffer();
     System.out.println("SB"+sb+"::"+sb.capacity());
     //2.Constructor public StringBuffer(int capacity)
     StringBuffer sb2=new StringBuffer(3);
     System.out.println("sb2"+sb2);
     System.out.println("sb2 capacity::"+sb2.capacity());
     // public StringBuffer(String s)
     StringBuffer sb3=new StringBuffer("abc");
     System.out.println("sb3::"+sb3);
     System.out.println("sb3.capacity::"+sb3.capacity());
     
     
	}

}
