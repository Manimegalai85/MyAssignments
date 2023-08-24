package week3.day4;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		
		
		String[] split = text.split(" ");
		
		for (int i = 0; i < split.length-1; i++) {
			
			for (int j = i+1; j < split.length; j++) {
				
				if(split[i].equalsIgnoreCase(split[j])) 
					
					split[j]="";
							
			}
			
		}
		for (int k = 0; k < split.length; k++) {
			
			System.out.print(split[k]+" ");
			
		}
		

	}

}
