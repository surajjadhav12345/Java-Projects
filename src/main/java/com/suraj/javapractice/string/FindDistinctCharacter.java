package com.suraj.javapractice.string;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDistinctCharacter {
    public static void main(String[] args) {
        String s= "Resposible";
        
        for(int i=0;i<s.length();i++) {
        char ch= s.charAt(i);
        int count=0;
        for(int j=0;j<s.length();j++) {
        	if(ch==s.charAt(j)) {
        		count++;
        	}
        }
        if(count==1) {
        	System.out.print(ch+ "");
        }
        }
    }
}

        
