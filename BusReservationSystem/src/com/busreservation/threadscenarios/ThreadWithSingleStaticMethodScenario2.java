package com.busreservation.threadscenarios;

public class ThreadWithSingleStaticMethodScenario2 extends Thread{
	static int seats=5;
	String busName;
	ThreadWithSingleStaticMethodScenario2(String busName){
		this.busName=busName;
	}
//	@override
	public void run() {
		for(int i=1;i<=4;i++) {
		reserved(busName,i);
		System.out.println("Available seats are:"+seats);
		}
	}
	public static void main(String[] args) {
		
//	case 1:single object reference for single thread
		ThreadWithSingleStaticMethodScenario2 t=new ThreadWithSingleStaticMethodScenario2("Morning star");
		Thread thread=new Thread(t);
		thread.start();
//		
//////		case 2:single object refernce to multiple threads
//		ThreadWithSingleStaticMethodScenario2 s=new ThreadWithSingleStaticMethodScenario2("Morning star");
//		Thread t1=new Thread(s);
//		Thread t2=new Thread(s);
//		t1.start();
//		t2.start();
//			
//		ThreadWithSingleStaticMethodScenario2 obj=new ThreadWithSingleStaticMethodScenario2("Morning star");
//		ThreadWithSingleStaticMethodScenario2 obj1=new ThreadWithSingleStaticMethodScenario2("Orange Travels");
//		Thread tobj=new Thread(obj);
//		Thread tobj1=new Thread(obj1);
//		tobj.setName("Akhila");
//		tobj1.setName("Koti");
//		tobj.start();
//		tobj1.start();
	}
	public static void reserved(String busName,int i) {
		 
	
			if(seats>0) {
			System.out.println(Thread.currentThread().getName()+" booked a seat"+i +"in "+busName+" bus");
			seats--;
			}
			else {
				System.out.println(Thread.currentThread().getName()+" tries to book a seat "+i+ busName+" but seats are not available");
			}
		}
	}

