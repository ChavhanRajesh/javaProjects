package Constructor;

public class dog {
	String breed;
	String color;
	public dog(String breed,String color)
	{
		this.breed=breed ;
		this.color= color;
	}
	public static void main(String[] args) {
		dog d1= new dog("german","red");
		System.out.println(d1.breed);
		System.out.println(d1.color);
		
		dog d2= new dog("rotliver","white");
		System.out.println(d2.breed);
		System.out.println(d2.color);
	}

}
