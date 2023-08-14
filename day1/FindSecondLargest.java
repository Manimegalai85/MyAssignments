package week2.day1;

import java.util.Arrays;

public class FindSecondLargest {
	
	
	
			
	public static void main(String[] args) {
		

int[] data = {3,2,11,4,6,7};
		
		int len = data.length;
		System.out.println("Array length");
		System.out.println(len);
		
		Arrays.sort (data);
		System.out.println("Arrange in Ascending order");
		
		for (int i = 1; i < data.length; i++) {
			
			
			
			System.out.println(data[i]);
			
		
			
			
		}
		
		System.out.println("Second largest");
		System.out.println(data[len-2]);
		
	}

}
