package com.suraj.javapractice.string;

public class ReverseWordInString {
	public static void main(String[] args) {
		String s="Komal Suraj Jadhav";
		
	String words[]=s.split(" ");
	 for(String word:words) {
		 
		 String reverseWord=" ";
		 for(int i=word.length()-1;i>=0;i--) {
		 reverseWord= reverseWord+word.charAt(i);
		 
	 }
		 System.out.print(reverseWord+ " ");
	}

}
}
