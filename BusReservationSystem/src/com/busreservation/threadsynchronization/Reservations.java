package com.busreservation.threadsynchronization;

public class Reservations {
	int seats=5;
	
//	variables are names used to hold one or more values.
//	Instead of repeating these values in multiple places in your code, the variable holds the results of a calculation, 
//	database call, results of a database query, or other value.
	
	String busName;
	
	Reservations(String busName){
		this.busName=busName;
	}
	
	
	public  void seatsReserved(String busName,int i) {
		
		if(this.seats>0) {	
			System.out.println(Thread.currentThread().getName()+" booked a seat "+i +" in bus "+busName);
			this.seats--;
			}
		else {				
			System.out.println(Thread.currentThread().getName()+" tries to book seat "+i+" in bus "+busName+ " but the seats not available in "+busName +"bus");
			}
	
	}
	
	public void moneyDetails(String busName) {
		
		if(busName.equals("MorningStar")) {			
			System.out.println("4000/-");
		}
		else {
			System.out.println("5000/-");
			
		}	
	}
		
}
