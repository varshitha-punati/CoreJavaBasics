package com.busreservation;

public class BookingSeats{
	
	public static void main(String[] args) {
		
		
		Reservation r=new Reservation("Kesari");
//		Reservation r1=new Reservation("Yatra");
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.setName("thread1");
		t2.setName("thread2");
		t1.start();
		t2.start();
		
	}
}
class Reservation implements Runnable{
	Booking b=new Booking();
	 String busName;
	 
	 Reservation(String busName){
		 this.busName=busName;
//		 this.book=book;
	 }
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		b.seatsReserved(busName);
		b.seatsReserve(busName);
	}

}
class Booking{
//	public static synchronized void seatsReserved( String busName) {
//		for(int i=0;i<4;i++) {
//			System.out.println("Thread Name:"+Thread.currentThread().getName()+"  Bus Name:"+busName+"  SeatNo:"+i);
//		}
//	}
	public   synchronized void seatsReserve( String busName) {
		for(int i=0;i<4;i++) {
			System.out.println("Non-static method   Thread Name:"+Thread.currentThread().getName()+"  Bus Name:"+busName+"  SeatNo:"+i);
		}
	}
}