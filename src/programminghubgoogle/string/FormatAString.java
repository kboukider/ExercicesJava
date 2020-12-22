package programminghubgoogle.string;

public class FormatAString {

	public static void main(String[] args) {

		String str =  "This is formatted %s exemple";
		System.out.println(String.format(str, "string"));
		
		String str1 = "We are addinig number %d to string";
		System.out.println(String.format(str1, 10));
	}

}
