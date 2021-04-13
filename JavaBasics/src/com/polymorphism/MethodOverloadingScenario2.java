/*
 * AutoConversion table..
 * byte->short->int->long->float->double
	char->int->long->float->double
*/
package com.polymorphism;

public class MethodOverloadingScenario2 {
	public static void main(String[] args) {
		RunAdditionOn.add();
		RunAdditionOn.add(12);
//		RunAdditionOn.add(8.0f);
		
		//In this case there is no..char type agrument but it is executing int type agrument method
//		so char can convert to.char->int->float->double
//		but char cannot convert to short or byte..
//				RunAdditionOn.add('c');
				
//		In this case compile time error will raise because..double cannot be covert to other types
//				but the revesre case is possible 
//				byte->short->int->float->double
//				RunAdditionOn.add(8.00d);
				
//In this case if the int is not there then next its look for long then after float.after double
//	if float and double are there for int agrument then float will execute..
//				RunAdditionOn.add(11);
				
				
	}
	 
	 
}
class RunAdditionOn{
	public static void add() {
		System.out.println("The sum will be:"+0);
	}
	public static void add(int i) {
		System.out.println("The sum  of int type is:"+(i+10));
	}
	
//	public static void add(double i) {
//		System.out.println("The sum  of double type is:"+(i+10));
//	}
	public static void add(short i) {
		System.out.println("The sum  of short type is:"+(i+10));
	}
//	public static void add(float a) {
//		System.out.println("The sum of float type is is:"+(a+10));
//	}
}