/*Strictfp:
 * 
 * It is introduced in java 1.2 version
 * stritcfp:Strict floating point
 * This is applicable for classes and methods but not for variables
 * 1.Here in this 15.5/2  floating arthimetic operation
 * In windows 7.75122
 * In macos 7.75121
 * In linux 7.75123
 * Here the result may vary from one machine to another machine
 * 2.If we want a platform independent result for floating arthimetic operation we use strictfp modifier
 * 
 * 3.strictfp for methods:
 * -----
 * i.If a method is declared as strictfp then all floating point caluclations in that method
 * 	should follow IEEE standard,so that we will get platform independent result
 * 
 * 4.strictfp for classes:
 * -----
 * i.If a class is declared as strictfp then all the methods in that class will have 
 * get platform independent results
 * 
 * abstract,strictfp->not acceptable in method level but in class level it is possible
 * abstract strictfp->is acceptable at class level 
 */


package com.accessmodifiers;

//public class ModifiersScenario5 {
//	public static void main(String[] args) {
//		ModifiersScenario5 obj=new ModifiersScenario5();
//		obj.display();
//	}
//	public strictfp void display() {
//		float a=15.5f;
//		int b=2;
//		float result=(a/b);
//		System.out.println(result);
//	}
//
//}
abstract strictfp class ModifiersScenarios {
	public strictfp void display() {
		float a=15.5f;
		int b=2;
		float result=(a/b);
		System.out.println(result);
	}
	abstract  void show();
	
}
class Sample extends ModifiersScenarios{

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("abstract method");
		
	}
	public static void main(String[] args) {
		Sample s=new Sample();
		s.show();
	}
	
}
