package ArrayProgram;

public class FirstDuplicateFromArray {
	public static void main(String[] args) {
		int [] a= {10,4,6,4,10,2,74};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("First Duplicate element is :"+a[j]);
					temp= temp+1;       // we use temp to stop the searching sfter finding the first duplicate element
					break;                				
			}
			if(temp>0)
			{
				break;              // here we stop the main loop 
			}
		}
	}

	}}
