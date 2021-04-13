package com.abstractmodifier;

public  class OnAbstractClasses {
	//so..if we declare any abstract method in a class the class must be abstract class..otherwise it raise error
//	public abstract void m1();
}
abstract class Vehicle{//abstract class be public or default
	
	//variables 
	
		String colour;
		static int size=5;
		final int noOfBrakes=2;
	
	
//	constructors
	public Vehicle(String colour){
		this.colour=colour;
		System.out.println("Bike colour is:"+colour);
	}
		
	//blocks
	static {
		System.out.println("Differnt bikes are available");
	}
	
	{
		System.out.println("Bike details are:");
	}
	
	
	
	//AbstractMethods
	
	//abstract method will contains only...declaration but not any implementation
	public abstract void getNoOfWheels();
	abstract void getnumber();
	//private abstract void getSpeed();
	//private modifier is not accessiable
	protected abstract void getNoOfWheel();
//	final abstract void getNo();//static and final is also not accessiable
	
	
	//concrete methods
	public static void name() {
		System.out.println("bike name is pulsar");
	}
	protected static void cost() {
		System.out.println("50k");
	}//private methods can declare but not accessiable to child class
	
	
	
	public static void main(String[] args) {
		Vehicle b=new Bike("Blue");
		b.getNoOfWheel();
		b.getNoOfWheels();
		b.getnumber();
		name();
		cost();
		
	}
	
}
class Bike extends Vehicle{

	public Bike(String colour) {
		super(colour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getNoOfWheels() {
		// TODO Auto-generated method stub
		System.out.println("2 wheels");
	}

	@Override
	protected void getNoOfWheel() {
		// TODO Auto-generated method stub
		System.out.println("2 wheels");
		
	}

	@Override
	void getnumber() {
		// TODO Auto-generated method stub
		System.out.println("bike number is:AP04123");
		
	}
}