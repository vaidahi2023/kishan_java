//package Basic;
//
//public class Account {
//
//	    private String accountNumber;
//	    private double balance;
//
//	    public Account(String accountNumber, double balance) {
//	        boolean valid = true;
//
//	        if (accountNumber == null ) {
//	            System.out.println("Error: Account number cannot be null or empty.");
//	            valid = false;
//	        }
//
//	        if (balance < 0) {
//	            System.out.println("Error: Balance cannot be negative.");
//	            valid = false;
//	        }
//
//	        if (valid) {
//	            this.accountNumber = accountNumber;
//	            this.balance = balance;
//	            System.out.println("Account created successfully.");
//	        } else {
//	            System.out.println("Account creation failed due to invalid input.");
//	        }
//	    }
//
//
//	    // Main method to test the class
//	    public static void main(String[] args) {
//	        // Valid account
//	        Account acc1 = new Account("123456789", 1000.0);
//	        System.out.println();
//
//	        // Invalid account (empty account number and negative balance)
//	        Account acc2 = new Account("", -500.0);
//	        
//	    }
//}
