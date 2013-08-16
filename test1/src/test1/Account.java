package test1;

public class Account {

	int bal;
	Account(int bal)
	{
		this.bal=bal;
	}
	

	public int getBal()
	{
		return bal;
	}
	
	public void deposit(int balance)
	{
		 bal =+ balance;
	}
	
	public int withdraw(int amt)
	{
		 bal=bal - amt;
		 return bal;
	}

}
