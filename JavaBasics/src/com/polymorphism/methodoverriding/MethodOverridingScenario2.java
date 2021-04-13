/*
 * Covariant:It is introduced in 1.5 version
 * So,it can be changed to..object to string overriding is possible
 * But..string to object overriding is not possible
 * 
 */

package com.polymorphism.methodoverriding;

public class MethodOverridingScenario2 {
	public static void main(String[] args) {

//		1.child class object reference with child class Object
		AndroidPhone a = new AndroidPhone();
		a.mobilePrice();

//		2.parent class object with parent class reference
		MobilePhone m = new MobilePhone();
		m.mobilePrice();

//		3.parent class reference for child class object
		MobilePhone obj = new AndroidPhone();
		obj.mobilePrice();
	}
}

class MobilePhone {
	public String mobilePrice() {
		System.out.println("parent class method:Mobile price is 20,000/-");
		return null;
	}
}

class AndroidPhone extends MobilePhone {
	// here though i am returning string it is acceptable
	public String mobilePrice() {
		System.out.println("child class method:The android mobile cost is 60,000/-");
		return null;
	}

}