package List_VS_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set s= new HashSet<>();
		
		s.add(100);
		s.add(100);          // duplicate value not accept in set
		s.add(200);
		s.add(300);
		s.add(null);
		s.add(null);         // we can pass only one null value
		
		System.out.println(s);
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
