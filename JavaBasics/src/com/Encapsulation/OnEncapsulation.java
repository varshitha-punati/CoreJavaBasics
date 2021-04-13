package com.Encapsulation;

public class OnEncapsulation {
	String username = "varshi";
	int password = 12345;

	public static void main(String[] args) {
		AccountDetails ad = new AccountDetails();
		OnEncapsulation obj = new OnEncapsulation();
		if (obj.username.equals("varshi")) {
			if (obj.password == 12345) {
				System.out.println("Login successful");
				System.out.println("Account Number is:"+ad.getAccountNumber());
				System.out.println("Account balance is:"+ad.getBalance());

			}

		}
	}

}
