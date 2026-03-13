package com.suraj.javapractice.string;

import java.util.HashMap;
import java.util.Map;

public class CountOccurnceOfEachCharacter {
	public static void main(String[] args) {
		String s="Reesponsible";
		
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int count=0;
			

			 if (s.indexOf(ch) != i) {
			                continue;
			            } 

			for(int j=0;j<s.length();j++) {
				if(ch==s.charAt(j)) {
					count++;
				}
			}
			System.out.println(ch +"=="+count+"");
			
		}
		
		
		
		
		//using map
		
		Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through each character
        for (char ch : s.toCharArray()) {
            // Update count in map
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        


        // Print results
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " == " + entry.getValue());
        }

	}

}







