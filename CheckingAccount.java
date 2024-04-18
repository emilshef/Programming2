package Programming2;

public class CheckingAccount extends BankAccount {

	private double interestRate;
	
	//constructor
	public CheckingAccount () {
		this.firstName = "N/a";
		this.lastName = "N/a";
		this.accountID = 0;
		this.balance = 0;
		this.interestRate = 0.01; 
	}
	
	public void setInterestRate (double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void getInterestRate () {
		System.out.println("Interest rate: " + interestRate + "%.");
	}
	
	public void processWithdrawl(double dollarAmount) {
		balance -= dollarAmount;
		if (balance < 0) {
			balance -= 30;
			System.out.print("This account is overdrawn. A $30 fee was added to your account balance. ");
			System.out.print("The balance is $" + balance + ". ");
		}
	}
	
	public void displayAccount() {
		super.accountSummary();
		System.out.println("Your interest rate is " + interestRate +"%");
	}
	
	
	

}
