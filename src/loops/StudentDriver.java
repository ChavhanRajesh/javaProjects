package loops;

public class StudentDriver {
	public static void main(String[] args) {
		Student s= new Student("Raj", "Chavhan", 18);
		Student s1= new Student("Raj", "Chavhan",45);
		//System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println(s.hashcode());
		System.out.println(s.hashcode());
		
		
	}
	

}
