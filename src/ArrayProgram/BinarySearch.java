package ArrayProgram;

public class BinarySearch {
	private static final int MidleIndex = 0;

	public static void main(String[] args) {
		int [] a= {4,6,8,12,16,17,21,35,50};
		int search=35;
		int lowerIndex=0;
		int HigherIndex=a.length-1;
		int MidleIndex=(lowerIndex+HigherIndex/2);
		
		
		
		while(lowerIndex<=HigherIndex)
		{
			if(MidleIndex==search)
			{
				System.out.println("elemnt is at"+MidleIndex+" Index position");
				break;
			}
			else if (a[MidleIndex]<search) {
				
				lowerIndex=MidleIndex+1;
				
			}
			else
			{
				HigherIndex=MidleIndex-1;
				
			}
			MidleIndex=(lowerIndex+HigherIndex)/2;
			
		}
		if(lowerIndex>HigherIndex)
		{
			System.out.println("element not found");
		}
		
		
				
		}
	}


