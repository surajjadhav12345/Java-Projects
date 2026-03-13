package com.suraj.javapractice.encapsulation;

public class BankAccount {
	private double balance ;
	public double getBalance ()
	{
		return balance;
	} 
	
	public void deposite(double amount)
	{
		if (amount >0)
		{
			balance = balance + amount;
		}
	}

}
