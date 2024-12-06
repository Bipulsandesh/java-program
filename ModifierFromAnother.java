package pack2;
import pack1.B;
public class SampleDefaultModifierFromAnotherPackage {

	public static void main(String[] args) {
		B obj = new B();
		//obj.display();// The method display() from the type B is not visible

	}

}
