package programminghubgoogle.array;

public class ArraySumAndAverage {

	public static void main(String[] args) {
		int[] numbers = new int[] { 10, 20, 15, 25, 16, 60, 100 };
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		double average = sum / numbers.length;
		
		System.out.println("Sum of array element is : " + sum);
		System.out.println("Average value of array elements is : "+ average);
	}

}
