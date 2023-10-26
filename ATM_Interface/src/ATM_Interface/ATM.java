package ATM_Interface;

public class ATM 
{
	private double balance;
	private double withdrawAmount;
	
	public ATM() 
	{
	
	}

	public ATM(double balance, double withdrawAmount)
	{
		this.balance = balance;
		this.withdrawAmount = withdrawAmount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	
	
	
	
	
	

}
