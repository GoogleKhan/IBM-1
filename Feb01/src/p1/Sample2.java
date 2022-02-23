package p1;

public class Sample2 {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setAge(25);
		e1.setName("Shad");
		e1.setSalary(1234);

		Employee e2 = new Employee();
		e2.setAge(25);
		e2.setName("Shad");
		e2.setSalary(1234);
		
		boolean b1 = e1 == e2; // reference equality
		System.out.println(b1);//? false
		
		boolean b2 = e1.equals(e2);// object equality
		System.out.println(b2);//? 
		
	}

}
