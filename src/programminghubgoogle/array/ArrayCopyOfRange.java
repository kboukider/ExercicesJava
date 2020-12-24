package programminghubgoogle.array;

import java.util.Arrays;

public class ArrayCopyOfRange {

	public static void main(String[] args) {
		char[] copyForm = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
		char[] copyTo = Arrays.copyOfRange(copyForm, 2, 9);
		System.out.println(new String(copyTo));
		
	}

}
