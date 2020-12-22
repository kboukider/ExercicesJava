package programminghubgoogle.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AnagramWithoutRecursion {
	
	 public static void main(String args[]) throws Exception
	    {
		 AnagramWithoutRecursion a = new AnagramWithoutRecursion();

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        System.out.print("Enter first string: ");
	        String str1 = br.readLine();

	        System.out.print("Enter second string: ");
	        String str2 = br.readLine();

	        int flag = a.Anagram(str1, str2);

	        if (flag == 0)
	        {
	            System.out.print("\nResult: " + str1 + " and " + str2 + " are anagrams.");
	        }
	        else
	        {
	            System.out.print("\nResult: " + str1 + " and " + str2 + " are not anagrams.");
	        }

	        System.out.println();
	    }

	    public int Anagram(String str1, String str2)
	    {
	        if (str1.equals(str2))
	        {
	            return 0;
	        }

	        return 1;
	    }

}
