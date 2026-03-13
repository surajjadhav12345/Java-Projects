package com.suraj.javapractice.string;

public class RemoveDublicateCharacters {
	public static void main(String[] args) {
		String s="I love java programing";
		String noDublicates="";
		s=s.toLowerCase();
		
		for(int i=0;i<=s.length()-1;i++) {
			char ch= s.charAt(i);
			
			if(noDublicates.indexOf(ch)==-1) {
				noDublicates=noDublicates+ch;
			}
		}
		
		System.out.println(noDublicates);
	}

}
