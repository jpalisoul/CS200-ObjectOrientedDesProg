/**********************************************************************
 *                             Account                                *
 *                                                                    *
 *  Programmed by:  Joseph Palisoul  								  *
 *  Class:  CS200   (September 29th, 2016)                            *
 *  Instructor:  Dean Zeller                                          *
 *                                                                    *
 *  Description:  Supplementary functions for the bank functions.     *
 *********************************************************************/
public class Account{
	
	private int ID, pin;
	private double balance;
	private String holder;
	
	public Account(int ID, double balance, String holder, int pin)
	{
		this.ID = ID;
		this.balance = balance;
		this.holder = holder;
		this.pin = pin;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String getHolder()
	{
		return holder;
	}
	
	public int getPin()
	{
		return pin;
	}
	
	public double deposit(double deposit)
	{
		balance += deposit;
		return balance;
	}
	
	public double withdraw(double withdraw)
	{
		balance -= withdraw;
		return balance;
	}
	
	public void displayInfo(int ID, double balance, String holder)
	{
		System.out.println();
	}
	
}
