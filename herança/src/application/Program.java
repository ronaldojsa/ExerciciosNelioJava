package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		BusinessAccount account = new BusinessAccount();
		

		account.getBalance();
		
	
		// **************
		
		// downcasting e upcasting
		
		
		Account acc = new Account(1001, "Alex",0.0);

		System.out.println(acc);  // ***************************************************
		
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		System.out.println(bacc);   
		
		System.out.println ();
		
		System.out.println("Number: " + bacc.getNumber() + "  holder: " + bacc.getHolder() + "  Balance: " + acc.getBalance() + "  Limit: " + bacc.getLoanLimit() ); // *********
		
		System.out.println ();
		System.out.println ("***********");
		System.out.println ("***********");
		System.out.println ();
		
		// upcasting
		
		Account acc1 = bacc;  // acc1 não tem getLoanLimit porque não é businessAccount e sim account
		System.out.println(acc1);
		System.out.println ();
		
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);  // ficou Account
	
		System.out.println ("acc2: " + acc2);
		System.out.println ();
				
		
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01); // de SavingsAccount passou a ser Account
		System.out.println ("acc3: " + acc3);
		System.out.println ();

		// downcasting  superclasse para subclasse
		
		BusinessAccount acc4 = (BusinessAccount) acc2;  // passa a ser BusinessAccount ou seja precisa fazer casting manual
		acc4.loan(100.0);
		
		// ****************
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;  // fazendo casting acc3 que é Account porém foi instanciada de uma SavingAccount
														// porque SavingAccount é uma Account e não uma BusinessAcount. erro em tempo de exec.
	
		// para resolver:
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
			
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			
			System.out.println("Update!");
			
		}
		
		
		// TREINANDO SOBREPOSIÇÃO OU SOBRESCRITA
		
		Account acc10 = new Account(1001,"Ronaldo", 1000.0);
		acc10.withdraw(200.0);
		System.out.println(acc10.getBalance());
		
		Account acc11 = new SavingsAccount(1002,"José", 1000.0, 0.01);
		acc11.withdraw(200.0);
		System.out.println(acc11.getBalance());
		
		Account acc12 = new BusinessAccount(1004, "Gonçalves", 1000.0, 500.0);
		acc12.withdraw(200.0);
		System.out.println((acc12.getBalance()));
		
		
		
	}
	
		
	
	

}
