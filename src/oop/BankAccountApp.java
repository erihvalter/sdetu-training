package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object
		BankAccount acc1 = new BankAccount();
		
		// With Encapsulation : public API methods
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.setSsn("468765465");
		System.out.println("SSN: " + acc1.getSsn());
		
		
		acc1.accountNumber = "15345236";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(2000);
		
		
		// Polymorphism through overriding
		System.out.println(acc1.toString());
		
		// Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "15345237";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "15345238";
		
		
		/*
		acc3.checkBalance();

		// Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.InterestRate = "4.5";
		cd1.name = "Juhan";
		cd1.accountType = "CDAccount";
		System.out.println(cd1.toString());
		cd1.compound();
		*/
		
	}

}
