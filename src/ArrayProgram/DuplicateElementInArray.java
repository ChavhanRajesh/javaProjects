package ArrayProgram;

public class DuplicateElementInArray {
	public static void main(String[] args) {
		int [] a= {10,22,44,22,33,44,88,66,33,10};
		System.out.println("Duplicate Element are:");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && i!=j)
				{
					System.out.println(a[j]+" ");
				}
			}
		}
	}

}
