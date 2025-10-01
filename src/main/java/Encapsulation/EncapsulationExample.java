package Encapsulation;

public class EncapsulationExample {

	public static void main(String[] args) {
	BankAccount acc = new BankAccount();
	acc.deposite(1000);
	acc.getBalance();
	System.out.println("Current amount= "+acc.getBalance() );

	}

}
