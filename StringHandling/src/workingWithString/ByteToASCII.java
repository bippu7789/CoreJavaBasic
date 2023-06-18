package workingWithString;

public class ByteToASCII {

	public static void main(String[] args) {
      byte b []= {97,98,99};
      String s8=new String(b);
      System.out.println("S8::"+s8);
      
      byte c []= {65,66,67};
      String s9=new String(c);
      System.out.println("s9::"+s9);
	}

}
