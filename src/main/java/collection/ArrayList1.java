package collection;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main (String []args)
	{
	
	ArrayList array =new ArrayList();
	
	array.add(100);
	array.add(200);
	array.add('x');
	array.add("Komal");
	array.add(null);
	System.out.println(array);
	
	for (Object o : array)      //upcasting
	{
		Object oo=(Object)o;       //downcasting
		System.out.println(oo);
	}
	

	}

}
