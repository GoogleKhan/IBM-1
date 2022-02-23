package p1;

public class Sample4 {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee e1 = new Employee();
		e1.setAge(25);
		e1.setName("Shad");
		//e1.setSalary(1234);

//		Employee e2 = new Employee();
//		e2.setAge(e1.getAge());
//		e2.setName(e1.getName());
//		e2.setSalary(e1.getSalary());
		
		Employee e2 = e1.clone();
		Employee e3 = e1.clone();

		System.out.println(e1);
		System.out.println(e2);

		System.out.println(e1.equals(e2));
		
		System.out.println(e2 == e3);
	}

}
