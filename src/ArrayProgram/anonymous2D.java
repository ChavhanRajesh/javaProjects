package ArrayProgram;

public class anonymous2D {
	public static void main(String[] args) {
		
		anonymous2D.sum(new int[][] {{10,20,30},{40,50}});
		
	}
	static void sum(int [][] no)
	{
		int total=0;
		
		for(int[] i:no)
		{
			for(int b:i)                        //Here it is 2D array thats why we use two for each loop // same goes for 3D we need three for each loop
			{
				total= total+b;
			}
			
		}
		System.out.println("sum is:"+total);
	}

}
