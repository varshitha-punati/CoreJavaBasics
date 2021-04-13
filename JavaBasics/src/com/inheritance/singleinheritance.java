package com.inheritance;

public class singleinheritance {
	public static void main(String[] args) {
		Mango.fruitsQuality();
		Mango.feature();
	}
}

class Fruit {
	public static void fruitsQuality() {
		System.out.println("Fruits are important sources of dietary fibre, vitamins and antioxidants.");
	}
}

class Mango extends Fruit {
	public static void feature() {
		System.out.println("Mangoes are  yellow to orange in colour, juicy, and of distinctive sweet-spicy flavour.");
	}
}