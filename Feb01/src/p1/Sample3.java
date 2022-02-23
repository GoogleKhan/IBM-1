package p1;

public class Sample3 {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setAge(25);
		e1.setName("Shad");
		e1.setSalary(1234);

		Employee e2 = new Employee();
		e2.setAge(22);
		e2.setName("NRN");
		e2.setSalary(4321);

		System.out.println(e1);// Shad
		System.out.println(e2.toString()); //NRN
	}

}
