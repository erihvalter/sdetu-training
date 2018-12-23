package oop;

public class CDAccount extends BankAccount implements IRate {
	
	String InterestRate;
	
	void compound() {
		System.out.println("Compounding interest");
	}
	
}
