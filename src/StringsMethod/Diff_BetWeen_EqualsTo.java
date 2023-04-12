package StringsMethod;

public class Diff_BetWeen_EqualsTo {
	public static void main(String[] args) {
		String s= new String("Rajesh");
		String s1= new String("Rajesh");
		
		System.out.println(s==s1);  // false            becouse it campare betwen two references if they didnt then adress must same for both but here address is different
		
		System.out.println(s.equals(s1));  //true      coz it check the data 
		
		
		
		
		String s3= "Niku";
		String s4= "Niku";
		
		System.out.println(s3==s4);       // True      // by using literal it store SCP so adress is same so it true
		
		System.out.println(s3.equals(s4));  // true
		
		
	
	}

}
