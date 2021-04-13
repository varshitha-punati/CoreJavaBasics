package com.variables;

public class OnBlocks {
	static String info;
	float i;
	float j;
	static {
		info="Welcome to the website";
		System.out.println(info);
	}
	static {
		System.out.println("Please  register!");
	}
	
	{
		System.out.println("Details of the person");
	}
	OnBlocks(){
		System.out.println("No parameterized constructor and person height and weight is not mentioned");
	}
	OnBlocks(float height){
		i=height;
		System.out.println("single parameter constructor with height:"+i);
	}
	OnBlocks(float height,float weight){
		i=height;
		j=weight;
		System.out.println("double parameter constructor with height:"+i+"and weight is:"+j);
	}
	public static void main(String[] args) {
		OnBlocks obj=new OnBlocks();
		OnBlocks obj1=new OnBlocks(5.5f);
		OnBlocks obj2=new OnBlocks(5.7f,65.0f);
		OnBlocks obj3=new OnBlocks(5.7f,65.0f);
		
	}
}
