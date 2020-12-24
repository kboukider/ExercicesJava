package programminghubgoogle.array;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		String iArr[] = { "Programming", "Hub", "Alice", "Wonder", "Land" };
		
		//sorting Array
		Arrays.sort(iArr);
		
		// let us peint all element availabale in list
		System.out.println("The sortesd array is : ");
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
	}

}