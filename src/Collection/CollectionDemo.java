package Collection;

import java.util.ArrayList;

public class CollectionDemo {
	public static void main(String[] args) {
		ArrayList al= new ArrayList<>();
		al.add(100);
		al.add("Rajesh");
		al.add("Hi");
		
		System.out.println(al);
		
		System.out.println(al);
		
		ArrayList al2= new ArrayList<>();
		al2.add("200");
		al2.add("NIKU");
		al2.add("Hello");
		
		System.out.println(al2);
		
		al.addAll(al2);                  // Here addAll method use to merge one collection into another collection
		System.out.println(al);
		System.out.println(al.contains("Rajesh"));      //contains method used to check particular value present in it or not . It will give u True or false
		
		System.out.println(al.isEmpty());   // isEmpty use to check the collection empty or not
		
		System.out.println(al.remove(0));      // remove method use to remove the value but we have to give index position because it is ArrayList  method
		System.out.println(al);
		
		System.out.println(al.remove("Hello"));
		
		System.out.println(al);                // This remove method is from collection so we can directly pass the value whichever we want to remove
		
		
		System.out.println(al.containsAll(al2));  //  this method will use to check entire collection element at a shot
		System.out.println(al);
		
		System.out.println(al.size());           // SIZE() method return you the count of element present inside the collection.
		
		
	
		
	}

}
