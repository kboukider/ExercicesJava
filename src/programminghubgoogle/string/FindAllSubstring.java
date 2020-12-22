package programminghubgoogle.string;

import java.util.Scanner;

public class FindAllSubstring {

	public static void main(String[] args) {
		
		String string, sub ;
		int i, c, length;
		
		System.out.println("Merci de saisir un mot : ");
		Scanner sc = new Scanner(System.in);
		string = sc.nextLine();
		length = string.length();
		
		System.out.println("Substring de " + string + " est : ");
		for ( c = 0; c < length; c++) {   
			for (i = 1; i <= length -c; i++) {   
				sub = string.substring(c, c+i);
				System.out.println(sub);
			}
		}

		
	}

}
