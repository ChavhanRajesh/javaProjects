package Oops;

 interface Interface {
	 void display();
	 
	

}
 class male implements Interface
 {
	 public void display()
	 {
		 System.out.println("Print male as output");
	 }
	 
 }
 
 class female implements Interface
 {
	 public void display()
	 {
		 System.out.println("display female as output");
	 }
 }
 
 
 
 
  class demo
 {
	 public static void main(String[] args) {
		 Interface p1= new male();
		 Interface p2= new female();
		 p1.display();
		 p2.display();
		
	}
 }
