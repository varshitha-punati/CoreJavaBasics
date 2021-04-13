/*we can't reduce the visibility of inherited methods
 * private->default->protected->public
 * 
 * If we declare method as public it cannot be overridden to protected or default or private
 *but for private we cannot override the methods
 * Like that we can increase the visibility but cannot reduce the  visibility
 * For private,final,static overriding is not possible
 * For strictfp,native,public,protected overriding is possible
 */
package com.polymorphism.methodoverriding;

public class MethodOverridingScenario3 {
	
	public static void main(String[] args) {

//		1.child class object reference with child class Object
		AboutAndroid a = new AboutAndroid();
		a.mobilePrice();
		a.display();

//		2.parent class object with parent class reference
		AboutMobile m = new AboutMobile();
		m.mobilePrice();
		m.display();

//		3.parent class reference for child class object
		AboutMobile obj=new AboutAndroid();
		obj.mobilePrice();
		obj.display();
	}
}
class AboutMobile {
	 void mobilePrice() {
		System.out.println("parent class method:Mobile price is 20,000/-");
	
	}
	public static void display() {
		System.out.println("parent class method");
	}
}

class AboutAndroid extends AboutMobile {
	//here though i am returning string it is acceptable
	public void mobilePrice() {
		System.out.println("child class method:The android mobile cost is 60,000/-");
		
	}
	
//	for static methods we cannot override it is method hiding
	public static void display() {
		System.out.println("child class method");
	}

}