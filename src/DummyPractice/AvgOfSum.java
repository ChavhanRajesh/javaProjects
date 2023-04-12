package DummyPractice;

public class AvgOfSum {
	public static void main(String[] args) {
		int[] a= new int[6];
		for(int i=0;i<a.length;i++)
		{
			a[i]=i*2;
			
		}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		int avg=sum/a.length;
		System.out.println("sum:"+sum+"avg:"+avg);
	}

}
