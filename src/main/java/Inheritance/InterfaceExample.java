package Inheritance;

public class InterfaceExample {

	public static void main(String[] args) {
		
            ATM hdfc = new HDFCBank();
            ATM sbi = new SBIBank(); 
            sbi.withdraw(200);
            sbi.checkBalance();
            hdfc.withdraw(600);
            hdfc.checkBalance();
	}

}
