package week3.day4;

import java.util.Iterator;

public class ReverseTheString {

	public static void main(String[] args) {
		
		String name ="Amazon development centre, Chennai";
		
		String lc = name.toLowerCase();
		
		System.out.println(lc);
		
		System.out.println("----------------");

		
		
		String[] split = lc.split(" ");
		
		for (int i = 0; i < split.length; i++) {
            
			System.out.println(split[i]);
			
			
        
		}
		System.out.println("----------------");
		
		for (int i =split.length-1 ; i>=0; i--)
		{
            System.out.println(split[i]);
	}
	

	}
	
}


