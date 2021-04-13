/*Method Local inner classes
Inner class can be declared within a method of an outer class.

Method Local inner classes can’t use local variable of outer method until that local variable is not declared as final
A method local inner class is defined within a method of the enclosing class. 
If you want to use inner class , you must instantiate the inner class in the same method, but after the class definition code. 
Only two modifiers are allowed for method-local inner class which are abstract and final.
The inner class can use the local variables of the method (in which it is present), only if they are marked final.
*
*
*/

package comm.typesofinnerclasses;

public class MethodLocalVariable {
	
	int a=70;
	
	//outer class method
	void outerMethod() { 
        System.out.println("inside outerMethod"); 
        
        // Inner class is local to outerMethod() 
        class Inner { 
        	int a=30;
        	//inner class method
            void innerMethod() { 
                System.out.println("inside innerMethod"); 
                System.out.println(MethodLocalVariable.this.a);
                System.out.println(Inner.this.a);
            } 
        } 
        Inner y = new Inner(); 
        y.innerMethod(); 
    } 
}

class MethodDemo { 
    public static void main(String[] args) { 
    	
    	MethodLocalVariable x = new MethodLocalVariable(); 
        x.outerMethod(); 
    } 
} 