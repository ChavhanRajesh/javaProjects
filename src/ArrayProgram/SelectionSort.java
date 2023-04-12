package ArrayProgram;

public class SelectionSort {
	public static void main(String[] args) {
		int [] a= {38,52,9,18,6,62,14};                    // in this sorting it will search the minimum value and place in fist position
		
		
		int min;
		int temp=0;
		
		for(int i=0;i<a.length;i++)
		{
			min=i;                                      //  here we comparing first value with remaining array 
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j] < a[min])
				{
					min=j;
				}
				
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
		}
	}

