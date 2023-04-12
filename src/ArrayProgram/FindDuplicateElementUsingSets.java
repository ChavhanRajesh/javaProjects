package ArrayProgram;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementUsingSets {
	public static void main(String[] args) {
		int [] a= {3,5,3,6,2,4,2,4,2,2,2};
		Set<Integer> s= new HashSet<>();
		
		for(int no:a)
		{
			if(s.add(no)==false)    //if it add the number so the it should true in Set if it get false means duplicate value are not added
			{
				System.out.println(no);
			}
		}
		
	}

}
