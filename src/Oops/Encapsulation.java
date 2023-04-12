package Oops;

public class Encapsulation {
	private String str;
	private int id;
	
	public Encapsulation() {
		this.str= str;
		this.id=id;
	}
	
	public String getstr()
	{
		return str;
	}
	public int getid()
	{
		return id;
		
	}
	public void setstr(String str)
	{
		this.str=str;
		
	}
	public void setid(int id)
	{
		this.id=id;
	}
	
	public static void main(String[] args) {
		Encapsulation e= new Encapsulation();
		e.setstr("Rajesh");
		
		e.setid(200);
		
		System.out.println("id of candidate"+e.getid());
		System.out.println("string of candidate"+e.getstr());
	}

}
