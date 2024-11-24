package javaoops;
class Address{
	String stName, cityName;
	long pinCode;
	Address(String stName, String  cityName,long pinCode)
	{
		this.stName=stName;
		this.cityName=cityName;
		this.pinCode=pinCode;
		
	}
}
class Customer{
	int cId;
	String cName;
	Address address;
	Customer(int cId, String cName, Address address)
	{
		this.cId=cId;
		this.cName=cName;
		this.address=address;
	}
	void display()
	{
		System.out.println("Customer ID:"+cId);
		System.out.println("Customer Name:"+cName);
		System.out.println("Customer Address:"+address.stName +", "+address.cityName+", "+address.pinCode);
	}
	
}
public class AggregationDemo {

	public static void main(String[] args) {
		Address a1= new Address("Gandhi street", "Chennai", 678456);
	    Address a2 =new Address("Rajaji street","Bangalore",789345);
	    
	   Customer c1 = new Customer(101, "Tom", a1);
	   c1.display();
	   
	   Customer c2 =new Customer(102, "Jerry", a2);
	   c2.display();
	   
	
	}

}
