package ArrayProgram;

public class MaxArrayAndMinArray {
	public static void main(String[] args) {
		int []a= {44,-5,-9,-6,-3,-1};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])    //44<a[44]
			{
				max=a[i];
				
			}
			if(min>a[i])
			{
				min=a[i];
			}
			
			
			
		}
		System.out.println("maximum"+max);
		System.out.println("minimun"+min);	
		
	}

}
