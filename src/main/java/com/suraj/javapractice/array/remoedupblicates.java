package com.suraj.javapractice.array;
import java.util.*;
public class remoedupblicates {
	public static void main(String[] args) {
		int numbers[]= {23,212,34,23,44, 44,23,34};
		
		
		
		List<Integer> num= new ArrayList<Integer>();
		
		for(int number:numbers) {
			
			if(!num.contains(number)) {
				num.add(number);
				
			}
		}
		
		System.out.println(num);
		
	// remove dublicate using set	
		Set<Integer> number= new HashSet<Integer>();
		
		for(int num1:numbers) {
			number.add(num1);
		}
		
		
		System.out.println(number);
	}

}
