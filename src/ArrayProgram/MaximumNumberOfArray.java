package ArrayProgram;

public class MaximumNumberOfArray {
	public static void main(String[] args) {
		int []a= {10,78,21,34,6,41};
		
		int max=a[0];
		
		
		for(int i=0;i<a.length-1;i++)
		{
		   if(a[i]>max)
		   {
			   max=a[i];
		   }
		}
		System.out.println("max is:"+max);
	}

}
