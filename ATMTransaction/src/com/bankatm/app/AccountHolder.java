package com.bankatm.app;

public class AccountHolder implements Runnable {
	private Account account;

	public AccountHolder(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 4; i++) {
			makeWithdrawal(3000);
			if (account.getBalance() < 0) {
				System.out.println("account is overdrawn!");
			}
		} 
	}

	private synchronized void makeWithdrawal(int withdrawAmount) {
		System.out.println();
	
		if (account.getBalance() >= withdrawAmount) {
			System.out.println(Thread.currentThread().getName()	+ " is going to withdraw "+withdrawAmount);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException ex) {  
			}
			account.withdraw(withdrawAmount);
			System.out.println(Thread.currentThread().getName()	+ " completes the withdrawal of "+withdrawAmount);
			System.out.println("Now available balance is:"+account.getBalance());
		} else {
			
			System.out.println("Not enough money in account for "	+ Thread.currentThread().getName() + " to withdraw ");
			
		}
		
}
	
	}

