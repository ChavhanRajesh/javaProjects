package StringsMethod;

public class trims {
	public static void main(String[] args) {
		String s= "  hey how are you   ";
		String s1=  "i   am    fine";
		
		System.out.println(s.trim());          // it will remove spaces for starting and ending only
		System.out.println(s1.trim());
		
		
		System.out.println(s.trim().length());  // we can count lenght using  trim
	}

}
