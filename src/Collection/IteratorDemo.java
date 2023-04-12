package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList al= new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add(300);
		
		System.out.println(al);
		
		Iterator itr = al.iterator();          // to get the O/P in after another we go for iterator and to access the iterator we have to store in one avriable
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	
	}

}
