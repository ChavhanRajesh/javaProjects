package loops;

import java.util.Scanner;

public class ifelseifOrogram {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value");
		char ip=sc.next().charAt(0);
		
		
		if(ip>='0' &&ip<='9')
		{
			System.out.println("It is a digit");
		}
		else if(ip >='a' && ip<='z'|| ip>='A'&&ip<='Z')
		{
			System.out.println("It is a charcheter");
		}
		else
		{
			System.out.println("it is a special charactet");
		}
	}

}
