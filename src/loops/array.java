package loops;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size");
	int size=sc.nextInt();
	
	int a[]= new int[size];
	System.out.println("the size is " +size);
	
	for(int i=0; i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("the value are");
		
 for(int i=0;i<a.length;i++)
 {
	 System.out.println(a[i]);
 }
	}

}
