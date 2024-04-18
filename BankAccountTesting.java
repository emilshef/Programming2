package Programming2;

public class BankAccountTesting extends CheckingAccount{

	public static void main(String[] args) {
		BankAccount userBank1 = new BankAccount();
		CheckingAccount userChecking2 = new CheckingAccount();
		
		userBank1.setFirstName("Teddy");
		userBank1.setLastName("Jones");
		userBank1.setAccountID(12345678);
		userBank1.deposit(5000);
		userBank1.accountSummary();

		System.out.println();
		
		userChecking2.setFirstName("Mimi");
		userChecking2.setLastName("Harris");
		userChecking2.setAccountID(98766543);
		userChecking2.deposit(1000);
		userChecking2.processWithdrawl(1050);
		userChecking2.displayAccount();
		
	}


}
