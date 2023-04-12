package LegacyClasses;

import java.util.Stack;

public class Stacks {
	public static void main(String[] args) {
	Stack s = new Stack();
	s.push("Rajesh");
	s.push("valia");
	s.add("Rohan");
	s.add("deepika");
	
	System.out.println(s);
	System.out.println(s.pop());	
	System.out.println(s);
	
	System.out.println(s.peek());
		System.out.println(s.search("valia"));
	}

}
