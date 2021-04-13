package com.variables;

public class OnVariables {
	//bankName is static variable
	static String bankName;
	
	//studentWeight,studentWeight is instance variable
	float studentWeight;
	float studentHeight;
	
	OnVariables(float studentWeight,float studentHeight){
		this.studentWeight=studentWeight;
		this.studentHeight=studentHeight;
	}
	
	 static public void main(String[] args) {
		
		bankName="AndhraBank";
		
		OnVariables obj=new OnVariables(60.0f,5.5f);
		System.out.println("For Object reference obj the static variable bankName is:"+obj.bankName);
		
		System.out.println("For Object reference obj the weight is:"+obj.studentWeight+" and the Height is:"+obj.studentHeight);
		OnVariables obj1=new OnVariables(40.0f,5.1f);
		System.out.println("For Object reference obj1 the weight is:"+obj1.studentWeight+" and the Height is:"+obj1.studentHeight);
		System.out.println("For Object reference obj the weight is:"+obj.studentWeight+" and the Height is:"+obj.studentHeight);
		bankName="UnionBank";
	
		System.out.println("For Object reference obj1 the static variable bankName is:"+obj1.bankName);
		System.out.println("For Object reference obj the static variable bankName is:"+obj.bankName);
		for(int i=1;i==1;i++) {
			//here i is a local variable because it is used to that particular block only
			System.out.println("local variable is:"+i);
			
		}
//		System.out.println(i);
	}
	
}

