package week3.day4;

public class FindCharCount {

	public static void main(String[] args) {
		String name = "TestLeaf";
		int count =0;
		
		char[] cs = name.toCharArray();
		
		for (int i = 0; i < cs.length; i++) {
			
			
			
			//To get the count of e 
			
			if (cs[i]=='e') {
				count++;
				
				
			}
			
		}
		System.out.println(count);
	}

}
