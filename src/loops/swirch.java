package loops;

import java.util.Scanner;

public class swirch {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter day");
		int day=sc.nextInt();
		int days=50;
		switch(day)
		{
		case 1: 
			System.out.println("study");
			break;
		case 2:
			System.out.println("Workout");
			break;
		case 3:
			System.out.println("exercise");
			break;

		default :
			System.out.println("defaoult block is executed");
		
			
		}
	

	}
	

}
