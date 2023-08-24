package week3.day4;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		
		String test = "changeme";
		
		char[] arr = test.toCharArray();
		
		
		for (int i = 0; i < arr.length; i++) {
			
			if(i%2==0) {
				
				arr[i]=Character.toUpperCase(arr[i]);
				
			}
				System.out.print(arr[i]);
			
				}
			
			}
			
		}
	


