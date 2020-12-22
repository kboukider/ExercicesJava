package programminghubgoogle.string;

public class ASCIItocharCharToASCII {

	public static void main(String[] args) {
		
		char a = 'A';
		int ascii = 66;
		
		System.out.println( "Le ascii de " + a + " est : " + CharToSCII(a));
		System.out.println("le char de "+ascii+" est : " + SCIIToChar(ascii));
	}
	
	public static int CharToSCII(final char character) {
		return (int) character;
	}
	public static char SCIIToChar(final int ascii) {
		return (char) ascii;
	}

}
