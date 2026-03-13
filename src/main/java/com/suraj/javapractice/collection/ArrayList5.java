package com.suraj.javapractice.collection;

import java.util.Arrays;
import java.util.List;

public class ArrayList5 {

	public static void main(String[] args) {
		
		String [] arr = new String[5];
		arr[0]="komal";
		arr[1]="Suraj";
		arr[2]="Swati";
		arr[3]="Sharad";
		arr[4]="Gita";
		arr[5]="teju";
		
		List<String> al = Arrays.asList(arr);
		
		
		for ( String ss :al)
		{
			System.out.println(ss);
		}
		
	}

}
 