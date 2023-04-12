package loops;

public class Student {
	String name;
	String lastname;
	int age;
	Student(String name,String lastname,int age)
	{
		this.name=name;
		this.lastname=lastname;
		this.age=age;
	}
	public boolean  equals(Object i) {
		
		Student s=(Student)i;
		
		if(this.name==s.name && this.lastname==s.lastname && this.age==s.age)
		{
		
		return true;
		}
		return false;
	}
	public int hashcode()
	{
		int hash=0;
		hash=hash+age;
		return hash;
		
	}

}
