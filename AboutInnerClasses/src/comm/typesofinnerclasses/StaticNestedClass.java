/*Static nested classes are not technically an inner class. 

 * They are like a static member of outer class.
	A static nested classes are the inner classes marked with static modifier.
	Because this is static in nature so this type of inner class doesn’t share any special kind of relationship with an instance of outer class.
	A static nested class cannot access non static members of outer class.
 * */

package comm.typesofinnerclasses;

public class StaticNestedClass {
	private static void outerMethod() { 
	     System.out.println("inside outerMethod"); 
	   } 
	     
	   // A static inner class 
	   static class Inner { 
	     public static void main(String[] args) { 
	        System.out.println("inside inner class Method"); 
	        outerMethod(); 
	     } 
	   } 
}
