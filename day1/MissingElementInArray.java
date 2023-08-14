package week2.day1;


public class MissingElementInArray {
//without Array sort
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		int len = arr.length;

		int flag;

		System.out.println("Array length "+ len);

	

		for (int j = 8; j >= 1; j--) {

			flag = 0;

			for (int i = arr.length - 1; i >= 0; i--) {

				if (j == arr[i]) {
					flag = 1;

					break;

				}
				
			}
			
			if (flag == 0) {
				System.out.println("missing element " + j);
			}}

		}

}
