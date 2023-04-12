package DummyPractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplcateEleementUsingSet {
public static void main(String[] args) {
	int []a= {10,20,40,10,41,85,40};
	 Set<Integer> s= new LinkedHashSet<Integer>();
	 for(int no:a)
	 {
		 if(s.add(no)==false)
		 {
			 System.out.println("Duplicate element are : " +no);
		 }
	 }
}
}
