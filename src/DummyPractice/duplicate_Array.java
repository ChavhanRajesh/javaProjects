package DummyPractice;

public class duplicate_Array {
	public static void main(String[] args) {
		int []a= {10,12,15,12,24,10};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate element are " +a[i]);
				}
			}
		}
	}

}
