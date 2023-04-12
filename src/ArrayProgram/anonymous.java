package ArrayProgram;

public class anonymous {
	public static void main(String[] args) {
		anonymous.sum(new int[] {10,20,30});   // here we will pass anonymous array inside a method as a argument
		
		
	}
	static void  sum(int[] no)    // here no is array name
	{
		int total=0;
		for(int i:no)
		{
			total= total+i;
		}
		System.out.println("ths sum is:"+total);
		
	}

}
