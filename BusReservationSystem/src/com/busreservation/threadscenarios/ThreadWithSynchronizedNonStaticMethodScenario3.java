package com.busreservation.threadscenarios;

public class ThreadWithSynchronizedNonStaticMethodScenario3 extends Thread{
	int seats=5;
	
	String busName;
	
	ThreadWithSynchronizedNonStaticMethodScenario3(String busName){
		this.busName=busName;
	}
	
	
	public static void main(String[] args) {
		
//		case1:single object reference in single thread
//		ThreadWithSynchronizedNonStaticMethodScenario3 t=new ThreadWithSynchronizedNonStaticMethodScenario3("MorningStar");
//		Thread sn=new Thread(t);
//		sn.start();
		
		
//		case 2:single object reference to multiple threads
//		ThreadWithSynchronizedNonStaticMethodScenario3 s=new ThreadWithSynchronizedNonStaticMethodScenario3("MorningStar");
//		Thread obj=new Thread(s);
//		Thread obj1=new Thread(s);
//		obj.setName("AKhila");
//		obj1.setName("Koti");
//		obj.start();
//		obj1.start();
			
//		case 2:seperate object reference in seperate threads
		ThreadWithSynchronizedNonStaticMethodScenario3 tobj=new ThreadWithSynchronizedNonStaticMethodScenario3("MorningStar");
		ThreadWithSynchronizedNonStaticMethodScenario3 tobj1=new ThreadWithSynchronizedNonStaticMethodScenario3("OrangeTravels");
		Thread	thread1=new Thread(tobj);
		Thread thread2=new Thread(tobj1);
		thread1.setName("AKhila");
		thread2.setName("avinash");
		thread1.start();
		thread2.start();
	}
	
	public void run() {  
		for(int i=1;i<=4;i++) {
		reserved(busName);
		System.out.println("Available seats are:"+seats);
		}
	}
	
	public  synchronized void reserved(String busName) {
	
			if(seats>0) {
			System.out.println(Thread.currentThread().getName()+ " booked a seat in "+busName);
			seats--;
		}
			else {
				System.out.println(Thread.currentThread().getName()+" tries to book the ticket but seats are not available in "+busName);
			}	
	}
	
}
