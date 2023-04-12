package DummyPractice;

public class FindingMax {
	public static void main(String[] args) {
		int []a= {12,2,13,14,55,21};
		int temp = 0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
				}
				
			}
		}
		System.out.println(temp);
		
	}

}
