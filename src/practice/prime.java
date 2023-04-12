package practice;

public class prime {
	public static void main(String[] args) {
		int num=7;
		int i;
		
		for( i=2;i<num;i++)
		{
			if(num%2==0)
			{
				break;
			}
		}
			 if (i==num) {
				System.out.println("it is prime no");
				
			}
			else
			{
				System.out.println("It is not a prime no");
			}
		}
	}


