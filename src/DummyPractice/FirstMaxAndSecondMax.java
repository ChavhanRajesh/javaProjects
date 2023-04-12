package DummyPractice;

import java.util.Arrays;

public class FirstMaxAndSecondMax {
	public static void main(String[] args) {
		int []a= {12,2,13,14,55,21};
		int fmax=0;
		int smax=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					fmax=a[i];
					a[i]=a[j];
					a[j]=fmax;
							
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(a.length-1 );
		System.out.println(a.length-2);
	}

}
