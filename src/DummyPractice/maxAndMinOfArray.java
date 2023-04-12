package DummyPractice;

public class maxAndMinOfArray {
public static void main(String[] args) {
	int []a= {12,2,13,14,55,21};
	int max=a[0];
	int min=a[0];
	
	for(int i=0;i<a.length;i++)
	{
		if(max<a[i])
		{
			max=a[i];
			
		}
		 if(min>a[i])
		{
			min=a[i];
		}
//		System.out.println("max value is "+max);
//		System.out.println("min value is "+min);
		
	}
	System.out.println("max value is "+max);
	System.out.println("min value is "+min);
	
	
}
}
