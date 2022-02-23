package p1;

public class Employee implements Cloneable{

	private String name;
	private int age;
	private float salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {

		Employee e1 = this;
		Employee e2 = (Employee) obj;

		boolean isName = e1.getName().equals(e2.getName());
		boolean isAge = e1.getAge() == e2.getAge();
		boolean isSalary = e1.getSalary() == e2.getSalary();

		return isName && isAge && isSalary;
	}

	@Override
	public String toString() {
		// return "Employee [name=" + name + ", age=" + age + ", salary=" + salary +
		// "]";
		return "Hello " + name;
	}

	@Override
	public Employee clone() throws CloneNotSupportedException {
		return (Employee) super.clone();
	}

}
