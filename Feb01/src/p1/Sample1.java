package p1;

public class Sample1 {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setAge(25);
		e1.setName("Shad");
		e1.setSalary(1234);

		Employee e2 = new Employee();
		e2.setAge(22);
		e2.setName("NRN");
		e2.setSalary(4321);

		int h1 = e1.hashCode();
		int h2 = e2.hashCode();
		
		System.out.println(h1);
		System.out.println(h2);

		boolean b1 = h1 == h2;
		System.out.println(b1);
	}

}
