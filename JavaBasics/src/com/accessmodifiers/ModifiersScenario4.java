/*Protected modifiers:
 * -----
 * protected is applicable for methods and variables but not for outer classes
 * 1.with the same package we can access protected method in other class
 * 2.But in case other package classes we can access protected method through extending class by 
 * 		using only child class object
 */
package com.accessmodifiers;

public class ModifiersScenario4 {
	protected String getAddress() {
		System.out.println("Ongole");
		return "ongole";
	}
}
