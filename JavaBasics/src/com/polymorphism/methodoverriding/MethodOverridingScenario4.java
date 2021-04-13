/*1.variables cannot be overridden
 * 2.var-args cannot be overridden
 */

package com.polymorphism.methodoverriding;

public class MethodOverridingScenario4 {
	public static void main(String[] args) {
		
//		1.child class object reference with child class object
		AboutAndroidPhone obj=new AboutAndroidPhone();
		System.out.println(obj.s);
		obj.mobilePrice(200000);
		
		
//		2.parent class object reference with parent class Object
		AboutMobilePhone obj1=new AboutMobilePhone();
//		In this case it is prinitng parent class variable
		System.out.println(obj1.s);
		obj1.mobilePrice(600000);
		
//		3.Parent class object refrence with child class object
		AboutMobilePhone obj2=new AboutAndroidPhone();
//		In this case it is printng parent class variable and the variable is not overided 
		System.out.println(obj2.s);
//		so var args cannot be overridden
		obj2.mobilePrice(800000);
		
		
	}
}
class AboutMobilePhone {
	public String s="hello";
	
	public void mobilePrice(int...i) {
		System.out.println("The method with var args");
		
	}
}

class AboutAndroidPhone extends AboutMobilePhone {
	
	public String s="Hello world";
	//here though i am returning string it is acceptable
	
	public void mobilePrice(int i) {
		System.out.println("The method with int argument");
		
	}

}