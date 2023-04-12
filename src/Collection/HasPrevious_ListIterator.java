package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class HasPrevious_ListIterator {
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
	 System.out.println("-------now our cursor come to end now we want to go previous so we have to continue the  flow---------");
	 
	 while(listItr.hasPrevious())
	 {
		 System.out.println(listItr.previous());
	 }
	 l.remove("Krunal");
	 System.out.println(l);
//	 l.add("Raj");
//	 System.out.println(l);

	 l.set(0, "Ram");
	 System.out.println(l);
	

}}
