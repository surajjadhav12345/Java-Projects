package string;

public class FindDuplicateCharacters {
	public static void main(String[] args) {
        String s= "Suraj";
        
        for(int i=0;i<s.length();i++) {
        char ch= s.charAt(i);
        int count=0;
        for(int j=0;j<s.length();j++) {
        	if(ch==s.charAt(j)) {
        		count++;
        	}
        }
        if(count>1&&s.indexOf(ch)==i) {
        	System.out.print(ch+ "");
        }
        }
    }
	

}
