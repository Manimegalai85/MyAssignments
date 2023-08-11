package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Fibonacci Series");

		int F = 0;
		int S = 1;
		int Sum;

		// Fibonacci series - 0,1,1,2,3,5,8,13

		System.out.println(F);
		System.out.println(S);

		for (int i = 1; i <= 6; i++) {

			Sum = F + S;
			F = S;
			S = Sum;

			System.out.println(Sum);
		}

	}
}