/*
method Overloading:
1.when two method names are same and having different argument types 
then the method is said to be overloaded
2.when we are calling overloaded methods compiler will check whether the method is there or not
3.checking method resoution during compile time so..it is called as compile time polymorphism...

*/
package com.polymorphism;
//add(),add(int i),add(float a)
public class MethodOverloadingScenario1 {
	public static void main(String[] args) {
		RunAddition.add();
		RunAddition.add(5.0f);
		RunAddition.add(10);
		//here in this case it will raise error because we don't have method with string arguments
//		RunAddition.add("sravya");
		
	}
}
class RunAddition{
	public static void add() {
		System.out.println("The sum will be:"+0);
	}
	public static void add(int i) { 
		System.out.println("The sum is:"+(i+0));
	}
	public static void add(float a) {
		System.out.println("The sum is:"+(a+0));
	}
}