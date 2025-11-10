package encapsulationPractice;

public class BankAccountMain {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		
		account.setAccountData(1000123, "John Wills", 323728.23);
		account.getAccountData();
		
		System.out.println("=============");
		BankAccount account2 = new BankAccount();
		account2.setAccountData(1000124, "Alex Carey", 23627.221);
		account2.getAccountData();
		
		

	}

}
