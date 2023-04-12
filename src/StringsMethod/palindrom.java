package StringsMethod;

public class palindrom {
public static void main(String[] args) {
	String s="malayalam";
	String rev = "";
	
	for(int i=s.length()-1;i>=0;i--)              // mostly check greater less than sign
	{
		
		rev= rev+s.charAt(i);
	}
	if(s.equals(rev))
	{
		System.out.println("it is palindrome");
	}
	else
	{
		System.out.println("it is not a palindrom");
	}
}
}
