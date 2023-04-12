package List_VS_Set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
	public static void main(String[] args) {
		List l= new ArrayList<>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(200);
		
		l.add(null);
		l.add(null);
		
		
		System.out.println(l);
		
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		                                              // These are two ways we can iterate the value from the list
		
		ListIterator listItr = l.listIterator();
		
		while(listItr.hasNext())
		{
			System.out.println(listItr.next());
		}
	}

}
