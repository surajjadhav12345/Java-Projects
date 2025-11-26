package collection;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList ();
		
		al.add(new Emp(102,"Komal"));
		al.add(new Emp(103,"Suraj"));
		al.add(new Emp(104,"Teju"));
		
		for(Object ee : al)
		{
			Emp eee=(Emp)ee;
			System.out.println(eee.empId +"  "+eee.empName);
		}
	}

}
