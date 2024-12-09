package javaoops;
class Furniture // parent class
{
	final void disp()
	{
		System.out.println("Furniture class, disp method is executed");
	}
}
class Table extends Furniture
{
//	@Override  
//	void disp()  //Cannot override the final method from Furniture
//	{
//		
//	}
}
public class FinalMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
