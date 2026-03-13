package com.suraj.javapractice.number;

public class ReverseNumber {
public static void main(String args[]) {
	int num=151;
	int origin=num;
	int rev=0;
	
	while(num>0) {
		int rem= num%10;
		rev=rev*10+rem;
		
		num= num/10;
		
		
	}
	
	System.out.println(rev);
	
	if(origin==rev) {
		System.out.println("given number is palledron");
	}
	
}
}
