package com.aldebaran.student;

public class Student {
	private String fNum;
	private String firstName;
	private String lastName;
	private String email;
	private String age ;
	private String group;
	private String grade1;
	private String grade2;
	private String grade3;
	private String grade4;
	private String phone;
	
	
	
	
	



	public Student(String fNum, String firstName, String lastName, String email, String age, String group, String grade1,
			String grade2, String grade3, String grade4, String phone) {
		super();
		this.fNum = fNum;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
		this.group = group;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
		this.grade4 = grade4;
		this.phone = phone;
	}








	@Override
	public String toString() {
		
		
		return this.fNum+" "+this.firstName+" "+this.lastName+" "+this.age+" "+this.email+" "+this.phone;
	}

	

}
