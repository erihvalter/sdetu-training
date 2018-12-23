package basics;

public class Lab1_1 {
	public static void main(String[] args) {
		System.out.println(sum(5));
	}
	
	public static int sum(int n) {
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum += i;
		}
		return sum;
	}
}
