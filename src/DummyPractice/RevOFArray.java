package DummyPractice;

import java.util.Arrays;

public class RevOFArray {
	public static void main(String[] args) {
		int a[]= {10,14,12,18,6};
		
		for(int i=0;i<a.length/2;i++)
		{
			int temp=a[i];
			a[i]=a[a.length-1-i];
		
			a[a.length - 1 - i] = temp;
			
			
		}
		System.out.println(Arrays.toString(a));
	}

}
