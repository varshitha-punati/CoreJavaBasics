package comm.innerclasses;

public class RegularInnerClasses {
	void show() {
		int a=20;
		int b=12;
		System.out.println("outerClass method");
	}
	class InnerClass{
		int a=1;
		int b=2;
		void display() {
			System.out.println("InnerClass method:"+a);
		}
		
	}
		public static void main(String[] args) {
			
			//Here we can access only the innerclass methods
			new RegularInnerClasses().new InnerClass().display();
		}

}
