
public class UseCase2 {

	public static void main(String[] args) {

		// Numeric to String Conversion

		int x = 10;
		// String s = x + ""; OR
		String s = String.valueOf(x);
		System.out.println(s);

		System.out.println("---------------------------");

		// String to Numeric Conversion

		String s1 = "101";

		int y = Integer.parseInt(s1);
		System.out.println("y= " + y);

		float z = Float.parseFloat(s1);
		System.out.println("z= " + z);

		String s2 = "Abc";
		int i = Integer.parseInt(s2);
		System.out.println(i);// Exception in thread "main" java.lang.NumberFormatException: For input string:
								// "Abc"

	}

}
