package DummyPractice;

import java.util.Arrays;

public class rotateArray {
	public static void main(String[] args) {
		int [] a= {10,1,2,6,7,3};
		for(int i=0;i<a.length;i++)
		{
			int temp=a[0];
			for(int j=1;j<a.length;j++)
			{
				a[j-1]=a[j];
				
				
			}
			a[a.length-1]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
