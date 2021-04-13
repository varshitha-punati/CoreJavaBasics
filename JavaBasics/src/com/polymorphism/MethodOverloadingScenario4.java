//when you have both parent and child class the child class will have highest priority
//String->Object
//If string is not there then object argument will work..but if the 
package com.polymorphism;

public class MethodOverloadingScenario4 {
	
	public static void main(String[] args) {
//		Sum.add(new Object());
		Sum.add("hello");
//		so here it first checks for child class and if not there then parent class
		Sum.add(null);
		
//		Sum.add(18);
//		Sum.add(18.0f);
//		Sum.add(20.00d);
	}
}
class Sum{
//	public static void add(Object o) {
//		System.out.println("The object type argument");
//	}
	public static void add(String s) {
		System.out.println("The String type argument:");
	}
}