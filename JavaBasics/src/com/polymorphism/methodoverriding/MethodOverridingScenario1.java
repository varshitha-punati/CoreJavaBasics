/*methodOverriding:
 * whatever the method declared in parent class is declared in child class also method also have same method
 *It is called as runtime polymorphism  because the object is getting created at runtime 
 * so,here at runtime jvm is checking which method to call..
 */

package com.polymorphism.methodoverriding;

public class MethodOverridingScenario1 {
	public static void main(String[] args) {

//		1.child class object reference with child class Object
		Android a = new Android();
		a.mobilePrice();

//		2.parent class object with parent class reference
		Mobile m = new Mobile();
		m.mobilePrice();

//		3.parent class reference for child class object
		Mobile obj=new Android();
		obj.mobilePrice();
	}
}

class Mobile {
	public void mobilePrice() {
		System.out.println("parent class method:Mobile price is 20,000/-");
	}
}

class Android extends Mobile {
	public void mobilePrice() {
		System.out.println("child class method:The android mobile cost is 60,000/-");
	}

}
