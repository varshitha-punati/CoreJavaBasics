/*Inner classes are a security mechanism in Java. 
 * We know a class cannot be associated with the access modifier private, but if we have the class as a member of other class, then the inner class can be made private.
 *  And this is also used to access the private members of a class.
 */

package comm.innerclasses;
class Outer{
	
	//creating inner class
	private class Inner{
		
		//creating inner class method
		void show() {
			System.out.println("Inner class method");
		}
	}
	
	//creating outer class method
	void display() {
		
		 //Instantiating the inner class
		Inner i=new Inner();
		
		//Accessing the display() method.
		i.show();
		
		
		System.out.println("Outer class method");
	}
}

public class SampleInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //Instantiating the outer class
		Outer o=new Outer();
		
		 //Accessing the display() method.
		o.display();
	}

}
