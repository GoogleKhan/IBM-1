package p7;

public class Sample3 {

	// Var-Args
	void sum(int... a) {

		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}

		System.out.println(sum);

	}

	public static void main(String[] args) {

		Sample3 obj = new Sample3();

		obj.sum();// 0
		obj.sum(2); // 2
		obj.sum(2, 3); // 5
		obj.sum(2, 3, 4); // 9
		obj.sum(2, 3, 4, 5);
		obj.sum(2, 3, 4, 6, 7, 8, 9, 5, 4, 3, 2, 1, 4, 5, 6, 7, 8, 9, 01);

	}

}
