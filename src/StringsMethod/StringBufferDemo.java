package StringsMethod;

public class StringBufferDemo {
	public static void main(String[] args) {
		String s="Rajesh";
		StringBuffer sb= new StringBuffer();
		
		System.out.println(sb.capacity());           // DEFOAULT CAPACITY IS 16
		
		sb.append("Rajesh");
		
		System.out.println(sb.capacity());           //capacity 16
		sb.append("Rajesh is a good listner");
		
		System.out.println(sb.capacity());         //capacity 34     .....it get diuble becouse we cross defoault capacity (16+1*2)=34
		
		
		// length method
		
		System.out.println(sb.length());
		
		
		System.out.println(sb.charAt(4));   //s
		
		System.out.println(sb.delete(0, 6));  // here it will delele string
		
		
		
	}

}
