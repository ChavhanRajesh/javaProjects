package ArrayProgram;

public class StringBubbleSort {
public static void main(String[] args) {
	String [] s= {"Rajesh","Nikita","marry","soon"};
	String temp;
	for(int i=0;i<s.length;i++)
	{
		for(int j=0;j<s.length-1;j++)
		{
			if(s[i].compareTo(s[j+1])>0)          //here will use compareTo method to convert String into hexadecimal value and it will compare internally
			{
				temp=s[j];
				s[j]= s[j+1];
				s[j+1]=temp;
			}
		}
	}
	for(int i=0;i<s.length;i++)
	{
		System.out.println(s[i]);
	}
	
}
}
