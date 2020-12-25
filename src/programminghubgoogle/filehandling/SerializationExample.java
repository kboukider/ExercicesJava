package programminghubgoogle.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
	
	
	/*
	 * package programminghubgoogle.filehandling;
	 * 
	 * public class Employee implements java.io.Serializable {
	 * 
	 * public String name; 
	 * public String address; 
	 * public transient int id; 
	 * public int number; 
	 * 
	 * }
	 */
	
	

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Andy Rubin";
		e.address = "Tours, France";
		e.id = 007;
		e.number = 58921456;

		try {
			FileOutputStream fileOut = new FileOutputStream("C:\\Users\\kouce\\OneDrive\\Bureau\\kokojava\\bonjour.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in / employee.ser");

		} catch (IOException i) {
			i.printStackTrace();
		}

	}

}
