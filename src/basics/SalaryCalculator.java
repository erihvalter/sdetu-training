package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		//Declare
		String career;
		System.out.println("Program is starting");
		
		//Define
		career = "Software Developer";
		System.out.println("My career " + career);
		
		// Declare & Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		career = "Web Developer";
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of " + rate + " dollars per hour is " + salary + " dollars per year.");
		
		// rate * hoursPerWeer * weeksPerYear
	}
}
