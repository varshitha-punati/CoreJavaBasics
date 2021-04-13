package com.inheritance;

public class MultipleInheritance {

	public static void main(String[] args)

	{
		Human h = new Human();
		h.read();
		h.writing();
		Human.activity();

	}
}

interface Read

{

	default void read() {

		System.out.println("I am reading");

	}

}

interface Write

{

	default void writing() {
		System.out.println("I am writing");

	}

}

class Human implements Read, Write

{
	public static void activity() {
		System.out.println("Human can read and write");
	}
}