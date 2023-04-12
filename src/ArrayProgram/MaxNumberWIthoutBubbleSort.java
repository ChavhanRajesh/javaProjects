package ArrayProgram;

import java.util.Arrays;

public class MaxNumberWIthoutBubbleSort {
	public static void main(String[] args) {
		int[]a= {87,63,41,74,63};
		int max=a[0];
		int sMax=a[0];
		int min=a[0];
		int sMin=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<max)
			{
				sMax=max;
				max=a[i];
			}
			else if(a[i]<sMax||sMax==max)
			{
				sMax=a[i];
			}
		}
		System.out.println(sMax);
		System.out.println(max);
		
	}

}
