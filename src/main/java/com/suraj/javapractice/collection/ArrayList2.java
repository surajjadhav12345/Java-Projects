package com.suraj.javapractice.collection;
import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Komal"); 
		
		al.add("Suaraj");
		al.add("Sharad");
		for (String s:al)
		{
			System.out.println(s);
		}
		

	}

}
