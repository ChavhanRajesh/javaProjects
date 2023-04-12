package ArrayProgram;

import java.util.Arrays;

public class PassValueOtherArray {
	public static void main(String[] args) {
		int[]a= {10,20,30,40,50};//5
		int[]d= {10,40,80,70,65};
		int []b=a;
		System.out.println(Arrays.toString(b));
		int[]c= new int[a.length+d.length];//c[10]
		int j = 0;
		for(int i=0;i<c.length;i++)
		{
			if(i<a.length) {      //here it will ierate for first loop i<5 
			c[i]=a[i];
			
			}
			if(i>=a.length) {   // here if i>5 then it will print for next loop 
				c[i]=d[j];       //c[10]=d[0] coz it itrate from zero value thats why we gave here 0
				j++;
						
			}
			
		}
		System.out.println(Arrays.toString(c));
	}

}
