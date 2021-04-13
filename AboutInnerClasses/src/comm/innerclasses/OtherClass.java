package comm.innerclasses;

public class OtherClass {

	public static void main(String[] args) {
		
		//creating an object for the outer Class
		NestedClass n=new NestedClass();
		n.show();
		
		//it will raise error because it is declared in seperate class
//		InnerClass i=n.new InnerClass();
		
		//creating an object for innerclass with the help of innerclass
		NestedClass.InnerClass i=n.new InnerClass();
		i.display();
	}
}

//creating outer class
class NestedClass{
	
	//declaring method in outer class
	void show() {
		System.out.println("show method in innerclasses");
	}
	
	//creating inner class
final class InnerClass{
	
	//declaring method in nner class
void display() {
	System.out.println("display method in outer class");
}
}
}

