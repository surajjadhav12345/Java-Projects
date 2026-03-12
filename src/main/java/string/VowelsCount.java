package string;
import java.util.*;

public class VowelsCount {
	public static void main(String[] args) {
		String input="I love Java Programming";
		
		input=input.toLowerCase();
		
		Map<Character,Integer> vowelsCount= new HashMap<>();
		
		char characters[]= {'a','i','o','e','u'};
		
		
		for(char ch:characters) {
			vowelsCount.put(ch,0);
		}
		
		char[] eachChar = input.toCharArray();
		for(char ss:eachChar) {
			
			if(vowelsCount.containsKey(ss)) {
				vowelsCount.put(ss, vowelsCount.get(ss)+1);
			}
		}
		
		for(Map.Entry<Character,Integer> entry:vowelsCount.entrySet()) {
			
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
		
	}

}
