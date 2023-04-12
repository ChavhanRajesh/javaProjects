package ArrayProgram;

import java.util.Arrays;

public class FindMaxAndSecondMax {
	public static void main(String[] args) {
	int []a= {44,11,54,10,3};
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
		if(a[i]>a[j])
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		}
		
		
	}
	System.out.println(Arrays.toString(a));
	System.out.println(a[a.length-1]);
	System.out.println(a[a.length-2]);
	}
	

}
