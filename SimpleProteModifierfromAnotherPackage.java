package pack2;
import pack1.B;

public class SampleProtectedModifierFromAnotherPackage extends B
{

	public static void main(String[] args) {
		//B obj = new B();
		//obj.show();
		
		SampleProtectedModifierFromAnotherPackage  obj = new SampleProtectedModifierFromAnotherPackage();
        obj.show();
	}

}
