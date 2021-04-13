package comm.innerclasses;

public class PrivateInnerClass {
	 int x = 10;

	  private class InnerClass {
	    int y = 5;
	  }
	}

	class Main {
	  public static void main(String[] args) {
		  PrivateInnerClass myOuter = new PrivateInnerClass();
		  
//		  If you try to access a private inner class from an outside class (MyMainClass), an error occurs:
		  
		  
		  //	    OuterClass.InnerClass myInner = myOuter.new InnerClass();
//	    System.out.println(myInner.y + myOuter.x);
	  }
}
