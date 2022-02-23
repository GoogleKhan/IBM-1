
//Display the minimum and maximum value for int, float and double 
package p1;

public class Test4 {

	public static void main(String[] args) {

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);

		int x = 101; // Numeric value

		// String s = x + ""; // convert into Textual value;

		String s = String.valueOf(x); // convert into Textual value;
		System.out.println(s);

		System.out.println("======================================");

		String s1 = "205"; // Textual value

		int y = Integer.parseInt(s1); // convert String/Textual value into Numeric value;
		int z = Integer.valueOf(s1); // convert String/Textual value into Numeric value;
		
		System.out.println("---- We can not use primitive in Collections and Generics---");

	}

}
