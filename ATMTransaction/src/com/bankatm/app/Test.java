package com.bankatm.app;

class MyThread  implements Runnable{
	
	
	 int num = 50;
	
	public void run() {		
		
		while(num>0){
			
//			synchronized (this)
			{
				
				num--;
				if(num > 0){
					 System.out.println(Thread.currentThread().getName()+":One ticket is booked \n The remaining tickets: "+num);
				}else{
					 System.out.println(Thread.currentThread().getName()+":Tickets sold out");
				}
				
				
		  	}
		}
	}
 
} 

public class Test {
	  public static void main(String[] args){  
			MyThread mt = new MyThread();
			
			Thread thread1 = new Thread(mt);
			 thread1.setName("Window One");
			 
			Thread thread2 = new Thread(mt);
			 thread2.setName("Window Two");
			thread2.setPriority(thread2.MAX_PRIORITY);
			 
			 Thread thread3 = new Thread(mt);
			 thread3.setName("Window Three");
			 thread3.setPriority(thread3.MIN_PRIORITY);
			 
			 Thread thread4 = new Thread(mt);
			 thread4.setName("Window Four");
			 thread4.setPriority(Thread.MAX_PRIORITY);
			
	  			 
			 
			thread1.start();
				
			thread2.start();
			
			thread3.start();
			
			thread4.start();
			
			
			
			
			
	    }  
}


