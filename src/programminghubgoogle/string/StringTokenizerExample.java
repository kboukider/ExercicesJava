package programminghubgoogle.string;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Java StringTokenizer Example");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
