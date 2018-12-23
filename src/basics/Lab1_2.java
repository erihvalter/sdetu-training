package basics;

public class Lab1_2 {

	public static void main(String[] args) {
		System.out.println(fact(10));
	}
	
	
	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		else if (n==1) {
			return 1 * 1;
		}
		return fact(n-1) * n;
	}

}