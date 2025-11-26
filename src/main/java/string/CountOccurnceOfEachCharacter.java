package string;

public class CountOccurnceOfEachCharacter {
	public static void main(String[] args) {
		String s="Responsible";
		
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
	}

}
