package Inheritance;

public class SBIBank implements ATM {
	
	private int balance = 2000;
	public void withdraw (int amount)
	{
	  balance = balance - amount;	
	 System.out.println("withdewal amount "+ amount );
	}

	public void checkBalance ()
	{
		System.out.println("Hdfc balence" + balance);
	}

}
