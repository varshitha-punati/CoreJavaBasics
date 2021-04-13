package comm.innerclasses;

public class OuterClass {
	
	//creating inner class
	class InnerClass{
		
		//creating inner method
		void show() {
			System.out.println("show method in innerclasses");
		}
	}
	
	//creating outer method
	void display() {
		System.out.println("display method in outer class");
	}
	
	//main method
	public static void main(String[] args) {
		
		//creating object for outer class
		OuterClass o=new OuterClass();
		o.display();
		
		//creating object for inner class with innerclass
		InnerClass i=o.new InnerClass();
		i.show();
		
		System.out.println("outer class name:"+o.getClass().getName());
		System.out.println("inner class name:"+i.getClass().getName());
		
//		InnerClass in=new OuterClass().new InnerClass();
//		in.show();
	}
}

