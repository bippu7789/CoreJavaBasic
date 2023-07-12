package workingWithString;

public class ReverseWorld {

	public static void main(String[] args) {
		String s = "Bipin Kumar Yadav";
		String result=reverseString(s);
		System.out.println(result);

	}

	public static String reverseString(String s) {
		// String s="Bipin Kumar Yadav";
		String[] world = s.split(" ");
		String result = "";
		for (int i = world.length - 1; i > 0; i--) {
			result += world[i] + "";
		}
		return result;

	}
}
