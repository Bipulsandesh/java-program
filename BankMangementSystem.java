package javaoops;

class Account
{
	String cusName; // non-static variable or instance variable
	int accNumber;  // non-static variable or instance variable
	String accType;  // non-static variable or instance variable
	double balance;  // non-static variable or instance variable
	Account()  // default constructor --> initial default values
	{
		this.cusName="unknown";
		this.accNumber = 0;
		this.accType="saving";
		this.balance= 1000;
		
	}
	
	Account(String cusName, int accNumber, String accType, double balance) // custom constructor or parameterizied constructor ---> initialize the custom values
	{
		this.cusName = cusName;
		this.accNumber=accNumber;
		this.accType = accType;
		this.balance= balance;
	}
	void display()
	{
		System.out.println("Customer Name  : "+cusName);
		System.out.println("Account Number : "+accNumber);
		System.out.println("Account Type   : "+accType);
		System.out.println("Accoutn Balance: "+balance);
	}
	
	
	
}
public class BankMgmtSystem {

	public static void main(String[] args) {
		System.out.println("Customer Accounts with default values");
		// creating account with default values
		Account c1 =new Account();
		c1.display();
		
	   // creating account with custom values
		System.out.println("Customer Accounts with custom values");
		Account c2 = new Account("Tom",10002,"savings", 5000);
		c2.display();
	}

}
