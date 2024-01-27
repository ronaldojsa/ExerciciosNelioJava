package entities;

public class Account {
	
	private Integer number;
	private String holder;
	protected Double balance;     // protected para na sub classe BusinessAccount possa ser visível - veja acessos
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		
		balance += amount;
	}
	
	
	public void withdraw(double amount) {
		
		balance -= amount + 5.0;  // os 5.0 refere-se a uma taxa de saque
		
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + "]";
	}



	

	
	
}
