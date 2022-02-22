package p1;

public class Cat {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		if (age <= 0) {
			// Validation
		}

		this.age = age;
	}

}
