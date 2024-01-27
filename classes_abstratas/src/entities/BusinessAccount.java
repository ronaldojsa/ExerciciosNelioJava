package entities;

public class BusinessAccount extends Account {   //extends define a herança da super classe Account
	
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
		
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);  // chama o construtor da super classe Account
		this.loanLimit = loanLimit;
	}

	
	
	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}


	public void loan(double amount) {
		
		if (amount <= loanLimit) {
			balance += amount - 10.0;
			
			//balance = 10.0;
			
			//deposit(amount);
		
		}
		
	}

	@Override
	public void withdraw (double amount) {
		super.withdraw(amount);  // aproveita o withdraw da super classe
		balance -= 2.0;
		
	}


	
	
	

}
