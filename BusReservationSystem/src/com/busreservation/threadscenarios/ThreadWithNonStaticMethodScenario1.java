//scenario 1:
//
//I have one thread class inside that only one  non-static method is there
//	case 1:you have created only one thread
//	case 2:you have 2 threads and those two threads you are passing the same thread class object
//	case 3:	you have 2 threads and you are passing seperate thread class objects



package com.busreservation.threadscenarios;

public class ThreadWithNonStaticMethodScenario1 extends Thread {
	
	 static int seats= 5;
	String busName;
	ThreadWithNonStaticMethodScenario1(String busName){
		this.busName=busName;
	}
	public void run() {
		// TODO Auto-generated method stub

	for(int i=1;i<=4;i++) {
		reserve(busName,i);
		System.out.println("Available seats are:"+seats);
	}
	
	}
	public static  void reserve(String busName,int i) {
		
//		for(int i=1;i<=4;i++) {
			
			if(seats>0) {	
			System.out.println(Thread.currentThread().getName()+" booked a seat "+i +" in bus "+busName);
			seats--;
			}
			else {
				
				System.out.println(Thread.currentThread().getName()+" tries to book seat "+i+" in bus"+busName+ " but the seats not available in "+busName +"bus");
			}
			
//		}
	}
	public static void main(String[] args) {
		
		//case 1:passing object refernce to one thread
//		ThreadWithNonStaticMethodScenario1 t=new ThreadWithNonStaticMethodScenario1("Morning star");
//		Thread thread=new Thread(t);
//		thread.start();
		
		
		
//		case 2:passing  same object refernce to two thread
//		mixed output is displaying both threads are running concurrently to single object reference
		ThreadWithNonStaticMethodScenario1 s=new ThreadWithNonStaticMethodScenario1("Morning star");
		Thread thread1=new Thread(s);
		Thread thread2=new Thread(s);
		thread1.setName("Akhila");
		thread2.setName("Koti");
		thread1.start();
		thread2.start();
		
//  	case 3:passing seprate object reference to each thread
//		mixed output is displaying both threads are running concurrently to multiple object reference
//		ThreadWithNonStaticMethodScenario1 obj=new ThreadWithNonStaticMethodScenario1("Morning star");
//		ThreadWithNonStaticMethodScenario1 obj1=new ThreadWithNonStaticMethodScenario1("Orange Travels");
//		Thread t1=new Thread(obj);
//		Thread t2=new Thread(obj1);
//		t1.setName("Akhila");
//		t2.setName("Koti");
//		t1.start();
//		t2.start();
		
		
		
		
	}

}

