package com.busreservation.threadsynchronization;

public class ThreadLogic {
	public static void main(String[] args) {
		ThreadScenario t=new ThreadScenario();
		ThreadScenario1 t1=new ThreadScenario1();
		Thread thread=new Thread(t);
		Thread thread1=new Thread(t1);
		thread.start();
		thread1.start();
	}
}
