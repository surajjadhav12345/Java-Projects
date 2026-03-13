package com.suraj.javapractice.string;

public class FindLenthofString {
public static void main(String[] args) {
	String S="Suraj";
	char[] ch = S.toCharArray();
	int lenght=0;
	for(char c:ch) {
		lenght++;
	}
	
	System.out.println("lenght Of String is : "+lenght);
}
}

