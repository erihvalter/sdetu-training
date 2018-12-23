package basics;

public class FibonacciApp {

	public static void main(String[] args) {
		// Fibonacci number is defined by the sum of the 2 previous Fibonacci numbers
		// fib(0) = 0
		// fib(1) = 1
		// fib(2) = fib(0) + fib(1) = 0 + 1 = 1
		// fib(3) = fib(1) + fib(2) = 1 + 1 = 2
		// fib(4) = fib(2) + fib(3) = 1 + 2 = 3
		// fib(5) = fib(3) + fib(4) = 2 + 3 = 5
		
		// Write fibonacci numbers in a row
		int amount = 20;
		for (int i = 0; i < amount; i++) {
			if (i + 1 == amount) {
				System.out.print(fib(i) + ". ");
			}
			else {
				System.out.print(fib(i) + ", ");
			}
		}
	}

	public static int fib(int n) {
		if(n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		return ( ((fib(n-1)) + (fib(n-2))) );
	}
}
