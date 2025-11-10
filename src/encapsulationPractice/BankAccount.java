package encapsulationPractice;

public class BankAccount {
	
	private int accNumber;
	private String accName;
	private double accBalance;
	
	
	void setAccountData(int accNumber, String accName, double accBalance) {
		this.accNumber = accNumber;
		this.accName = accName;
		this.accBalance = accBalance;
	}
	
	String getAccountData() {
		System.out.println("The Account Details is: ");
		
		
		System.out.println("Account Number: " + accNumber);
		System.out.println("Account Name: " + accName);
		System.out.println("Account Balance: " + accBalance);
		return accNumber + " " + accName + " " + accBalance;
	}
	

}
