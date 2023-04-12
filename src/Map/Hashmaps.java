package Map;

import java.nio.file.spi.FileSystemProvider;
import java.util.HashMap;
import java.util.Map;

public class Hashmaps {
	public static void main(String[] args) {
		Map hm= new HashMap<>();
		hm.put(1, "Rajesh");
		hm.put(2, "Niku");
		hm.put(3, "Love");
		hm.put(4, "Forever");
		
		System.out.println(hm);

		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		System.out.println(hm.containsKey(4));
		
		System.out.println(hm.containsValue("Love"));
	}

}
