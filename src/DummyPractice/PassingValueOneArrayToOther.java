package DummyPractice;

import java.util.Arrays;

public class PassingValueOneArrayToOther {
	public static void main(String[] args) {
		int [] a=  {2,5,6,8,12};
		int[]b=a;
		int []c= new int [a.length];
		for(int i=0;i<c.length;i++)
		{
			c[i]=a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
		
	}

}
