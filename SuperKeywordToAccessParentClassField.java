package javaoops;

class DomesticAndWildBirds
{
	String sound="All birds will make sound";
	
}
class Birds extends DomesticAndWildBirds
{
	String sound="But Birds sounds will be very soft";
	
	void dispSound()
	{
		System.out.println(super.sound);
		System.out.println(sound);
	}
}

public class SuperKewordToAccessParentClassField {

	public static void main(String[] args) {
		Birds b = new Birds();
		b.dispSound();

	}

}
