package programminghubgoogle.string;

public class ReverseAStringUsingRecursiveTODO {

	
	String reverse = "";

	public String reverseString (String str) {
	
		if(str.length() == 1) {
			return str;
		}
		else {
			reverse += str.charAt(str.length()-1) + reverseString(str.substring(0, str.length() -1));
		}
		
		return reverse;
	}
	
	public static void main(String[] args) {
	
		ReverseAStringUsingRecursiveTODO srr = new ReverseAStringUsingRecursiveTODO();
		System.out.println("Resultat : " + srr.reverseString("Bonjour"));
		
	}

}
