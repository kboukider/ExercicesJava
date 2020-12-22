package programminghubgoogle.string;

public class StringReverseWithoutUsingReverse {

	public static void main(String[] args) {
		String s ="abcdef";
		char c[] = s.toCharArray();
		
		System.out.println("Reverse String : ");
		
		for (int i = c.length -1 ; i >= 0; i--) {
			System.out.print(c[i]); 
		}
		

	}

}
