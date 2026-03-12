 package Practice;

public class MethodOverloading {
	void payment()
	{
	   System.out.println("Write logic for  cash")	;
	}
	void payment(int Creaditdebit)
	{
	   System.out.println("Write logic for CreaditDebit")	;
	}
	void payment(String Upi)
	{
	   System.out.println("Write logic for  Upi")	;
	}

}
class Example
{public static void main (String [] args)
	{
	  MethodOverloading d=new MethodOverloading();
	  d.payment();
	}
	}
