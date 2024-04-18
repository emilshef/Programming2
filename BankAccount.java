package Programming2;

public class BankAccount {

	protected String firstName;
	protected String lastName;
	protected int accountID;
	protected double balance;
	
	//constructor
	public BankAccount () {
		this.firstName = "N/a";
		this.lastName = "N/a";
		this.accountID = 0;
		this.balance = 0;
	}
	
	//deposit method
	public void deposit (double dollarAmount) {
		balance += dollarAmount;
	}
	
	//withdrawal method 
	public void withdrawal (double dollarAmount) {
		balance -= dollarAmount;
	}
		
	public void setFirstName (String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName (String lastName) {
		this.lastName = lastName;
	}
	
	public void setAccountID (int accountID) {
		this.accountID = accountID;
	}
	
	public void getFirstName() {
		System.out.println("First name: " + firstName);
	}
	
	public void getLastName() {
		System.out.println("Last name: " + lastName);
	}
	
	public void getAccountID() {
		System.out.println("Account ID: " + accountID);
	}

	
	public double getBalance() {
		return balance;
	}
	
	public void accountSummary() {
		System.out.println("Here is a summary for this account: ");
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Account ID: " + accountID);
		System.out.println("Balance: " + balance);
			
	}
}
