package com.abstractmodifier;
public abstract class OnAbstarctMethods {
	//we can't create object for abstract class 
	//If a class is not abstarct then anyone can access by creating object
	//If a class does not contain Abstract method  still we can declare class as abstract
	public abstract void m1();
} 


class Sample extends OnAbstarctMethods{
	public static void main(String[] args) {
//		 OnAbstarctClass  obj=new  OnAbstractClass();
		 Sample obj1=new Sample();
		 obj1.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
}
