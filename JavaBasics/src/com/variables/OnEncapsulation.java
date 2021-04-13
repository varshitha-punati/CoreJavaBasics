package com.variables;

public class OnEncapsulation {
	
	public static void main(String[] args) {
		Hideclass obj=new Hideclass();
		obj.setStudentName("varshi");
        obj.setStudentId(21);
      
        System.out.println("Student Name: " + obj.getStudentName());
        System.out.println("Student Id: " + obj.getStudentId());
       
	}
}
class Hideclass{
	int studentId;
	String studentName;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
