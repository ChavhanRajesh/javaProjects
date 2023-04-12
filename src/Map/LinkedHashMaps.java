package Map;

import java.util.LinkedHashMap;

public class LinkedHashMaps {
public static void main(String[] args) {
	
	LinkedHashMap lm= new LinkedHashMap();
	
	lm.put(1, "Ram");
	lm.put(2, "Seeta");
	lm.put(3, "Hanuman");
	lm.put(4, "Laksham");
	
	System.out.println(lm);
	
	System.out.println(lm.hashCode());
	
	
	System.out.println(lm.entrySet());
	System.out.println(lm.getOrDefault(1, "Ramesh"));
}

}
