package programminghubgoogle.string;

import java.util.Scanner;

public class ReverseWordInTheSentenceTODO {

	public static void main(String[] args) {
			int strLen, i, j;
			String str;
			
			String reverse = "", temp="";
			Scanner sc = new Scanner(System.in);
			
			System.out.println("merci de saisir une phrase : ");
			str = sc.nextLine();
			
			strLen = str.length() - 1;
			
			for (i = 0; i <= strLen; i++) {
				
				temp += str.charAt(i);
				
				if (str.charAt(i) == ' ' || (i == strLen)) {
					for (j = temp.length()-1 ; j >= 0; j--) {
						reverse += temp.charAt(j);
						if((j==0) && (i !=strLen)) {
							reverse += " ";
						}
					}
					temp="";
				}
			}
			System.out.println("Reverse de => " + str + " : "+ reverse);
	}

}
