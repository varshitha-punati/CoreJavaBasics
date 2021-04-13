/*Default Modifier:
 * 1.If we have not declared any modifier before class name or method name it is default modifier
 * ---
 * If we declare a class in default..it can be accessed in other classes with in the same package
 *If we declare a class in public and method in default it can access form other class in same package
 *but we cannot access in other packages classes..in method level and class level
 */
package com.accessmodifiers;

class ModifiersScenario3 {
	 void show() {
		System.out.println("In default access modifiers in show method");
	}
}
