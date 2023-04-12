package ArrayProgram;

public class SecondLargestNumberFromArray {
	public static void main(String[] args) {
		int [] a= {4,6,74,41,22,14};
		
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])   // for second smallest just > do this
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(i==1)                 // this not mandotary to right but to increase the speed 
			{
				break;
			}
		
			
		}
		System.out.println("second largest element is:"+a[1]);
	}

}
