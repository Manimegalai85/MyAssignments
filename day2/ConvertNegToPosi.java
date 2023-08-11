package week1.day2;

public class ConvertNegToPosi {

	public static void main(String[] args) {
		int num = -40;
		if (num < 0) {
			System.out.println(num * -1);
		} else {
			System.out.println(num);
		}

		// another method

		int i = -20;
		if (i < 0) {
			System.out.println(i = -i);
		}

	}

}
