package DummyPractice;

public class EvensSum_OddSum {
	public static void main(String[] args) {
		int a[]= {6,7,4,84,32,14,11,21,45,16};
		int EvenSum=0;
		int OddSum=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				EvenSum+=a[i];
			}
			else
			{
				OddSum+=a[i];
			}
		}
	System.out.println("EvenSum:" +EvenSum+" OddSum:" +OddSum);
		

		
	}

}
