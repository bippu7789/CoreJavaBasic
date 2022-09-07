// Serialization
package collection.com.nt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Kanpur");
		al.add("Nagpur");
		al.add("LuckNow");
		al.add("Delhi");
		try {
			// serialization
			FileOutputStream fos = new FileOutputStream("City.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			fos.close();
			oos.close();
			// Deserialization
			FileInputStream fis = new FileInputStream("City.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList list = (ArrayList) ois.readObject();
			System.out.println(list);
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
