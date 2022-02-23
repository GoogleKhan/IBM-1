package p1;

public class Sample1 {

	public static void main(String[] args) {

		Car c1 = new Car();
		Car c2 = new Car();

		boolean b1 = c1 == c2;
		System.out.println(b1);// false

		boolean b2 = c1.equals(c2);
		System.out.println(b2);// false

		System.out.println("-----------------------------");

		String s1 = "JAVA";
		String s2 = "JAVA";

		boolean b3 = s1 == s2;
		System.out.println(b3); // true

		boolean b4 = s1.equals(s2);
		System.out.println(b4); // true

		System.out.println("-----------------------------");

		String s3 = new String("PYTHON");
		String s4 = new String("PYTHON");

		boolean b5 = s3 == s4;
		System.out.println(b5);// false

		boolean b6 = s3.equals(s4);
		System.out.println(b6); // true

	}

}
