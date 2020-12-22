package programminghubgoogle.string;

public class StringConcatenate {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "FreeIT";
		
		String s3 = s1.concat(s2);
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		System.out.println("s3 = "+s3);
		
		String s4 = "Hello";
		if(s4.equals(s1)) {
			System.out.println("s4 is equal to s1");
		} else {
			System.out.println("s4 is not equal to s1");
		}

	}

}
