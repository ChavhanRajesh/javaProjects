package DummyPractice;

public class DuplicateElement {
public static void main(String[] args) {
	int []a= {10,20,40,10,41,85,40};
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
{
	
			System.out.println("Duplucate element are" +a[j]+" ");
}
		}
	}
}
}
