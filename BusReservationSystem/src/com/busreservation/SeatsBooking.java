package com.busreservation;

public class SeatsBooking {
	public static void main(String[] args) {
		
		Reservation1 r=new Reservation1("Kesari");
		Reservation1 r1=new Reservation1("Yatra");
		Thread t1=new Thread(r);
		Thread t2=new Thread(r1);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.setName("thread1");
		t2.setName("thread2");
		t1.start();
		t2.start();
	}
}
class Reservation1 implements Runnable{
	Booking1 b=new Booking1();
	 String busName;
	 
	 Reservation1(String busName){
		 this.busName=busName;
//		 this.book=book;
	 }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		b.seatsReserved(busName);
		
	}

}
class Booking1{
	Details d=new Details();
	public static void seatsReserved( String busName) {
		
		
		synchronized(Booking1.class)
//		synchronized(this)
		{
		for(int i=0;i<4;i++) {		
			System.out.println("Thread Name:"+Thread.currentThread().getName()+"  Bus Name:"+busName+"  SeatNo:"+i);
		}
		
		}
		
	
	}
	
}
class Details{
	public void cashDetails(String busName) {
		if(busName.equals("Kesari")){
			System.out.println("Rs.1000/-");
		}
		else {
			System.out.println("Rs.1200/-");
		}
	}
	}
