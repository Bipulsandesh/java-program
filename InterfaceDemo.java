package javaoops;
interface TestInterface
{
	void disp();  // abstract method
}

class SampleTest implements TestInterface
{
	public void disp()
	{
		System.out.println("TestInterface, disp method is implemented");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		
      TestInterface t1 = new SampleTest();
      t1.disp();
      
      SampleTest t2 = new SampleTest();
    		  t2.disp();
      
	}

}
