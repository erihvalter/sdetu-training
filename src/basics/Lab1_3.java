package basics;

public class Lab1_3 {

	public static void main(String[] args) {
		int[] numbers = {3, 27, 5, 9, 7, 50, 42, 1};
		
		System.out.println("The lowest number is " + getMinimum(numbers));
		System.out.println("The highest number is " + getMaximum(numbers));
		System.out.println("The average is " + getAverage(numbers));
	}

	public static int getMinimum(int[] array) {
		int lowestNumber = array[0];
		for (int i = 0; i < array.length; i++) {
			if (lowestNumber > array[i]) {
				lowestNumber = array[i];
			}
		}
		return lowestNumber;
	}
	
	public static int getMaximum(int[] array) {
		int highestNumber = array[0];
		for (int i = 0; i < array.length; i++) {
			if (highestNumber < array[i]) {
				highestNumber = array[i];
			}
		}
		return highestNumber;
	}
	
	public static int getAverage(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;

	}

}
