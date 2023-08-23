package week3.day2;

public class Students {
	
	public void getStudentInfo(int a) {
		
		System.out.println("Student Id - "+a);	
		
	}
	
	
public void getStudentInfo(int a, String name) {
		
		System.out.println("Student ID - "+a);
		System.out.println("Student name - "+ name);
		
	}


public void getStudentInfo(String email, long phoneno) {
	
	System.out.println("Email - "+email);
	System.out.println("Phone No - "+phoneno);
	
}

	public static void main(String[] args) {
		
		Students obj = new Students();
		
		obj.getStudentInfo(20);
		obj.getStudentInfo(20, "Megala");
		obj.getStudentInfo("megalasekar20@gmail.com", 8056163885l);
		
		
		
		

	}

}
