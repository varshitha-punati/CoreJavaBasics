//Var-args introduced in 1.5 these can also be overloaded ...
//Var-args means it can pass zero or more than one int value
//if no argument is passed then var argument is executed
//if i passed one int argument in add method then method with int agrument is executed
//So,when we used to call int type argument then the first priority will goes to normal int argument than var agrument
//The reason is first priority will goes to old version there is no specific logic

package com.polymorphism;

public class MethodOverloadingScenario5 {
public static void main(String[] args) {
	VarSum obj=new VarSum();
//	
	obj.add();
	obj.add(10);
	obj.add(10,20);
}
}
class VarSum{
	public void add(int...i) {
		System.out.println("The var type argument");
	}
	public  void add(int a) {
		System.out.println("The int type argument:");
	}
}