package Constructor;

import java.util.HashMap;

public class unique {
	public static void main(String[] args) {
		String s="automation";
		HashMap<Character, Integer>hm= new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(hm.containsKey(s.charAt(i)==-1))
			{
				hm.put(s.charAt(i), i);
			}
		}
		
	}

}
