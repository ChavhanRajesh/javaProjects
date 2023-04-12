package StringsMethod;

public class SubString_and_subSequencess {
	public static void main(String[] args) {
		String s="Hello i am king";
		
		System.out.println(s.subSequence(0, 10));         // to get substring we will provide inital index and ending index
		
		System.out.println(s.substring(1));              // here we will provide only intial index so till end we will get the output
		
		System.out.println(s.substring(0, 11));         // in this we give initial and ending index
	}

}
