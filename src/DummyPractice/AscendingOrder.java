package DummyPractice;

import java.util.Arrays;

public class AscendingOrder {
	public static void main(String[] args) {
		int []a= {12,2,13,14,55,21};
		int asc=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					asc=a[i];
					a[i]=a[j];
					a[j]=asc;
				}
					
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
