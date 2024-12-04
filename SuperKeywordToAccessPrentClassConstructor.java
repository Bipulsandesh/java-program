package javaoops;

class Person  // Person: parent class
{
	int age;  // instance variable or non-static variable
	String name;
	Person(int age, String name) // parameterized parent class constructor
	{
		this.name = name;
		this.age = age;
	}
	void speak()
	{
		System.out.println( " I am "+name+" and my age is "+age);
	}
}

class Students extends Person // Students: child class
{
	char grade;
	Students(int age, String name, char grade) // Paremeterized child class constructor
	{
		super(age, name);  // super()-- it will call the parent class constructor
		this.grade= grade;
		
	}

	void study()
	{
		
		System.out.println(" I am studying for grade: "+grade);
	}
}

public class SuperKeywordToAccessParentClassConstructor {

	public static void main(String[] args) {
		Students s1 =new Students(14, "Tom", '9');
		s1.speak();
		s1.study();
	}

}
