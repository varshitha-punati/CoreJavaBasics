package com.variables;

public class OnMethods {
	
	   int empId; 
	   String empName; 
	   static String companyName = "TCS";
	   
	   
	 //constructor to initialize the variable 
	   OnMethods(int id, String name){ 
	      empId = id; 
	      empName = name; 
	   } 
	   
	   //static method to valueChange the value of static variable 
	   public static void valueChange()
	   { 
	      companyName = "CTS"; 
//	      System.out.println(empId+" "+empName+" "+companyName);
	   } 
	   
	 //method to display values 
	  void display()
	   {
	      System.out.println(empId+" "+empName+" "+companyName);
	   } 
	
	   public static void main(String args[])
	      { 
		   valueChange();
		  
		   OnMethods Obj = new OnMethods(571,"sravani"); 
		   OnMethods Obj1 = new OnMethods(572,"mansiha"); 
		   OnMethods Obj2 = new OnMethods(573,"Renuka"); 
	         
	         Obj.display(); 
	         Obj1.display(); 
	         Obj2.display(); 
	      } 
}
