package basics;

public class MyVersionFibonacci {

	public static void main(String[] args) {
		
		int firstNumber = 0;
		int secondNumber = 1;
		int nextNumber = 0;
		int numberBefore = 0;
		int untilNumber = 1000;
		for (int i = firstNumber; i < untilNumber; i = nextNumber) {
			System.out.print(i);
			if (i == 0) {
				numberBefore = i;
				nextNumber = secondNumber;
			}
			else {
				nextNumber = i + numberBefore;
				numberBefore = i;	
			}
			
			if (nextNumber < untilNumber) {
				System.out.print(", ");
			}
			
		}
		System.out.println(".");
		
	}

}
