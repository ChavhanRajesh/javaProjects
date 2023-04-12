package loops;

import java.util.Scanner;

public class sum {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter starting char");
	char start = sc.next().charAt(0);
	System.out.println("enter the last character");
	char end = sc.next().charAt(0);
	
	for(int i=start;i<end;i++)
	{
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				break;
			}
			if(i==j)
			{
				System.out.println("It is a prime no");
			}
			else
			{
				System.out.println((char)i);
			}
		}
	
	}
}}