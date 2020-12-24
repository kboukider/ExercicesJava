package programminghubgoogle.array;

public class MergeTwoArray {

	public static void main(String[] args) {
		Integer a[] = { 1, 2, 3, 4 };
		Integer b[] = { 5, 6, 7, 8 };
		Integer[] both = concat(a, b);

		System.out.println("\nFirst Array :");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}

		System.out.println("\nSeconde Array :");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + "  ");
		}

		System.out.println("\nMerged Array :");
		for (int i = 0; i < both.length; i++) {
			System.out.print(both[i] + "  ");
		}
	}

	public static Integer[] concat(Integer[] a, Integer[] b) {
		int aLen = a.length;
		int bLen = b.length;
		Integer[] c = new Integer[aLen + bLen];
		System.arraycopy(a, 0, c, 0, aLen);
		System.arraycopy(b, 0, c, aLen, bLen);
		return c;
	}

}
