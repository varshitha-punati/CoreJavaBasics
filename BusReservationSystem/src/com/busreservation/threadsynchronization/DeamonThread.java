package com.busreservation.threadsynchronization;

public class DeamonThread extends Thread{
	
	public static void main(String[] args) {
		
		 DeamonThread d=new  DeamonThread();
		 Thread t=new Thread();
		 t.setDaemon(true);
		 t.start();
		
		if(Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName()+" the thread is deamon");
		}
		else {
			System.out.println(Thread.currentThread().getName()+" the thread is not deamon");
		}
		if(t.isDaemon()) {
			System.out.println(" the thread-0 is deamon");
		}
		else {
			System.out.println(" the thread-0 is not deamon");
		}
		
	}
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(i);
		}
	}
}
