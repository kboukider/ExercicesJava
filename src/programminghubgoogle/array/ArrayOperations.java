package programminghubgoogle.array;

import javax.naming.spi.DirStateFactory.Result;

public class ArrayOperations {

	public static void main(String[] args) {
		double [] myList = {1.9 , 2.9, 3.4, 3.5};
		
		//print all the array elements
		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i]);
		}
		
		double total = 0;
		//summing all elements
		for (int i = 0; i < myList.length; i++) {
			
			total += myList[i];
		}
		System.out.println("la somme de tous les elements est : "+total);
		
		double max = myList[0];
		for (int i = 0; i < myList.length; i++) {
			if(myList[i]>max){
				max = myList[i];
			}
		}
		System.out.println("le max est : " + max);
	}

}
