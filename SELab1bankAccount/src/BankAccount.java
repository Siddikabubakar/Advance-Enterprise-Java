
public class BankAccount {

	// instance variable or fileds
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	
	// getter and setter
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	//deposit 
	
	public void deposit(double amount){
		this.balance= this.balance+amount;
		
	}
	//withdraw 
	public void withdraw(double amount){
		if(this.balance<amount){
			System.out.println("Insufficient balance");
		}else {
			this.balance= this.balance-amount;
		}
	
	}
	//transfer
	public void transfer(double amount, BankAccount receiver){
		this.balance= this.balance-amount;
		receiver.balance= receiver.balance+amount;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance="
				+ balance + "]";
	}
	
	


}
