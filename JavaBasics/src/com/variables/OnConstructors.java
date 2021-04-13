package com.variables;

public class OnConstructors {

	int studentId;
	String studentName;

	protected OnConstructors(int studentId, String studentName) throws ArithmeticException {
		this.studentId = studentId;
		this.studentName = studentName;
		System.out.println(studentId);
		System.out.println(studentName);
		System.out.println(1 / 0);
	}

	public static void main(String[] args) throws ArithmeticException {

		OnConstructors obj = new OnConstructors(20, "Lavanaya");
		SampleConstructor obj1 = new SampleConstructor(15, "Gowthami");
	}
}

class SampleConstructor extends OnConstructors {

	SampleConstructor(int studentId, String studentName) throws ArithmeticException {
		super(studentId, studentName);
		System.out.println(studentId);
		System.out.println(studentName);
		// TODO Auto-generated constructor stub
	}

}
