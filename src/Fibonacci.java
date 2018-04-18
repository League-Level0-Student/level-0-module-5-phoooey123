
public class Fibonacci {

	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 1;
		int sum = 0;
		System.out.print("0,1");
		for (int i = 0; i < 12; i++) {
			System.out.print("," + (number1 + number2));
			sum = number1 + number2;
			number1 = number2;
			number2 = sum;
		}

	}
}
