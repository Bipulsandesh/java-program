package pack1;

class A
{
	 private int a =10; // private data member
	 private void disp() // private method
	 {
		 System.out.println(a);
	 }
	 
	int b =20; //  default data member
	void show()  // default method
	{
		System.out.println(b);
	}
}


public class SamplePrivateModifier {

	public static void main(String[] args) {
		A obj = new A();
		//obj.a=20;  // The field A.a is not visible
		//obj.disp(); //The method disp() from the type A is not visible
	   obj.show();
	   obj.b=50;
	   obj.show();
	}

}
