package programminghubgoogle.string;

public class StringLengthAndTrim {

	public static void main(String[] args) {

		String s1 = " Universe ";
		System.out.println("s1 = "+s1);
		
		System.out.println("The length of s1 is (using length) : "+s1.length());
		
		//Removing extra spaces from s1
		String s2 = s1.trim();
		System.out.println("The lengrh of s1 is (using trim) : "+s2.length());
	}

}
