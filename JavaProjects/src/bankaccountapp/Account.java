package bankaccountapp;

public abstract class Account implements InterestRate{

//	Constructor
	
	public Account(String name)
	{
		System.out.println("Name: "+name);
		System.out.print("New Account: ");	
	}
}
