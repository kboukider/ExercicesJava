package programminghubgoogle.string;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseSentenceWithoutUsingSplitTODO {

	public static void main(String[] args) {
		System.out.println("Merci de saisir une phrase : ");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		
		ArrayList al = new ArrayList();
		al = recursiveReverseMethod(sentence, al);
		al.trimToSize();
		StringBuilder sb = new StringBuilder();
		for (int i = al.size()-1; i >= 0; i--) {
			sb.append(al.get(i)+" ");
		}
		System.out.println("l'inverse de la phrase : "+sb);

	}
	public static ArrayList recursiveReverseMethod(String sentence, ArrayList al) {
	
		int index = sentence.indexOf(" ");
		al.add(sentence.substring(0, index));
		sentence = sentence.substring(index +1);
		
		if (sentence.indexOf(" ")==-1) {
			al.add(sentence.substring(0));
			return al;
		}
		return recursiveReverseMethod(sentence, al);
	}

}
