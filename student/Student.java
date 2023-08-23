package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		
		System.out.println("Megala");
		
	}
	
	public void studentDept() {
		
		System.out.println("Physics");
		
	}

	public void studentId() {
		
		System.out.println("PGP20");
		
	}
	
	public static void main(String[] args) {
		
		Student obj = new Student();
		
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		
	}

}



