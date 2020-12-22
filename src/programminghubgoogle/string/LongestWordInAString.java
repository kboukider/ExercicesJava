package programminghubgoogle.string;

import java.util.Scanner;

public class LongestWordInAString {

	public static void main(String[] args) {
		System.out.println("Enter une phrase svp : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String maxword =null;
		str = str + " ";
		int length = str.length();
		String word = "";
		int maxlength = 0;
		
		for (int i = 0; i < length; i++) {
			word = word + str.charAt(i);
			if(str.charAt(i+1)== ' ') {
				if(word.length() > maxlength) {
					maxword = new String(word);
					maxlength = word.length();
				}
				word="";
				i++;
			}
			
		}
		System.out.println("le mot le plus long est = " + maxword);
	}

}
