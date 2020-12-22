package programminghubgoogle.string;

import java.util.Scanner;

public class PermutationOfTheGivenTODO {

	public static void main(String[] args) {
		System.out.println("Ajouter le mot pour la permutation : ");
		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();
		System.out.println("Le r�sultat est : ");
		
		permute(original);

	}
	
	public static void permute(String input) {
		int inputLength = input.length();
		boolean[] used = new boolean[inputLength];
		StringBuffer outputString = new StringBuffer();
		char[] in = input.toCharArray();
		
		doPermute(in, outputString, used, inputLength, 0);
	}
	
	public static void doPermute(char[] in, StringBuffer outputString, boolean[] used, int inputLength, int level) {
		if(level == inputLength) {
			System.out.println(outputString.toString());
			return;
		}
		
		for (int i = 0; i < inputLength; i++) {
		if(used[i]) continue;
		
		outputString.append(in[i]);
		used[i] = true;
		
		doPermute(in, outputString, used, inputLength, level+1);
		used[i] = false;
		outputString.setLength(outputString.length() - 1);
		}
	}

}
