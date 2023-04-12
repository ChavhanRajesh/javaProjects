package StringsMethod;

public class StringBuffer_EqualsNethodDemo {
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("Rajesh");
		StringBuffer sb1= new StringBuffer("Rajesh");
		
		System.out.println(sb.equals(sb1));        // you will get FALSE becouse String nbuffer class does not override eqals method from object class
		                                          // but String  ckass override so in STRING WE WILL GET trUE
	}

}
