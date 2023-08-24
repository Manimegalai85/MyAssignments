package week3.day4;

public class ReverseTheEvenPositionWords {

	public static void main(String[] args) {

		// output: I ma a erawtfos tester

		String test = "I am a software tester";

		String[] split = test.split(" ");

		for (int i = 0; i < split.length; i++) {
			if (i > 0) {

				System.out.print(" ");
			}

			if (i % 2 != 0) {

				char[] ch = split[i].toCharArray();

				for (int j = ch.length - 1; j >= 0; j--) {

					System.out.print(ch[j]);

				}

			}

			else {

				System.out.print(split[i]);

			}

		}

	}

}
