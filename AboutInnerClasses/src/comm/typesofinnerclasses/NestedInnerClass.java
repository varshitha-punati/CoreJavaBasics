/*Inner class means one class which is a member of another class. There are basically four types of inner classes in java.
1) Nested Inner class
2) Method Local inner classes
3) Anonymous inner classes
4) Static nested classes


Nested Inner class:
Nested Inner class can access any private instance variable of outer class. 
Like any other instance variable, we can have access modifier private, protected, public and default modifier.
Like class, interface can also be nested and can have access specifiers.

*/
package comm.typesofinnerclasses;

public class NestedInnerClass {
	
	  static int a=1;
	 static int b=3;
	
	 // Simple nested inner class 
	 class Inner { //it can accept any type of variables but static class can accept only static variables
	      
		public void show() { 
	           System.out.println("In a nested class method"); 
	           System.out.println(NestedInnerClass.a);
	           System.out.println(NestedInnerClass.b);
	           
	      } 
	      
	   } 
	public static void main(String[] args) {
		NestedInnerClass.Inner i=new NestedInnerClass().new Inner();
		i.show();
	}
}
	
	   	   

