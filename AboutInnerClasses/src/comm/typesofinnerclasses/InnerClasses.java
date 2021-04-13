package comm.typesofinnerclasses;

public class InnerClasses {

	class Outer{//is a relationship//Aggregation//correlation
		
	}
	public static void main(String[] args) {
		InnerClasses obj=new InnerClasses();
	}
}
class Listen extends InnerClasses{//has a relationship
	
	public static void main(String[] args) {
		
		InnerClasses obj=new Listen();
	}
}