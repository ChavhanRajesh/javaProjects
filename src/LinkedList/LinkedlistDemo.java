package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedlistDemo {

	public static void main(String[] args) {
		LinkedList l= new LinkedList<>();
		l.add("Raj");
		l.add("harsh");
		l.add("Krunall");
		
		System.out.println(l);
		
		l.addFirst("Niku");
		l.addLast("dubu");
		
		System.out.println(l);
		
		l.removeFirst();
		l.removeLast();
		
		System.out.println(l);
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
	}
}
