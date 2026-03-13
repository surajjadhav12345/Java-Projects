package com.suraj.javapractice.number;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num=151;
		int origin=num;
		int sum=0;
		
		
		while(num>0) {
			
			int digit= num%10;
			sum=sum+(digit*digit*digit);
			num=num/10;
		}
		
		if(origin==sum) {
			System.out.println("given Number is armstron Number");
		}
		else {
			System.out.println("given Number is  not armstron Number");
		}
		
	}

}
