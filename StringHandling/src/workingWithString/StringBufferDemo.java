package workingWithString;

public class StringBufferDemo {

	public static void main(String[] args) {
    //Append
		StringBuffer bf=new StringBuffer("abc");
		StringBuffer bf1=bf.append("d");
        System.out.println(bf);
        System.out.println(bf1);
        System.out.println(bf==bf1);
        //Insert
        StringBuffer sb1=new StringBuffer("883545");
        System.out.println(sb1);
        sb1.insert(3,'/');
        System.out.println(sb1);
        sb1.insert(4,'/');
        System.out.println(sb1);
        // Delete 
        StringBuffer sb4=new StringBuffer("Bipin Kumar yadav");
        System.out.println(sb4);
        sb4.deleteCharAt(4);
        sb4.deleteCharAt(4);
        sb4.delete(sb4.indexOf("K"), sb4.indexOf("r"));
        System.out.println(sb4);
        
        //Reverse
        StringBuffer sb5=new StringBuffer("Olive crypto systems");
        System.out.println(sb5);
        sb5.reverse();
        System.out.println(sb5);
        
        StringBuffer sb6=new StringBuffer();
        System.out.println(sb6.capacity());
        sb6.ensureCapacity(13);
        System.out.println(sb6.capacity());
        
        sb6.ensureCapacity(33);
        System.out.println(sb6.capacity());
        
	}

}
 