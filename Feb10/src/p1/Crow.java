package p1;

public class Crow extends Animal implements Flyable {

	@Override
	void eat() {
		System.out.println("Crow is eating");

	}

	@Override
	public void fly() {
		System.out.println("Crow is flying");

	}

}
