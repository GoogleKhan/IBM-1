package p1;

public class CalculateSalary {

	public static void main(String[] args) throws MyException{

		double totalSalary = calcSalary(-100);

		System.out.println(totalSalary);

	}

	private static double calcSalary(int basic) throws MyException {

		// forgiveness
//		if (basic <= 0) {
//			System.out.println("Bhai Sahab, Basic salary cannot be zero or negative");
//			return 0;
//		}

		// punishment
		if (basic <= 0) {
			MyException exp = new MyException("Hey man, Basic salary cannot be zero or negative");
			throw exp;
		}

		double total = basic * 2 + 50;
		return total;
	}

}
