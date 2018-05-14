/**********************************************************************
 *                               Bank                                 *
 *                                                                    *
 *  Programmed by:  Joseph Palisoul  								  *
 *  Class:  CS200   (September 29th, 2016)                            *
 *  Instructor:  Dean Zeller                                          *
 *                                                                    *
 *  Description:  Full functional operations of the actual bank       *
 *  			  happens here in this file.						  *
 *********************************************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
	
	static int nextID = 1000;
	static String name = "Harambank";
	static String owners = "Joe Palisoul";
	static int bankID = 6942069;
	static String division = "Cincinatti";
	static int numAccounts;
	static double totalBalance;
	static ArrayList<Account> accounts = new ArrayList<>();
	static int input;
	
	public static void displayMenu()
	{
		String response;
		Scanner kb = new Scanner(System.in);
		System.out.println("B - Bank Information");
		System.out.println("N - New Account");
		System.out.println("L - List all accounts");
		System.out.println("S - Search accounts by ID");
		System.out.println("Q - Quit Program");
		System.out.println("? - Help menu");
		do {
		System.out.println("");
		System.out.print("==> ");
		response = kb.next();
		switch (response.toUpperCase()) {
		case "B":
			displayBankInfo(name, owners, bankID, division, numAccounts, totalBalance);
			break;
		case "N":
			newAccount(nextID);
			break;
		case "L":
			listAccounts(numAccounts, totalBalance);
			break;
		case "S":
			acceptUserInput(input);
			break;
		case "Q":
			writeToFile();
			System.exit(0);
			break;
		case "?":
			displayMenu();
			break;
		default:
			System.out.println("That is not one of your options!!");
		}

		} while (!response.equalsIgnoreCase("Q"));
		}
	
	
	public static int acceptUserInput(int input)
	{
		int ID = 0, pin = 0, pinUser = 0;
		double bal = 0;
		boolean validanswer = true;
		String holder = "", answer = "";
		String response;
		Scanner kb = new Scanner(System.in);
		System.out.println("  Search Accounts");
		if (accounts.size() == 0)
		{
			System.out.println("    <There are no accounts>");
		}
		else
		{
			System.out.print("    Enter account ID:  ");
		}
		input = Integer.parseInt(kb.next());
		for(int i = 0; i<accounts.size(); i++)
		{
			ID = accounts.get(i).getID();
			if(ID == input)
			{
				bal = accounts.get(i).getBalance();
				holder = accounts.get(i).getHolder();
				pin = accounts.get(i).getPin();
				System.out.println("    Account:");
				System.out.println("     ID             HOLDER                BALANCE");
				System.out.println("   +-------+------------------------+---------------+");
				System.out.printf("   |%6s | %-23s|%14s |", ID, holder, "$" + bal);
				System.out.print("\n");
				System.out.println("   +-------+------------------------+---------------+");
				
				while (validanswer)
				{
					try
					{
						System.out.print("   Is this the correct account?  (Y/N) :");
						Scanner keyboard = new Scanner(System.in);
						answer = keyboard.next();
						if(answer.equalsIgnoreCase("Y"))
						{
							System.out.print("   Please enter your Pin to access your account:  ");
							Scanner pinInput = new Scanner(System.in);
							pinUser = pinInput.nextInt();
							if(pinUser == pin)
							{
								System.out.println("");
								displayAccountMenu(input);
								validanswer = false;
							}
							else
							{
								System.out.println("   Entered incorrect pin, redirecting to main menu.");
								System.out.println("");
								displayMenu();
								validanswer = false;
							}
						}
						else if(answer.equalsIgnoreCase("N"))
						{
							displayMenu();
							validanswer = false;
						}
						else
						{
							System.out.println("   This is not one of the options!");
						}
					}
					catch(InputMismatchException ignore)
					{
							System.out.print("   Please answer Y for Yes, and N for No. :");
					}
				}
			}
		}
		if (ID != input)
		{
			System.out.println("    Account " + input + " does not exist.");
			System.out.println("");
			displayMenu();
		}
		return input;
	}
	
	public static void displayAccountMenu(int input)
	{
		String response;
		Scanner kb = new Scanner(System.in);
		System.out.println("M - Main Menu");
		System.out.println("D - Deposit to account");
		System.out.println("W - Withdraw from account");
		System.out.println("B - Balance information");
		System.out.println("X - Delete Account");
		System.out.println("? - Help menu");
		do
		{
			System.out.println("");
			System.out.print("Account " + input + " ==> ");
			response = kb.next();
			switch (response.toUpperCase())
			{
				case "M":
					displayMenu();
					break;
				case "D":
					deposit(input, totalBalance);
					break;
				case "W":
					withdraw(input, totalBalance);
					break;
				case "B":
					balanceInfo(input);
					break;
				case "X":
					delete(input);
					break;
				case "?":
					displayAccountMenu(input);
					break;
				default:
					System.out.println("That is not one of your options!!");
			}
		} while (!response.equalsIgnoreCase("Q"));	
	}
	
	public static void displayBankInfo(String name, String owners, int bankID, String division, int NumAccounts, double totalBalance)
	{
		System.out.println("  Bank Information");
		System.out.printf("    %-14s%-30s", "Bank Name:", name);
		System.out.print("\n");
		System.out.printf("    %-14s%-30s", "Owner(s):", owners);
		System.out.print("\n");
		System.out.printf("    %-14s%-30s", "ID:", bankID);
		System.out.print("\n");
		System.out.printf("    %-14s%-30s", "Division:", division);
		System.out.print("\n");
		System.out.printf("    %-14s%-30s", "# Accounts:", NumAccounts);
		System.out.print("\n");
		System.out.printf("    %-14s%-30s", "Total Balance:  ", "$"+totalBalance);
		System.out.print("\n");
	}
	
	public static void newAccount(int nextID)
	{
		boolean testbalance = true;
		int ID = Bank.nextID, pin = 0;
		Bank.nextID++;
		Bank.numAccounts++;
		double bal = 0;
		String holder = "";
		System.out.println("  New Account");
		System.out.println("    ID:    " + nextID + " (automatically generated");
		while(testbalance == true)
		{ 
			System.out.print("    Starting Balance:  ");
			Scanner balance = new Scanner(System.in);
			bal = balance.nextDouble();
			if(bal >= 10000)
			{
				System.out.println("    An account must have a starting balance less than $10,000.00.  Please re-enter." );
			}
			else if(bal <=0)
			{
				System.out.println("    An account must have a starting balance greater than $0.  Please re-enter." );
			}
			else
			{
				testbalance = false;
			}

		}
		System.out.print("    Holder:  ");
		Scanner name = new Scanner(System.in);
		holder = name.nextLine();
		System.out.print("    Please enter a 5 digit pin number:  ");
		Scanner pinInput = new Scanner(System.in);
		pin = pinInput.nextInt();
		Account acct = new Account(ID, bal, holder, pin);
		accounts.add(acct);
		System.out.println("  Account " + ID + " created for " + holder + " with a starting balance of $" + bal + ".");
		Bank.totalBalance += bal;
	}
	
	public static void listAccounts(int NumAccounts, double totalBalance)
	{
		int ID;
		double bal = 0;
		String holder;
		System.out.println("  List Accounts");
		if(accounts.size() == 0)
		{
			System.out.println("    <There are no accounts>");
		}
		else
		{
			System.out.println("     ID             HOLDER                BALANCE");
			System.out.println("   +-------+------------------------+---------------+");
			for(int i = 0; i<accounts.size(); i++)
			{
				ID = accounts.get(i).getID();
				bal = accounts.get(i).getBalance();
				holder = accounts.get(i).getHolder();
				System.out.printf("   |%6s | %-23s|%14s |", ID, holder, "$" + bal);
				System.out.print("\n");
			}
			System.out.println("   +-------+------------------------+---------------+");
		}
		System.out.printf("  %-14s%-30s", "# Accounts:", NumAccounts);
		System.out.print("\n");
		System.out.printf("  %-14s%-30s", "Total Balance:  ", "$" + totalBalance);
		System.out.print("\n");
	}
	
	public static void deposit(int input, double totalBalance)
	{
		int ID = 0;
		double bal = 0, endbal = 0;
		String holder = "";
		System.out.println("  Depositing Funds.");
		Scanner balance = new Scanner(System.in);
		bal = balance.nextDouble();
		System.out.print("  Amount to deposit => ");
		System.out.print("\n");
		System.out.println("  Depositing $" + bal + " into account" + input + ".");
		System.out.println("  Updated account information:");
		for(int i=0; i < accounts.size(); i++)
		{
			ID = accounts.get(i).getID();
			if(ID == input)
			{
				accounts.get(i).deposit(bal);
				endbal = accounts.get(i).getBalance();
				holder = accounts.get(i).getHolder();
			}
		}
		System.out.println("     ID             HOLDER                BALANCE");
		System.out.println("   +-------+------------------------+---------------+");
		System.out.printf("   |%6s | %-23s|%14s |", ID, holder, "$" + endbal);
		System.out.print("\n");
		System.out.println("   +-------+------------------------+---------------+");
		Bank.totalBalance += bal;
	}
	
	public static void withdraw(int input, double totalBalance)
	{
		int ID = 0;
		double bal = 0, endbal = 0;
		String holder = "";
		System.out.println("  Withdrawing Funds.");
		Scanner balance = new Scanner(System.in);
		bal = balance.nextDouble();
		System.out.print("  Amount to withdraw => ");
		System.out.print("\n");
		System.out.println("  Withdrawing $" + bal + " into account" + input + ".");
		System.out.println("  Updated account information:");
		for(int i=0; i < accounts.size(); i++)
		{
			ID = accounts.get(i).getID();
			if(ID == input)
			{
				accounts.get(i).withdraw(bal);
				endbal = accounts.get(i).getBalance();
				holder = accounts.get(i).getHolder();
			}
		}
		System.out.println("     ID             HOLDER                BALANCE");
		System.out.println("   +-------+------------------------+---------------+");
		System.out.printf("   |%6s | %-23s|%14s |", ID, holder, "$" + endbal);
		System.out.print("\n");
		System.out.println("   +-------+------------------------+---------------+");
		Bank.totalBalance -= bal;
	}
	
	public static void balanceInfo(int input)
	{
		int ID = 0;
		double bal = 0;
		String holder = "";
		for(int i = 0; i<accounts.size(); i++)
		{
			ID = accounts.get(i).getID();
			if(ID == input)
			{
				bal = accounts.get(i).getBalance();
				holder = accounts.get(i).getHolder();
				System.out.println("    Account:");
				System.out.println("     ID             HOLDER                BALANCE");
				System.out.println("   +-------+------------------------+---------------+");
				System.out.printf("   |%6s | %-23s|%14s |", ID, holder, "$" + bal);
				System.out.print("\n");
				System.out.println("   +-------+------------------------+---------------+");
			}
		}
	}
	
	public static void delete(int input)
	{
		int ID = 0;
		boolean validanswer = true;
		String answer = "";
		while (validanswer)
		{
			try
			{
				System.out.println("Deleting account. Are You sure?  (Y/N)");
				Scanner keyboard = new Scanner(System.in);
				answer = keyboard.next();
				if(answer.equalsIgnoreCase("Y"))
				{
					for(int i=0; i < accounts.size(); i++)
					{
						ID = accounts.get(i).getID();
						if(ID == input)
						{
							accounts.remove(i);
							System.out.println("  Account " + input + " deleted.");
							System.out.println("");
							numAccounts -= 1;
							validanswer = false;
						}
					}

				}
				else if(answer.equalsIgnoreCase("N"))
				{
					validanswer = false;
					displayAccountMenu(input);
				}
				else
				{
					System.out.println("   This is not one of the options!");
				}
			}
			catch(InputMismatchException ignore)
			{
					System.out.print("   Please answer Y for Yes, and N for No. :");
			}
		}
		displayMenu();
	}
	public static void writeToFile()
	{
		PrintWriter outputStream = null;
		int ID = 0, pin = 0;
		double bal = 0;
		String holder = "";
		try
		{
			outputStream  =new PrintWriter(new FileOutputStream("Accounts.txt", false));
		}
		catch (FileNotFoundException ignore)
		{
			System.out.println("The file could not be found");
			System.exit(0);
		}
		for(int i = 0; i < accounts.size(); i++)
		{
			ID = accounts.get(i).getID();
			bal = accounts.get(i).getBalance();
			holder = accounts.get(i).getHolder();
			pin = accounts.get(i).getPin();
			outputStream.println(ID + "," + bal + "," + holder + "," + pin);
		}
		outputStream.close();
	}
	public static void readInFile()
	{
		Scanner fileIn = null;
		String newLine = null;
		String position0 = null;
		String position1 = null;
		String position2 = null;
		String position3 = null;
		int ID = 0, pin = 0;
		double bal = 0;
		String holder = "";
		try
		{
			fileIn = new Scanner(new File("Accounts.txt"));
		}
		catch (FileNotFoundException ignore)
		{
			System.out.println("THe file could not be found");
			System.exit(0);
		}
		while (fileIn.hasNextLine())
		{
			newLine = fileIn.nextLine();
			String[] contents = newLine.split(",");
			position0 = contents[0];
			ID = Integer.parseInt(position0);
			Bank.numAccounts += 1;
			position1 = contents[1];
			bal = Double.parseDouble(position1);
			Bank.totalBalance += bal;
			position2 = contents[2];
			holder = position2;
			position3 = contents[3];
			pin = Integer.parseInt(position3);
			Account acct = new Account(ID, bal, holder, pin);
			accounts.add(acct);
			Bank.nextID += 1;
		}
		fileIn.close();
	}
}
