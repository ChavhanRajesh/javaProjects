package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		List l= new ArrayList<>();
		
		l.add("Rajesh");
		l.add(200);
		l.add("Krunal");
		
		System.out.println(l);
		
		ListIterator listItr = l.listIterator();
	
		 while(listItr.hasNext())
		 {
			 System.out.println(listItr.next());
		 }
		
	}

}
