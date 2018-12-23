package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount("455986787", 1000.50);
		BankAccount acc2 = new BankAccount("764836457", 2000);
		BankAccount acc3 = new BankAccount("134579456", 2500);

		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(900);
		acc1.accrue();
		System.out.println(acc1.toString());
	}

}


class BankAccount implements IInterest {
	// Properties of bank account
	private static int ID = 1000; // Internal ID
	private String accountNumber; // ID + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "005400657";
	private String name;
	private String SSN;
	private double balance;
	
	// Constructor
	public BankAccount (String SSN, double initDeposit) {
		balance = initDeposit;
		System.out.println("New Account Created");
		this.SSN = SSN; 
		ID++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = ID + "" + random + SSN.substring(0, 2);
		System.out.println("Your Account Number: " + accountNumber);
	}
	
	public int getID() {
		return ID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		System.out.println("Paying bill: " + amount);
		decreaseBalance(amount);
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		System.out.println("Making deposit: " + amount);
		increaseBalance(amount);
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	
	public void increaseBalance(double amount) {
		balance = balance + amount;
	}
	
	public void decreaseBalance(double amount) { 
		balance = balance - amount;
	}
	
	public void accrueInterest() {
		
	}

	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + " ]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance: "	+ balance + "]";
	}
}