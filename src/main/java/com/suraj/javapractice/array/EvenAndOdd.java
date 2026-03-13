package com.suraj.javapractice.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EvenAndOdd {

	public static void main(String[] args) {
		int numbers[]= {23,12,45,22,42,56,77,17,3};
//		List<Integer> odd=new ArrayList<Integer>();
//		List<Integer> even=new ArrayList<Integer>();
//		
//		for(int i=0;i<=numbers.length-1;i++) {
//			int num=numbers[i];
//			if(num%2==0) {
//				even.add(num);
//			}
//			else
//			{
//				odd.add(num);
//			}
//		}
//		
//		
//		System.out.println(Collections.max(even));
//		System.out.println(Collections.min(odd));
		
		
		
		Integer maxeven=null;
		Integer mineven =null;
		for(int num:numbers) {
			
			if (num % 2 == 0) { 
			    if (maxeven == null || num > maxeven) {
			        maxeven = num;
			    }

			}
			else
			{
				if(mineven == null||num<mineven) {
					mineven=num;
				}
			}
		}
		
		System.out.println(maxeven);
		System.out.println(mineven);
		
	}

}
