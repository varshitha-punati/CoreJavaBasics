//Ambiguity error will raise in Overriding
package com.polymorphism;

public class MethodOverloadingScenario3 {
	public static void main(String[] args) {
		
		Run.add(10, 10.0f);
		Run.add(20.0f, 20);
		
//	In these both the two cases ambiguous error will raise because compiler dont not which method to execute
		
//		Run.add(10.0f, 10.0f);
	}
}
class Run{
	
	public static void add(int i,float a) {
		System.out.println("The sum is:"+(i+a));
	}
	public static void add(float i,int a) {
		System.out.println("The sum is:"+(i+a));
	}
}