/*
 * 1.In java we can create multiple classes in one java file
 * 2.If we one class in one file..then one .class file is generated
 * 3.If we have four class in one file then four .class files will generate
 * 4.In this scenario I have saved this file as ModifiersScenario1 but my class name and file name are not same
 * 		even though it does not raise error it means..
 * 5.In a file If you have more than one class and if all the classes are default
 *    	then it will accept the file if the filename and className are not same..
 *  6.So..public should be declared to class having same file name otherwise it will raise error
 * 	7.so,we can declare main method in any class and we can also declare mainmethods in every class also
 *	8.the public modifier should be declared to its own class file otherwise it will raise error
*/

package com.accessmodifiers;

class Payment{
//	public static void main(String[] args) {
//		ModifiersScenario1.show();
//	}
}
class Bank{
//	public static void main(String[] args) {
//		ModifiersScenario1.show();
//	}
}
class Loan{
//	public static void main(String[] args) {
//		ModifiersScenario1.show();
//	}
}  
//public class ModifiersScenario1{
//	public static void show() {
//		System.out.println("in show..method");
//	}
//}