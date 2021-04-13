package com.busreservation.threadsynchronization;

public class ThreadScenario extends Thread{
	
	
	
	public void run() {
		Reservations r=new Reservations("MorningStar");
		
		for(int i=1;i<=4;i++) {
			r.seatsReserved("MorningStar",i);
			System.out.println("Available seats are:"+r.seats);
//			r.moneyDetails("MorningStar");
			
		}
//		scenario 5:
//
//			I have one thread class inside that two non static methods is there
//				case 1:you have created only one thread and call the two methods
//				case 2:you have 2 threads and those two threads you are passing the same    class object and two threads are calling seperate methods
//				case 3:you have 2 threads and those two threads you are passing the same thread class object and two threads are calling same methods
//				case 4:	you have 2 threads and you are passing seperate thread class objects and two threads are calling the same methods
//				case 5:	you have 2 threads and you are passing seperate thread class objects and two threads are calling the seperate methods	
		
	}
	
	
}
class ThreadScenario1 extends Thread{
	
	public void run() {
		Reservations r1=new Reservations("OrangeTravels");
		
		for(int i=1;i<=4;i++) {
//			r1.seatsReserved("OrangeTravels",i);
//			System.out.println("Available seats are:"+r1.seats);
			r1.moneyDetails("OrangeTravels");
			
		}
		
		
	}
	
	
}
