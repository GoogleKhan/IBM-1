
//Display the minimum and maximum value for int, float and double 
package p1;

public class Test6 {

	public static void main(String[] args) {

		String name = "Shadab";
		int age = 35;
		double salary = 1234.5;

		// DO Something to print
		/*
		 * { "name": "Shadab", "age": 35, "salary": 1234.5 }
		 */

		String str = "{ \"name\": \""

				+ name + "\", \"age\": " + age + ", \"salary\": " + salary + " }";
		
		System.out.println(str);

	}

}
