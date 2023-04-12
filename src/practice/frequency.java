package practice;

import java.util.LinkedHashSet;

public class frequency {
	public static void main(String[] args) {
		String s="aabsccaabbcccabcba";
		LinkedHashSet<Character> lh= new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			lh.add(s.charAt(i));
		}
	
		
		for(Character ch:lh)
		{
			for(int i=0;i<s.length();i++)
			{
				if(ch.equals(s.charAt(i)))
				{
					System.out.println(ch);
				}
			}
			System.out.println();
		}
		
	}

}
