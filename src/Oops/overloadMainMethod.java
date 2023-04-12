package Oops;

public class overloadMainMethod {
	public static void main(String[] args) {
		
		System.out.println("from main method1");
		
		//main();
		main(10,20);
	}
	public static void main()
	{
		System.out.println("from main method 2");
	}
	public static void main(int a,int b)
	{
		System.out.println("from main method 3"+(a+b));
	}
}
