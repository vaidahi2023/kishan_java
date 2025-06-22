package Basic;

public class Bank {
		/*Write a Java program to create a class called Account with instance variables accountNumber and balance. Implement a parameterized constructor that initializes these variables with validation:
			accountNumber should be non-null and non-empty.
			balance should be non-negative.
			Print an error message if the validation fails.*/
		private String accountNumber;
		private int balance;
		Bank(String accountNumber ,int balance)
		{
		    boolean isbool=true;
			if(accountNumber==null || accountNumber.isEmpty())
			{
				isbool=false;
				System.out.println("enter valid details:");
		  }
		if( balance<0)
		{
			isbool=false;
			System.out.println("enter valid details:");
		}
		if(isbool)
		{		
			this.accountNumber=accountNumber;
			this.balance=balance;
		}
		else
		{
			System.out.println("enter valid details for acc.:");	
		}
		}
		public static void main(String[] args) {
			Bank b=new Bank("",56467);
			System.out.println("accountnumer:"+b.accountNumber+"balance"+b.balance);
		}
	}
