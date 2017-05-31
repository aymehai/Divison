import java.util.Scanner;

class Divison {
	public static void main(String[] args) {
		int a, b, result = 0;
		try {

			Scanner input = new Scanner(System.in);
			System.out.println("Input two integers");

			a = input.nextInt();
			b = input.nextInt();

			result = a / b;
		} catch (Exception e) {
			System.out.println("something went wrong");
		} finally {
			System.out.println("finally block will execute.");
		}

		System.out.println("Result = " + result);
	}
}