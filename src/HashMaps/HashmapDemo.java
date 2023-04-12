package HashMaps;

import java.util.HashMap;
import java.util.Set;

public class HashmapDemo {
	public static void main(String[] args) {
		HashMap hm= new HashMap<>();
		hm.put(1, "Raj");
		hm.put(2, "Nik");
		hm.put(3, "Love");
		hm.put(4, "Forever");
		
		System.out.println(hm);
		System.out.println(hm.keySet());
		
		System.out.println(hm.values());
		
		System.out.println(hm.containsKey(3));
		
		System.out.println(hm.containsValue("Raj"));
		
		Set entry = hm.entrySet();
		
		System.out.println(entry);
	}

}
