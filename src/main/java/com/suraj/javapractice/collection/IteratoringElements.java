package com.suraj.javapractice.collection;

import java.util.*;
import java.util.*;

public class IteratoringElements {
	
	public static void main(String args[]) {
		
		  String names[]= {"Komal","Suraj", "Suraj"};
		
//		  List<String> elements = new ArrayList<>(Arrays.asList(names));
		  
		  
		  Set<String>uniqElement= new HashSet<String>(Arrays.asList(names));



//		Elements.add("Suraj");
//		Elements.add("Komal");
//		Elements.add("Dhiraj");
		

		
//		for(String s:elements) {
//			System.out.println(s);
//		}
		
//		elements.addFirst("Nilesh");
		  
Iterator it = uniqElement.iterator();

while(it.hasNext()) {
	
	System.out.println();
}
		System.out.println(uniqElement);
		
		
	}

}
