package week2.day1;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {

		// literal syntax for array
		int[] marks = { 89, 78, 56, 35, 66 };

		// instantiation syntax for array

		int[] nums = new int[4];

		nums[0] = 3;

		nums[1] = 6;
		nums[2] = 5;
		nums[3] = 9;
		// to get the length of the array

		int len = marks.length;

		System.out.println(len);
		
		
		//array we can't print directly. we should use loop for print
		
		for (int i = 0; i <marks.length; i++) {
			
			System.out.println(marks [i]);
			
		}
//arrange my array
		
		Arrays.sort(marks);
		
		System.out.println("order result");
		
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
			
		} 
		
		//to arrange reverse
		
		System.out.println("reverse order");
		
		for (int i = marks.length-1; i >= 0; i--) {
			
			System.out.println(marks[i]);
			
		}
		
	}

}
