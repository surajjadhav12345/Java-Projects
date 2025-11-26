package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList4 {

	public static void main(String[] args) {
		
   ArrayList<String> al = new ArrayList<String>(); 
   
       al.add("Komal");
       al.add("Suraj");
       al.add("Swati");
       System.out.println(al);
       
       String [] arr = al.toArray(new String[al.size()]);
       
       System.out.println(Arrays.toString(arr));  // Why here print reference not value
        
       for(String ss: arr)
       {
    	   System.out.println(ss);
       }
       
    
		
	}

}
