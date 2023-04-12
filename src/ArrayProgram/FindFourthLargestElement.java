package ArrayProgram;

public class FindFourthLargestElement {
	public static void main(String[] args) {
		int [] a= {4,74,14,32,72,34};
		int temp;
		int k=3;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		
		}
		System.out.println("forth largest element is"+a[3]);
	}

}
