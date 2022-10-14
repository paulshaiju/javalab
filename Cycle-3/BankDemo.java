class BankAccount
{
	String holName;
	String accNum;
	String accType;
	double accBal;
	
	BankAccount()
	{
		System.out.print("Hello! Welcome to Bank");
	}
	
	BankAccount(String name, String num, String type, double bal)
	{
		System.out.println("Hello! Welcome to  Bank");
		holName = name;
		accNum = num;
		accType = type;
		accBal = bal;
	}
	
	public void accInfo()
	{
		System.out.println("\nAccount Info: ");
		System.out.println("Account Holder Name: " + holName);
		System.out.println("Account No: " + accNum);
		System.out.println("Account Type: " + accType);
		System.out.println("Acount Balance: " + accBal);
	}
	
	public void deposit(double dep)
	{
		accBal += dep;
		System.out.println("\n" + dep + " deposited successfully");
		accInfo();
	}
	
	public void withdraw(double wd)
	{
		if(wd < accBal){
			accBal -= wd;
			System.out.println("\n" + wd + " withdrawn succesfully");
			accInfo();
		}
		else{
			System.out.println("\nNot enough balance! Withdrawal of " + wd + " failed");
			accInfo();
		}
	}
}

public class BankDemo
{
	public static void main(String args[])
	{
		BankAccount bacc = new BankAccount("aadil","129793401","savings",1000);
		bacc.accInfo();
		bacc.deposit(100);
		bacc.withdraw(1000);
		bacc.withdraw(10000);
	}
}
