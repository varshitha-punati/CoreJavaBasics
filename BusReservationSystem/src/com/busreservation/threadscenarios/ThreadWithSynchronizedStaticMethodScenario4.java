package com.busreservation.threadscenarios;

public class ThreadWithSynchronizedStaticMethodScenario4 extends Thread {
	
	static int seats=5;
	String busName;
	ThreadWithSynchronizedStaticMethodScenario4(String busName){
		this.busName=busName;
		
	}
	
	public static void main(String[] args) {
//		ThreadWithSynchronizedStaticMethodScenario4 ss=new ThreadWithSynchronizedStaticMethodScenario4("MorningStar");
//		 Thread t=new Thread(ss);
//		 t.start();
		 
		 
		 ThreadWithSynchronizedStaticMethodScenario4 obj=new ThreadWithSynchronizedStaticMethodScenario4("MorningStar");
		 Thread t1=new Thread(obj);
		 Thread t2=new Thread(obj);
		 t1.setName("Akhila");
		 t2.setName("Koti");
		 t1.start();
		 t2.start();
		 
		 
//		 
//		 ThreadWithSynchronizedStaticMethodScenario4 tobj=new ThreadWithSynchronizedStaticMethodScenario4("MorningStar");
//		 ThreadWithSynchronizedStaticMethodScenario4 tobj1=new ThreadWithSynchronizedStaticMethodScenario4("OrangeTravels");
//		 Thread thread1=new Thread(tobj);
//		 Thread thread2=new Thread(tobj1);
//		 thread1.setName("Akhila");
//		 thread2.setName("Koti");
//		 thread1.start();
//		 thread2.start();
	}
	
	
	public void run() {
		for(int i=1;i<=4;i++) {
		reserved(busName,i);
		}
	}
	
	public static synchronized void reserved(String busName,int i) {		
			if(seats>0) {
			System.out.println(Thread.currentThread().getName()+" booked a seat"+i +"in "+busName);
			seats--;
		}
			else {
				System.out.println(Thread.currentThread().getName()+" tries to book seat "+i+" in "+busName+" but seats are not available");
			}
	}
	
}
	
